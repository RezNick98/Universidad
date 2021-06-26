"use strict";
let notas=[];
let total = 0;
document.querySelector('#AgregarNota').addEventListener('click',function(e){
    let Nota = parseInt(document.querySelector('#Notas').value)
    notas.push(Nota)
    Add(Nota)
})
document.querySelector('#Promedio').addEventListener('click',Promediar)
function Add(Notas){
   total = Notas+total;
}
function Promediar(){
    let Promedio=total/notas.length;
    console.log(Promedio)
    document.querySelector('#PromedioFinal').innerHTML=Promedio
}