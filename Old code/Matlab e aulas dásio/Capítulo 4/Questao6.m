% Programa Questao6, Resolve a quest�o 6
% Criado por Breno Felipe
%
% Explica��o :
%
% Apenas excreva as opera��es l�gicas corretamente.
%
% Vari�veis de entrada :
%
% x = Vetor da quest�o
% y = Vetor da quest�o
%
% Vari�veis de sa�da :
%
% a = Letra A
% b = Letra B
% c = Letra C
% d = Letra D
% r = Resultados juntos
%
% Par�metros :
%
x = [ 10 -2 6 5 -3 ];
y = [ 9 -3 2 5 -1 ];
%
% C�lculo :
%
a = x < 6;
b = x<=y;
c = x==y;
d = x~=y;
r = [ a ; b ; c ; d ];
%
% Display :
%
disp('Os resultados s�o : ')
disp(r)