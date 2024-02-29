<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $name       = $_POST['name'];
    $pin        = $_POST['pin'];
    $fruit      = $_POST['favorite_fruit'];
    $age        = $_POST['age'];
    $shoeSize   = $_POST['foot_size'];
    $confidence = $_POST['self_confidence'];

    if (empty($name)) {
        echo "<span class=\"warning\">Név nem lehet üres!</span><br>";
    }
    else {
        if (strlen($name) > 50) {
            echo "<span class=\"warning\">A név nem lehet hosszabb 50 karakternél!</span><br>";
        }
    }
    if (empty($pin)) {
        echo "<span class=\"warning\">PIN kód nem lehet üres!</span><br>";
    }
    else {
        if (strlen($pin) > 50) {
            echo "<span class=\"warning\">PIN kód nem lehet hosszabb 50 karakternél!</span><br>";
        }
    }
    if (empty($fruit)) {
        echo "<span class=\"warning\">Kedvenc gyümölcs nem lehet üres!</span><br>";
    }
    if (empty($age)) {
        echo "<span class=\"warning\">Életkor nem lehet üres!</span><br>";
    }
    if (empty($shoeSize)) {
        echo "<span class=\"warning\">Lábméret nem lehet üres!</span><br>";
    }
    if (empty($confidence)) {
        echo "<span class=\"warning\">Önbizalom nem lehet üres!</span><br>";
    }

    echo "Név: $name<br>";
    echo "Kedvenc gyümölcs: $fruit<br>";
    echo "Életkor: $age<br>";
    echo "Lábméret: $shoeSize<br>";
    echo "Önbizalom: $confidence<br>";
}
?>
