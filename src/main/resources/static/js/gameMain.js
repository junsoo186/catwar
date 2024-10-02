function checkLoginStatus() {
	fetch('/auth/check')
		.then(response => response.json())
		.then(data => {
			console.log('Login status:', data.loggedIn);
			if (data.loggedIn) {
				console.log('Loading home page content');
					loadGameContent('/user/home');
			} else {
				console.log('User not logged in, redirecting to login page');
				setTimeout(() => {
					loadGameContent('/user/login');
				}, 2000);
			}
		})
		.catch(error => console.error('Error checking login status:', error));
}

function loadGameContent(url) {
	fetch(url)
		.then(response => {
			if (!response.ok) {
				throw new Error('Network response was not ok');
			}
			return response.text();
		})
		.then(data => {
			document.getElementById('gameScreen').innerHTML = data;
		})
		.catch(error => console.error('Error loading content:', error));
}

checkLoginStatus();


