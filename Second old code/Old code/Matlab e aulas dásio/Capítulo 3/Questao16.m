% Programa Questao16, Resolve a Questão 16
% Criado por Breno Felipe
%
% Explicação :
%
% Defina dentro do programa "a" e "b" e chame a Side Function
%
% Variáveis de entrada :
%
% a = Raio interno ( in )
%
% Variáveis de saída :
%
% b = Raio externo ( in )
% V = Volume ( in^3 )
% A = Área ( in^2 )
%
% Cálculo :
%
a = 0.25:0.25:4;
b = 2 + a;
[V,A] = Questao16a(a,b);