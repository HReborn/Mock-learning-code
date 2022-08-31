% Programa Questao30x, Resolve a questão 30
% Criado por Breno Felipe
%
% Explicação :
%
% Na letra A, defina o tempo, calcule a parte  Y do vetor posição que
% precisa do tempo, o resultado vai ser um vetor "x", depois, diga que
% a primeira coluna da matriz "r", que será uma constante, é 2, depois,
% diga a segunda coluna é igual á x' que é uma matriz coluna, e depois
% diga que a terceira coluna da matriz "r" é igual a 0.
% Na letra B, apenas procure a quinta linha
% Na letra C, escreva a equação dita na questão e calcule. como "m" é uma
% escalar, é apenas uma multiplicação normal, mas a outra operação, é
% um produto vetorial
% 
% Variáveis de entrada :
%
% t = Tempo ( s )
% v = Velocidade, 11x3, repete a mesma linha 11 vezes ( m/s )
% m = Massa ( kg )
%
% Variáveis de saída :
%
% x = Parte Y do vetor "r"
% r = Vetor posição , 11x3, cada linha representa r(t), para cada tempo
% L = Momento angular
%
% Parâmetros :
%
t = 0:0.5:5;
v(:,1) = 0;
v(:,2) = 10;
v(:,3) = 0;
m = 5;
%
% Cáltulo :
%
% Letra A :
x = 10*t+3;
r(1:11,1) = 2; % m
r(:,2) = x';
r(:,3) = 0;
%
% Letra C :
%
L = m*(cross(r,v));
%
% Display :
disp('O vetor posição é :')
disp(r)
disp('Letra B')
disp(r(11,:))
disp('O momento angular é :')
disp(L)