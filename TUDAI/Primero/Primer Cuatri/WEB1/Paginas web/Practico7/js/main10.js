"use strict";
let tabla= [{
    "Nombre":"Barcelona FC",
    "Puntos":98,
    "pj":35,
    "pg":32,
    "pe":2,
    "pp":1,
}]
console.log(tabla);
let equiposDom=document.querySelector("#Equipos")
for (let index of tabla) {
    equiposDom.innerHTML+=`<td> ${tabla[0].Nombre} ${tabla[0].Puntos}${tabla[0].pj}</td>`
    console.log(index)
}