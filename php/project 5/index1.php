<!DOCTYPE html>
<html>
<head>
    <title>Student Result File</title>
</head>
<body>

<h2>Student Result Form</h2>

<form method="post">
    Name: <input type="text" name="name" required><br><br>
    Roll: <input type="text" name="roll" required><br><br>
    Subject 1 Marks: <input type="number" name="sub1" required><br><br>
    Subject 2 Marks: <input type="number" name="sub2" required><br><br>
    Subject 3 Marks: <input type="number" name="sub3" required><br><br>


    <button type="submit" name="save">Save Result</button>
</form>

<hr>

<?php
if (isset($_POST['save'])) {

    $name = $_POST['name'];
    $roll = $_POST['roll'];
    $sub1 = $_POST['sub1'];
    $sub2 = $_POST['sub2'];
    $sub3 = $_POST['sub3'];


    $total = $sub1 + $sub2 + $sub3;
    $average = $total / 3;

    $filename = "result.txt";

    $data = "Name:$name\n";
    $data .= "Roll:$roll\n";
    $data .= "Subject 1:$sub1\n";
    $data .= "Subject 2:$sub2\n";
    $data .= "Subject 2:$sub3\n";
    $data .= "Total:$total\n";
    $data .= "Average:$average\n";
    $data .= "----------------------\n";
    
    // Save to file
    $file = fopen($filename, "a"); // a = append
    fwrite($file, $data);
    fclose($file);

    echo "<h3>Result Saved Successfully!</h3>";
    // echo "<pre>$data</pre>";
    if (file_exists($filename)) {
    $readata = file_get_contents($filename);

    // Split students using the same separator you saved
    $students = explode("----------------------", $readata);

    foreach ($students as $student) {
        $student = trim($student);
        if ($student == "") continue;

        echo "<div style='border:1px solid #000; padding:10px; margin:10px 0;'>";

        // Split lines
        $lines = explode("\n", $student);
        foreach ($lines as $line) {
            echo $line . "<br>";
        }

        echo "</div>";
    }
}


}
?>

</body>
</html>
