
<!DOCTYPE html>
<html>
<head>
  <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css'>
  <style type='text/css'>
    ol {
      margin:1em;
      width:70%;
    }
    pre {
      border: 1px solid black;
      margin-bottom: 1em;
    }
    li {
      
    }
    body {
      padding: 1em;
    }
  </style>

  <title>Form 1</title>
  <meta charset='utf-8'>

</head>

<body>

  <h2>Handling HTML forms with PHP - File 1</h2>

  <h3>New Student Enrollment</h3>

<?php

if(isset($_POST['submit'])) {
  echo '_POST data has been sent to this page.';
	echo '<br />';
  echo $_POST['age']

}
else {
  echo 'No $_POST data';
}

?>

<form action='' method='post'>
Name: <input type='text' name='name'><br>
E-mail : <input type='email' name='email'><br>
Age: <input type='text' name='age'><br>
Course Enrolled Date: <input type='date' name='enrolledDate'><br>
<em>Developer note: Format is yyyy-mm-dd if a date picker doesn't automatically show in your browser.</em>
<input type="hidden" name="studentId" value="1234" >
<br />
<input type='submit' name='submit'>
</form>

<br>

  <h4>Instructions</h4>

  <p>Depending on the question, either place your answers inside
     the given &lt;pre&gt;tag, or add PHP code to this file.

  <ol>

    <li>Somewhere within the 'if block on line 33, echo $_REQUEST['age'] to output the value of course id.</li>

    <li>What value gets displayed?</li>

    <pre>
      The users age

    </pre>

    <li>Research - what does PHP’s $_REQUEST variable/array represent? </li>

    <pre>

    It is an array that stores the contents of a submitted form or other data submitted into HTML like $_GEt or $_Cookie methods

    </pre>

    <li>Create a local variable inside of the same if block starting on line 33, and name it $email that is set to the value of $_POST['email']. This will make it easier for you to refer to/type in later rather than having to type the POST syntax every time.</li>

    <pre>
    
    </pre>

    <li>
      What is the input type of the email field?
    </li>

    <pre>

      Email
      
    </pre>

    

  </ol>

</body>
</html>