# Enum Calculator

Simple calculator that uses an Enum to work. Takes 2 inputs, `x` and `y`. When the method `executarOperacao(x, y)` is called, returns the result of the operation between the two numbers of `double` type. Supports only 4 operations: sum, subtraction, multiplication and division.
- [Source code file](https://github.com/HReborn/Random-Bits-of-Code/blob/main/EnumCalculator/src/main/java/com/bitsofcode/calculadoraenum/CalculadoraEnum.java)

## Methods
- `executarOperacao(x, y)` that will return the result of the operation between two numbers of `double` type.
- `getOperacao()` will return a string with `+`, `-`, `*` or `/` based on the selected operation.
- `toString()` will return a string with `+`, `-`, `*` or `/` based on the selected operation. Also allows the enum to be printed.

## In-depth explanation

Made with an abstract method. The method is forced to be implemented by every enum option available resulting in a different behavior(operations) for each one of it.

## Example
```
CalculadoraEnum sum = CalculadoraEnum.SOMAR;
CalculadoraEnum subtract = CalculadoraEnum.SUBTRAIR;
CalculadoraEnum divide = CalculadoraEnum.DIVIDIR;
CalculadoraEnum multiply = CalculadoraEnum.MULTIPLICAR;

System.out.println(sum.executarOperacao(50, 50));
System.out.println(sum.getOperacao());
System.out.println(sum);

System.out.println(subtract.executarOperacao(200, 100));
System.out.println(subtract.getOperacao());
System.out.println(subtract);

System.out.println(divide.executarOperacao(1000, 10));
System.out.println(divide.getOperacao());
System.out.println(divide);

System.out.println(multiply.executarOperacao(10, 10));
System.out.println(multiply.getOperacao());
System.out.println(multiply);
```
Output:
```
100
+
+
100
-
-
100
/
/
100
*
*
```
