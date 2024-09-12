//if statements
// if(true){
//     console.log('Welcome');
// }
// if(10 === 10){
//     console.log("Data & Datatype is Equal");
// }

// if(true){
//     console.log("Welcome");
// }
// else{
//     console.log("Tata Bye Bye");
// }
// //example
// let num=11;
// if(num%2 == 0){
//     console.log(`${num} is Even Number`);
// }
// else{
//     console.log(`${num} is odd number`);
// }

//example-2
// let gender="male";
// if(gender === "male"){
//     console.log("i am a boy 👦");
// }
// else{
//     console.log("i am a girl 👧");
// }

// let rcb="won";
// if(rcb === "won"){
//     console.log("E sala cup Namde");
// }
// else{
//     console,log("Next sala cup namde");
// }

// let num=0;
// if(num>0){
//     console.log(`${num} is + Number`);
// }
// else if(num<0){
//     console.log(`${num} is -ve Number`);
// }
// else{
//     console.log(`${num} is neither +ve nor -ve Number`);
// }

//Nested if
// let num=0;
// if(num>0){
//     document.writeln("Is positive number");
//     if(num%2 == 0){
//         document.writeln(num+" & is EVEN number");
//     }
//     else{
//         document.writeln(num+" & is ODD number");
//     }
//     }
//     else if(num<0){
//         document.writeln("Is -ve number");
//         if(num%2 == 0){
//             document.writeln(num+" & is EVEN number");
//         }
//         else{
//             document.writeln(num+" & is ODD number");
//         }
//     }
//     else{
//         document.writeln(num+" is neither positive nor negative number");
//     }

//Switch
let signal="red"
switch(signal){
    case "red":console.error("Stop ❤ Danger");
                break;
    case "yellow":console.warn("Be Ready 💛");
                break;
    case "green":console.log("Good tata bye bye 💚");
                break;
    default :console.log("RIP ☮");
}