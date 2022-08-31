% Programa Questao13a, Side Function da questão 13
% Criado por Breno Felipe
%
% Explicação :
%
% Faça duas equações, uma do custo total e a outra da área total,
% Isole o "L" nas duas equações e iguale, então terá Custo(r)
%
% Variáveis de entrada :
%
% r = Raio do semicírculo ( ft )
%
% Variáveis de saída :
%
% Custo = Custo total para fazer o negoço ( $ )
%
% Cálculo : 
%
function Custo = Questao13a(r)
Custo = (20*(4000 - pi*r^2) + pi*r^2*50*(pi+2))/(pi*r);