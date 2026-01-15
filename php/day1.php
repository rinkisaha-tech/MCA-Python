<?php
	/*echo"HelloWorld\n";
	$a = 18;
	$b = 9;
	$sum = $a+$b;
	echo "Sum is " ,$sum;

	$age = 19;
	if($age>=18){
		echo"\n Adult ";
	} else{
		echo"\n Teenage ";
	}

	$ageGroup = $age>=18?"\n Adult ": "\n Teenage ";
	print($ageGroup);*/

	/*$m = readline("Enter a number: ");
	//echo $m;
	//print_r("Enter a number: ");

	for($i = 1; $i <= 10; $i++){
		echo $m , "X", $i, "=", $i*$m,"\n";
	}*/

	//even odd
	$n = readline("Enter a number: ");
	if($n%2==0){
		echo"Number is even..!";
	}else{
		echo"Number is odd.!!!";
	}
	
	//factorial
	$fact = 1;
	if($n == 0 || $n ==1){
		echo"Fact is : ",$n;
	}else{
		for($i = 2; $i <= $n ; $i++){
			$fact = $fact * $i;
			echo $fact,"\n";
		}
	}

	//Prime Check
	
	$prime = 1;
	if($n <= 1){
		$prime = 0;
	}
	for($i = 2; $i<= sqrt($n); $i++){
		if($n % $i == 0){
			$prime = 0;
			break;
		}
	}
	echo $prime == 1 ? "Prime":"Not Prime";
























?>