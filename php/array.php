<?php
$arr =array ("AAA","BBB","CCC");

//insert element
$arr[4]="EEE";

$no_of_e = count($arr);
print_r($arr);

foreach($arr as $item){
	echo $item, "\n";
}

?>