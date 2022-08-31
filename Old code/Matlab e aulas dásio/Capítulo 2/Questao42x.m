% Programa Questao38x, Resolve a questão 38
% Criado por Breno Felipe
%
% Explicação :
%
% Só joga na função, rapá
%
% Variáveis de entrada :
%
% a = Polinômio numerador
% b = Polinômio denominador
%
% Variáveis de saída :
%
% c = Polinômio resultante da divisão
% r = Resto da divisão
%
% Parâmetros :
%
a = [ 14 -6 3 9 ];
b = [ 5 7 -4 ];
%
% Cálculo :
%
[c,r] = deconv(a,b);% Programa Questao42x, Resolve a questão 42
% Criado por Breno Felipe
%
% Explicação
%
%
% Variáveis de entrada :
%
% a = Polinômio numerador
% b = Polinômio Denominador
% x = Intervalo
%
% Variáveis de saída :
%
% ax = Pontos do polinômio "a"
% bx = Pontos do polinômio "b"
% c = Resultado da divisão
%
% Parâmetros :
%
a = [ 3 -12 20 ];
b = [ 1 -7 10 ];
x = 0:0.1:7;
%
% Cálculo :
%
ax = polyval(a,x);
bx = polyval(b,x);
c = ax./bx;
%
% Plot :
%
plot(x,c)