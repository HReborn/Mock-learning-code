% Programa Questao3x, resolve a quest�o 3
% Criado por Breno Felipe em 24/04/2017
%
% Entrada :
%
% x = Vetor da quest�o
% z = Primeira linha do arranjo
% t = Segunda linha do arranjo
%
% Sa�da : 
%
% A = Arranjo da quest�o
%
% Valores : 
%
x = linspace(0,10,6);
z = 3*x;
t = 5*x - 20;
%
% C�lculo :
%
A = [z;t];
% Se��o disp :
%
disp('O Valor de A � : ');
disp(A);