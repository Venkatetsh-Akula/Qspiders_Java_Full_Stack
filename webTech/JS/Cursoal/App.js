let classblock=document.getElementsByClassName("sliderbox")[0].getElementsByTagName('img');
let urlArray=[];
for(let i=0;i<classblock.length;i++){
    urlArray[i]=classblock[i].getAttribute('src');
}
let slide=(e)=>{
 let Arrowurl=e.target.getAttribute('src');
 let blackbox=document.getElementsByClassName('BB')[0];
 if(Arrowurl == './images/right-arrow.png'){
    let bac=urlArray.shift();
    urlArray.push(bac);
    blackbox.style.cssText=`background:url(${bac});`
 }
 else{
    let bac=urlArray.pop();
    urlArray.unshift(bac);
    blackbox.style.cssText=`background:url(${bac});`
 }
    
}