% Programa Questao4, Resolve a quest�o 4
% Criado por Breno Felipe
%
% Explica��o :
%
% C�lcule os dois lado a express�o e verifique a igualdade
%
% Vari�veis de entrada :
%
% x = Valores arbitr�rios
%
% Vari�veis de sa�da :
%
% y = senh de x
% z = Fun��o que determina senh de x
%
% Par�metros :
%
x = 1:4;
%
% C�lculo :
%
y = sinh(x);
z = (exp(x) - exp(-x))/2;
%
% Display :
%
disp('Senh de x : ')
disp(y)
disp('Fun��o que determina senh de x : ')
disp(z)