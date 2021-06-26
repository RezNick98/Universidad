"use strict"
let btn = document.querySelectorAll('.ver-mas')
for(let i=0;i<btn.length;i++){
    btn[i].addEventListener('click',function(e){
        let el = this.previousElementSibling;
        el.classList.toggle('Ver');
    })
}