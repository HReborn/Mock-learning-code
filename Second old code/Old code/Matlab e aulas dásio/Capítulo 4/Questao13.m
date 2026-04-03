% Programa Questao13, Resolve a Questão 13
% Criado por Breno Felipe
%
% Explicação :
%
% De acordo com a questão, se o preço está acima de 25, vende 100, se está
% abaixo de 20, compra 100, estabelecendo essas condições e essas operações
% dentro do loop for, resolvemos essa questão.
%
% Variáveis de entrada :
%
% p = Preço diário
% t = Total de peças que você tem
% i = Variável de indexamento
%
% Variáveis de saída :
%
% g = Total de gastos
% v = Total de vendas
% L = Lucro
% t = Quantidade de peças mantidas
%
% Parâmetros :
%
clear
p = [ 19 18 22 21 25 19 17 21 27 29 ];
t = 1000;
g = 0;
v = 0;
%
% Cálculo
%
for i = 1:10
    if p(i) < 20
        t = t + 100;
        g = g + p(i)*100;
    else p(i) > 25
        t = t - 100;
        v = v + p(i)*100;
    end
end
L = v - g;
%
% Display :
%
disp('Gastos')
disp(g)
disp('Vendas')
disp(v)
disp('Lucros')
disp(L)
disp('Peças mantidas')
disp(t)