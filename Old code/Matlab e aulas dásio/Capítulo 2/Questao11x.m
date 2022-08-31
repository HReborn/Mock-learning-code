% Programa Questao11x, resolve a questão 11
% Criado por Breno Felipe em 24/04/2017
%
% Entrada :
%
% A = Matriz da questão
% B = Matriz da questão
% C = Matriz da questão
%
% Saída : 
%
% D = Matriz da letra A
% B = Maior elemento de cada culuna de D
% B1 = Maior elemento de D
%
% Valores : 
%
A = [3 -2 1;6 8 -5;7 9 10];
B = [6 9 -4;7 5 3;-8 2 1];
C = [-7 -5 2;10 6 1;3 -9 8];
%
% Cálculo :
%
D = cat(3,A,B,C);
E = max(max(D));
E1 = max(E);
%
% Seção disp :
%
disp('A matriz D é : ');
disp(D);
disp('O maior valor de cada camada de D é : ');
disp(E);
disp('E o maior valor de B é : ');
disp(E1);