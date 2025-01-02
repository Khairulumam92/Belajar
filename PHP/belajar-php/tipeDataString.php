<?php
echo 'Name : ';
echo 'Moh. Khairul Umam';
echo "\n";

echo "Nama : ";
echo "Moh. \t Khairul\t umam\t";
echo"\n";

//multi line string
//heredoc
echo <<<MLS
ini adalah contoh penerapan multi line string dalam PHP
menggunakan heredoc, kita tidak perlu menambahkan enter
secara terus menerus.  
MLS;

echo "\n";
//nowdoc
echo <<<'MLS'
ini adalah contoh penerapan multi line string dalam PHP
menggunakan nowdoc, kita tidak perlu menambahkan enter 
secara terus menerus.  
MLS;



?>