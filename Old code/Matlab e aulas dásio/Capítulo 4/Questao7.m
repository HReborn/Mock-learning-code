% Programa Questao7, Resolve a questão 7
% Criado por Breno Felipe
%
% Explicação :
%
% Ele pede que você ache os elementos em que x>y. Não pensei em outra forma
% de fazer isso, usei find, que vai achar os índices do que não sao nulos
% ou que são "1", depois eu usei um loop para fazer um vetor com os valores
% de x que saõ maiores que y com a condição que se no "i" de z(i) = 1,
% então um valor será computado no vetor "r".
%
% Variáveis de entrada :
%
% x = Valores de x
% y = Valores de y
% i = Variável usada para indexamento
% g = Variável usada para indexamento, cada vez que a condição for sanada e
%     o valor computado em r, o valor de g aumenta em + 1
%
% Valores de saída :
%
% z = Condição que a questão pede
% t = Vetor contendo os índices dos valores de x que são maiores que y
% k = O valor de k vai mudar para o valor com índice "g" de "t", ou seja
%     k vai ser algum índice computado pela funçao find
%
% Parâmetros :
%
clear
x = [ -3 0 0 2 6 8 ];
y = [ -5 -2 0 3 4 10 ];
g = 1;
%
% Cálculo :
%
z = x>y;
t = find(z);
for i = 1:length(x)
    if z(i) == 1
        k = t(g);
        r(g) = x(k);
        g = g + 1;
    end
end
%
% Display :
%
disp('Os valores em que X > Y são :')
disp(r)
disp('Os índices desses valores são :')
disp(t)