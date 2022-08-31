% Programa Questao 22, REsolve a quest�o 22
% Criado por Breno Felipe
%
% Explica��o :
%
% Fa�a um loop, em que a itera��o atual receba o valor calculado anterior
% y = 5*k^3, y(i) = 5*k(i)^3 + y(i-1), ou calcule os pontos y(k) e use a
% fun��o sum(x)
%
% Vari�veis de entrada : 
%
% k = Intervalo
%
% Vari�veis de sa�da : 
%
% y = Valores dos termos
% soma = Soma dos dez primeiros termos
%
% Par�metros :
%
clear
k = 1:10;
%
% C�lculo :
%
for i = 1:10
    y(i) = 5*k(i)^3;
end
soma = sum(y);
%
% Display : 
%
disp(' O resultado � : ')
disp(soma)