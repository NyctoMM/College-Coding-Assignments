function textInput() {
    const regex = /\d+/;
    const regexLetters = /\D+/;

    var Sentinal = 0;

    for(x=1; x<=2; x++) {
        var input = ("Box " + x + ": has " + document.getElementById("text" + x).value);
        var regexTest = regex.test(document.getElementById("text" + x).value);
        var regexTest2 = regexLetters.test(document.getElementById("text" + x).value);
        console.log(regexTest);
        console.log(regexTest2);
        if(regexTest != regexTest2) {
            alert(input);
        }
        else if (regexTest == regexTest2){
            var Sentinal = Sentinal + 1;
            console.log(Sentinal);
            alert(input + " Has a number, please remove it");
        }
    }
    if (Sentinal == 2) {
        alert("You must exclude numbers, please remove all numbers");
    }
    else if (Sentinal == 0) {
        alert("Thank you for not using numbers");
    }
}

function radioInput() {
    var input = document.querySelector('input[name="Radio"]:checked').value;
    alert(input);
}

function checkboxInput() {
    for(x=1; x<=3; x++) {
        if(document.querySelector('input[name=Check' + x +']:checked')) {
            alert("You checked " + document.getElementById("checkbox" + x).value);
        }
    }
}

function listInput() {
    var input = document.getElementById("Cards").value;
    alert(input);
}