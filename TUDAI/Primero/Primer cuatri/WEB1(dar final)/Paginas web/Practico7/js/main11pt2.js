document.addEventListener('DOMContentLoaded',function (){
    "use strict"
    document.querySelector('#AgregarTarea').addEventListener('click',AgregarTarea);
    let lista=[{
        "Tarea1":"Hacer las compras",
        "Tarea2":"Cursar"
    }]
    function AgregarTarea(){
        let listaDom=document.querySelector("#lista-dinamica")
        let AgregarTareaDom=document.querySelector('#AgregarTarea-dom').value;
        for (let index = 0; index < lista.length; index++) {
            listaDom.innerHTML+=`<li>${AgregarTareaDom}</li>`
    
            
        }
        
    }
    function Show(){
        let listaDom=document.querySelector("#lista-dinamica");
        listaDom.innerHTML='';
        for(let i=0;i<lista.length;i++){
            listaDom.innerHTML+=`<li>${lista[0].Tarea1}</li>`+`<li>${lista[0].Tarea2}</li>`
        }
    }
    Show();
})