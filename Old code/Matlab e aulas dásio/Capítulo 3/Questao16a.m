% Programa Questao16a, Side Function do programa Questao16
% Criado por Breno Felipe
%
% Explica��o :
%
% S� fa�a a fun��o com as equa��es dadas
%
% Vari�veis de entrada :
%
% a = Raio interno ( in )
% b = Raio externo ( in )
%
% Vari�veis de sa�da :
%
% V = Volume ( in^3 )
% A = �rea ( in^2 )
%
% C�lculo :
%
function [V,A] = Questao16a(a,b)
V = (pi.^2.*(a+b).*(b-a).^2)/4;
A = pi.^2.*(b.^2 - a.^2);