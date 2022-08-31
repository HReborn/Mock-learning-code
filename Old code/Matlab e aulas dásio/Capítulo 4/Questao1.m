% Programa Questao1, Resolve a Quest�o 1
% Criado por Breno Felipe
%
% Explica��o :
%
% Ache os valores de v, de a e plote os dois
%
% Vari�veis de entrada :
%
% r = Raio da esfera ( m )
%
% Vari�veis de sa�da :
%
% v = Volume da esfera ( m^3 )
% a = �rea da esfera ( m^2 )
%
% Par�metros :
%
r = 0:0.25:3;
%
% C�lculo :
%
v = 4*pi*r.^3/3;
a = 4*pi*r.^2;
%
% Plot :
%
plot(v,a)