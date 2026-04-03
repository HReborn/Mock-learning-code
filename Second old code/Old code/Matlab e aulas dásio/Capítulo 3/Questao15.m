% Programa Questao15, Resolve a questão 15
% Criado por Breno Felipe
%
% Explicação :
% 
% Defina o volume como sua entrada para ele ser usado na Side Function,
% minimize o raio usando a função fminbnd. Calcule a altura mínima
% usando o raio mínimo em uma das expressões em que o h foi isolado.
% Plote um intervalo do raio com fórmula do volume.
%
% Variáveis de entrada :
%
% v = Volume ( in^3 )
%
% Variáveis de saída :
%
% rm = Raio mínimo ( in )
% hm = Altura mínima ( in )
% r = Intervalo qualquer do raio ( in )
% v1 = Volume em função do raio ( in^3 )
% Am = Área mínima ( in^2 )
% AmA = 10% Acima da Área mínima ( in^2 )
% a1 = intervalo da área mínima até 10% acima de seu valor
% rmA1 = Polinômio que representa a variação do raio em função da área
% rmA2 = Valores possíveis para rm
% rmA = Valor máximo que r pode variar do seu valor mínimo quando a área
%       varia até 10% acima do seu valor mínimo
%
% Cálculo :
%
function [rm,rmA] = Questao15(v)
rm = fminbnd(@Questao15a,0,100);
hm = (3*v)/(pi*rm^2);
r = 0:0.1:5;
v1 = pi*r.^2*hm/3;
Am = Questao15a(rm);
AmA = Am*1.1;
a1 = linspace(Am,AmA,50);
rmA1 = [ pi 0 0 0 -a1.^2 0 9*v^2 ];
rmA2 = roots(rmA1);
rmA = max(rmA2);
%
% Plot :
%
plot(r,v1)