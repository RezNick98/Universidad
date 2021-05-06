"uses strict";
let btn_escondder=document.querySelector("#btn-esconder").addEventListener("click",EsconderDiv);
let btn_mostrar=document.querySelector("#btn-mostrar").addEventListener("click",MostrarDiv);
function EsconderDiv(){
    document.querySelector("#EsconderDiv").classList.remove("Mostrar");
    document.querySelector("#EsconderDiv").classList.add("Ocultar");
}
function MostrarDiv(){
    document.querySelector("#EsconderDiv").classList.remove("Ocultar");
    document.querySelector("#EsconderDiv").classList.add("Mostrar")
}
