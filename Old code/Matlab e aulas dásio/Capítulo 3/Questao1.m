% Programa Questao1, Resolve a quest�o 1
% Criado por Breno Felipe
%
% Explica��o :
%
% S� jogue nas opera��es imagin�rias indicadas
%
% Vari�veis de entrada :
%
% x = Intervalo da quest�o
% 
% Vari�veis de sa�da :
%
% y = Fun��o da quest�o
% a = Letra a
% b = Letra b
% c = Letra c
% d = Letra d
%
% Par�metros :
%
x = 0:2;
%
% C�lculo :
%
y = -3 +i*x;
a = abs(y);
b = sqrt(y);
c = (-5 - 7*i)*y;
d = y/(6 - 3*i);
%
% Display :
%
disp('Letra A')
disp(a)
disp('Letra B')
disp(b)
disp('Letra C')
disp(c)
disp('Letra D')
disp(d)