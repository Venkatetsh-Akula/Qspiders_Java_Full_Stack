let generator=()=>{
    let RandomValue=Math.round(Math.random()*10000);
    if(RandomValue >999 && RandomValue <10000){
        let str=document.getElementsByTagName('p')[0];
        str.innerText=RandomValue;
    }
    else{
        generator();
    }
}