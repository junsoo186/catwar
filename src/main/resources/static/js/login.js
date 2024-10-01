function login() {
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;

    // URL 인코딩된 데이터로 변환
    const data = `email=${encodeURIComponent(email)}&password=${encodeURIComponent(password)}`;

    fetch('user/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded'  
        },
        body: data
    })
    .then(response => {
        if (response.redirected) {
            window.location.href = response.url;
        } else if (!response.ok) {
            alert("로그인 실패");
        }
    })
    .catch(error => {
        alert('로그인 중 문제가 발생했습니다.');
        console.error('Error:', error);
    });
}