% Programa Questao41x, Resolve a quest�o 41
% Criado por Breno Felipe
%
% Explica��o :
%
% Fa�a um vetor posi��o em fun��o do tempo para cada avi�o, use pit�goras
% e ache uma espress�o para "d" em fun��o do tempo, plote depois.
% Na letra B, Use a mesma espress�o d(t) com d = 30, e ache um polin�mio
% para o tempo, ent�o use roots.
%
% Vari�veis de entrada :
%
% va = Velocidade avi�o A ( mi/min )
% vb = Velocidade Avi�o B, menor velocidade ( mi/min )
% t = Tempo, use o intervalo que chegue at� o valor m�nimo de "d" ( min )
% 
% Vari�veis de sa�da :
%
% a = Vetor posi��o de A a cada minuto ( mi )
% b = Vetor posi��o de B a cada minuto ( mi )
% d = Dist�ncia entre os avi�es a cada minuto ( mi )
% x = Polin�mio representando o tempo quando d = 30
% t1 = Tempo quando d = 30 ( min )
%
% Par�metros :
%
va = 16/3; % mi/min
vb = 8/3; % b = avi�o com menor velocidade
t = 0:3:150;
%
% C�lculo :
%
a = 800 - va*t;
b = 410 - vb*t;
d = sqrt(a.^2 + b.^2);
d(length(a)) = 10; % A �ltima intera��o, n�o � um triangulo retangulo
%                    mas sim apenas uma reta
x = [ (va^2 + vb^2) -(1600*va + 820*vb) (410^2 + 800^2 -(30^2)) ];
t1 = roots(x)
%
% Plot :
%
plot(t,d)
%
% Display :
% 
disp('Tempo quando D = 30 � :')
disp(t1)