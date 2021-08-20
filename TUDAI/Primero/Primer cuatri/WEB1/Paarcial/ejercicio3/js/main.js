let listado =[];
function mostrar() {
    let t = document.getElementById("tabla-dinamica");

    t.innerHTML = " ";


    for (const i of listado) {

        t.innerHTML += 
        `<tbody>
            <td> ${i.modelo} </td>
            <td> ${i.color} </td>
            <td> ${i.precio} </td>
            <td> ${i.aireacondicionado}</td>
        </tbody>
        `
    }
    
}
document.querySelector('#AgregarAuto').addEventListener('click',function(e){
    let modelo = document.querySelector('#Modelo').innerHTML;
    let color = documenttt.querySelector('#color').innerHTML;
    let precio = docuemnt.querySelector('#precio').innerHTML;
    let aireacondicionado=documetn.querySelector('aireacondicionado').value
    let nuevoauto={
        'modelo':modelo,
        'color':color,
        'precio':precio,
        'aireacondicionado':aireacondicionado
    }
    listado.push(nuevoauto);
    mostrar();
})

document.querySelector('#con_aire_acondicionado').addEventListener('click',function(e){
    let conaire = docuemnt.querySelector('#Aireacondicionado');
    conaire.innerHTML = ''
  for (let index = 0; index < listado.length; index++) {
      `<tbody>
      <td>${index.modelo}</td>
      <td>${index.color}</td>
      <td>${index.precio}</td>
      </tbody>`
      
  }
})
document.querySelector('#sin').addEventListener('click',function(e){
    let sinaire = docuemnt.querySelector('#Sinaireacondicionado');
    sinaire.innerHTML = ''
  for (let index = 0; index < listado.length; index++) {
      `<tbody>
      <td>${index.modelo}</td>
      <td>${index.color}</td>
      <td>${index.precio}</td>
      </tbody>`
      
  }
})
