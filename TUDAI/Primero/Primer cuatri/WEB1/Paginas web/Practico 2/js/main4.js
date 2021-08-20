"uses strict";
let btn_agregar=document.getElementById("btn-Agregar").addEventListener("click",AgregarTarea);

function AgregarTarea(){
   let tarea=document.querySelector("#Tarea").value;
   let lista = document.createElement("li");
   lista.innerHTML ="Nueva tarea "+ tarea;
   list.appendChild(lista);
}

