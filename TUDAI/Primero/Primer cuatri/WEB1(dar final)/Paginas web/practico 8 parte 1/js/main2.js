let BTN_Dom=document.querySelectorAll('#CargaAjax');
BTN_Dom.forEach(e => e.addEventListener('click',CargarAjax));
function Alerta(t){
    let container = document.querySelector("#Impresodesdeajax");
    container.innerHTML=t;
    container.querySelectorAll(".js-comportamiento").forEach(e => e.addEventListener('click', () =>
    {alert("Botonn")}))
}
function CargarAjax(evento){
    event.preventDefault();
    document.querySelector("#Impresodesdeajax").innerHTML+=`<h1>${"Loading"}</h1>`
    fetch("http://web-unicen.herokuapp.com/api/html").then(response =>{
        if(response.ok){
            response.text().then(Alerta)
        }
    })
    .catch(error =>{
        console.log("error")
    })
}
