let login=(e)=>{
    e.preventDefault();
    let username=e.target[0].value;
    let password=e.target[1].value;
    let data={
        uname:'venky',
        pswd:'12345'
    }
    if(username === data.uname && password === data.pswd){
        document.location.href='./16.Login_Welcome.html';
    }
    else{
        alert("enter the correct password or userid");
    }
}

