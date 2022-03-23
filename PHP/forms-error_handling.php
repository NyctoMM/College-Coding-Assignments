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

  <title>PHP</title>
  <meta charset="utf-8">

</head>

<body>

  <h2>Adding errors to an array / JavaScript code injection</h2>


<?php

// Everything 
if(isset($_POST['submit'])) {

  echo "Form Submitted!"."<br />";

  echo "------"."<br />";

  // Here, we will create two arrays 
  // - one to hold all values that come from the user,
  // and these will go through various filtering functions
  // - and the second to hold any errors.

  $filteredValues = [];  // will be built up a few lines below
  $errors = [];  // no errors at the start

  // Making local variables for easier syntax
  $filteredValues['firstName'] = htmlspecialchars(trim($_POST['firstName']));
  $filteredValues['lastName'] = $_POST['lastName'];
  $filteredValues['email'] = $_POST['email'];
  $filteredValues['id'] = $_POST['id'];
  $filteredValues['password'] = $_POST['password'];
  

  


  // if the firstName field isn't empty,
  if(!empty($filteredValues['firstName'])) {
   
  }
  // otherwise, keep adding messages to the $errors array
  else {
    $errors[] = "Please enter your first name.";
  }


echo "hidden id is: ". $filteredValues['id'];

}


?>

<form action="" method="POST">
    
    <label for="firstName">First Name:</label>
    <input type="text" name="firstName" id="firstName" value="Fred" />
    <br />
    <label for="lastName">Last Name:</label>
    <input type="text" name="lastName" id="lastName" value="Funk" />
    <br />
    <label for="email">Email address: </label>
    <input type="text" name="email" value="fred@funk.com" /><br>
    
    <label for="password">Password: </label>
    <input type="password" name="password" /><br>

    <input type="hidden" name="id" value="12345" />
    <input type="submit" name="submit" value="Submit">

  </form>

<h3>Be sure to read the comments next to the code at the top of the file, especially the arrays.</h3>

<ol>
  <li>
    <p>The htmlspecialchars() function will convert characters such as '&lt;' to '& lt;' (minus the space) in order to prevent someone from trying to execute malicious Javascript code.
    </p>
    <p> You will see in the code at the top of this file <em>$filteredValues['firstName'] = htmlspecialchars(trim($_POST['firstName']));</em> . Repeat this for the other values in the $filteredValues array, but not the password field since we want any character that the user enters to be stored as part of the password.
    </p>
    <pre>


    </pre>
  </li>
  <li>
    <p>Write code to call print_r() on the errors array below the rest of the code that handles form submissions.
    </p>
    
  </li>
  <li>
    <p>Also, write error handlers for the rest of the fields in the php code at the top of this file; the first one is done for you.
    </p>
  </li>

  <li>Copy the following text from the below gray box on the web page (not this PHP file or it won't work) and enter this into the password field and submit the form. 
    <pre>
      <?php 
      echo htmlspecialchars("<script type = \"text/javascript\">  alert (\"This is an alert dialog box\");  </script> ");
      ?>
    
    </pre>
    <p>What outputs for the password in the array given to you from print_r()?
    </p>
    <pre>



    </pre>
    <p>Did your browser execute the Javascript alert? Also, name the browser that you are using. </p>
    <pre>



    </pre>
  </p>
</li>
<li>
  <p>
    Now, go to the page source and (R-click->View page source, or something similar depending on the browser). What do you see for the value next to '[password] => '? (You can just describe what's going on instead of pasting the code so it doesn't execute again.)
  </p>
  <pre>


  </pre>
  <p>
    NOTE: After you answer this question, just enter a different value in the password field next form submission to prevent the alert from happeneing.
  </p>
</li>
  <li>
  Then, at the bottom of the PHP section, output back to the user their first name, last name, and email address using the same $filteredValues array. Don't output their password. At this point, the data shouldn't have any spaces, nor will it have characters like &lt; and &gt;. Also, remove or comment out the line of code that outputs the hidden id. </li>

</body>
</html>