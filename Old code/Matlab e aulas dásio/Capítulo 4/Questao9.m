% Programa Questao9, resolve a questão 9
% Criado por Breno Felipe
%
% Explicação :
%
% Calcule a condição e some o resultado, pois já que é binário o resultado
% vai ser exatamente a quantidade de vezes em que a condição foi sanada. 
%
% Variáveis de entrada :
%
% pa = Preço A
% pb = Preço B
%
% Variáveis de saída :
%
% x = Condição da questão
% z = Soma dos dias em que a condição foi sanada
%
% Parâmetros :
%
pa = [ 19 18 22 21 25 19 17 21 27 29 ];
pb = [ 22 17 20 19 24 18 16 25 28 27 ];
%
% Cálculo :
%
x = pa>pb;
z = sum(x,2);
%
% Display :
%
disp('A Quantidade de dias em que a condição foi sanada é :')
disp(z)