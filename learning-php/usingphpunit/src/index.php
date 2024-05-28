<?php 

/*
 Add these lines on php.ini file to display errors on the page, otherwise it won't load the page and will give the 500 http error.
 to locate php.ini, type the command php --ini
 
ini_set('display_errors', 1);
ini_set('display_startup_errors', 1);
error_reporting(E_ALL);
*/

// to start the php server, we must use: 
// php -S localhost:port -- ex: php -S localhost:8080 to consider the current directory as root
// or php -S localhost:8080 -t ~/directory to consider another path as root

$name = "nameless..."; // semi collon needed, type of variable not needed, always start with dollar sign

$int = 10;
$float = 10.5;
$tru = true;
$fal = false;

$anArray = array(1, "10", 2.5, false); // allows all types
$anotherArray = [1, 'toba', false];

echo "printing an array with var_dump: <br>";
var_dump($anArray); //way of printing on page

echo "<br><br>getting first array item with 'echo $ anArray[0];': <br>";
echo $anArray[0];

$assArray = [
    "key" => "value"
]; // this is an associative array, or, a dictionary.
echo "<br><br>printing an associative array or a dictionary with var_dump: <br>";
var_dump($assArray);

echo "<br><br>getting first array item with 'echo $ assArray[key];': <br>";
echo $assArray['key'];

$arrayInArray = [
    [
        "key1" => "value1",
        "key2" => "value2"
    ],
    [
        "key3" => "value3",
        "key4" => "value4"
    ]
];
echo "<br><br>an array with multiple arrays: <br>";
var_dump($arrayInArray);

echo "<br><br>fetching with $ arrayInArray['key1']['key3']; : <br>";
echo $arrayInArray[1]['key3'];

echo "<br><br>transforming it into JSON with json_encode($ arrayInArray): <br>";
$jsOnObj = json_encode($arrayInArray);
echo json_encode($arrayInArray);

$isEmpty = NULL; // this is null data type

echo "<br><br>printing a variable with var_dump: <br>";
var_dump($int);

echo "<br><br>printing a variable with print_r: <br>";
print_r($int);

echo "<br><br>printing with print('anything'): <br>";
print("there's also this method");

echo "<br><br>printing with print 'anything': <br>";
print "there's this too. so cool";

echo "<br><br>printing a constant with var_dump: <br>";
define("MY_VAR_NAME", "my var value"); //this here is a constant and is usually defined at the top of a file
var_dump(MY_VAR_NAME);

echo "<br><br>this here is a not equal result: <br>";
echo $int <> $float; // != not equal equivalent
//all methods above differ on speed

$var1 = "coisa 1";
$var2 = "coisa 2";

echo "<br><br>echo $ var1 . 'is' . $ var2; :<br>";
echo $var1 . " is " . $var2;

echo "<br><br>echo 'var1= $ var1 and var2= $ var2'; :<br>";
echo "var1=$var1 and var2=$var2";

echo "<br><br>echo '5' + '5'; :<br>";
echo '5'+'5';

echo "<br><br>echo 5 + 5; :<br>";
echo 5+5;

echo "<br><br>null coalescing operator, assigns $ fruit to $ var if $ fruit isn't null, if it's null assigns 'apple'<br>";
echo "$ fruit = NULL;<br>";
echo "$ var = $ fruit ?? 'apple'<br>";
$fruit = NULL;
$var = $fruit ?? 'apple';
echo $var . "<br>";

for ($i=0;$i<3;$i++){
    echo "<br>loop value: $i";
}

echo "<br><br> foreach";
$examples = [1, 2, 3, 4];
foreach($examples as $example) {
    echo "<br>" . $example;
}

echo "<br><br> foreach with associative array:";
foreach($arrayInArray[0] as $arr => $value) {
    echo "<br>" . $arr . " and " . $value;
}

function anyF() {
    echo "<br><br>function without arguments";
}
function withF($anyVar) {
    echo "<br><br>function argument: ";
    var_dump($anyVar);
}
function sum($var1=1, $var2=2) {
    echo "<br><br>function with default arguments: ";
    var_dump($var1, $var2);
    echo "<br> sum of the two: " . ($var1+$var2);
}
anyF();
withF("maluko");
sum();

$shorthand = fn($n1, $n2) => $n1 + $n2;
echo "<br><br>shorthand sum function: " . $shorthand(10,11);


/*
?> close the tag only if you wanna work with php and html at the same time. if not, leave it open.
*/
?>
<html>
<body>
<br>
<br>
<br>
<p>THIS IS FROM A HTML PARAGRAPH TAG TO SHOW THAT<br>WE CAN HAVE HTML AND PHP ON THE SAME FILE </p>
</body>
</html>
