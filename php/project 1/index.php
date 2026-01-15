<html>
<head>
<title> PHP Form Submission</title>
</head>
<body>
	<ul>
		<li><a href="/">home</a> </li>
		<li><a href="multitable.php">multiplication table</a> </li>
	</ul>
	<h1> PHP Form Submission </h1>
	<form action = "index.php" method="POST">
		//<input type= "text" name="name" placeholder = "enter your name">
		//<input type= "text" name="phone" placeholder = "enter your number">
		<input type= "number" name="num1" placeholder = "enter your 1st number">
		<input type= "number" name="num2" placeholder = "enter your 2nd number">
		<select  name ="operation" required>
			<option value = "+">+</option>
			<option value = "-">-</option>
			<option value = "*">*</option>
			<option value = "/">/</option>
		</select>
		<button type="submit">Submit</button>
	</form>

	<?php
	if($_POST){

	/*echo "Form Submitted";
	print_r ($_POST);
	echo "<h2> Your name is :  ",$_POST['name'],"</h2>";
	echo "<h2> Your phone no. is :  ",$_POST['phone'],"</h2>";*/

	switch($_POST['operation']){
		case "+":
		echo "Addition ",$_POST['num1']+$_POST['num2'];
		break;

		case "-":
		echo "Subtraction ",$_POST['num1']-$_POST['num2'];
		break;

		case "*":
		echo "Multiplication ",$_POST['num1']*$_POST['num2'];
		break;

		case "/":
		echo "Division ",$_POST['num1']/$_POST['num2'];
		break;
	}

	}
	?>
</body>
</html>