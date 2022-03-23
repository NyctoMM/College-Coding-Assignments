/*
Write an .html file with a \
body that contains at least 
five lines of text, copy from
 a news site if you wish. 
 Create a style with fonts, 
 size and font color. Have three 
 buttons that will increase and decrease 
 the font size and one that will return it 
 to the original size.
 */
Normalfontsize = 16;
newFontSize = 24;
 function fontNormal(){
    for(x=1; x<6; x++) {
        let paragraph = document.getElementById(x);
        let newSize = parseFloat(Normalfontsize);
        paragraph.style.fontSize = newSize + 'px';
    }
}
function fontLarger(){
    for(x=1; x<6; x++) {
        let paragraph = document.getElementById(x);
        let newSize = parseFloat(window.getComputedStyle(document.getElementById(x)).fontSize);
        paragraph.style.fontSize = (newSize + 2) + 'px';

    }
}
function fontSmaller(){
    for(x=1; x<6; x++) {
        let paragraph = document.getElementById(x);
        let newSize = parseFloat(window.getComputedStyle(document.getElementById(x)).fontSize);
        paragraph.style.fontSize = (newSize -2) + 'px';

    }
}

