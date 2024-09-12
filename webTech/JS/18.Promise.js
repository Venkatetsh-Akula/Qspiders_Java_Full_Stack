let chocalate='given';
let p=new Promise((resolve,reject)=>{
    if(chocalate === 'given'){
        resolve('Promise is completed');
    }
    else{
        reject('Promise is rejected');
    }
})
p.then((msz)=>{
    console.log(msz);
})
p.catch((err)=>{
    console.log(err);
})

// let rcb='won'
// let proObj=new Promise((resolve,reject)=>{
//     if(rcb === 'won'){
//         resolve('E sala cup Namde')
//     }
//     else{
//         reject('Next sala cup namde');
//     }
// })
// proObj.then((msg)=>{
//     console.log(msg);
// })
// proObj.catch((err)=>{
//     console.log(err);
// })


// let a=()=>{
//     return 'Dinga'
// }
// let b=()=>{
//     return new Promise((res,rej)=>{
//         setTimeout(()=>{
//             res('Dingi')
//         },2000)
//     })
// }
// let c=()=>{
//     return 'Dingu'
// }
   
// let displayName=async()=>{
//     console.log(a());
//     console.log(await b());
//     console.log(c());
// }
// displayName()