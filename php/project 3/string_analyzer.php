<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>PHP String Analyzer</title>

</head>
<body>

    <h2>PHP String Analyzer</h2>

    <form method="post">
        <label>Enter a string:</label>
        <input type="text" name="text" required>

        <label>Word to replace:</label>
        <input type="text" name="find_word">

        <label>Replace with:</label>
        <input type="text" name="replace_word">

        <input type="submit" name="analyze" value="Analyze">
    </form>

    <?php
    if (isset($_POST['analyze'])) {
        $text = $_POST['text'];
        $findWord = $_POST['find_word'];
        $replaceWord = $_POST['replace_word'];

        $lengthWithSpaces = strlen($text);
        $lengthWithoutSpaces = strlen(str_replace(' ', '', $text));
        $wordCount = str_word_count($text);

        preg_match_all('/[aeiouAEIOU]/', $text, $vowels);
        $vowelCount = count($vowels[0]);

        preg_match_all('/[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]/', $text, $consonants);
        $consonantCount = count($consonants[0]);

        $reversed = strrev($text);

        $cleanText = strtolower(preg_replace('/[^a-zA-Z0-9]/', '', $text));

        // Replace feature
        if (!empty($findWord)) {
            $replacedText = str_replace($findWord, $replaceWord, $text);
        } else {
            $replacedText = $text;
        }
    ?>

            <h3>Results:</h3>
            <p><strong>Original String:</strong> <?php echo htmlspecialchars($text); ?></p>
            <p>Characters (with spaces): <?php echo $lengthWithSpaces; ?></p>
            <p>Characters (without spaces): <?php echo $lengthWithoutSpaces; ?></p>
            <p>Word Count: <?php echo $wordCount; ?></p>
            <p>Vowels: <?php echo $vowelCount; ?></p>
            <p>Consonants: <?php echo $consonantCount; ?></p>

            <hr>
            <p><strong>After Replacement:</strong></p>
            <p><?php echo htmlspecialchars($replacedText); ?></p>
    <?php } ?>

</body>
</html>
