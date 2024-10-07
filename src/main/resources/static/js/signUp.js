function signUp() {
	fetch('/user/signUp')
		.then(response => {
			if (!response.ok) {
				throw new Error('Network response was not ok: ' + response.status);
			}
			return response.text(); 
		})
		.then(html => {
			document.getElementById('gameScreen').innerHTML = html; 
		})

}

function userSignUp() {

	const name = document.getElementById("name").value;
	const email = document.getElementById("email").value;
	const password = document.getElementById("password").value;

	const data = `name=${encodeURIComponent(name)}&email=${encodeURIComponent(email)}&password=${encodeURIComponent(password)}`;
	fetch('user/signUp', {
		method: 'POST',
		headers: {
			'Content-Type': 'application/x-www-form-urlencoded'
		},
		body: data

	})
		.then(response => {
			if (!response.ok) {
				throw new Error('인터넷 접속 문제 발생');
			}
			return response.text(); 
		})
		.then(html => {
			nextStage = true;
			document.getElementById('gameScreen').innerHTML = html;
		})

}