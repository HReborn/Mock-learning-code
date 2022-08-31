% Programa Questao25x, resolve a quest�o 25
% Criado por Freno Felipe
%
% Explica��o :
%
% Use a multiplica��o de matriz sem ser elemento a elemento.
%
% Vari�veis de entrada :
%
% A = Matriz dada
% B = Matriz dada
%
% Vari�veis de sa�da
%
% a = Multiplica��o A*B
% b = Multiplica��o B*A
%
% Par�metros :
%
A = [ 11 5 ; -9 -4 ];
B = [ -7 -8 ; 6 2 ];
%
% C�lculo :
a = A*B;
b = B*A;
%
% Display
%
disp('A*B')
disp(a)
disp('B*A')
disp(b)