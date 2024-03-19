<!DOCTYPE html>
<html lang="hu">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="content-type" content="text/html" />
        <meta http-equiv="cache-control" content="max-age=0" />
        <meta http-equiv="cache-control" content="no-cache" />
        <meta http-equiv="expires" content="0" />
        <meta http-equiv="pragma" content="no-cache" />
        <title>Űrlap adatok</title>
    </head>
    <body>
        <?php
            echo "<strong>Név:</strong> " . htmlspecialchars($_POST['nev']) . "<br><br>";
            echo "<strong>PIN kód:</strong> " . htmlspecialchars($_POST['pin_kod']) . "<br><br>";
            echo "<strong>Kedvenc gyümölcs:</strong> " . htmlspecialchars($_POST['kedvenc_gyumolcs']) . "<br><br>";
            echo "<strong>Életkor:</strong> " . htmlspecialchars($_POST['eletkor']) . "<br><br>";
            echo "<strong>Láb méret:</strong> " . htmlspecialchars($_POST['labmeret']) . "<br><br>";
            echo "<strong>Önbizalom szintje:</strong> " . htmlspecialchars($_POST['onbizalom']) . "<br><br>";
        ?>

        <a href="http://vecb52.localhost">Vissza az űrlapra</a>
    </body>
</html>
