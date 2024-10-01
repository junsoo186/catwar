 function loadNewGame() {
        fetch('/user/newGame')
            .then(response => response.text())
            .then(data => {
                document.getElementById('gameScreen').innerHTML = data;
            })
            .catch(error => console.log('Error loading newGame.jsp:', error));
    }