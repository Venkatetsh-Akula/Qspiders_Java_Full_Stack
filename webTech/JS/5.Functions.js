// console.log("Demo on Functions");
// //General Functions
// //function without parameter & without return value
// function demo(){
//     console.log("I am in function");
// }
// demo();
// demo();

// function add(){
//     let a=10;
//     let b=20;
//     let c=a+b;
//     console.log(`${a} + ${c} = ${c}`);
// }
// add()

// //function with parameter & without return value
// function fun(x){
//     console.log("i am in "+x);
// }
// fun("Jspiders");
// fun("Pyspiders");

//Example Program
// function fullName(fnm,lnm){
//     console.log(`My name is ${fnm} ${lnm}`);
// }
// fullName("Dinga","Raja");
// fullName("Dingi","Rani");


//WAP to add two numbers by using general sunction with paramenter

// function sum(x,y){
//     let z=x+y;
//     console.log(`${x} + ${y} = ${z}`);
//     let sub=x-y;
//     console.log(`${x} - ${y} = ${sub}`);
// }
// sum(10,20);

//WAP to check even or odd number by using general function with parameter
//function EvenOdd(number){
//     if(number%2 == 0){
//         console.log(`${number} is even number`);
//     }
//     else{
//         console.log(`${number} is odd number`);
//     }
// }
// EvenOdd(6); 

//WAP to print even number from 25-35 by using general function with paramater
// function EvenNumbers(x,y){
//     let number;
//     for(number=x;number<=y;number++){
//         if(number%2 == 0){
//             console.log(`${number} is even number`);
//         }
//         else{
//             console.log(`${number} is odd number`);
//         }
//     }
// }
// EvenNumbers(25,35);



// //V I P
// //Example Question
// function fun(a,b,c=420){
//     let b='Pakka';
//     console.log(a,b,c);   //because of let is not possible to re declare in the function
// }
// fun('Dinga') 

// a=10;
// let a=100;
// console.log(a) // error because a is already intilize and redeclaration is not possible in let 

// function dummy(z){
//     console.log(z) //0
// }
// dummy(Number());

// function fun(){
//     let a=true;
//     return a;
// }
// let x=fun()
// console.log(x);

// function num(){
//     let a=10;
//     let b=20;
//     let add=a+b;
//     return `${a} + ${b} = ${add}`
// }
// let res=num();
// console.log(res);

//!Arrow Function
//?Function without parameter and without return 
// let s=()=>{
//     console.log("hello")
// }
// s()

// //?Function with parameter without return vlaue
// let fam=(x,y)=>{
//     let sum=x+y
//     console.log(sum of ${x} ${y} is ${sum})
// }
// fam(30,50)

// //?Function without parameter with return value
// let ref=()=>
// {
//     console.log("arrow")
//     return "done"
// }
// let z=ref()
// console.log(z)
// console.log(ref())

// //?Function with parameter and with return value
// // let y1=Number(prompt("Enter the number"))
// // let a=(num)=>
// // {
// //     if(num%3==0)
// //     {
// //         return(${num} is divisible by 3)
// //     }
// //     else{
// //         return(${num} is not divisible by 3)
// //     }
// // }

// // let ans=a(y1)
// // console.log(ans)

// //!Special behaviour of arrow function
// console.warn("special behaviour")
// //?only one pararmeter->parenthesis are optional
// let arrow1=a=>{
//     console.log(a)
// }
// arrow1(true)

// let arrow2= _=>{
//     console.log("hello")
// }
// arrow2()

// //?only one return keyword ->retuen keyword and {}parentesis are optional
// let a1=_=>false

// let r=a1()
// console.log(r)

// let adding=(a,b)=>{
//     return `${a} +${b}=${a+b}`;
// }
// console.log(adding(10,20))
// console.log(adding(60,20))
// console.log(adding(90,20))
// console.log(adding(50,20))


// let sub=(a,b)=>{
//     return `${a} -${b}=${a-b}`
// }
// console.log(sub(90,20))


//!Self Invoking Function
// console.warn("Self invoking/immediate invoking");

// (function(){
//     console.log('I am in SIF');
// }());

// (()=>{
//     console.log('This is 2nd function');
// })()

// //todo:Conclusion
// let retn=(()=>{
//     return 'Hello'
// })()
// console.log(retn);
// console.log(typeof retn);  //string

// let re=((a,b)=>{return a+b})(25,45)
// console.log(re)

// //?using both arrow and self involking function
// console.log((a=>a)('hello'))//hello

// //! call back function & Higher Order Function
// console.warn("Call Back and Higher Order Function");
// function num(){
//     return 100
// }
// function sum(a,b){
//     let add=a+b;
//     return add

// }
// let res6=sum(num(),200)
// console.log(res6);

// console.log(sum(150,num()));
// //todo : In this example num() is call back function(CBF) and sum() is Higher order function(HOF)

// //! Example-2
// let surname=function(){
//     return 'Khan'
// }

// let fullName1=function(fnm,lnm){
//     return My name is ${fnm} ${lnm}
// }
// console.log(fullName1('Sheeraz',surname()));
// console.log(fullName1('Salman',surname()));
// console.log(fullName1('Sharuk',surname()));
// //todo: In this example surname is CBF and Fullname is HOF

// //?Example-3
// let sumation=(a,b)=>{
//     let add = a+b()
//     return add
// }
// let res7=sumation(25,()=>{
//  return 100
// })
// console.log(res7);

// //?Example-4
// let add1=(a,b)=>a+b(50)
// console.log(add1(15,x=>35+x));

// //todo: b() is CBF and add1() is HOF