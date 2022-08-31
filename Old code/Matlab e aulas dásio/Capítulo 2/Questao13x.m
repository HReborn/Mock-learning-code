% Programa Questao13x, resolve a questão 13
% Criado por Breno Felipe em 24/04/2017
%
% Entrada :
%
% A = Matriz da questão
% B = Matriz da questão
%
% Saída : 
%
% C = Letra A
% D = Letra B
% E = Letra C
%
% Valores : 
%
A = [56 32;24 -16];
B = [14 -4;6 -2];
%
% Cálculo :
%
C = A*B;
D = A/B;
E = B.^3;
%
% Seção disp :
%
disp('A multiplicação matricial de A por B é : ');
disp(C);
disp('O resultado da divisão matricial à direita de A por B é : ');
disp(D);
disp('O arranjo B com todos os seus elementos elevados à terceira é : ');
disp(E);