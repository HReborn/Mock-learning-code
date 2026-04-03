% Programa Questao41x, Resolve a questão 41
% Criado por Breno Felipe
%
% Explicação :
%
% Faça um vetor posição em função do tempo para cada avião, use pitágoras
% e ache uma espressão para "d" em função do tempo, plote depois.
% Na letra B, Use a mesma espressão d(t) com d = 30, e ache um polinômio
% para o tempo, então use roots.
%
% Variáveis de entrada :
%
% va = Velocidade avião A ( mi/min )
% vb = Velocidade Avião B, menor velocidade ( mi/min )
% t = Tempo, use o intervalo que chegue até o valor mínimo de "d" ( min )
% 
% Variáveis de saída :
%
% a = Vetor posição de A a cada minuto ( mi )
% b = Vetor posição de B a cada minuto ( mi )
% d = Distância entre os aviões a cada minuto ( mi )
% x = Polinômio representando o tempo quando d = 30
% t1 = Tempo quando d = 30 ( min )
%
% Parâmetros :
%
va = 16/3; % mi/min
vb = 8/3; % b = avião com menor velocidade
t = 0:3:150;
%
% Cálculo :
%
a = 800 - va*t;
b = 410 - vb*t;
d = sqrt(a.^2 + b.^2);
d(length(a)) = 10; % A última interação, não é um triangulo retangulo
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
disp('Tempo quando D = 30 é :')
disp(t1)