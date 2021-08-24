    const url='https://web-unicen.herokuapp.com/api/groups/ejemplos/nombres'
    let list = document.querySelector('#ListAjax');
    async function ReadFromAjax(){
        try {
            let response = await fetch(url);
            let json = await response.json();
            console.log(json)
            console.log(response)
            console.log(json.nombre)
            for (const iterator of json.nombres) {
                let name = JSON.stringify(iterator.thing.nombre)
                id = JSON.stringify(iterator._id)
                list.innerHTML +=`<li>${name},${id}</li>`
                console.log(name)
            }
        } catch (error) {
            console.log(error)
        }
    }
    async function BorrarUltimo(){
        try {
            let response = await fetch(`${url}`,{
                "method":"DELETE",
            })
            if(response.status===200){
                document.querySelector('#MSG').innerHTML = "Eliminado"
            }
        } catch (error) {
            
        }
    }
    document.querySelector('#BTN-Borrar').addEventListener('click',BorrarUltimo);
    ReadFromAjax()
