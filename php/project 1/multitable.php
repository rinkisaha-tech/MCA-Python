<html>
<head>
<title> PHP Form Submission</title>
</head>
<body>
	<ul>
		<li><a href="/">home</a> </li>
		<li><a href="multitable.php">multiplication table</a> </li>
	</ul>
	<form action = "multitable.php" method="POST">
	<input type= "number" name="num" placeholder = "enter a number">
	<button type="submit">Submit</button>
	</form>

	<?php
	if($_POST){
		$number = $_POST['num'];
		echo $number,"Table is: ";
	?>
		<table border =1>
		<?php 
		for($i=1;$i<=10;$i++){
		?>

		<tr>
			<td><?php echo $i,"X",$number;?></td>
			<td><?php echo $i*$number;?></td>
		</tr>
		<?php } ?>
		</table>
	<?php } ?>
</body>
</html>