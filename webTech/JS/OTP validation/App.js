let str=document.querySelector('input');
let root=document.getElementById("root")
let SeeHere=document.getElementById("SeeHere");
let checker=0
function getOTP(){
    rotp=Math.floor((Math.random()*10000));
    SeeHere.innerText=rotp;
    if(rotp>999 && rotp < 10000){
        checker=rotp;
    }
    else{
        getOTP();
    }
}
function verify(){
    // e.preventDefault();
    console.log(checker);
    inpValue=str.value;
    console.log(inpValue);
    if(checker == inpValue){
        root.innerHTML=`
                <h1>Good To Go</h1>            
        `
    }
    else{
        root.innerHTML=`
                <h1></h1>
        `
    }
}