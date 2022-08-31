% Programa Questão23, Resolve a questão 23
% Criado em 03/02/2018, por Breno Felipe
%
% Variáveis de entrada : 
%
% x = Intervalo da função
% y = Função f(x) de Fourier
%
% Variáveis de saída : 
% 
% f = Representação da série de Fourier
%
% Valores : 
%
x = linspace(-pi,pi,100);
y(1:50) = -1;
y(51:100) = 1;
%
% Cálculo : 
%
f = (4/pi)*(sin(x) + sin(3*x)/3 + sin(5*x)/5 + sin(7*x)/7);
%
% Plot : 
%
plot(x,y,'r',x,f,'b'),xlabel('Intervalo'),ylabel('Função e Representação de Fourier'),title('Série de Fourier')