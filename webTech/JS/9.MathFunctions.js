//Math Functions
// function num(...a){
//     console.log(a);
//     console.log(...a)
//     //to find mixmum number
//     let mx=Math.max(...a);
//     console.log(mx);
//     //to find smallest number
//     let mn=Math.min(...a);
//     console.log(mn);
// }
// num(25,45,75,88,23,35,57,75,10,22)

// let pai=Math.PI
// console.log(pai);
// let p=Math.pow(2,3);
// console.log(p);
// console.log(Math.pow(27,3));
// console.log(Math.sqrt(25));

// // generating of OTP
// console.log(Math.random());
// console.log(Math.random()*10000);
// console.log(Math.floor(100.255234234));
// console.log(Math.floor(420.23843847532));


// let a=Math.random()*10000;
// let OTP=Math.floor(a);
// if(a>999 && a<10000){
//     console.log(OTP);
// }

// let x=Math.random()*10000;
// let run=Math.floor(x);
// console.log(run);

// //round method
// console.log(Math.round(100.50));

function num(...arr){
    console.log(arr);
    let add=arr.map(ele => ele+2)
    console.log(add);
    let res=add.sort((a,b) =>  a-b)
    console.log(res);
    let even=res.filter(ele => ele%2 == 0)
    console.log(even);
    let final=even.reduce((pvalue,cvalue)=> pvalue+cvalue);
    console.log(final);
}
num(25,45,75,98,23,35,57,75,10,22)