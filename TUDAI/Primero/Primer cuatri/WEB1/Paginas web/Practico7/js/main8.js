'use strict';
document.querySelector("#EliminarParrafo").addEventListener('click',Delete);
let parrafos=[{

}];

let parrafoDom=document.querySelectorAll('.Parrafo');
parrafos.push(parrafoDom.innerHTML)

function Delete(){
    for (let index = parrafoDom.length; index>0; index--) {
        parrafos.pop();
        
    }
    console.log(parrafos)
}
function show(){
    let i = document.querySelectorAll('.Parrafos')
    for (let i of parrafosDom) {
      i.innerHTML=`<p> ${i.parrafos}</p>`
        
    }
}