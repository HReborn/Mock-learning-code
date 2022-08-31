% Programa Pistao, plota o angulo entre o eixo e a manivela de um pist�o com a dist�ncia do eixo da manivela ao pist�o.
% Criado por Breno Felipe
%
% Explicando o problema :
%
disp('Um motor de combust�o interna possui um pist�o,uma biela e uma manivela');

disp('Quando h� a combust�o, o pist�o � empurrado para baixo que empurra a biela para baixo a qual gira a manivela');

disp('O objetivo do programa � plotar a dist�ncia (D) entreo pist�o e o eixo da manivela');
%
% Valores e defini��es das vari�veis :
%
L1 = 1; % Comprimento da biela (Em ft)
L1_1 = 0.6; % Novos valores devido a quest�o 31
L1_2 = 1.4; % Novos valores devido a quest�o 31
L2 = 0.5; % Comprimento da manivela (Em ft)
A = linspace(0,pi,100); % �ngulo entre L2 e D (Em rad)
A1 = linspace(0,4*pi,100); % Maior abrang�ncia do �ngulo A (Em rad)
B = asin(sin(A)*L2/L1); % �ngulo entre L1 e D (Em rad)
B1 = asin(sin(A1)*L2/L1); % Maior abrang�ncia do �ngulo B (Em rad)
B2 = asin(sin(A)*L2/L1_1); % Novos valores devido a quest�o 31
B3 = asin(sin(A)*L2/L1_2); % Novos Valores devido a questao 31
% D = Dist�ncia entre o eixo da manivela e o pist�o (Em ft)
% D = Maior abrang�ncia dos valores de D
%
% C�lculo :
%
% De acordo com o problema,temos os valores dos comprimentos da manivela e da biela e como os valores de A s�o arbitr�rios, resta apenas achar os valores de B e de D
% Para achar D usamos a rela��o trigonom�trica abaixo :
D = cos(B)*L1 + cos(A)*L2;
D1 = cos(B1)*L1 + cos(A1)*L2;
D2 = cos(B2)*L1_1 + cos(A)*L2; % Novos valores devido a quest�o 31
D3 = cos(B3)*L1_2 + cos(A)*L2; % Novos valores devido a quest�o 31
% Para acharmos D, precisamos achar o valor de B pela lei dos senos : 
% sin(B) = sin(A)*L2/L1
% B = asin(sin(A)*L2/L1)
%
% Plotando
%
plot(A,D,'*',A,D),xlabel('�ngulo(rad)'),ylabel('Dist�ncia(ft)'),title('Gr�fico do pist�o'),grid;
Grafico1 = input('Deseja plotar o gr�fico com uma maior abrang�ncia : ','s');
plot(A1,D1,'*',A1,D1),xlabel('�ngulo(rad)'),ylabel('Dist�ncia(ft)'),title('Gr�fico do pist�o'),grid;
lokao = input('Deseja plotar o gr�fico da quest�o 31 : ','s');
plot(A,D,'r',A,D2,'b',A,D3,'g'),xlabel('�ngulo(rad)'),ylabel('Dist�ncia(ft)'),title('Gr�fico do pist�o'),grid;
disp('Aparentemente, quanto maior for L1 maior a dist�ncia, e quanto maior for L2, provalmente ter� o mesmo efeito.')