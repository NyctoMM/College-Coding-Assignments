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

  <title>PHP Checkbox</title>
  <meta charset="utf-8">

</head>

<body>
  
  <?php

      if(isset($_POST)) {
        
        // Two buttons - 

        // the first if statement handles the Clear Form button by
        // resetting the POST array,
        if(isset($_POST["clearForm"])) {
          $_POST = array();

        }
        // and the else if handles a regular submit button.
        else if(isset($_POST["submit"])) {

          // Check for Military status
          if(isset($_POST["isActiveDutyMilitary"])) {

            echo "<p>Is military - true</p>";

          }

          // Check for senior (65 or older)
          if(isset($_POST["isSenior"])) {
             echo "<p>Is senior - true</p>";
          }
          else {
             echo "<p>Is senior - false</p>";
          }

        }

      }
      
  ?>

  <form action="" method="POST">
    <label for="firstName">First Name:</label>
    <input type="text" name="firstName" id="firstName" />
    <br />
    <label for="isActiveDutyMilitary">Are you in the military?</label>
    <input type="checkbox" name="isActiveDutyMilitary" 
    id="isActiveDutyMilitary" value="isActiveDutyMilitary" checked />
    <br />
    <label for="isSenior">Are you over 65?</label>
    <input type="checkbox" name="isSenior" 
    id="isSenior" />
    <br />
    <input type="submit" name="clearForm" value="Clear Form">
    <input type="submit" name="submit" value="Submit">
  </form>

<p>In PHP, an HTML input type of "checkbox" is handled by simply checking if it is set, which will happen if the user checks the checkbox.</p>
<p>NOTE: If you press the Clear Form button, it will reset the form completely by removing all POST data. Use this to test if you have to.</p>
<p>Also note that whenever you submit a form, the checkbox states will revert back to what they are in code, rather than what the user submitted. We can still see what the user chose when we output $_POST data.

<ol>
  <li>Examine the isActiveDutyMilitary input in the form. Which property/attribute/keyword causes the checkbox to be checked?
  <pre>



  </pre>
</li>
<li>In the PHP form handling code section, write code to handle the checkbox for the isSenior control. Follow the example already written for isActiveDutyMilitary.

  </li>

</ol>

</body>
</html>