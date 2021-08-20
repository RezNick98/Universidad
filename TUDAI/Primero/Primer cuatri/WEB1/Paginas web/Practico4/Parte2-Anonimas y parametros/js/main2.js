"use strict"
let contador=0
document.querySelector('#btn-1').addEventListener('click',function(e){
    contar(contador);
    console.log(contador)
})
document.querySelector('#btn-2').addEventListener('click',function(e){
    contar(contador)
    console.log(contador)
})
document.querySelector('#btn-3').addEventListener('click',function(e){
    contar(contador)
    console.log(contador)
})
function contar(){
    contador+=1;
}