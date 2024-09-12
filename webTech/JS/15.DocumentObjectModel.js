let str=document.getElementById('wish');
function greeting(){
    str.innerText='Have  a nice Day';
    str.style.cssText=`color:red;
                      background:yellow;
                      text-align:center;`
}
function greeting2(){
    let str2=document.getElementById('wish');
    str2.innerText='just looking like wow 😲'
    str2.style.cssText=`background:Black;
                        text-align:center;
                        color:white;
                        padding:10px;`
}

let eff=document.getElementsByClassName('msg')
function colors(){
    eff[0].style.cssText=`color:orange;
                              background:yellow;
                              text-align:center;
                              padding:10px 0px;`
    eff[1].style.cssText=`color:white;
                              background:skyblue;
                              text-align:center;
                              padding:10px 0px;`
    eff[2].style.cssText=`color:white;
                              background:black;
                              text-align:center;
                              padding:10px 0px;`
}

//Box Example
let box=document.getElementsByClassName("box");
let boxmodel= () => {
    box[0].innerText='Bye';
    box[1].style.cssText=`background-color:red;`
    box[2].style.cssText=`border-radius:50%;
                          background:green;  `
}

//Example With Image

let image=document.getElementsByTagName('img');
let changeImage = () => {
    image[0].src='./images/solo_travel_bike_biker.jpg';
}

// Example on ON-OFF button model
let onOff= () =>{
    let btn=document.getElementById('btn');
    let text=btn.innerText;
    (text === 'ON') ? btn.innerText='OFF' : btn.innerText='ON';
}

//Example On Dark Mode and Light Mode
let i=0;
let DN = ()=> { 
    i++;
    if(i%2 != 0){
        document.body.style.cssText=`background:black;
                                     color:white;`
        document.innerText='Day Mode'
    }
    else{
        document.body.style.cssText=`background:white;
                                     color:black;`
        document.innerText='Night Mode'
    }
}

// changing of colors using what we entered
let RGB=()=>{
    let colorText=prompt("Enter the background color:");
    document.body.style.cssText=`background:${colorText};`
}

// forms example
let selectedElem=document.getElementById('res');
let ab=document.getElementById('age');
let fname=document.getElementsByName('fnm')[0].value;
let lname=document.getElementsByName('lnm')[0].value;
let birth=document.getElementsByName('dob')[0].value;
printDetails=(e) =>{
    e.preventDefault();
    selectedElem.innerText=`My name is ${fname} ${lname} date of birth year is ${birth}`
    let dateobj=new Date();
    let agePerson=dateobj.getFullYear()-birth;
    ab.innerText=`My age is ${agePerson}`
}


