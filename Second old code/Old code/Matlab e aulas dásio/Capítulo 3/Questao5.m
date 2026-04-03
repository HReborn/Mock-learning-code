% Programa Questao5, Resolve a questão 5
% Criado por Breno Felipe
%
% Explicação :
%
% Calcule os dois lados da expressão para provar a igualdade
%
% Variáveis de entrada :
%
% x = Intervalo
%
% Variáveis de saída :
%
% y = Arccosh
% z = Função que determina o Arccosh
%
% Parâmetros :
%
x = 1:4;
% 
% Cálculo :
%
y = acosh(x);
z = log(x + sqrt(x.^2 - 1));
%
% Display :
%
disp('Arccosh : ')
disp(y)
disp('Função que determina o Arccosh : ')
disp(z)