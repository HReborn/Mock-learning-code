% Programa Questão 11, Caucula a principal causa da imprecisão do cálculo da
%                      pressão referente à questao 11
% Criado em 17/03/2017 por Breno Felipe
%
% Variáveis contantes:
% A = Esse valor depende do gás
% B = Esse valor depende do gás
% R = É a constante universal dos gases
% N = Quantidade de matéria (Em mol)
% V = Volume do gás (Em litros)
% T = Temperatura do gás (Em Kelvin)
%
% Variaveis de saída:
% P1 = Pressão mais imprecisa em relação à Van Der Waals
% P = Pressão exercida por um gás no recipiente de acordo com Van Der Waals
% Z = Correção do volume das moléculas
% W = Correção da atração das moléculas
% D = Diferença entre as pressões
%
% Valores constantes:
% São os valores indicados nas questões
A = 6,49;
B = 0.0562;
R = 0.08206;
N = 1;
V = 22.41;
T = 273.2;
% Seção de cálculo:
P1 = (N*R*T)/V;
Z = N*B;
W = (A*N^2)/V^2;
P = (N*R*T)/(V - Z) - W;
D = P - P1;
%
% Secao a mostra:
disp('A pressão exercida pelo gás de acordo com Van Der Waals é:')
disp(P)
disp('A pressão mais imprecisa é:')
disp(P1)
disp('A diferença entre as pressões é:')
disp(D)
disp('Como a correção relacionada ao volume das moléculas é:')
disp(Z)
disp('E a correção relacionada às atrações moleculares é:')
disp(W)
disp('Logo,a principal causa da diferença é o volume das moléculas:')
disp(Z)