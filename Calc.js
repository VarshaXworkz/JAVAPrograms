let displayEl = document.querySelector('.display');
let buttons = Array.from(document.querySelectorAll('#buttons'));

buttons.map((button)=> {
button.addEventListener('click', (e)=> {
let input= e.target.innerText;

switch(input) {
  case 'C':
   displayEl.innerText = " ";
   break;

case'=':
   try {
     displayEl.innerText = eval(displayEl.innerText);
    } catch {
     alert("Invalid expression");
     displayEl.innerText = " ";
    }
    break;

case 'Back':
    if(displayEl.innerText) {
   displayEl.innerText = displayEl.innerText.substring(0, displayEl.innerText.length - 1);
}
break;       

default :
              displayEl.innerText=displayEl.innerText+input;
       }
    })
})