% Programa Quest�o 34x, Resolve a quest�o 34
% Criado por Breno Felipe
% 
% Explica��o
%
% S� jogue na equa��o dada
%
% Vari�veis de entrada :
%
% a = Aresta do paralelep�pedo
% d = Aresta do paralelep�pedo
% c = Aresta do paralelep�pedo
% 
% Vari�veis de sa�da :
%
% d = Volume do paralelep�pedo
%
% Par�metros :
%
a = [ 5 0 0 ];
b = [ 2 4 0 ];
c = [ 3 0 -2 ];
%
% C�lculo :
%
d = abs(dot(a,cross(b,c)));
%
% Display :
%
disp('O Volume do paralelep�pedo � :')
disp(d)