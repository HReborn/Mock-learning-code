% Programa Quest�o23, Resolve a quest�o 23
% Criado em 03/02/2018, por Breno Felipe
%
% Vari�veis de entrada : 
%
% x = Intervalo da fun��o
% y = Fun��o f(x) de Fourier
%
% Vari�veis de sa�da : 
% 
% f = Representa��o da s�rie de Fourier
%
% Valores : 
%
x = linspace(-pi,pi,100);
y(1:50) = -1;
y(51:100) = 1;
%
% C�lculo : 
%
f = (4/pi)*(sin(x) + sin(3*x)/3 + sin(5*x)/5 + sin(7*x)/7);
%
% Plot : 
%
plot(x,y,'r',x,f,'b'),xlabel('Intervalo'),ylabel('Fun��o e Representa��o de Fourier'),title('S�rie de Fourier')