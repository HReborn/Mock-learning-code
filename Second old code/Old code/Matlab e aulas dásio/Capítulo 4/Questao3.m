% Programa Questao3, Resolve a questão 3
% Criado por Breno Felipe
%
% Explicação :
%
% Para obter a soma dos números é só definir x = 0 e para cada iteração
% ir somando a soma anterior, xatual = somaatual + xantigo e repete até
% chegar ao final de k
%
% Variáveis de entrada :
% 
% x = Soma inicial, que é zero
% k = Variável independente
%
% Variáveis de saída :
%
% x = Soma, mesma variável que o x inicial, porém ele vai mudando o valor
%
% Parâmetros :
%
x = 0;
%
% Cálculo :
%
for k = 1:10
    x = 14*k^3 - 20*k^2 + 5*k + x;
end
%
% Display :
%
disp('Soma dos dez termos :')
disp(x)