var spidermodal = document.getElementById("spidermodal");

var spiderbtn = document.getElementById("spidergang");

var spiderspan = document.getElementsByClassName("spiderclose")[0];

spiderbtn.onclick = function() {
  spidermodal.style.display = "block";
}

spiderspan.onclick = function() {
  spidermodal.style.display = "none";
}

spidermodal.onclick = function(event) {
  if (event.target == spidermodal) {
    spidermodal.style.display = "none";
  }
}