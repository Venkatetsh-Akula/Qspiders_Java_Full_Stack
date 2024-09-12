function generateOTP(){
    let otp=Math.floor(Math.random()*10000);
    let res=(otp>999 && otp <10000);
    res ? console.log(otp) : generateOTP();
}
generateOTP();