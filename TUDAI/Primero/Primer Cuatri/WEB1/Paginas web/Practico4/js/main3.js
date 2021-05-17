"uses strict"
let btn_change = document.querySelector("#ButtonChange").addEventListener("click",Change);

function Change(){
    document.querySelector(".Change").classList.toggle("NewAppearence");
}
