// let obj={

// }
// console.log(obj);
// console.log(typeof obj);


// let car={
//     carName : 'KIA',
//     carColor : 'red',
//     carModel : 2020
// }

// //Accessing the data from the Object
// //Using dot Operator
// console.log(`My car name is ${car.carName}`);

// //Using SubScript Operator
// let cc=car["carColor"];
// console.log(car["carColor"]);
// console.log(`Car color is ${cc}`);

// //Modification
// //Update the propety value
// //Syntax : objectName.proertyName = newValue
// car.carColor = 'black'
// console.log(car);

// //add the property
// //Syntax: ObjectName.newPropertyName=value
// car.carRegNo="KA 01 AB 420";
// console.log(car);

// //delete the property
// //syntax = delete objectName.propertyName
// delete car.carModel;
// console.log(car); 
//Example Program to objects
// let personObj={
//     fname:"Dinga",
//     lname:"Raja",
//     address:{
//         city:"goa",
//         pincode: 123456,
//     }
// }
// console.log(personObj.fname,personObj.lname+" is from "+ personObj.address.city);

// let personObj={
//     fname:"Dinga",
//     lname:"Raja",
//     dob:1947,
//     address:{
//         city:"goa",
//         pincode: 123456,
//     },
//     fullname: function(){
//         let res=`My name is ${this.fname} ${this.lname}`;
//         console.log(res);
//     },
//     calculateAge: function(){
//         let a=2024-this.dob;
//         console.log(a);
//     }
// }
// console.log(personObj.fname,personObj.lname+" is from "+ personObj.address.city);
// personObj.fullname();
// personObj.calculateAge();

// //Using new keyword
// let o=new Object();
// console.log(typeof o);

// //example 1
// let car=new Object();
// car.carName="KIA";
// car.carColor="BLACK";
// car.RegNo="AP 34 AB 008";
// console.log(car);
// delete car.RegNo;
// console.log(car);
// car.carName="BREZZA";
// console.log(car);

// //constructor Function
// function Person(){
//     this.fnm="Dinga"
//     this.lnm="Raja"
// }
// let p=new Person()
// console.log(typeof p);
// console.log(p);

function Person1(fname,lname){
    this.fnm=fname;
    this.lnm=lname;
}
let p1=new Person1('Dinga','Raja');
console.log(p1);
console.log(typeof p1);

let p2=new Person1('Dingi','Rani');
console.log(p2);
console.log(typeof p2);
