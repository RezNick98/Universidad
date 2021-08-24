"use strict";
let boton1=document.querySelector("#Boton1").addEventListener('click',function(e){
    boton1="Boton1"
    click(boton1);
});
let boton2=document.querySelector("#Boton2").addEventListener('click',function(e){
    boton2="Boton2"
    click(boton2);
});
let boton3=document.querySelector("#Boton3").addEventListener('click',function(e){
    boton3="Boton3"
    click(boton3);
});



function click(Boton){
   document.querySelector("#UltimoClickeado").innerHTML="El ultimo clickeado fue " + Boton;
}