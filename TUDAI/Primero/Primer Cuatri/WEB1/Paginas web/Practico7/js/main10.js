"use strict";
let tabla= [{
    "Nombre":"Barcelona FC",
    "Puntos":98,
    "pj":35,
    "pg":32,
    "pe":2,
    "pp":1,
}]
document.querySelector("#RecorrerTabla").addEventListener('click',Recorrer)

console.log(tabla);
function Recorrer(){
    let equiposDom=document.querySelector("#Equipos")
    equiposDom.innerHTML="";
    for (let index of tabla) {
        equiposDom.innerHTML+=
        `<tr>
        <td>Nombre
        <td>Puntos</td>
        <td>pg</td>
        <td>pe</td>
        <td>pp</td>
        <td>pp</td>
        </tr>
        <tr>
        <td>${tabla[0].Nombre}</td> 
        <td>${tabla[0].Puntos}</td>
        <td>${tabla[0].pj}</td> 
        <td>${tabla[0].pg}</td> 
        <td>${tabla[0].pe}</td> 
        <td>${tabla[0].pp}</td>
        </tr>`
        console.log(index)
    }
}

document.querySelector("#ActualizarTabla").addEventListener('click',Actualizar)


function Actualizar(){
    let NombreDom=document.querySelector("#Nombre").value;
    let PuntosDom=document.querySelector("#Puntos").value;
    let PartidosJugadosDom=document.querySelector("#PartidosJugados").value;
    let PartidosGanadosDom=document.querySelector("#PartidosGanados").value;
    let partidosEmpatadosDom=document.querySelector("#PartidosEmpatados").value;
    let PartidosPerdidosDom=document.querySelector("#PartidosPerdidos").value;

    let equiposDom=document.querySelector("#Equipos-dinamico")
    for (let index of tabla) {
        equiposDom.innerHTML+=
        `<tr>
        <td>Nombre
        <td>Puntos</td>
        <td>pj</td>
        <td>pg</td>
        <td>pe</td>
        <td>pp</td>
        </tr>
        <tr>
        <td>${NombreDom}</td> 
        <td>${PuntosDom}</td>
        <td>${PartidosJugadosDom}</td> 
        <td>${PartidosGanadosDom}</td> 
        <td>${partidosEmpatadosDom}</td> 
        <td>${PartidosPerdidosDom}</td>
        </tr>`
        console.log(index)
    }
}
