% Programa Questao2x, resolve a quest�o 2
% Criado por Breno Felipe em 24/04/2017
%
% Entrada :
%
% i = In�cio do vetor
% f = Final do vetor
% q = Quantos termos entre o in�cio e o final
%
% Sa�da : 
%
% A = Arranjos
%
% Valores : 
%
i = 10;
f = 1000;
q = [50,20];
%
% C�lculo : 
A1 = logspace(i,f,q(1));
A2 = logspace(i,f,q(2));
% Se��o disp :
%
x = input('Mostrar valor de A1 : ','string');
disp(A1);
x1 = input('Mostrar valor de A2 : ','string');
clc;
disp(A2);