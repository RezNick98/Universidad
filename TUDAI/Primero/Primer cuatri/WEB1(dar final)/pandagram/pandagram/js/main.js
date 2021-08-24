"use strict";

let inputStatus = document.getElementById("input-status");
let boxPreview = document.querySelector(".preview");
let boxFeed = document.querySelector(".feed");

inputStatus.addEventListener("keyup", preview);

function preview() {
  console.log("Algun panda levanto una tecla!");
  boxPreview.innerHTML = inputStatus.value;
}

let btnPublish = document.getElementById("btn-publish");

btnPublish.addEventListener("click", publish);

function publish() {
  let post = document.createElement("div"); // <div></div>
  post.className = "post"; //<div class="post"></div>
  let span = document.createElement("span"); // <span></span>
  span.innerHTML = "Panda dice:"; //<span>Panda dice:</span>
  let status = document.createElement("p"); //<p></p>
  status.innerHTML = inputStatus.value; //<p>Lo que esta en el input de status</p>
  post.appendChild(span); //<div class="post"><span>Panda dice:</span></div>
  post.appendChild(status);
  //<div class="post">
  //<span>Panda dice:</span>
  //<p>Lo que esta en el input de status</p>
  //</div>

  boxFeed.appendChild(post);
  inputStatus.value = "";
  boxPreview.innerHTML = "";
}
