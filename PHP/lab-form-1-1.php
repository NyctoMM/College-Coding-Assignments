<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <style type="text/css">
    ol {
      margin:1em;
      width:70%;
    }
    pre {
      border: 1px solid black;
      margin: 1em 0;
    }
    body {
      padding: 1em;
    }
  </style>

  <title>Lab - Form 1</title>
  <meta charset="utf-8">

</head>

<body>

  <h2>Handling HTML forms with PHP</h2>

<?php

if(isset($_POST["submit"])) {
  echo "<p>_POST data has been sent to this page.</p>";

  print_r($_POST);

}
else {
  echo " there is no POST data";
}

?>

<form action="" method="post">
<p>First Name: <input type="text" name="firstName" value="Martha"></p>
<p>Last Name: <input type="text" name="lastName" value="Wayne"></p>
<p>E-mail : <input type="text" name="email" value="batmom@dc.com"><br>
<input type="submit" name="submit">
</form>


  <pre>
  1. When the form is submitted, what appears at the top of the screen?

  
  
  2. What is responsible for the display this information? Look inside the if(isset($_POST["submit"])) { 
     section of the code.



  3. Remove the ' method="post" ' code, and resubmit the form.
  What happened to the POST data?



  4. Now, place ' method="get" ' where the previous code used to be,
  and resubmit your form. Look at the URL and notice that all of the data submitted in the form is now at the end of the URL.
  Copy everything from the '&' in the URL to the end, and write that here.



  5. Place "http://www.southhills.edu" inside of the double quotes of ' action="" '. Then, submit the form. What happens?



  </pre>

</body>
</html>