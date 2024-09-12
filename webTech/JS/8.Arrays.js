// let arr1=[10,20,30,40,50,60];
// console.log(arr1);
// console.log(typeof arr1);

// let arr2=[10,"Hi",true,undefined,null,()=>{},{fname:'Dinga'},[10,20,30]]
// console.log(arr2);
// console.log(arr2[3]);
// console.log(arr2[6]);
// console.log(arr2[7]);

// //Modification
// let arr=[10,20,30,40,50]
// console.log(arr);

// //todo: Adding the array elements to the arrays
// arr[6] ="Added"
// console.log(arr);
//  //todo : Update the array element
//  arr[0]="Updated";
//  console.log(arr);
//  //todo:delete the array element
//  delete arr[1];
//  console.log(arr);
// let arr=[10,20,30,40,50,60];
// console.log(arr);
// for(let i=0;i<arr.length;i++){
//     console.log(`arr[${i}] = ${arr[i]}`);
// }

//WAP to display only numbers from this array list
// let array=[10,'hai',false,220,'Bye',null,'500',true,250,undefined];
// for(let i=0;i<array.length;i++){
//     if(typeof array[i] === 'number'){
//         console.log(array[i]);
//     }
// }

//Array Methods

//Methods
// push
// pop
// unshift
// shift
// splice

// let arr=[10,20,30,40,50]
// console.log(arr);
// console.log(arr.length)
// //push Method
// arr.push('Hi',500,true)
// console.log(arr);
// console.log(arr.length);
// //pop method
// arr.pop()  //here removing element and not storing value so that we are not knowing for of elements
// console.log(arr);
// let r1=arr.pop()
// console.log(arr);
// console.log(r1);
// let r2=arr.pop();
// console.log(arr);
// console.log(r2);

// //unshift
// arr.unshift('venky',22,'Male');
// console.log(arr);
// //shift
// arr.shift();
// console.log(arr);
// let s1=arr.shift()
// console.log(s1);
// console.log(arr);
// let s2=arr.shift();
// console.log(s2);
// console.log(arr);
//splice
// let arr=[10,20,30,40,50];
// console.log(arr);
// //Deleting the array elements from the array list
// let r1=arr.splice(1,3);  //inside the splice 1 number is starting index and 3 value is from the that 1 position next to 3 elements need to remove
// console.log(arr);
// console.log("deleted elements= "+r1 );

// //add the elements
// console.log(arr);
// arr.splice(1,0,'Hii','Welcome');  // splice(Static position or declered positin, delection count fron the static position, adding value upto what we need )
// console.log(arr);

// //Both(delete & add)
// arr.splice(3,1,false,'new3');
// console.log(arr);

//Higher order functions
//Map Method

// let arr=[10,20,30,40,50]
// let farr=arr.map((elem,position)=>{
//     console.log(elem);
//     console.log(position);
//     return elem;
// })
// console.log(farr);
// let arr = [2, 3, 5, 7]

// arr.map(function(element, index, array){
//     console.log(element);
//     //console.log(index);
//     //console.log(array);
//     //return element;
// }, 80);

// let arr=[1,2,3,4,5,6,7,8,9,10]
// // for(let i=0;i<arr.length;i++){
// //     console.log(arr[i]*arr[i]);
// // }
// let d=arr.map((elem)=>{
//     return elem*elem;
// })
// console.log(d);  //i can reduce this code
// let dred=arr.map((elem)=> elem*elem)
// console.log(dred);

//WAP to display from this arr
// let arr= [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
// let even=arr.map((elem,index)=>{
//     if(elem%2 === 0){
//         console.log(arr[index])
//         return arr[index];
//     }
// })
// console.log(even)

//Filter method
// let arr= [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
// console.log(arr);
// let res=arr.filter((elem)=>{
//     if(elem%2 === 0){
//         console.log(elem);
//     }
//     return elem%2 == 0;
// })
// console.log(res);

//WAP to print only string in the given string using arr in built method
// let arr=[10,'Winner',500,'Winner',true,'Chicken',220,false,'Dinner']
// let str=arr.filter((elem) => {
//     if(typeof elem === 'string'){
//         return elem;
//     }
// })
// console.log(str);
// console.log(arr.filter( elem => typeof elem==='string'));

//Reduce function 
// let arr=[2,4,5,3,6]
// let add=arr.reduce((previousValue,currentValue) => {
//     console.log(`the previous${previousValue} and current ${currentValue}`)
//     return previousValue+currentValue;
   
// })
// console.log(add);

// let arr1=[2,4,5,3,6]
// let add1=arr.reduce((previousValue,currentValue) => {
//     console.log(`the previous${previousValue} and current ${currentValue}`)

// })
// console.log(add1);

// let da=[4,false,20,'Jan',20,null+4,(true*4)]
// let res=da.reduce((pvalue,cvalue) => {
//     return pvalue+cvalue;
// })
// console.log(res);

//Sort Method
// let arr1=[2,4,8,1,7,3,5,9,6,0]
// console.log(arr1);
// let x1=arr1.sort((a,b)=>{
//     return a-b;  //Assending order
// })
// console.log(x1);

// let arr2=[2,4,8,1,7,3,5,9,6,0]
// console.log(arr2);
// let x2=arr2.sort((a,b)=>{
//     return b-a;  //Decending order
// })
// console.log(x2);
// //WAP to find second largest number
// let arr3=[2,4,8,1,7,3,5,9,6,0]
// let x3=arr3.sort((a,b) => a-b)
// console.log(x3[x3.length-2]);

// //example
// let str=['pqr','xyz','abc']
// console.log(str);
// let s=str.sort(); //sorted in ascending order
// console.log(s);

// //reverse method
// let r=s.reverse() //sorted in descending order
// console.log(r);

// let arr4=[2,4,8,1,7,3,5,9,6,0]
// console.log(arr4);
// let x4=arr4.sort().reverse();
// console.log(x4);
// console.log(x4[1]);

// //indexof()  method
// //indexOf will check from the front of the array 
// let color=["red","yellow","blue","black","green","crimson","pink","blue","white","purple"]
// console.log(color);
// let c1=color.indexOf('blue');
// console.log(c1);
// //lastIndexOf is used to check from back of the array
// let c2=color.lastIndexOf('blue');
// console.log(c2);
// let c3=color.indexOf('orange');
// console.log(c3);

// //includes give only booolean and to check it present or not
// let i=color.includes('green')
// console.log(i);
// let i2=color.includes('orange');
// console.log(i2);

//join method
//join is used to concatinate the string in the array
// let arr=["Winner","Winner","Chicken","Dinner"];
// console.log(arr);
// console.log(typeof arr);
// let j=arr.join(" ") //inside the join what are it going to take over there
// console.log(j);
// console.log(typeof j);

//flat method
//flat method is used to sub arrai into a single array
// let arr=[2,4,5,[1,2,3],4,8,9,[5,7]]
// console.log(arr);

// let f=arr.flat()
// console.log(f);

//Spread Operator(...) 
// let x=[10,20,30];
// let y=[15,25,35];
// let arr=[x,y];
// console.log(arr);

// let arr1=[...x,y]
// console.log(arr1);

// let arr2=[x,...y]
// console.log(arr2);

// //rest Operator
// function num(...a){ //... this dots acts like a rest operator
//     console.log(a); //[10,20,30,40,50]
//     console.log(...a); //10 20 30 40 50  //... this dots acts like a spread operator
// }
// num(10,20,30,40,50);

//WAP to find largest / maximum number from array
//WAP to find smallest/minimum nuber from th given arr
let arr=[52,40,82,71,75,13,50,98,64,30];
let x=arr.sort((pvalue,cvalue) =>{
    return cvalue-pvalue;
})
console.log(x[0]);
console.log(x[x.length-1]);
// PushManager,pop,unshift,shift,splice,map(),filter(),reduce(),indexOf(),lastIndexOf(),includes(),
let mx=Math.max(52,40,82,71,75,13,50,98,64,30);
console.log(mx);
