var name = document.getElementsByClassName("name")
var video = document.getElementsByClassName("video")
var triangleamv = document.getElementById("triangleamv")
var trianglebatshit = document.getElementById("trianglebatshit")
var trianglefuck = document.getElementById("trianglefuck")
var trianglerap = document.getElementById("trianglerap")
var triangleyear = document.getElementById("triangleyear")
var amv = document.getElementById("amv")
var batshit = document.getElementById("batshit")
var fuck = document.getElementById("fuck")
var rap = document.getElementById("rap")
var year = document.getElementById("year")

function displayamv() {
    amv.style.display="block";
    batshit.style.display="none";
    fuck.style.display="none";
    rap.style.display="none";
    year.style.display="none";
    triangleamv.innerHTML="&#9660;";
    trianglebatshit.innerHTML="&#9654;";
    trianglefuck.innerHTML="&#9654;";
    trianglerap.innerHTML="&#9654;";
    triangleyear.innerHTML="&#9654;";
}

function displaybatshit() {
    amv.style.display="none";
    batshit.style.display="block";
    fuck.style.display="none";
    rap.style.display="none";
    year.style.display="none";
    triangleamv.innerHTML="&#9654;";
    trianglebatshit.innerHTML="&#9660;";
    trianglefuck.innerHTML="&#9654;";
    trianglerap.innerHTML="&#9654;";
    triangleyear.innerHTML="&#9654;";
}

function displayfuck() {
    amv.style.display="none";
    batshit.style.display="none";
    fuck.style.display="block";
    rap.style.display="none";
    year.style.display="none";
    triangleamv.innerHTML="&#9654;";
    trianglebatshit.innerHTML="&#9654;";
    trianglefuck.innerHTML="&#9660;";
    trianglerap.innerHTML="&#9654;";
    triangleyear.innerHTML="&#9654;";
}

function displayrap() {
    amv.style.display="none";
    batshit.style.display="none";
    fuck.style.display="none";
    rap.style.display="block";
    year.style.display="none";
    triangleamv.innerHTML="&#9654;";
    trianglebatshit.innerHTML="&#9654;";
    trianglefuck.innerHTML="&#9654;";
    trianglerap.innerHTML="&#9660;";
    triangleyear.innerHTML="&#9654;";
}

function displayyear() {
    amv.style.display="none";
    batshit.style.display="none";
    fuck.style.display="none";
    rap.style.display="none";
    year.style.display="block";
    triangleamv.innerHTML="&#9654;";
    trianglebatshit.innerHTML="&#9654;";
    trianglefuck.innerHTML="&#9654;";
    trianglerap.innerHTML="&#9654;";
    triangleyear.innerHTML="&#9660;";
}