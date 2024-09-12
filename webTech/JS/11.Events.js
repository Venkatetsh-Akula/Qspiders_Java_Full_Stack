function fun(){
    console.log("I am in External JS file")
}
function fullname(){
    let fname=prompt("Enter the first name");
    let lname=prompt("Enter the last name");
    console.log(`My name is ${fname} ${lname}`)
}
function double()   {
    console.log("Double click event")
}
function singleclick(){
    console.log("I am Clicking One time")
}
function doubleclick(){
    console.log("I am Clicking Two times")
}
function dob(){
    let name=prompt("enter the name:")
    let x=Number(prompt("enter the date of year:"));
    let year=new Date();
    let res=year.getFullYear()-x;
    console.log(res);
    document.write(res);
}


// Key Board Events
function key1(){
    console.log("On Key Down");
}
function key2(){
    console.log("On Key Press");
}
function key3(){
    console.log("On Key Up");
}

//Mouse Events
function image(){
    console.log("Smile Please 😁😚😄")
}

//Submit event
let printName=(e)=>{
    console.log('Hello');
    e.preventDefault();
}

let fullName=(e) =>{
    e.preventDefault();
    // console.log(e);    //Print object 
    // console.log(e.target);  //print tagret array
    // console.log(e.target[0].value); //print array of its first target value 
    // console.log(e.target[1].value);  //print array of the second target value
    let fnam=e.target[0].value;  //storing the first value in target
    let lnam=e.target[1].value;  //storing the Second value in target
    console.log(`My Name is ${fnam} ${lnam}`) //Printing with the interpolation
    let year=e.target[2].value;
    let dateObj=new Date();
    let age=dateObj.getFullYear()-year;
    // console.log(age);
    console.log(`My Name is ${fnam} ${lnam} My age is ${age}`);
}