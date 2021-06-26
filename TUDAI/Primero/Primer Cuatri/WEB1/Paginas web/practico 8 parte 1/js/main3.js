"use strict";
document.addEventListener('DOMContentLoaded',function(e){
    document.querySelectorAll('.CargaAjax').forEach(e => e.addEventListener('click', CargarAjax))
    function Alerta(t){
        let container = document.querySelector(".Impresodesdeajax")
        container.innerHTML = t
        document.querySelectorAll(".js-comportamiento").forEach(e=>e.addEventListener('click',()=>{
            alert("Boton")
        }));
    }
    async function CargarAjax(e){
        event.preventDefault();
        let container = document.querySelector('.Impresodesdeajax');
        container.innerHTML = `<h1> ${"Loading ..."} </h1>`
        try{
            let respones = await fetch("http://web-unicen.herokuapp.com/api/html")
                let r = await respones.text();
                container.innerHTML = r;

        }catch{

        }
    }
})
let btnDistinto = document.querySelectorAll('#CargaAjaxDistintos');
for(let i=0;i<btnDistinto.length;i++){
    btnDistinto[i].addEventListener('click',function(e){
        let el = this.previousElementSibling;
        
    })
}
