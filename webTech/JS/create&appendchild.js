let onOff = () =>{
    let btn=document.querySelector('button')

    let x=btn.classList.toggle('on')
    let y=btn.classList.toggle('off')

    console.log(x,y);
    let text=btn.innerText;
    (text==='ON') ? btn.innerText='OFF' : btn.innerText = 'ON';
}

let newElem = () =>{
    let newTag = document.createElement('h1')
    newTag.innerText='Hello'

    document.body.appendChild(newTag)
    console.log(newTag)
}
newElem()

let newElem1= (e) =>{
    e.preventDefault();
    let tagName=e.target[0].value
    let data=e.target[1].value

    let newTag=document.createElement(tagName)
    newTag.innerText=data
  
   document.body.appendChild(newTag)
  console.log(newTag)
}