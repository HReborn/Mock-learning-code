% Programa Questao22 , Plota o a fun��o dada na quest�o 22
% Criado por Breno Felipe em 11/04/2017
%
% Vari�veis de entrada : 
%
% x1 = Dist�ncia (Em milhas)
% 
% Vari�veis de sa�da : 
%
% u = Velocidade (Milhas/h)
% v = Velocidade (Milhas/h)
% 
% Valores :
%
x1 = linspace(0,2,30);
%
% C�lculo : 
%
u = log10(60*x1 + 1);
v = 3*cos(6*x1);
%
% Se��o plot : 
%
plot(x1,u,x1,v),xlabel('Tempo(minutos)'),ylabel('Velocidade(Milhas/h)'),gtext('Velocidade(u)'),gtext('Velocidade(v)'),title('Gr�fico Quest�o 22'),grid;
