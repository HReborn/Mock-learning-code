% Programa Questao13 , Calcula a quest�o 13
% Criado por Breno Felipe em 09/04/2017
%
% Vari�veis de entrada : 
% 
% x = Vari�vel correspondente � quest�o 13
%
% Vari�veis de sa�da : 
%
% y = Vari�vel correspondente � quest�o 13
% z = Vari�vel que calcula a quantidade de elementos do arranjo
% w = Vari�vel correspondente ao 3� elemento de y
%
% Valores : 
%
x = 1:0.2:5;
%
% C�lculo : 
%
y = 7*sin(4*x);
z = length(y);
w = y(3);
%
% Se��o disp : 
%
disp('O arranjo y tem os seguintes valores : ');
disp(y);

disp('A quantidade de elementos em y � : ');
disp(z);

disp('O terceiro elemento de y � igual � : ');
disp(w);