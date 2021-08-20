
let url = '`www.webstats.com/api/cliente/'
let listado=[];
listado.innerHTML = "";
async function CodigoaParcial(){
let response = await fetch(url);
let json = await response.json()
for (const iterator of json) {
let anio = acceso[iterator].anio
listado.innerHTML +=`<p>${anio}</p>`
}
}
async function InsertAcceso(){
 
let accesoDom = document.querySelector('#accesonuevo').value;
let accesos = {
"acceso":{
"nombre":name
}
}
try {
let response = await fetch(url,{
"method":"POST",
"headers":{"Content-type":"application/json"},
"body":JSON.stringify(accesos)
})
if (response.status===201){
document.querySelector("#MSG").innerHTML="Creado"
}
} catch (error) {
console.log(error);
}
}
document.querySelector('#Enviar').addEventListener('click',InsertAcceso)