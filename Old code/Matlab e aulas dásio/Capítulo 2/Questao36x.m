% Programa Questao36x, Resolve a questão 36
% Criado por Breno Felipe
%
% Explicação
% 
% Defina o intervalo, calcule os pontos do polinômio e plote
%
% Variáveis de entrada :
%
% y = Polinômio da questão
% x = Intervalo
%
% Variáveis de saída :
%
% yx = Pontos do polinômio
%
% Parâmetros :
%
y = [ 3 -5 -28 -5 200 ];
x = -1:0.5:1;
%
% Cálculo :
%
yx = polyval(yx,x);
%
% Plot :
%
plot(x,yx),grid,ginput