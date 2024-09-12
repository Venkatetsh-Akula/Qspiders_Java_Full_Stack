//Scope of Variable
//!todo Statement Block
// if(true){
//     var a=10 //?global scope

//     //?local Scope
//     let b=20;
//     const c=30;
//     console.log(a,b,c);
// }
// console.log(a);
// console.log(b); //!Error(not defined)
// console.log(c);  //!Error(not defined)

//todo: function Block
// function num(){
//     //? local scope
//     var x=100;
//     let y=200;
//     const z=300;
//     console.log(x,y,z);
//     return `${x} ${y} ${z}`
// }
// console.log(x); //!Error
// console.log(num());

//! Hoisting
//todo: Variable Hoisting
// var a;
// a=100;
// console.log(a);

// b=200;
// console.log(b);
// let b; //Error(Cannto Access b before intilize)

// //todo: Function Hoisting
// fun()
// function fun(){
//     console.log('I am in function');
// }

// f1()
// var f1=()=>{
//     console.log('I m in arrow function')    //Error (f1 is not found)
// }


//! Destructring
//todo : Array Destructring
// let arr=[5,7,6,3,4];
// let [five,seven,six,three,four]=arr;
// console.log(`My Lucky Number is ${seven}`);

// //todo: Object Destruxtring
// let pObj={
//     fname:"Dinga",
//     lname:"Raja",
//     age:90,
//     place:"Goa"
// }
// let data=`My name is ${pObj.fname} ${pObj.lname}, I m from ${pObj.place} , My age is ${pObj.age}`
// console.log(data);
// //todo: With Destructring
// let {fname,lname,age,place}=pObj;
// let data1=`My name is ${fname} ${lname}, I m from ${place}, & My age is ${age}`;
// console.log(data1);


//! for-in & for-of
// let arr=[8,6,7,5,2]
// console.log(arr);
// for(let key in arr){
//     console.log(key);
// }
// for(let key of arr){
//     console.log(key);
// }

let pObj={
    fnm : 'Dinga',
    lnm : 'Raja',
    age:40
}
console.log(pObj);
for(let key in pObj){
    console.log(pObj[key]);
    console.log(`${key} = ${pObj[key]}`);
}