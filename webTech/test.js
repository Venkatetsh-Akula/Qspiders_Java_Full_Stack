// let sentence="Lorem ipsum, dolor sit amet consectetur adipisicing elit. Quos quod deserunt quam obcaecati vitae facilis eius libero tempora";
// console.log(sentence)
// let words=sentence.split(" ");
// console.log(words);
// console.log(words.length);
// let longestEven=" ";
// console.log(longestEven);
// console.log(longestEven.length);
// for(let i=0;i<words.length;i++){
//     if(words[i].length %2 === 0 && words[i].length>longestEven.length){
//         longestEven=words[i];
//     }
// }
// console.log(longestEven);

// let marks=[100,50,50,25]
// let k=2;
// function stdrank(marks,k){
//     let CurrentMark=marks[0],count=0,rank=1;
//     for(let i=0;i<marks.length;i++){
//         if(marks[i] === 0){
//             continue;
//         }
//         else if(CurrentMark !== marks[i]){
//             rank++;
//             CurrentMark=marks[i];
//         }
//         else if(rank <= k){
//             count++;
//         }
//         else{
//             break;
//         }
//     }
//     return count;
// }
// console.log(stdrank(marks,k));

//Data types
// let a=10;
// console.log(a);           //10
// console.log(typeof(a));   //Number
// a="venky";
// console.log(a);       //venky
// console.log(typeof(a)); //String
// a=true;
// console.log(a);        //true
// console.log(typeof(a)); //Boolean
// a=undefined;   
// console.log(a);    //NaN
// console.log(typeof a); //NaN
// a=null;
// console.log(a);   //null
// console.log(typeof a); //object

//Number Data type
// Default vale is zero(0)
// let a=Number(10);
// console.log(a);   //10
// console.log(typeof a);  //number
// a=Number("vrnky");   
// console.log(a);          //NaN
// console.log(typeof a);     //Number
// a=Number(true);  
// console.log(a);          //1 (If it is false it will become 0)
// console.log(typeof a);    //number
// a=Number(undefined);  
// console.log(a);           //NaN
// console.log(typeof a);      //Number
// a=Number(null);    
// console.log(a);          //0
// console.log(typeof a);       //Number



//String Data type
// Default is emptyspace ""
// let str=String(10);
// console.log(str)  //10
// console.log(typeof str)  //string
// str=String("venky");
// console.log(str)   //venky
// console.log(typeof str) //String
// str=String(true);
// console.log(str)  //true
// console.log(typeof str)  //String
// str=String(undefined)  
// console.log(str)  //undefined
// console.log(typeof str)  //String
// str=String(null)  
// console.log(str)  //null
// console.log(typeof str)  //String

//Boolean Data type
// Default value is false(0)
// let con=Boolean(10);
// console.log(con);    //true
// console.log(typeof con);  //boolean
// con=Boolean("venky"); 
// console.log(con);   //true
// console.log(typeof con);   //boolean
// con=Boolean(false);
// console.log(con);   //false
// console.log(typeof con);   //boolean
// con=Boolean(undefined) 
// console.log(con);   //false
// console.log(typeof con);   //boolean
// con=Boolean(null);
// console.log(con);   //false
// console.log(typeof con);   //boolean


// Operators
// console.log(true+"false");  //truefalse
// console.log(10*"10");  //100
// console.log(true*"false");  //NaN
// console.log(10*"false"); //NaN     "false" is String boolean value can't convert to it actual value so we geting not a number
// console.log(10-"false");  //NaN
// console.log(false-'10');   //-10     "10" is converting 10 inplictly so operation is working


// Control statements
// conditional Statements
// let a=1
// switch(null){
//     case "A":
//             b=10;
//             console.log(a+b);
//              break;
//     case "B":
//             b=20;
//             console.log(a+b);
//             break;
//     case "C":
//             b=30
//             console.log(a+b);
//             break;
//     case "D":
//             b=40;
//             console.log(a+b);

                                        //Any thing i can pass in swith case i will accept and compile
// }

// let a=1
// switch(null){
//     case "A":{
//             b=10;
//             console.log(a+b);
                // }
//              break;
//     case "B":{
//             b=20;
//             console.log(a+b);
                //}
//             break;
//     case "C":{
//             b=30
//             console.log(a+b);
                //}
//             break;
//     case "D":{
//             b=40;
//             console.log(a+b);
                //}
// }


// Looping Statements
// let i=0;
// for(console.log("Hello") ; i<=5 ;console.log("world")){
//     console.log("Bye");
//     i+=2;
// }


// Functions
// General Function
// function general(){
//     console.log("I am In General function")
// }
// general();

// //Anonyomous Function
// let Ano=function(){
//     console.log("i am In anonyomous Function");
// }
// Ano();
// //Arrow Function
// let Arr=()=>{
//     console.log("I am In Arrow Function");
// }
// Arr();
// // Special behavior of arrow function

// let SArr= a =>{
//     console.log(a);
// }
// SArr(200);
// SArr("I am In single parameter Arrow function");

// //no paramenter arrow function

// let Nopar=_=>{
//     console.log("I am in no parament arrow function");
// }
// Nopar();
// //Single return value arrow function
// let ORet=()=> "i am in no return arrow function";
// console.log(ORet);
// //self Invoke function
// (function(){
//     console.log("I am in Self invoke function")
// }());  //I can my self invoke function from inside or outside of block

// //Higher order function and call back function
// function callBac(){
//     return 100;
// }
// function add(a){
//     return a+" i am in Higher order and call backfunction";
// }
// let value=add(callBac());
// console.log(value);



// Objects

//In object there total three type of decliration that are
// 1.Direct literal
// 2.using new keyword
// 3.function consectetur

//1.Direct Literal
// let obj={
//     lname:"Venatesh",
//     age:22,
//     color:"brown",
//     add:function(){
//         console.log(10,20)
//     },
//     pen:{
//       he:"10MM",
//       wd:"5MM",
//       work:"Writting",
//       cost:50
//     }
// }
// obj.fname="Akula";
// console.log(obj);
// console.log(obj.add());  //calling function in object
// console.log(obj.pen);
// console.log(obj.age);
// delete obj.color;  //deleted
// console.log(obj);
// console.log(typeof obj);   //object
// console.log(typeof obj.add);  //function

// //subscript operator
// console.log(obj["lname"]); //calling object in sub script operator


//Using new key word
//using new key we can convert inplict/explecit method into object
// let DateObj=new Date();
// console.log(DateObj);
// console.log(DateObj.toLocaleTimeString());
// console.log(DateObj.toDateString());
// console.log(DateObj.getHours());
// console.log(DateObj.getMonth());
// console.log(DateObj.getMinutes());
// console.log(DateObj.getTimezoneOffset());
// console.log(DateObj.getFullYear());
// console.log(DateObj.getDay());
// console.log(DateObj.getDate());


// //constructor function
// function fun(company,color,cost){
//     this.com=company;
//     this.col=color;
//     this.price=cost;
// }
// let pe=new fun("BMW","White","3 lakhs")
// console.log(pe);
// console.log(pe.price);


//Array
// let arr=[10,20,30,40,50];
// delete arr[0];
// console.log(arr);
// arr[arr.length]="Hii";
// console.log(arr);
// arr[0]="Welcome";
// console.log(arr);
// //push method
// arr.push(true);
// console.log(arr);
// //pop method
// arr.pop();
// console.log(arr);
// //unshift method
// arr.unshift("Bye");
// console.log(arr);
// //shift method
// arr.shift();
// console.log(arr);
//splice
//removing my elements to arr
// arr1=['Bye', 'Welcome', 20, 30, 40, 50, 'Hii']; 
// arr1.splice(1,3);
// console.log(arr1);
// //adding of elements to arr
// arr1.splice(3,0,77,"good to hava");
// console.log(arr1);

//map method  it just work like for loop
// arr=['Bye', 'Welcome', 20, 30, 40, 50, 'Hii']; 
// let modifity=arr.map((ele,index,e)=>{
//     console.log(ele,index);
//     return ele;
// })
// console.log(modifity);

//filter method   i work when the condition true with proper arr
// arr.filter((ele)=>{
//     if(ele%2 == 0){
//         console.log(ele);
//     }
// })

// reduce method (i will convert hole arr into single arr by perform operation)
// arr=[10,20,30,44,55,66];
// let collect=arr.reduce((pval,cval)=>{
//     return (pval*cval);
// })
// console.log(collect);

//sort method it is use to sort the element in the prfered order
/// arr=[23,34,345,2,322,645,112];
// let sortedArr=arr.sort((a,b)=>{
//     return a-b;                     //a-b asscending order
// });
// console.log(sortedArr);

// let desending=arr.sort((a,b)=>{
//     return b-a;                    //b-a decending order;
// })
// console.log(desending);


//
// arr=[121,3,3.3,4.4,3,3235,42,23,2,34,45];
// console.log(arr.indexOf(4.4));  //indexOf()  display index  search from first
// console.log(arr.lastIndexOf(23))  //lastIndexOf() display the index search from last
// console.log(arr.includes(3234));  //includes() will check the if it is present or not in are return boolean
// console.log(arr.join(""));    // i will join all the arr into single word
// console.log(arr.flat());   //i will sub arr into single array;

// spread operator
// let x=[10,20,30];
// let y=[45,55,65];
// let arr=[...x,y];  //it take element and spread all elements into non array form
// console.log(arr);

// let arr2=[x,...y];
// console.log(arr2); 


//combination of rest and spread operator
// function fun(...a){        //rest operator      (take all argument in one shot in the form of array) 
//     console.log(a); 
//     console.log(...a);        //spread operator   (convert array into non-array elements)  
// }
// fun(10,20,30,40,"hii");


//Math functions
// arr=[121,3,3.3,4.4,3,3235,42,23,2,34,45];
// console.log(Math.PI);  //Pi value
// console.log(Math.max(...arr));  //rest operator
// console.log(Math.min(...arr));   //rest operator     
// console.log(Math.pow(2,3));   //2 power 3
// console.log(Math.random());  //Print some random value

// Generate otp
// function OTPGenerator(){
//     let value=Math.random()*10000;
//     let OTP=Math.floor(value);
//     if(OTP > 999){
//        let str= document.body.innerHTML=`<h1>${OTP}</h1>`;
//     }
//     else{
//         OTPGenerator()
//     }
// }
// OTPGenerator();

//Events

// onclick event this events wil work on only when we are clicking
//onclick event
// let activity=()=>{
//     console.log("onclick event");
//     document.body.innerHTML+=`Heartly welcome <br>`;
// }
//ondblclick event
// let action=()=>{
//     console.log("I am on on double click event");
//     // document.body.innerText +="Hello world" //it is taking only inner text from the body
//     document.body.innerHTML += " Hello world ";
// }


//onmouse events
// let countkey=()=>{
//     console.log("I am in omouse over event");
// }

// let i=0;
// let OKP=()=>{
//     console.log(i++);
//     console.log("I am On onkey Press events");
// }

// let OKD=(e)=>{
//     console.log(e.target.value);
//     console.log("I am on onkey down mode");
   
// }

// let OKUP=(e)=>{
//     console.log("I am on onkeyup state");
//     console.log(e.taret);
//     console.log(e.target.value);
// }


//onsubmit event
// let FS=(e)=>{
//     e.preventDefault(); 
//     console.log(e);                  //i will print hole event
//     console.log(e.target);           //here i will select all input fields           (//Only in form target attribute had in the form of index )
//     console.log(e.target[0]);           //i will select only first input field
//     console.log(e.target[0].value);      //it will select only the contect of the input field
//     console.log(e.target[1].value);
//     console.log(e.target[2].value);
//     console.log(e.target[3].value);
//     console.log(e.target[4].value);
//     console.log(e.target[5].value);
// }

// let Dateobj=new Date();
// let ca=(e)=>{
//     e.preventDefault();
//     DOB=e.target[0].value;
//     console.log(DOB);
//     let year=Dateobj.getFullYear()-DOB;
//     console.log(year);
//     document.body.innerHTML += `<h1>${year}</h1>`;
// }


// popup event
// let conformation=()=>{
//     let str=prompt("enter the name:")
//     // console.log(typeof str); //if i have click ok i will take empty string or click cancle i will give as null
//     // document.body.innerHTML +=`${str}`;
//     if(str === '' || str===null){
//         let con=confirm("do you want to exit");
//         if(con===true){
//             alert("Bye bye");
//         }
//         else{
//             prompt("enter the name");
//             alert("thank you");
//         }
//     }
//     else{
//         alert("Application submited");
//     }
// }

// console.log(window.screen)  //display about the screen
// console.log(window.location);  //display about the file location
// console.log(window.history);// have number of pages visited history
// console.log(window.navigator);  //Givem about language,version etc
// console.log(window.document);  //It ia complete document or html of a body


//timeing functions
// setTimeOut
// let y=()=>{
//     console.log("it working on setTimeOut");
// }
// // setInterval
// let a=()=>{
//     console.log("I working with setInterval");
// }

// let str=document.getElementsByTagName('span');
// let STI=()=>{
//     let dateObj=new Date();
//     str[0].innerHTML =`<h1>${dateObj.getHours()}</h1>`
//     str[1].innerHTML =`<h1>${dateObj.getMinutes()}</h1>`
//     str[2].innerHTML =`<h1>${dateObj.getSeconds()}</h1>`
// }

//Document Object model

//change of content in html
// let str=document.querySelector('button');
// let cxt=document.getElementsByClassName('contect')[0];
// let mode=()=>{
//     text=str.innerText;
//     if(text == 'Dark'){
//         document.body.style.background=`black`;
//         cxt.innerHTML=`<h1>Dark Mode</h1>`
//         cxt.style.cssText=`color:white;`
//         str.innerText='Light'
//     }
//     else{
//         document.body.style.cssText=`background:white;`
//         cxt.innerHTML=`<h1>Light Mode</h1>`
//         cxt.style.cssText=`color:black;`
//         str.innerText='Dark';
//     }
// }


// //getting src attribute
// let str=document.getElementsByTagName('img');
// // console.log(str);
// let sr0=str[0].getAttribute('src');
// // console.log(sr);
// str[2].src=`${sr0}`;

// to add and remove of elements

// IdArray=document.getElementById('A');
// // console.log(IdArray);
// IdArray.classList.add("you");
// console.log(IdArray);

// classArray=document.getElementsByClassName('ART')[0];
// // console.log(classArray);
// classArray.classList.add('welcome');
// classArray.classList.add('Bye');
// console.log(classArray);            //adding of elements
// classArray.classList.remove('Bye');
// console.log(classArray);          //removing of elements

// let divsel=document.getElementsByTagName('div');
// console.log(divsel);
// divsel[0].classList.toggle('hash')
// console.log(divsel[0]);
// divsel[1].classList.toggle('on');
// console.log(divsel[1]);

// let selinp1=document.getElementsByTagName('input')[0];
// let selinp2=document.getElementsByTagName('input')[1];
// let validation=(e)=>{
//     e.preventDefault();
//     let inp1=e.target[0].value;
//     let inp2=e.target[1].value;
//     if(inp1 !== "venky" || inp1===""){
//         selinp1.style.cssText=`border:solid 5px red;`
//         selinp2.style.cssText=`border:solid 2px black;`
//     }
//     else if( inp2 !== '12345' || inp2===""){
//         selinp2.style.cssText=`border:solid 5px red;`
//         selinp1.style.cssText=`border:solid 2px black;`
//     }
//     else{
//         console.log("Welcome to page")
//         selinp1.style.cssText=`border:solid 2px black;`
//         selinp2.style.cssText=`border:solid 2px black;`
//     }
// }

//create and append child
// let str=document.createElement('h1');
// str.innerText="hello";
// document.body.appendChild(str);

// let na="venkatesh"
// // console.log(na.startsWith('v'));        //i will check which letter it start with


// console.log(na.endsWith('h'));          //it will check the which will goning ends return boolean

// console.log(na.toUpperCase());         //change all string to upper case

// console.log(na.toLowerCase());         //i will change all value to lower case

// console.log(na.charAt(3))         // i will give the letter of the name

// console.log(na.charCodeAt(4))       //ASCII value of the word

// console.log(na.indexOf('n'));      // if it present return the position

// console.log(na.lastIndexOf('a'));    //if will return positon of a from the last

// console.log(na.substring(1,3));   //it return elements from the start to end value-1

// console.log(na.substr(0,3));          

// console.log(na.slice(0,9))      // i will return starting index to declared index elements

// console.log(na.trim());        //remove space front and end of string

// console.log(na.split(""));     //split hole elements as single elements into arr

// console.log(na.replace(3));

// arr=[1123,23,34];
// console.log(arr.join(""));        //array into single elements

//scope of a varabile
// {
//     var a=10;
//     let b=23;
//     const c=30;
//     console.log(c+2);
// }

// console.log(a);
// console.log(b);
// console.log(c);

// let a="Choclate"
// let state=new Promise((resolve,reject)=>{
//     if(a === 'Choclate'){
//         resolve("He given Choclate");
//     }
//     else{
//         reject("Break up");
//     }
// })
// // console.log(state);
// state.then((inc)=>{
//     console.log(inc);
// })
// state.catch((bye)=>{
//     console.log(bye);
// })


//api fetching

// let website=fetch("https://api.github.com/users");
// let obj=website.then((cxt)=>{
//     return cxt.json();
// })
// obj.then((del)=>{
//     del.map((ele)=>{
//         console.log(ele);
//         // document.writeln(ele.id);
//         // document.body.innerHTML +=`<h3>${ele.login}</h3>`
//         document.body.innerHTML +=` <div class="pic">
//                                     <img src=${ele.avatar_url}>
//                                     <h3>${ele.login}</h3>
//                                     </div>
//                                     `
//         document.body.style.cssText=`display:grid;
//                                     grid-template-columns:auto auto auto;
//                                     justify-content: space-between;                                                       
        
//         `
//     })
// })

// let str="Hello";
// console.log(str);
// let arr=str.split("");
// console.log(arr);                             //Important
// console.log(arr.reverse());
// console.log(arr.join(""));

// let str=document.querySelector('input');
// let inp=(e)=>{
//     let value=e.target.innerText;
//     str.value+=value;
// }
// let equal=()=>{
//     res=eval(str.value);
//     str.value=res;
// }
// let refresh=()=>{
//     str.value="";
// }


// let cre=document.createElement('input');
// cre.value="Thank you";
// document.body.appendChild(cre);
// cre.style.cssText=`border:solid 2px black;
//                     height:20px;
//                     width:20%;`

// let inp=document.getElementsByTagName('input')[0];
// console.log(inp);
// let dis=(e)=>{
//    console.log(e.target.value);
//    inp.value+=e.target.value;
// }


// let tar=document.getElementById('loop');
// let fun=(e)=>{
//     console.log(e.target.innerText);
//     tar.innerText+=e.target.innerText;
// }


// let done=(e)=>{
//     e.preventDefault();
//     console.log(e.target[0].value);
//     console.log(e.target[0]);
//     console.log(e.target[1].value);
// }



// let arr=[10,20,30];
// console.log(arr);
// console.log(typeof(arr));

// arr.push(50);
// console.log(arr);
// arr.pop();
// console.log(arr);
// arr.unshift(12);
// console.log(arr);
// arr.shift();
// console.log(arr);
// arr.splice(0,0,23,45,67);
// console.log(arr);
// arr.splice(1,2);
// console.log(arr);

// arr.map((ele)=>{
//     console.log(ele);
// })
// arr.filter((ele)=>{
//     if(ele%2 == 0){
//         console.log(ele);
//     }
// })
// let value=arr.reduce((a,b)=>{
//     return a+b;
// })
// console.log(value);
// let ascOrd=arr.sort((a,b)=>{
//     return a-b;
// })
// console.log(ascOrd);
// let decOrd=arr.sort((a,b)=>{
//     return b-a;
// })
// console.log(decOrd);


let github=fetch("https://api.github.com/users");
// console.log(github);
let url=github.then((ele)=>{
    return ele.json();
})
url.then((arr)=>{
   arr.map((link)=>{
    console.log(link);
   })
})

let pro=new Promise((resolve,reject)=>{
    if(true){
        resolve("Hiii");
    }
    else{
        reject("Bye");
    }

})
pro.then((ele)=>{
    console.log(ele);
})