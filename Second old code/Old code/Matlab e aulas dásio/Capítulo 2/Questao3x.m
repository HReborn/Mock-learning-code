% Programa Questao3x, resolve a questão 3
% Criado por Breno Felipe em 24/04/2017
%
% Entrada :
%
% x = Vetor da questão
% z = Primeira linha do arranjo
% t = Segunda linha do arranjo
%
% Saída : 
%
% A = Arranjo da questão
%
% Valores : 
%
x = linspace(0,10,6);
z = 3*x;
t = 5*x - 20;
%
% Cálculo :
%
A = [z;t];
% Seção disp :
%
disp('O Valor de A é : ');
disp(A);