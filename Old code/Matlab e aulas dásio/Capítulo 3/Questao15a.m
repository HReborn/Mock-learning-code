% Programa Questao15a, Side Function do programa Questao15,
% Criado por Breno Felipe
%
% Explica��o :
%
% Isole "h" nas duas express�es, iguale e voc� ter� a fun��o abaixo 
%
% Vari�veis de entrada :
%
% r = Raio ( in )
% v = Volume, vari�vel global, logo, pode ser usada fora da fun��o ( in^3 )
%
% Vari�veis de sa�da :
%
% A = �rea ( in^2 )
%
% C�lculo :
%
function A = Questao15a(r)
A = sqrt((9.*10.^2 + pi*r^6)/r^2);