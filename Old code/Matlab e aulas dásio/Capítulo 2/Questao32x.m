% Programa Questao32x, resolve a quest�o 32
% Criado por Breno Felipe
%
% Explica��o :
%
% Jogue na f�mula e verifique se a igualdade � verdadeira
%
% Vari�veis de entrada :
%
% a = Vetor da quest�o
% b = Vetor da quest�o
% c = Vetor da quest�o
%
% Vari�veis de sa�da :
%
% x = Parte A da igualdade
% y = Parte B da igualdade
%
% Par�metros :
%
a = [ 7 -3 7 ];
b = [ -6 2 3 ];
c = [ 2 8 -8 ];
%
% C�lculo :
%
x = cross(a,cross(b,c));
y = b*dot(a,c) - c*dot(a,b);
%
% Display :
%
disp('Parte A')
disp(x)
disp('Parte B')
disp(y)