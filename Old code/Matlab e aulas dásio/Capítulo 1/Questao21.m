% Programa Questao21 , Plota o a função dada na questâo 21
% Criado por Breno Felipe em 11/04/2017
%
% Variáveis de entrada : 
%
% t1 = Tempo (Minutos)
% 
% Variáveis de saída : 
%
% T = Temperatura (ºC)
% 
% Valores :
%
t1 = linspace(1,3,30);
%
% Cálculo : 
%
T = 6*log(t1-7*exp(0.2*t1));
%
% Seção plot : 
%
plot(t1,T,'sr'),xlabel('Tempo(minutos)'),ylabel('Temperatura(ºC)'),title('Gráfico questão 21'),grid;