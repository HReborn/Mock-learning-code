% Programa Questao15x, resolve a questão 15
% Criado por Breno Felipe em 24/04/2017
%
% Explicação : 
%
% O problema da as velocidades de dois aviões ,A e B, o qual o avião A viaja
% para o sudoeste e o avião B,oeste.Ele pede para calcularmos a velocidade relativa(A - B)
% entre os aviões.Devido as suas trajetórias, eles formam um triângulo retângulo 
% o qual a hipotenusa é A,a altura é (A - B) e a base é B e os angulos dos
% catetos são desconhecidos,visto que a inclinação de A pode ser qualquer umas
% contanto que seja na parte sudoeste.
%
% Entrada :
%
% A = Velociade do avião A ( Em milhas/h )
% B = Velociade do avião B ( Em milhas/h )
%
% Saída : 
%
% V = Velocidade de A em relação à B 
%
% Valores : 
%
A = 300;
B = 150;
%
% Cálculo :
%
V = sqrt(-B^2 + A^2);
%
% Seção disp :
%
disp('A velocidade de A em relação à B é : ');
disp(V);