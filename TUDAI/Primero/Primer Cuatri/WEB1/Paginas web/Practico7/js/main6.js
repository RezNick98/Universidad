"uses strict";
let Tabla = [{
    "Nombre":"Barcelona FC",
    "Puntos":98,
    "pj":35,
    "pg":32,
    "pe":2,
    "pp":1,
    },
    {
        "Nombre":"Atletico Madrid",
        "Puntos": 74,
        "pj": 35,
        "pg": 22,
        "pe": 8,
        "pp": 5,
    },
    {
        "Nombre":"Real Madrid",
        "Puntos": 81,
        "pj": 37,
        "pg": 24,
        "pe": 9,
        "pp": 4,
    },
    {
        "Nombre": "Sevilla FC",
        "Puntos": 74,
        "pj": 37,
        "pg": 23,
        "pe": 5,
        "pp": 9,

    },
    {
        "Nombre":"Real Sociedad",
        "Puntos": 59,
        "pj": 37,
        "pg": 16,
        "pe": 11,
        "pp": 10,

    },
]
console.log=(Tabla);
console.log=(Tabla[0]);
console.log=(Tabla.length);
let diferencia=parseInt(Tabla[0].Puntos-Tabla[1].Puntos);
document.querySelector("body").innerHTML="La diferencia de puntos es: "+ diferencia;