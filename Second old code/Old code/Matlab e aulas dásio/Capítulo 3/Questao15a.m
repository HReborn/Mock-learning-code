% Programa Questao15a, Side Function do programa Questao15,
% Criado por Breno Felipe
%
% Explicação :
%
% Isole "h" nas duas expressões, iguale e você terá a função abaixo 
%
% Variáveis de entrada :
%
% r = Raio ( in )
% v = Volume, variável global, logo, pode ser usada fora da função ( in^3 )
%
% Variáveis de saída :
%
% A = Área ( in^2 )
%
% Cálculo :
%
function A = Questao15a(r)
A = sqrt((9.*10.^2 + pi*r^6)/r^2);