document.querySelector("#EliminarParrafo").addEventListener('click',Delete);
function Delete(){
    let parrafoDom=document.querySelectorAll('.Parrafo');
    let parrafo={

    }
    parrafo.Cantidad=parrafoDom.length;
    console.log(parrafo);
}
