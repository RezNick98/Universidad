const url='https://web-unicen.herokuapp.com/api/groups/ejemplos/nombres'
let list = document.querySelector('#ListAjax');
async function listaAjax(){
    try {
        let response = await fetch(url);
        let json = await response.json();
        console.log(json)
        for (const user of json.nombres) {
            let name = JSON.stringify(user.thing.nombre)
            list.innerHTML += `<li>${name}</li>`
            console.log(name)
        }
    } catch (error) {
        
    }
}
async function EnvioDatos(){
    let name = document.querySelector('#Nombre').value;
    let user = {
        "thing":{
            "nombre":name
        }
    }
    try {
        let response = await fetch(url,{
            "method":"POST",
            "headers":{"Content-type":"application/json"},
            "body":JSON.stringify(user)
        })
        if (response.status===201){
            document.querySelector("#MSG").innerHTML="Creado"
        }
    } catch (error) {
        console.log(error);  
    }
}
listaAjax();
document.querySelector('#Enviar').addEventListener('click',EnvioDatos);