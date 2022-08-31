% Programa Questao19, Resolve a quest�o 19
% Criado por Breno Felipe
%
% Explica��o :
%
% Fa�a a fun��o, arbitre um intervalo e calcule os pontos, ent�o, plote.
% em seguida minimize a fun��o para achar o x m�nimo com fminbnd
%
% Vari�veis de entrada :
%
% y = Fun��o an�nima
% x = Intervalo qualquer
% 
% Vari�veis de sa�da :
%
% t = 
% minimo = 
%
% Par�metros :
%
y = @(x) 20.*x.^2 - 200.*x + 3;
x = -10:10;
%
% C�lculo :
%
t = y(x);
minimo = fminbnd(y,-10,10);
%
% Plot :
%
plot(x,t)
%
% Display :
% 
disp('Letra B :')
disp(minimo)