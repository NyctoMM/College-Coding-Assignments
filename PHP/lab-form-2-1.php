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

  <title>Lab - Form 2</title>
  <meta charset="utf-8">

</head>

<body>

  <h2>Handling HTML forms with PHP - Form 2</h2>

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
<p>First Name: <input type="text" name="firstName" value="Martha2"></p>
<p>Last Name: <input type="text" name="lastName" value="Wayne2"></p>
<p>E-mail : <input type="text" name="email" value="batmom2@dc.com"><br>
<input type="submit" name="submit">
</form>


  <pre>
  1. Add the following fields to the form:

  phoneNumber, with an &lt;input type=&quot;text&quot;>
  additionalComments, in the form of a a &lt;textarea&gt; with 4 rows and 50 columns (see <a href="https://www.w3schools.com/tags/tag_textarea.asp">this w3schools page </a>for usage).


  2. Add a value attribute and a value (confusing much?) to the submit button above, such as value="Create Account". What changes in the display?



  3. Change the request type from ‘post’ to ‘get’ and resubmit the form. What happens to the $_POST data?



  4. Once you have changed the post type to 'get', view your address bar. Write here (or copy and paste) everything after the "?" character.



  5. The command may be different from browser to browser, but as an example, in Google Chrome, R-click your page and choose "Inspect". Then, choose the "Network" tab.

  Then, refresh the page. Click on the name of your file in the Inspector. There will be a sample pic of this under Wednesday, Sept. 22's notes.

  If you scroll down to the bottom of the inspector, what is the name of the section that contains the form data?




  6. Change method="get" back to method="post". Resave your PHP page, and refresh your browser page. Resubmit the form, too. What is now the name of the section that contains the form data?





  </pre>

</body>
</html>