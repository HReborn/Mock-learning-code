% Programa Questao35x, Resolve a questão 35
% Criado por Breno Felipe
%
% Explicação
%
% Primeiro, defina os intervalos, defina os polinômios e usando a função
% polyval, calcule os pontos do polinômio e enfim plote o intervalo versus
% os pontos dos polinômios.
%
% Variáveis de entrada :
%
% y = Polinômio da questão
% z = Polinômio da questão
% x = intervalo
%
% Variáveis de saída :
%
% yx = Pontos do polinômio "y"
% zx = Pontos do polinômio "z"
%
% Parâmetros :
%
y = [ 3 -6 8 4 90 ];
z = [ 3 5 -8 70 ];
x = -3:0.5:3;
%
% Cálculo :
%
yx = polyval(y,x);
zx = polyval(z,x);
%
% Plot :
%
plot(x,yx,'r',x,zx,'b'),ylabel('mA'),xlabel('Volts')