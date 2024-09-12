function validation(e){
    e.preventDefault();
    let userName=e.target[0];
    let password=e.target[1];
    if(userName.value === '' || userName.value === null){
        userName.style.cssText='border:solid 2px red'
    }
    else if(password.value === '' || password.value === null){
        password.style.cssText='border:solid 2px red'
    }
}

let CV = (e)=>{
    e.preventDefault();
    let fname=e.target[0];
    let lname=e.target[1];
    let data={
        uname:"venky",
        passcode:12345,
    }
    if(fname !== data.uname || fname === '' || fname === null){
        fname.style.cssText=`border-color:red`
        console.log('enter correct username');
    }
    else if(lname !== data.passcode || fname === '' || lname === null){
        lname.style.cssText=`border-color:green`
        console.log('enter the correct password')
    }
    else{
        console.log("welcome")
    }
}

let togg =()=>{
    let ara=document.getElementsByClassName('xyz')[0];
    console.log(ara);
    ara.classList.toggle('OFF');
    // aratext=ara.innerText;
    // console.log(ara);
}