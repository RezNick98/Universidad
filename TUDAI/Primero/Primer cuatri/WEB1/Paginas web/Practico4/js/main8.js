"uses strict";
let btn_promedio = document.querySelector("#CalcularPromedio").addEventListener('click',CalcularPromedio);
let btn_agregar= document.querySelector("#Agregar").addEventListener("click",Add);
let total_notas=[];
let total=0;
let contador=0;


function Add(){
    console.log("Dentro de la funcion")
    let nota=parseInt(document.querySelector("#AgregarNota").value);
    document.querySelector("#AgregarNota").value="";
    total_notas.push(nota);
    console.log(total_notas);
    total=nota+total;
    contador++;
    document.querySelector("#Notas").innerHTML=total;
}
function CalcularPromedio(){
    let promedio=total/contador;
    document.querySelector("#Promedio").innerHTML=promedio;
}