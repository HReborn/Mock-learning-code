% Programa Quest�o 33x, Resolve a quest�o 33
% Criado por Breno Felipe
% 
% Explica��o
%
% Apenas calcule o m�dulo do produto vetorial entre os lados
%
% Vari�veis de entrada :
%
% a = Lado do paralelogramo
% b = Lado do paralelogramo
%
% Vari�veis de sa�da :
%
% c = �rea do paralelogramo
%
% Par�metros :
%
a = [ 5 0 0 ];
b = [ 1 3 0 ];
%
% C�lculo :
%
c = abs(cross(a,b));
%
% Display :
%
disp('A �rea do paralelogramo � :')
disp(c)