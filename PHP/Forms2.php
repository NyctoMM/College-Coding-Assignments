
<!DOCTYPE html>
<html>
<head>
  <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css'>
  <style type='text/css'>
    ol {
      margin:1em;
      width:70%;
    }
    li {
      margin-bottom: 1em;
    }
    pre {
      border: 1px solid black;
      margin: 1em 0;
    }
    body {
      padding: 1em;
    }

  </style>

  <title>Form 1</title>
  <meta charset='utf-8'>

</head>

<body>

  <h2>Handling HTML forms with PHP - File 2</h2>

  <p>
  	<mark>Note: a tricky thing in PHP is referring to ID fields in forms. Sometimes they contain 'ID', and sometimes they contain 'Id' (note the capitalization change), usually at the end of the field name.
  	</mark>
  </p>
<?php

if(isset($_POST['submit'])) {
  echo '<b>_POST data has been sent to this page.</b><br />';
  echo 'Form data:<br />';

  $firstName = $_POST["firstName"];
  echo '$firstName: '.$firstName; echo "<br>";
  $lastName = $_POST["lastName"];
  echo '$lastName: '.$lastName; echo "<br>";
  $email = $_POST["email"];
  echo '$email: '.$email; echo "<br>";
  $CustomerID = $_POST["customerId"];
  echo '$CustomerID: '.$CustomerID; echo "<br>";
  $OrderID = $_POST["orderId"];
  echo '$OrderID: '.$OrderID; echo "<br>";

  
  
}
else {
  echo '<b>No $_POST data</b>';
}

?>
<br />
<br />
<hr />
<form action='' method='post'>
First Name: <input type='text' name='firstName'><br>
Last Name: <input type='text' name='lastName'><br>
E-mail : <input type='text' name='email'><br>
CustomerID: <input type='text' name='customerId'><br>
OrderID: <input type='text' name='orderId'><br>
Estimated Shipping Date: <input type='date' name='shippingDate' value=''><br>

<input type='submit' name='submit'>
</form>

 <h4>Instructions</h4>

  <p>Depending on the question, either place your answers inside
     the given &lt;pre&gt;tag, or add PHP code to this file.

  <ol>

    <li>
      Create a local variables for if the form is submitted, and echo out each of their values. For instance, create a variable named $email that is set to the value of $_POST[‘email’]. This will make it easier for you to refer to/type in later rather than having to type the POST syntax every time.
      The first one is done for you as an example in the 'if' block starting on line 36.
    </li>

    <li>
     For every variable that you just created, wse the trim() function on it to eliminate whitespace from the front and back of the string. For example,
     <pre>$stuff = trim($_POST['stuff']);

    </li>
    

  </ol>

</body>
</html>