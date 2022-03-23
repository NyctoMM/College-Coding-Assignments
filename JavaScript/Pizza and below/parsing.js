function emailParse(){
    var email = document.getElementById("email").value;
    alert(email);

    var symbol = email.indexOf('@');
    var name = email.substring(0, symbol);
    var domain = email.lastIndexOf('.');
    var domainName = email.substring(symbol, domain);
    var com = email.substring(domain +1);

    alert(name);
    alert(domainName);
    alert(com);
}

function phraseParse(){

    var phrase = document.getElementById("phrase").value;
    alert("Your phrase is: " + phrase);
    const myArray = phrase.split(" ");
    document.getElementById("insertPhrase").innerHTML = myArray;
}   