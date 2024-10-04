function signUp() {
   fetch('/user/signUp')
        .then(response => {
            if (!response.ok) {
                throw new Error('Network response was not ok: ' + response.status);
            }
            return response.text(); // JSP 파일의 HTML을 반환
        })
        .then(html => {
            document.getElementById('gameScreen').innerHTML = html; // HTML 삽입
        })
      
}
