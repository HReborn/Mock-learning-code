% Programa Questao38x, Resolve a quest�o 38
% Criado por Breno Felipe
%
% Explica��o :
%
% S� joga na fun��o, rap�
%
% Vari�veis de entrada :
%
% a = Polin�mio numerador
% b = Polin�mio denominador
%
% Vari�veis de sa�da :
%
% c = Polin�mio resultante da divis�o
% r = Resto da divis�o
%
% Par�metros :
%
a = [ 14 -6 3 9 ];
b = [ 5 7 -4 ];
%
% C�lculo :
%
[c,r] = deconv(a,b);