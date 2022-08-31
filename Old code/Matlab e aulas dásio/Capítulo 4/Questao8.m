% Programa Questao8, resolve a questão 8
% Criado por Breno Felipe
%
% Explicação :
%
% Calcule a condição, como o resultado é binário, quando somar, o resultado
% vai ser exatamente a quantidade de vezes que a condição foi sanada.
%
% Variáveis de entrada :
%
% p = Arranjo dos preços
%
% Variáveis de saída :
%
% x = Condição da questão
% z = Soma dos dias que satisfazem a condição
%
% Parâmetros :
%
p = [ 19 18 22 21 25 19 17 21 27 29 ];
%
% Cálculo :
%
x = p > 20;
z = sum(x);
%
% Display :
%
disp('A quantidade de dias em que o preço estava acima de 20 reais :')
disp(z)