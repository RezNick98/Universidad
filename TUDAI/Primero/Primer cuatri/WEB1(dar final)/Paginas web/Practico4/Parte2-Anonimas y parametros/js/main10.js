document.addEventListener('DOMContentLoaded',()=>{
    "uses strict"
    let comentarios = [];
    let name = document.querySelector('#Name').innerHTML;
    let email = document.querySelector('#email').value;
    let cometnarioDom = document.querySelector("#Comentario").value;
    document.querySelector('#AgregarComentario').addEventListener('click', () =>{
        for (const iterator of comentarios) {
            
        }
        console.log(comentarios)
    })
})