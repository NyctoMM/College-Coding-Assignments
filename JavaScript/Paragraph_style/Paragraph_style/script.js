//onload(alert("Loaded"));
function loadStuff(){

    alert('Hi');
}
function newStyle(x){
   x.style.color="Red";
   x.style.fontSize="20px";
   x.style.backgroundColor="Blue";
   //document.getElementById("Jim").style.color="Blue";
   //alert(x);
}
function oldStyle(x){
    x.style.color="Black";
    x.style.fontSize="1em";
    x.style.backgroundColor="White";
    let trueVal = getComputedStyle(x);
    
    //alert(trueVal.fontSize);
   // trueVal.fontSize = 4;
    
}
function submit(){
    let jim = document.getElementById("colors").value;

    alert(jim);
    document.body.style.backgroundColor = jim;

}