% Programa Questao 22, REsolve a questão 22
% Criado por Breno Felipe
%
% Explicação :
%
% Faça um loop, em que a iteração atual receba o valor calculado anterior
% y = 5*k^3, y(i) = 5*k(i)^3 + y(i-1), ou calcule os pontos y(k) e use a
% função sum(x)
%
% Variáveis de entrada : 
%
% k = Intervalo
%
% Variáveis de saída : 
%
% y = Valores dos termos
% soma = Soma dos dez primeiros termos
%
% Parâmetros :
%
clear
k = 1:10;
%
% Cálculo :
%
for i = 1:10
    y(i) = 5*k(i)^3;
end
soma = sum(y);
%
% Display : 
%
disp(' O resultado é : ')
disp(soma)