% Programa Questao1, Resolve a Questão 1
% Criado por Breno Felipe
%
% Explicação :
%
% Ache os valores de v, de a e plote os dois
%
% Variáveis de entrada :
%
% r = Raio da esfera ( m )
%
% Variáveis de saída :
%
% v = Volume da esfera ( m^3 )
% a = Área da esfera ( m^2 )
%
% Parâmetros :
%
r = 0:0.25:3;
%
% Cálculo :
%
v = 4*pi*r.^3/3;
a = 4*pi*r.^2;
%
% Plot :
%
plot(v,a)