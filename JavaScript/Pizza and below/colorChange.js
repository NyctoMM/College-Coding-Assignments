function color1(){
    var p1 = document.getElementById("p1")
    p1.style.backgroundColor = "tomato";

}

function color2(){
    var p2 = document.getElementById("p2")
    p2.style.backgroundColor = "lime";

}

function color3(){
    var p3 = document.getElementById("p3")
    p3.style.backgroundColor = "cyan";

}

function arrayValue() {
    var array = document.getElementsByTagName('p');
    for(var i = 0; i < array.length; i++){
        array[i].style.backgroundColor="white";
    }
}