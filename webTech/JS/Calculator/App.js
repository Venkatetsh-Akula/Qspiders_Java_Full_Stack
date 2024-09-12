let input=document.querySelector('input');
let getValue=(e)=>{
    let btnValue=e.target.innerText;
    input.value+=btnValue;
    // console.log(screen)
    // console.log(btnValue);   
}
let result=()=>{
    let res=eval(input.value);
    input.value=res;
}
let refresh=()=>{
    input.value="";
}