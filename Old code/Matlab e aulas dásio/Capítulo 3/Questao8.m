% Programa Questao8, Resolve a quest�o 8
% Criado por Breno Felipe
%
% Explica��o :
%
% Ele pede uma fun��o que tenha o output em graus, use a fun��o que tem o
% output em radianos e dentro dessa fun��o, transforme para graus.
%
% Vari�veis de entrada :
%
% x = Parte x do ponto
% y = Parte y do ponto
%
% Vari�veis de sa�da :
%
% rad = Fun��o atan2, em rad
% deg = Tranforma��o do resultado de "rad" para graus
%
% C�lculo :
%
function [deg] = Questao8(y,x)
rad = atan2(y,x);
deg = (180*rad)/pi;