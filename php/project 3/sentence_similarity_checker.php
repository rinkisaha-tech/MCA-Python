<?php
function tokenize($sentence) {
    $sentence = strtolower($sentence);
    $sentence = preg_replace('/[^a-z0-9\s]/', '', $sentence);
    return preg_split('/\s+/', trim($sentence));
}

function wordFrequency($tokens) {
    $freq = [];
    foreach ($tokens as $word) {
        if ($word !== '') {
            $freq[$word] = ($freq[$word] ?? 0) + 1;
        }
    }
    return $freq;
}

function cosineSimilarity($sentence1, $sentence2) {
    $tokens1 = tokenize($sentence1);
    $tokens2 = tokenize($sentence2);

    $freq1 = wordFrequency($tokens1);
    $freq2 = wordFrequency($tokens2);

    $dotProduct = 0;
    foreach ($freq1 as $word => $count) {
        if (isset($freq2[$word])) {
            $dotProduct += $count * $freq2[$word];
        }
    }

    $magnitude1 = sqrt(array_sum(array_map(fn($x) => $x * $x, $freq1)));
    $magnitude2 = sqrt(array_sum(array_map(fn($x) => $x * $x, $freq2)));

    if ($magnitude1 == 0 || $magnitude2 == 0) {
        return 0;
    }

    // return percentage
    return ($dotProduct / ($magnitude1 * $magnitude2)) * 100;
}

$similarity = null;
if ($_SERVER["REQUEST_METHOD"] === "POST") {
    $s1 = $_POST['sentence1'] ?? '';
    $s2 = $_POST['sentence2'] ?? '';
    $similarity = cosineSimilarity($s1, $s2);
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sentence Similarity Checker</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 40px; }
        textarea { width: 100%; height: 80px; }
        button { padding: 10px 20px; margin-top: 10px; }
        .result { margin-top: 20px; font-size: 18px; }
    </style>
</head>
<body>

<h2>Sentence Similarity Checker</h2>

<form method="post">
    <label>Sentence 1:</label><br>
    <textarea name="sentence1" required><?= htmlspecialchars($_POST['sentence1'] ?? '') ?></textarea><br><br>

    <label>Sentence 2:</label><br>
    <textarea name="sentence2" required><?= htmlspecialchars($_POST['sentence2'] ?? '') ?></textarea><br>

    <button type="submit">Check Similarity</button>
</form>

<?php if ($similarity !== null): ?>
    <div class="result">
        Similarity Score: <strong><?= round($similarity, 2) ?>%</strong>
    </div>
<?php endif; ?>

</body>
</html>
