% Programa Questao8, Resolve a questão 8
% Criado por Breno Felipe
%
% Explicação :
%
% Ele pede uma função que tenha o output em graus, use a função que tem o
% output em radianos e dentro dessa função, transforme para graus.
%
% Variáveis de entrada :
%
% x = Parte x do ponto
% y = Parte y do ponto
%
% Variáveis de saída :
%
% rad = Função atan2, em rad
% deg = Tranformação do resultado de "rad" para graus
%
% Cálculo :
%
function [deg] = Questao8(y,x)
rad = atan2(y,x);
deg = (180*rad)/pi;