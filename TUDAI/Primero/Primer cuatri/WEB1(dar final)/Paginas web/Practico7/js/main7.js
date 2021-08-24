"uses strict";
document.querySelector("#ContarParrafos").addEventListener("click",ContarParrafos);
document.querySelector("#ContarItems").addEventListener("click",ContarItems);
document.querySelector("#ContarNoticias").addEventListener("click",ContarNoticias);

function ContarParrafos(){
    let pDom= document.querySelectorAll('p');
    let parrafo={

    }
    parrafo.cantidadp=pDom.length;
    console.log(parrafo.cantidadp);
}
function ContarItems(){
    let item={

    }
    let itemsDom=document.querySelector("#lista-menu").children;
    item.cantidaditem=itemsDom.length;
    console.log(item.cantidaditem);
}
function ContarNoticias(){
    let div={

    }
    let divDom=document.querySelectorAll('.noticias');
    div.cantidadDiv=divDom.length;
    console.log(div.cantidadDiv);
}