% Programa Questao17, Resolve a Questão 17
% Criado por Breno Felipe
%
% Explicação :
%
% Faça a mesma coisa que você faria se estivesse resolvendo um sitema
% de equações usando a barra invertida, as entradas são os pontos
% dados na questão, o resultado tem que bater, óbvio...
%
% Variáveis de entrada :
%
% x1 = X do primeiro ponto
% y1 = Y do primeiro ponto
% x2 = X do segundo ponto
% y2 = Y do segundo ponto
% x3 = X do terceiro ponto
% y3 = Y do terceiro ponto
% x4 = X do quarto ponto
% y4 = Y do quarto ponto
%
% Variáveis de saída :
%
% a = Matriz correspondente aos coeficientes das icógnitas
% b = Matriz resultado
% c = Resultado das icógnitas
%
% Cálculo :
%
function c = Questao17(x1,y1,x2,y2,x3,y3,x4,y4)
a = [ x1^3 x1^2 x1 1;x2^3 x2^2 x2 1;x3^3 x3^2 x3 1;x4^3 x4^2 x4 1 ];
b = [ y1;y2;y3;y4 ];
c = a\b;