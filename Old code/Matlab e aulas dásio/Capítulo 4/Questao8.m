% Programa Questao8, resolve a quest�o 8
% Criado por Breno Felipe
%
% Explica��o :
%
% Calcule a condi��o, como o resultado � bin�rio, quando somar, o resultado
% vai ser exatamente a quantidade de vezes que a condi��o foi sanada.
%
% Vari�veis de entrada :
%
% p = Arranjo dos pre�os
%
% Vari�veis de sa�da :
%
% x = Condi��o da quest�o
% z = Soma dos dias que satisfazem a condi��o
%
% Par�metros :
%
p = [ 19 18 22 21 25 19 17 21 27 29 ];
%
% C�lculo :
%
x = p > 20;
z = sum(x);
%
% Display :
%
disp('A quantidade de dias em que o pre�o estava acima de 20 reais :')
disp(z)