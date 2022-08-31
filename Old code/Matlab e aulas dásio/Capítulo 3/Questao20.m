% Programa Questao20, Resolve a questão 20
% Criado por Breno Felipe
%
% Explicação :
%
% Ele dá a função pronta depois divide em partes, junte as partes e
% Calcule os pontos do intervalo, depois disso, plote.
%
% Variáveis de entrada :
%
% h = Primeira parte
% g = Segunda Parte
% f = Terceira parte
% t = Junção de tudo
% k = Intervalo
%
% Variáveis de saída :
%
% v = Resultado dos pontos do intervalo
%
% Parâmetros :
%
h = @(z) 6.*exp(z);
g = @(y) 3.*cos(y);
f = @(x) x.^2;
t = @(k) h(g(f(k)));
k = 0:0.25:4;
%
% Cálculo :
%
v = t(k);
%
% Plot :
%
plot(k,v)