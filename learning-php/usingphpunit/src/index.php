<?php 

// to start the php server, we must use: 
// php -S localhost:port -- ex: php -S localhost:8080 to consider the current directory as root
// or php -S localhost:8080 -t ~/directory to consider another path as root

$name = "nameless..."; // semi collon needed, type of variable not needed, always start with dollar sign

$int = 10;
$float = 10.5;
$tru = true;
$fal = false;

$anArray = array(1, "10", 2.5, false); // allows all types

var_dump($anArray); //way of printing on page

$assArray = [
    "key" => "value"
]; // this is an associative array, or, a dictionary.

var_dump($assArray);

$isEmpty = NULL; // this is null data type

var_dump($int);
echo "Agora, só com o valor da variável/n";
print_r($int);

print("there's also this method");

print "there's this too. so cool";

define("MY_VAR_NAME", "my var value"); //this here is a constant and is usually defined at the top of a file
var_dump(MY_VAR_NAME);

echo $int <> $float; // != not equal equivalent
//all methods above differ on speed



/*
?> close the tag only if you wanna work with php and html at the same time. if not, leave it open.
*/

