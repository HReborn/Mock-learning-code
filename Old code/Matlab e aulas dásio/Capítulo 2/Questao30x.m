% Programa Questao30x, Resolve a quest�o 30
% Criado por Breno Felipe
%
% Explica��o :
%
% Na letra A, defina o tempo, calcule a parte  Y do vetor posi��o que
% precisa do tempo, o resultado vai ser um vetor "x", depois, diga que
% a primeira coluna da matriz "r", que ser� uma constante, � 2, depois,
% diga a segunda coluna � igual � x' que � uma matriz coluna, e depois
% diga que a terceira coluna da matriz "r" � igual a 0.
% Na letra B, apenas procure a quinta linha
% Na letra C, escreva a equa��o dita na quest�o e calcule. como "m" � uma
% escalar, � apenas uma multiplica��o normal, mas a outra opera��o, �
% um produto vetorial
% 
% Vari�veis de entrada :
%
% t = Tempo ( s )
% v = Velocidade, 11x3, repete a mesma linha 11 vezes ( m/s )
% m = Massa ( kg )
%
% Vari�veis de sa�da :
%
% x = Parte Y do vetor "r"
% r = Vetor posi��o , 11x3, cada linha representa r(t), para cada tempo
% L = Momento angular
%
% Par�metros :
%
t = 0:0.5:5;
v(:,1) = 0;
v(:,2) = 10;
v(:,3) = 0;
m = 5;
%
% C�ltulo :
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
disp('O vetor posi��o � :')
disp(r)
disp('Letra B')
disp(r(11,:))
disp('O momento angular � :')
disp(L)