% Programa Questao14 , Calcula a quest�o 14
% Criado por Breno Felipe em 09/04/2017
%
% Vari�veis de entrada :
%
% x1 = Arranjo correspondente � quest�o 14
%
% Vari�veis de sa�da : 
%
% z1 = Vari�vel que calcula a quantidade de elementos do arranjo x
% w1 = Vari�vel correspondente ao 10� elemento de x
%
% Valores : 
%
x1 = sin(-pi/2):0.05:cos(0);
%
% C�lculo : 
%
z1 = length(x1);
w1 = x1(10);
%
% Se��o disp : 
%
disp('A quantidade de elementos no arranjo � : ');
disp(z1);
disp('O d�cimo elemento do arranjo � igual � : ');
disp(w1);