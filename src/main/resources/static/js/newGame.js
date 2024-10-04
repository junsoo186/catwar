
function newNickName() {
	const nickName = document.getElementById("nickName").value;

	const data = `nickName=${encodeURIComponent(nickName)}`

	fetch('user/newNickName', {
		method: 'POST',
		headers: {
			'Content-Type': 'application/x-www-form-urlencoded'
		},
		body: data

	})
		.then(response => {
			if (!response.ok) {
				throw new Error('Network response was not ok');
			}
			return response.text(); // HTML 텍스트를 반환
		})
		.then(html => {
			nextStage = true;
			document.getElementById('gameScreen').innerHTML = html;
		})

}

