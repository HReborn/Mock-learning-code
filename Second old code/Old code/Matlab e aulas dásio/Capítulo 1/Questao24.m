% Programa Questao24 , plota o gráfico da questão 24
% Criado por Breno Felipe em 11/04/2017

% Variáveis de entrada : 
%
% R = Raio ( Em polegadas )
% fi = Ângulo do ciclóide ( Em radianos )
%
% Variáveis de saída : 
%
% Y = Equação do ciclóide
% X = Equação do ciclóide
%
% Valores : 
%
R = 10;
fi = linspace(0,4*pi,100);
%
% Cálculo : 
%
Y = R*(1 - cos(fi));
X = R*(fi - sin(fi));
%
% Plot : 
%
plot(X,Y),title('Gráfico do ciclóide')