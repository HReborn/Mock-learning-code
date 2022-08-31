% Programa Questao5, Resolve a quest�o 5
% Criado por Breno Felipe
%
% Explica��o :
%
% Calcule os dois lados da express�o para provar a igualdade
%
% Vari�veis de entrada :
%
% x = Intervalo
%
% Vari�veis de sa�da :
%
% y = Arccosh
% z = Fun��o que determina o Arccosh
%
% Par�metros :
%
x = 1:4;
% 
% C�lculo :
%
y = acosh(x);
z = log(x + sqrt(x.^2 - 1));
%
% Display :
%
disp('Arccosh : ')
disp(y)
disp('Fun��o que determina o Arccosh : ')
disp(z)