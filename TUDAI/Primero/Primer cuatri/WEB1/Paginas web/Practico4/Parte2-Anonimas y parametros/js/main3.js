"use strict";
let botonCambio = document.querySelector("#Cambiatitulo").addEventListener('click',function(e){
    Cambiartitulo(botonCambio)
})




function Cambiartitulo(Boton){
   Boton = document.querySelector('#Titulo1').classList.toggle('Cambiado')
   Boton = document.querySelector('#Titulo2').classList.toggle('Cambiado')
   Boton = document.querySelector('#Titulo3').classList.toggle('Cambiado')
}