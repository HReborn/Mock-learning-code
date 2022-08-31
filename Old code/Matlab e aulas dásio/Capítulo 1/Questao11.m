% Programa Quest�o 11, Caucula a principal causa da imprecis�o do c�lculo da
%                      press�o referente � questao 11
% Criado em 17/03/2017 por Breno Felipe
%
% Vari�veis contantes:
% A = Esse valor depende do g�s
% B = Esse valor depende do g�s
% R = � a constante universal dos gases
% N = Quantidade de mat�ria (Em mol)
% V = Volume do g�s (Em litros)
% T = Temperatura do g�s (Em Kelvin)
%
% Variaveis de sa�da:
% P1 = Press�o mais imprecisa em rela��o � Van Der Waals
% P = Press�o exercida por um g�s no recipiente de acordo com Van Der Waals
% Z = Corre��o do volume das mol�culas
% W = Corre��o da atra��o das mol�culas
% D = Diferen�a entre as press�es
%
% Valores constantes:
% S�o os valores indicados nas quest�es
A = 6,49;
B = 0.0562;
R = 0.08206;
N = 1;
V = 22.41;
T = 273.2;
% Se��o de c�lculo:
P1 = (N*R*T)/V;
Z = N*B;
W = (A*N^2)/V^2;
P = (N*R*T)/(V - Z) - W;
D = P - P1;
%
% Secao a mostra:
disp('A press�o exercida pelo g�s de acordo com Van Der Waals �:')
disp(P)
disp('A press�o mais imprecisa �:')
disp(P1)
disp('A diferen�a entre as press�es �:')
disp(D)
disp('Como a corre��o relacionada ao volume das mol�culas �:')
disp(Z)
disp('E a corre��o relacionada �s atra��es moleculares �:')
disp(W)
disp('Logo,a principal causa da diferen�a � o volume das mol�culas:')
disp(Z)