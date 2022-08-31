% Programa Questao15x, resolve a quest�o 15
% Criado por Breno Felipe em 24/04/2017
%
% Explica��o : 
%
% O problema da as velocidades de dois avi�es ,A e B, o qual o avi�o A viaja
% para o sudoeste e o avi�o B,oeste.Ele pede para calcularmos a velocidade relativa(A - B)
% entre os avi�es.Devido as suas trajet�rias, eles formam um tri�ngulo ret�ngulo 
% o qual a hipotenusa � A,a altura � (A - B) e a base � B e os angulos dos
% catetos s�o desconhecidos,visto que a inclina��o de A pode ser qualquer umas
% contanto que seja na parte sudoeste.
%
% Entrada :
%
% A = Velociade do avi�o A ( Em milhas/h )
% B = Velociade do avi�o B ( Em milhas/h )
%
% Sa�da : 
%
% V = Velocidade de A em rela��o � B 
%
% Valores : 
%
A = 300;
B = 150;
%
% C�lculo :
%
V = sqrt(-B^2 + A^2);
%
% Se��o disp :
%
disp('A velocidade de A em rela��o � B � : ');
disp(V);