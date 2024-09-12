let BG=document.getElementsByClassName('BGIP')[0];
let image=(e)=>{
    let str=e.target.getAttribute('src');
    BG.style.backgroundImage = `url(${str})`;
    // document.body.style.cssText=`background:url(${str});`
}