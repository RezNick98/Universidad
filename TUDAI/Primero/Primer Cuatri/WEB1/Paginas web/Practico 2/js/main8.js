"uses strict";
let btn_operation = document.querySelector("#Perform-operation").addEventListener("click",PerformOperation);
function PerformOperation(){
    let Operation=document.querySelector("#Selector").value
    let Op1=parseInt(document.querySelector("#Op1").value);
    let Op2=parseInt(document.querySelector("#Op2").value);
    let Result;
    if(Operation=="Sum"){
        Result=Op1 + Op2;
    }else if(Operation=="Substraction"){
        Result= Op1- Op2;
    }else if(Operation=="Multiplication"){
        Result= Op1 * Op2;
    }else if(Operation=="Division"){
        Result= Op1 / Op2;
    }

    document.querySelector("#Result").innerHTML=Result
}
