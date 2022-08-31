% Programa Questao11, Resolve a quest�o 11
% Criado por Breno Felipe
%
% Explica��o :
%
% S� escreva as opera��es l�gicas indicadas na quest�o
%
% Vari�veis de entrada :
%
% x = Vetor da quest�o
% y = Vetor da quest�o
%
% Vari�veis de sa�da :
%
% a = Condi��o da letra A
% b = Condi��o da letra B
% c = Condi��o da letra C
% d = Condi��o da letra D
%
% Par�metros :
%
x = [ -3 0 0 2 5 8 ];
y = [ -5 -2 0 3 4 10 ];
%
% C�lculo :
%
a = y > x;
b = x & y;
c = x|y;
d = xor(x,y);
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