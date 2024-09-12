// let str=String('Welcome');
// console.log(str);
// console.log(typeof str);
// console.log(str.length);
// console.log(str[0])
// console.log(str[length-1]);

// indexOf()
// lastIndexOf()        import string methods
// slice()
// split()


//String Methods
//todo: startWith & ends With Method
// let str='Welcome';
// let sw=str.startsWith('W');
// console.log(sw);

// console.log(str.startsWith('l'));
// console.log(str.startsWith('l',2));

// console.log(str.endsWith('e'));
// console.log(str.endsWith('m',6));

//todo: toUpperCase() & toLowerCase Method
// let str=` Lorem ipsum dolor, sit amet consectetur adipisicing elit. Repudiandae corrupti, possimus similique atque inventore officia fuga quia molestiae accusantium ipsam reprehenderit soluta minus commodi, recusandae illo! Laborum repellat deserunt excepturi?
// Odit voluptas maiores fuga officia quis consectetur! Molestias temporibus assumenda sapiente corporis totam inventore eveniet placeat, quos laborum voluptas sunt. Saepe consequuntur excepturi velit iure. Totam inventore laborum asperiores dignissimos.
// Expedita voluptas illo animi eligendi, laudantium accusamus, eum sunt, enim qui quam aperiam officia aut blanditiis consequatur cumque temporibus dicta aliquid omnis doloribus voluptatum ad unde numquam tempore fuga? Molestias!
// Dicta illo quo praesentium sed. Alias quod, sequi quos magnam ex corporis soluta. Explicabo voluptatem itaque possimus necessitatibus, minima quaerat perferendis. Possimus excepturi consequatur iure voluptatibus adipisci. Nam, nisi fugiat.
// Ut soluta accusamus quis accusantium provident, laudantium eaque, at hic autem consectetur error, molestias ratione rem deserunt facere ipsa ipsum dolore mollitia aspernatur adipisci sequi a rerum quaerat eveniet? Laudantium!`
// console.log(str);
// console.log(str.toUpperCase());
// console.log(str.toLowerCase());

//todo : charAt()  & charCodeAt Method
// let str='javascript';
// console.log(str.charAt(1)); //a
// console.log(str.charCodeAt(4)); //(s)115


//todo : indexOf() & lastIndexOf()
// let str='javascript';
// console.log(str.indexOf('a')) //1
// console.log(str.lastIndexOf('a')) //3
// console.log(str.indexOf('b')) //-1

//todo  substring,substr,slice
// let str='javascript'
// console.log(str.substring(0,4));//java
// console.log(str.substring(1,6));//avasc  //it will only move from left to right
// console.log(str.substring(4));//script
// console.log(str.substring(6,9));//rip

// console.log(str.substring(0,4));//java
// console.log(str.substring(1,4));//avas  
// console.log(str.substring(4,4));//scri

// console.log(str.slice(0,-6)); //java
// console.log(str.slice(-9,5)); //avas                                 //it will only move from left to right
// console.log(str.slice(-2,2)); //nothing will print space or empty


//todo: repeat method
// let str='javascript '
// console.log(str.repeat(3));

//todo: trim, method
// let str='              just looking like a wow                '
// console.log(str);
// console.log(str.length);

// let t1=str.trim();
// console.log(t1);
// console.log(t1.length);

// //todo: split method

// let s1=t1.split()
// console.log(s1);


// let s2=t1.split(' ');
// console.log(s2);

// let s3=t1.split('');
// console.log(s3);


//todo concat method

// let str1='welcome'
// let str2='JavaScript'
// console.log(str1+' to '+str2);
// console.log(str1,'to',str2);
// console.log(`${str1} to ${str2}`);
// console.log(str1.concat(' to ',str2));

// //fromCharCode
// console.log(String.fromCharCode(65));
// console.log(String.fromCharCode(90));

// console.log(String.fromCharCode(97));
// console.log(string.fromCharCode(122));


//!programs

// let printChar=(a,b)=>{
//     for(let i=a;i<=b;i++){
//         let ch=String.fromCharCode(i);
//         console.log(ch);
//     }
// }
// printChar(65,90);

// let printChar=(a,b)=>{
//     for(let i=a;i<=b;i+=2){
//         console.log(String.fromCharCode(i));
//     }
// }
// printChar(65,90);


//!todo: Reverse a string
// let str='Hello';
// for(let j=str.length-1;j>=1;j--){
//     // console.log(str[j]);
//     console.log(str.charAt(j));
//     str.
// }

//By inbuilt method
// let str='Hello'
// console.log(str);
// let res=str.split('').reverse().join('');
// console.log(res);

// let resstr=()=>{
//     let prom=prompt("enter the string to reverse");
//     console.log(prom);
//     let res=prom.split('').reverse().join('');
//     console.log(res);
// }

//todo check a polidrome
let checker=()=>{
    let str=prompt('Enter the string:');
    let res=str.split('').reverse().join('');
    console.log(res);
    (res === str)?console.log(`${str} is polindrome`):console.log(`${str} not a polindrome`);
    (res === str)?alert(`${str} is polindrome`):alert(`${str} not a polindrome`);

}