% Programa Questao21 , Plota o a fun��o dada na quest�o 21
% Criado por Breno Felipe em 11/04/2017
%
% Vari�veis de entrada : 
%
% t1 = Tempo (Minutos)
% 
% Vari�veis de sa�da : 
%
% T = Temperatura (�C)
% 
% Valores :
%
t1 = linspace(1,3,30);
%
% C�lculo : 
%
T = 6*log(t1-7*exp(0.2*t1));
%
% Se��o plot : 
%
plot(t1,T,'sr'),xlabel('Tempo(minutos)'),ylabel('Temperatura(�C)'),title('Gr�fico quest�o 21'),grid;