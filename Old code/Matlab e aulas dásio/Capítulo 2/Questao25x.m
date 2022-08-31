% Programa Questao25x, resolve a questão 25
% Criado por Freno Felipe
%
% Explicação :
%
% Use a multiplicação de matriz sem ser elemento a elemento.
%
% Variáveis de entrada :
%
% A = Matriz dada
% B = Matriz dada
%
% Variáveis de saída
%
% a = Multiplicação A*B
% b = Multiplicação B*A
%
% Parâmetros :
%
A = [ 11 5 ; -9 -4 ];
B = [ -7 -8 ; 6 2 ];
%
% Cálculo :
a = A*B;
b = B*A;
%
% Display
%
disp('A*B')
disp(a)
disp('B*A')
disp(b)