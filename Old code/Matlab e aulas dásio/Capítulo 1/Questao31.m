% Programa Pistao, plota o angulo entre o eixo e a manivela de um pistão com a distância do eixo da manivela ao pistão.
% Criado por Breno Felipe
%
% Explicando o problema :
%
disp('Um motor de combustâo interna possui um pistão,uma biela e uma manivela');

disp('Quando há a combustão, o pistão é empurrado para baixo que empurra a biela para baixo a qual gira a manivela');

disp('O objetivo do programa é plotar a distância (D) entreo pistão e o eixo da manivela');
%
% Valores e definições das variáveis :
%
L1 = 1; % Comprimento da biela (Em ft)
L1_1 = 0.6; % Novos valores devido a questão 31
L1_2 = 1.4; % Novos valores devido a questão 31
L2 = 0.5; % Comprimento da manivela (Em ft)
A = linspace(0,pi,100); % Ângulo entre L2 e D (Em rad)
A1 = linspace(0,4*pi,100); % Maior abrangência do ângulo A (Em rad)
B = asin(sin(A)*L2/L1); % Ângulo entre L1 e D (Em rad)
B1 = asin(sin(A1)*L2/L1); % Maior abrangência do ângulo B (Em rad)
B2 = asin(sin(A)*L2/L1_1); % Novos valores devido a questão 31
B3 = asin(sin(A)*L2/L1_2); % Novos Valores devido a questao 31
% D = Distância entre o eixo da manivela e o pistão (Em ft)
% D = Maior abrangência dos valores de D
%
% Cálculo :
%
% De acordo com o problema,temos os valores dos comprimentos da manivela e da biela e como os valores de A são arbitrários, resta apenas achar os valores de B e de D
% Para achar D usamos a relação trigonométrica abaixo :
D = cos(B)*L1 + cos(A)*L2;
D1 = cos(B1)*L1 + cos(A1)*L2;
D2 = cos(B2)*L1_1 + cos(A)*L2; % Novos valores devido a questão 31
D3 = cos(B3)*L1_2 + cos(A)*L2; % Novos valores devido a questão 31
% Para acharmos D, precisamos achar o valor de B pela lei dos senos : 
% sin(B) = sin(A)*L2/L1
% B = asin(sin(A)*L2/L1)
%
% Plotando
%
plot(A,D,'*',A,D),xlabel('Ângulo(rad)'),ylabel('Distância(ft)'),title('Gráfico do pistão'),grid;
Grafico1 = input('Deseja plotar o gráfico com uma maior abrangência : ','s');
plot(A1,D1,'*',A1,D1),xlabel('Ângulo(rad)'),ylabel('Distância(ft)'),title('Gráfico do pistão'),grid;
lokao = input('Deseja plotar o gráfico da questão 31 : ','s');
plot(A,D,'r',A,D2,'b',A,D3,'g'),xlabel('Ângulo(rad)'),ylabel('Distância(ft)'),title('Gráfico do pistão'),grid;
disp('Aparentemente, quanto maior for L1 maior a distância, e quanto maior for L2, provalmente terá o mesmo efeito.')