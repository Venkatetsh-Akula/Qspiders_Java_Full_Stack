// let win={
//     loc : "location",
//     doc : {
//         wrt:function(txt){
//             console.log(txt);
//         },
//         wrtln:function(txt){
//             console.log(txt);
//         }
//     },
//     cnsl : {
//         lg : function(){
//             console.log("i am in log function");
//         },
//         wrn : function(){
//             console.log("I am In warn function");
//         },
//         err : function(){
//             console.log("i am in error function");
//         }
//     }
// }

// console.log(win.doc.wrt("Hiii i am in wrt function"));
// console.log(win.doc.wrtln("I am in writeln function"));



// let person = {
//     fullname : {
//         fname : "Dinga",
//         lname : "Raja"
//     },
//     gender : "male",
//     age : function(nm,dob){
//         let dateObj=new Date();
//         age=dateObj.getFullYear()-dob;
//         console.log(nm+ " age is "+ age);
//     },
//     address : {
//         street : "food street",
//         area : "kabab mohalla",
//         city : "Hyderabad",
//         pincode : 12345
//     },
//     Hobbies : ["eating","sleeping","reading","playing"],
//     personal :{
//         phno:965421590,
//         mai:"dina@gmail.com"
//     }

// }

// let {fullname,address,Hobbies}=person;  //Destructring
// console.log(fullname.lname+ " is from "+address.city);
// let {fname,lname}=fullname;   //sub destructring
// console.log(fname+" "+lname);
// let {street,city,area}=address;
// console.log(fname+" from "+area);    
// let [eat,sleep,read,play]=Hobbies;       //Arr sub Destructring
// console.log(`${lname} from ${city} hobbies are ${eat}`);



// 10/05/2024


// //reverse a string with inbuit method
// let str="nagavara";
// let arr=str.split('');
// console.log(arr);
// let ruf=arr.reverse();
// console.log(ruf);
// let res=ruf.join('');
// console.log(res);

// let result="";
// for(let i=str.length-1;i>=0;i--){
//     //result=result+str.charAt(i);
//     result=result+str[i];
// }
// console.log(result);

//question 2
// let arr=[
//     {
//         id:1,
//         name:"qsp",
//         sal:50000
//     },
//     {
//         id:2,
//         name:"jsp",
//         sal:80000
//     },
//     {
//         id:3,
//         name:"pys",
//         sal:50000
//     }
// ];
// let salary=arr.map((a)=>{
//     return a.sal;
// })
// console.log(salary);
// let ans=salary.reduce((a,b)=>{
//     return a+b;
// })
// console.log(ans);
// console.log(ans/salary.length);

// //question 3 add some data to every object in arr
// let newObj=arr.map((a)=>{
//     a.company="IBM"
//     return a;
// })
// console.log(arr);

//create a function for n number of arguments in a function and find larget number
// function maximum(...a){  //rest parameter(individual elements into compact elements),spread operator(it will converts a compact element into indivudal elements)
//     let res=arr.sort((a,b)=>{
//         return a-b;
//     })
//     console.log(res[res.length-1]);
// }
// let arr=[23,23,43,54,47,676,78,434,534,32,66];
// maximum(arr);
// (or)

// function maximum(...x){
//     console.log(x);
//     console.log(...x);
//     console.log(Math.max(...x));
// }

// maximum(30,50,70,60)

// (or)
// let arr=[12,65,2,376,83,46,32,6,723,6,5];
// let res=arr.reduce((a,b)=>{
//     return (a>b)?a:b;
// })
// console.log(res);

//promise method
// let na="venky";
// let promObj=new Promise((resolve,reject)=>{
//     if(na==="venky"){
//         resolve("hiii");
//     }
//     else{
//         reject("bye");
//     }
// });
// promObj.then((msg)=>{
//     console.log(msg);
// })
// promObj.catch((msg)=>{
//     console.log(msg);
// })

let str="venky";
let arr=str.split("");
// for(let i=0;i<arr.length;i++){
//     for(j=1;j<arr.length;j++){
//         if(arr[j-1]>arr[j]){
//             let temp=arr[j-1];
//             arr[j-1]=arr[j];
//             arr[j]=temp;
//         }
//     }
// }
console.log(arr.sort());