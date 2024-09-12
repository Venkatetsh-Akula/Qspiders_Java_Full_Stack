
let onOff=()=>{
    let btn=document.querySelector('button');
    let x=btn.classList.toggle('on')
    let y=btn.classList.toggle('off')
    // console.log(x,y);
    let text=btn.innerText;
    (text === 'ON') ? btn.innerText='OFF':btn.innerText='ON';
}

// let newElem= ()=>{
//     let newTag=document.createElement('h3');
//     newTag.innerText='Hello'
//     document.body.appendChild(newTag);
// }
// newElem();

let htmltag=(tagsname,intext)=>{
    let tg=document.createElement(tagsname);
    tg.innerText=intext;
    document.body.appendChild(tg);

}
let requriment=(e)=>{
    e.preventDefault();
    let tagsname=e.target[0].value;
    let intext=e.target[1].value;
    htmltag(tagsname,intext);
}


let DayNight=()=>{
    let lightmode= document.querySelector('button');
    // console.log(lightmode)
    lightmode.classList.toggle('on');
    lightmode.classList.toggle('off');
    let str=lightmode.innerText;
    if(str === "Dark"){
        lightmode.innerText='Light';
        document.body.style.cssText=`background:black;
                                     color:white;`
    }
    else{
        lightmode.innerText='Dark';
        document.body.style.cssText=`background:white;
                                     color:black;`
    }
}

let i=0;
let onAndOff=()=>{
    let allstate=document.getElementsByClassName('bulb')[0];
    i++;
if(i%2 != 0){
    allstate.style.cssText=`background:orange;`
}
else{
    allstate.style.cssText=`background:white;`
}
}

let OnlyOn=()=>{
    let allstate=document.getElementsByClassName('bulb')[0];
    allstate.style.cssText=`background:orange;`
}

let OnlyOff=()=>{
    let allstate=document.getElementsByClassName('bulb')[0];
    allstate.style.cssText=`background:white;`
}
let Bytoggle=()=>{
    let allstate=document.getElementsByClassName('bulb')[0];
    let OWtoggole=document.querySelectorAll('button')[4];
    OWtoggole.classList.toggle('OWT');
    OWtoggole.classList.toggle('FWT');
    let toggletext=OWtoggole.innerText;
    // console.log()
    if(toggletext === 'ON'){
        allstate.style.cssText=`background:orange;`;  
        OWtoggole.innerText='OFF' 
    }
    else{
        allstate.style.cssText=`background:white;`;
        OWtoggole.innerText='ON' 
    }
}