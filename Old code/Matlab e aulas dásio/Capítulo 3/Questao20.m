% Programa Questao20, Resolve a quest�o 20
% Criado por Breno Felipe
%
% Explica��o :
%
% Ele d� a fun��o pronta depois divide em partes, junte as partes e
% Calcule os pontos do intervalo, depois disso, plote.
%
% Vari�veis de entrada :
%
% h = Primeira parte
% g = Segunda Parte
% f = Terceira parte
% t = Jun��o de tudo
% k = Intervalo
%
% Vari�veis de sa�da :
%
% v = Resultado dos pontos do intervalo
%
% Par�metros :
%
h = @(z) 6.*exp(z);
g = @(y) 3.*cos(y);
f = @(x) x.^2;
t = @(k) h(g(f(k)));
k = 0:0.25:4;
%
% C�lculo :
%
v = t(k);
%
% Plot :
%
plot(k,v)