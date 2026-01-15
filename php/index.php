<html>
<head>
	<Title> Html with Php </Title>
</head>
<body>
	<h1> Html file ...!!!!!! </h1>
	<table border =1>
	<tr>
		<td>SL</td>
		<td>Roll No </td>
	</tr>
	<?php for($i=1;$i<=20;$i++){?>
		<tr>
			<td><?php echo $i; ?></td>
		<td>
		<?php 
			$roll = $i<10?"BWU/MCA/0":"BWU/MCA/";
			echo $roll,$i;
		?>
		</td>
		</tr>
	<?php } ?>
</table>
</body>
</html>