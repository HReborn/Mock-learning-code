% Programa Questao16, Resolve a Quest�o 16
% Criado por Breno Felipe
%
% Explica��o :
%
% Defina dentro do programa "a" e "b" e chame a Side Function
%
% Vari�veis de entrada :
%
% a = Raio interno ( in )
%
% Vari�veis de sa�da :
%
% b = Raio externo ( in )
% V = Volume ( in^3 )
% A = �rea ( in^2 )
%
% C�lculo :
%
a = 0.25:0.25:4;
b = 2 + a;
[V,A] = Questao16a(a,b);