function fontFavorite(){
    let fontFamily = "";
    for(x=1; x<=6; x++) {
        if(document.querySelector('input[name=choice' + x +']:checked')) {
            fontFamily = fontFamily + document.getElementById("choice" + x).value + ", ";
        }
    }
    alert("You selected the following Fonts: " + fontFamily)
}

function changeParagraph(){
    for(x=1; x<4; x++) {
        let paragraph = document.getElementById("quote" + x);
        let newColor = document.getElementById("Color").value;
            paragraph.style.color = newColor;
        let newFont = document.getElementById("Family").value;
            paragraph.style.fontFamily = newFont;
        let newSize = parseFloat(document.getElementById("Size").value);
            paragraph.style.fontSize = newSize + 'px'
    }
}
