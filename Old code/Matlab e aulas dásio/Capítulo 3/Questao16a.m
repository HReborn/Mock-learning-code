% Programa Questao16a, Side Function do programa Questao16
% Criado por Breno Felipe
%
% Explicação :
%
% Só faça a função com as equações dadas
%
% Variáveis de entrada :
%
% a = Raio interno ( in )
% b = Raio externo ( in )
%
% Variáveis de saída :
%
% V = Volume ( in^3 )
% A = Área ( in^2 )
%
% Cálculo :
%
function [V,A] = Questao16a(a,b)
V = (pi.^2.*(a+b).*(b-a).^2)/4;
A = pi.^2.*(b.^2 - a.^2);