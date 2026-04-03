% Programa Questao22 , Plota o a função dada na questâo 22
% Criado por Breno Felipe em 11/04/2017
%
% Variáveis de entrada : 
%
% x1 = Distância (Em milhas)
% 
% Variáveis de saída : 
%
% u = Velocidade (Milhas/h)
% v = Velocidade (Milhas/h)
% 
% Valores :
%
x1 = linspace(0,2,30);
%
% Cálculo : 
%
u = log10(60*x1 + 1);
v = 3*cos(6*x1);
%
% Seção plot : 
%
plot(x1,u,x1,v),xlabel('Tempo(minutos)'),ylabel('Velocidade(Milhas/h)'),gtext('Velocidade(u)'),gtext('Velocidade(v)'),title('Gráfico Questão 22'),grid;
