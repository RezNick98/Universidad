let btn_add = document.querySelector("#Add").addEventListener("click",Add);
let btn_remove = document.querySelector("#Remove").addEventListener("click",Remove);
let ListaTarea=[];
let contador = 0;
function Add(){
    let Tarea= document.querySelector("#Tarea").value;
    let existe=repetitive(Tarea);
    if (contador<10 && existe==false){
        ListaTarea.push(Tarea);
        console.log(ListaTarea);
        Show();
        contador+=1;
    }else{
        document.querySelector("#Alert").innerHTML= "Ya alcanzo el maximo de tareas o ya existe"
    }
    
}


function Show(){
    let lista=document.querySelector(".Lista");
    lista.innerHTML="";
    for(let n of ListaTarea){ //Recorre el arreglo
        lista.innerHTML+=`<li>${n}</li>` //Cada vez que recorre el arreglo agrega un li
    }
}
function repetitive(Tarea){
    for (let index = 0; index < ListaTarea.length; index++) {
        element = ListaTarea[index];
        if(Tarea == element){
            return true;
        }
    }
    return false;
}





function Remove(){
    ListaTarea.pop();
    Show();
    contador-=1
    document.querySelector("#Alert").innerHTML="";
}