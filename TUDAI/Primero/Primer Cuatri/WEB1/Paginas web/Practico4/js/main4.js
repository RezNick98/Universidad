let btn_add = document.querySelector("#Add").addEventListener("click",Add);
let btn_remove = document.querySelector("#Remove").addEventListener("click",Remove);
let ListaTarea=[];
let contador = 0;
function Add(){
    if (contador==10){
        document.querySelector("#Alert").innerHTML= "Ya alcanzo el maximo de tareas"
    }else{
        let Tarea= document.querySelector("#Tarea").value;
        ListaTarea.push(Tarea);
        console.log(ListaTarea);
        Show();
        contador+=1;
    }
}


function Show(){
    let lista=document.querySelector(".Lista");
    lista.innerHTML="";
    for(let n of ListaTarea){ //Recorre el arreglo
        lista.innerHTML+=`<li>${n}</li>` //Cada vez que recorre el arreglo agrega un li
    }
}




function Remove(){
    ListaTarea.pop();
    Show();
    contador-=1
    document.querySelector("#Alert").innerHTML="";
}