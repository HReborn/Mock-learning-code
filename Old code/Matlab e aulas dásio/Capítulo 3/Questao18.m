% Programa Questao18, Resolve a Quest�o 18
% Criado por Breno Felipe
%
% Explica��o :
%
% Crie uma fun��o an�nima, com a entrada sendo o intervalo ,execute e por
% fim, plote.
%
% Vari�veis de entrada :
%
% z = Intervalo da quest�o
% y = Fun��o an�nima
%
% Vari�veis de sa�da :
%
% t = Resultado da fun��o
%
% Par�metros :
%
z = 0:0.25:2;
y = @(x) 10*exp(-2*x);
%
% C�lculo :
%
t = y(z);
%
% Plot :
%
plot(z,t)

