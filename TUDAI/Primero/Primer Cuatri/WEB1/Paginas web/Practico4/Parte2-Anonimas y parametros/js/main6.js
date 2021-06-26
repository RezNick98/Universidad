"use strict"
let list=[];
document.querySelector('#AgregarTarea').addEventListener('click',function(e){
    let existe = repetitive(Tarea)
    if(list.length<10 && existe==false ){
        AgregarTarea(Tarea);
    }else{
        document.querySelector('#limite').innerHTML="Ya llego a su limite de tareas o esa tarea ya existe"
    }
    show();
    console.log(list)
    console.log(existe);
})
function AgregarTarea(Tarea){
    Tarea=document.querySelector("#Tarea").value
    list.push(Tarea)
}
function repetitive(Tarea){
    Tarea=document.querySelector("#Tarea").value
    for(let index=0;index<list.length;index++){
        let element = list[index];
        if (element == Tarea){
            return true;
        }
    }
    return false
}
function show(){
    let listaDom = document.querySelector('#ListaTarea');
    listaDom.innerHTML= '';
    for (let i of list){
        listaDom.innerHTML+=`<li> ${i}</li>`
    }
}