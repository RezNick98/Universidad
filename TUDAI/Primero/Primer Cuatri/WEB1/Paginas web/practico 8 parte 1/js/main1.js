let cargarAjaxBtn = document.querySelectorAll('#CargaAjax');
cargarAjaxBtn.forEach(e => e.addEventListener('click',CargaAjax))
function CargaAjax(event){
    event.preventDefault();
    fetch("http://web-unicen.herokuapp.com/api/html").then(response =>{
        console.log(response);
        response.text().then(text =>{
            document.querySelector('#Impresodesdeajax').innerHTML=text
        })
    })
}