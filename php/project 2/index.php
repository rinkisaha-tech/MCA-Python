<html>
<head>
	<title>php form</title>
</head>
<body>

	<h1> Example PHP Form Submission </h1>
	<form action = "index.php" method="POST">
		 your name: <input type= "text" name="name" placeholder = "enter your name"></br>
		your email: <input type= "email" name="email" placeholder = "enter your email"></br>
		your phno: <input type= "number" name="phno" placeholder = "enter your phno"></br>
	
		gender: 
			 <input type= "radio" name="gen" value="male">Male
			 <input type= "radio" name="gen" value="female">Female</br>
		language known: 
			 <input type= "checkbox" name="lang[]" value="bengali">Bengali
			 <input type= "checkbox" name="lang[]" value="eng">English
			 <input type= "checkbox" name="lang[]" value="hind">Hindi</br>
		<button type="submit">Submit</button>
	</form>

	<?php
		if($_POST){
		print_r($_POST);
		$lan=$_POST['lang'];
		//print_r($lan);
		echo "Language known: ";
		forEach($lan as  $val){
			echo $val," , ";
			}
		}
	
	?>

</body>
</html>