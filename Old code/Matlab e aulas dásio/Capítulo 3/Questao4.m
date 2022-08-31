% Programa Questao4, Resolve a questão 4
% Criado por Breno Felipe
%
% Explicação :
%
% Cálcule os dois lado a expressão e verifique a igualdade
%
% Variáveis de entrada :
%
% x = Valores arbitrários
%
% Variáveis de saída :
%
% y = senh de x
% z = Função que determina senh de x
%
% Parâmetros :
%
x = 1:4;
%
% Cálculo :
%
y = sinh(x);
z = (exp(x) - exp(-x))/2;
%
% Display :
%
disp('Senh de x : ')
disp(y)
disp('Função que determina senh de x : ')
disp(z)