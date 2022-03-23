    function mouseOver(x) {
      x.style.color = "blue";
    }
    
    function mouseOuter(x) {
      x.style.color = "black";
    }

    function submit() {
      let color = document.getElementById("colors").value;
      document.body.style.backgroundColor = color;
    }