% Programa Questao12, Resolve a questão 12
% Criado por Breno Felipe
%
% Explicação :
%
% Faça a equação das áreas e quando chegar no retângulo, substitua a hipo-
% tenusa pelo lado do retângulo, vai dar a equação abaixo
%
% Variáveis de entrada :
%
% w = Lado menor do retângulo
% a = Área total
%
% Variáveis de saída :
%
% l = Lado maior do retângulo ( m )
%
% Cálculo :
function l = Questao12(w,a);
l = (4*a - w^2)/(4*w);