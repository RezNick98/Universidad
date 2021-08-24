"uses strict"
let list = document.querySelector("#ListaAjax");
list.innerHTML = "";
async function ObtenerDatos1(){
    let url = 'https://jsonplaceholder.typicode.com/posts'
    try {
            let response = await fetch(url);
            let json = await response.json()
            for(const user of json){
               let usuario =  user.title;
               let id = user.id
                list.innerHTML += `<li>${id} ${usuario}</li>`;
            }
            console.log(json)
    } catch (error) {
        console.log(error)
    }
}
async function ObtenerDatos2(){
    let url = 'https://web-unicen.herokuapp.com/api/groups/ejemplos/nombres'
    try {
        let list2 =document.querySelector("#ListaAjax2");
        list2.innerHTML = "";
        let response = await fetch(url);
        let jsonAjax = await response.json();
        console.log(jsonAjax)
            list2.innerHTML +=JSON.stringify(jsonAjax)
    } catch (error) {
        
    }
}
ObtenerDatos1();
ObtenerDatos2();