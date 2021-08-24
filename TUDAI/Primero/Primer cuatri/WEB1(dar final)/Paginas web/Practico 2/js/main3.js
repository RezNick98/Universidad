"uses strict"
let btn1 = document.querySelector("#PrimerBoton").addEventListener("click",VerificarBTN1UltimoClickeado);
let btn2 = document.querySelector("#SegundoBoton").addEventListener("click",VerificarBTN2UltimoClickeado);
let btn3 = document.querySelector("#TercerBoton").addEventListener("click",VerificarBTN3UltimoClickeado);
function VerificarBTN1UltimoClickeado(){
    document.querySelector("#UltimnoClickeado").innerHTML="El ultimo clickeado fue el boton1"
}
function VerificarBTN2UltimoClickeado(){
    document.querySelector("#UltimnoClickeado").innerHTML="El ultimo clickeado fue el boton2"
}
function VerificarBTN3UltimoClickeado(){
    document.querySelector("#UltimnoClickeado").innerHTML="El ultimo clickeado fue el boton3"
}