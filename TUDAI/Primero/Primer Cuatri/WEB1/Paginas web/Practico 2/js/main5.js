"uses strict";
let btn_enviar = document.querySelector("#btn-enviar").addEventListener("click",PonerNombreEnTitulo);
function PonerNombreEnTitulo(){
    let nombre = document.querySelector("#nombreTitulo").value;
    let apellido = document.querySelector("#apellidoTitulo").value;
    document.querySelector("#TituloFormulario").innerHTML=nombre+ " "+ apellido;
}