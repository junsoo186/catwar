/**
 * 
 */
function newNickName(){
	const nickName = document.getElementById("nickName").value;
	
	const data = `nickName=${encodeURIComponent(nickName)}`
	
	fetch('user/newNickName',{
		method: 'POST',
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded'  
        },
        body: data	
	})
	.then(resposne=>{
		window.location.href = response.url;
	})
	
}