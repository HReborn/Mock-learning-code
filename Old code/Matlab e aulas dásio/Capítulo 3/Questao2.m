% Programa Questao2, Resolve a quest�o 2
% Criado por Breno Felipe
%
% Explica��o :
%
% A magnitude de um imagin�rio � medida com a fun��o abs e seu �ngulo, com
% a fun��o angle
%
% Vari�veis de entrada :
%
% x = Na quest�o
% y = Na quest�o
%
% Vari�veis de sa�da :
%
% a1 = Magnitude da letra a
% a2 = �ngulo da letra a
% b1 = Magnitude da letra b
% b2 = �ngulo da letra b
%
% Par�metros :
%
x = -5 - 8*i;
y = 10 - 5*i;
%
% C�lculo :
%
a1 = abs(x*y);
a2 = angle(x*y);
b1 = abs(x/y);
b2 = angle(x/y);
%
% Display :
%
disp('Magnitude e �ngulo da letra A :')
disp(a1)
disp(a2)
disp('Magnitude e �ngulo da letra B :')
disp(b1)
disp(b2)