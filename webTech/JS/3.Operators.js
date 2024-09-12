/* operator 
 Arithematic operator */
// let  fnm='Dinga';
// let lnm='Raja';
// let plc='Goa';
// let age=25;
// let deg='BE';
// let stream='CSE';
// let res="My name is "+fnm+" "+lnm+" I am from "+plc+" & My age is "+age+". i completed "+deg+" in the stream of "+stream+".";
// console.log(res);

// //Interpolation
// let res1=`My name is ${fnm} ${lnm} I am from ${plc} & my age is ${age}. I completed ${deg} in the stream of ${stream}.`;
//  console.log(res1);
//  console.log(`My name is ${fnm,lnm}`);

 // '+' Operator
// let a=10;
// let b='10';
// console.log(a+b);//1010
// console.log(a+a);//20;
// console.log(b+b);//1010;
// console.log(a,b);//10 '10';
// console.log(b,b);//10 10;
// console.log("Dinga","Raja"); //Dinga Raja
// console.log("DInga"+"Raja");//DingaRaja
// console.log('10'+'20');//1020
// console.log('10','20');//10 20;

// console.log(10+20); //30
// console.log(10+"20");//10120
// console.log(true+10);//11
// console.log('true'+10);//true10
// console.log(true+'10');//true10
// console.log(true+true);//2
// console.log(true+'false');//truefalse
// console.log(20-10);//10
// console.log(20-'10');//10
// console.log(10*'10');//100
// console.log(true*'true');//NaN
// console.log(true-false);//1
// console.log(true-'false');//NaN
// console.log(true-'20');//-19
// console.log('3'+'3'-'3'); //30

// //Excisce
// console.log(10+true-'10');//1
// console.log(true+10+'20'+10+true);//112010true
// console.log(10+true+'20'+(true+true)+10+1);//11202101
// console.log(true+true+'01'+2+(false+false)+(true+true)+4);//2012024

// console.log(1+null);//1
// console.log(1+undefined);//NaN
// console.log(NaN+NaN);//NaN
// console.log(NaN-NaN);//NaN
// console.log(null-"undefined");//NaN

// console.log(true+null+'NaN');//1NaN
// console.log('NaN'+true+null);//NaNtruenull
// console.log(null+true+NaN);//NaN

// let exp=10+20/5*2;
// console.log(exp);

// let a=10;
// let b="10";
// let c=10;
// console.log(a == c);  //true
// console.log(a == b);  //false
// console.log(a === c); //true
// console.log(a === b); //false

// console.log(!!false == !!"false"); //false

//bitwise operator
// console.log(5 & 1);
// console.log(5 | 1);

//Unary Operator
// let a=10;
// let b=5;
// let c=a++ + --b + ++a;
// console.log(c);  //26

// let e=10;
//  e=++e;
// console.log(e);
// //console.log(f);

// let a=10;
// console.log(a); //10

//  a+=2; //a=a+2
//  console.log(a); //12

//  a-=7; //a=a-7
//  console.log(a); //5

//  a*=10; //a=a*10
//  console.log(a); //50

//  a/=5; //a=a/5
//  console.log(a);

//turnary operators
(10 !== 10) ? console.log('Hai') : console.log('Bye');
(10 == 10) ? console.log('Hai') : console.log('Bye');

let x=10;
let y="10";
(x == y) ? console.log("Yes, It is True") : console.log("Yes, It is false"); //t
(x !== y) ? console.log("Yes, It is True") : console.log("Yes, It is false"); //t
(x === y) ? console.log("Yes, It is True") : console.log("Yes, It is false"); //f
(x != y) ? console.log("Yes, It is True") : console.log("Yes, It is false"); //
