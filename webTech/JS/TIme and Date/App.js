let digitalClock=()=>{
    let dateObj=new Date();
    let span=document.getElementsByTagName('span');
    let curHrs=dateObj.getHours();
    span[0].innerText=curHrs;
    span[1].innerText=dateObj.getMinutes();
    span[2].innerText=dateObj.getSeconds();
    span[3].innerText=dateObj.getDate();
    let month=dateObj.getMonth();
    switch(month){
        case 0: month='Jan';
                break;
        case 1: month='Feb';
                break;
        case 2: month='Mar';
                break;
        case 3: month='Apr';
                break;
        case 4: month='May';
                break;
        case 5: month='June'
                break;
    }
    span[4].innerText=month;
    span[5].innerText=dateObj.getFullYear();
    span[6].innerText=dateObj.getDay();
}

let otpgenrator=()=>{

}