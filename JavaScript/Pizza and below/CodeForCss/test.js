function test(){
    let element = document.querySelector('.chapter-title');
    let style = getComputedStyle(element);
    let size = style.fontSize;
    alert(size);
}