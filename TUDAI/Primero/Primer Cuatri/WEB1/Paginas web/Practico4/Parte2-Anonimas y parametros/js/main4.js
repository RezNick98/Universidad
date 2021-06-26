"use strict";
let list = []
let agregar_tarea = document.querySelector('#AgregarTarea').addEventListener('click',function(e){
    console.log(AgregarTarea)
    if(list.length==10){
        document.querySelector("#limite").innerHTML="Alcanzo el limite de tareas"
    } else{
        AgregarTarea();
    }
})
function AgregarTarea(TareaNueva){
    TareaNueva = document.querySelector('#TareaNueva')
    list.push(TareaNueva.value)
    show();
}
function show(){
    let listaTarea=document.querySelector("#ListaTarea");
    listaTarea.innerHTML = "";
    for (let index = 0; index < list.length; index++) {
        listaTarea.innerHTML +=`<li> ${list[index]}</li>`
    }
}