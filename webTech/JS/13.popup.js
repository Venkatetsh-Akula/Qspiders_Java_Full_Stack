function printName(){
    let fnm=prompt("enter the first name")
    let lnm=prompt('enter last name')
    alert(`My name is ${fnm} ${lnm}`);
}

function fun(){
    let bool=confirm("Prepare for mock");
    if(bool){
        alert('I Will get Requriment')
    }
    else{
        alert("I Wont get requriment");
    }
}

let example=()=>{
    let username=prompt("Enter the name");
    if(username === null || username === ''){
        let bool=confirm("Do you want to exit....!");
        (bool) ? alert('Ok Thank You....!') : example();
    }
    else{
        alert(`My name is ${username}`);
    }
}

