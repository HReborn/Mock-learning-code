% Programa Questao13, Resolve a Quest�o 13
% Criado por Breno Felipe
%
% Explica��o :
%
% De acordo com a quest�o, se o pre�o est� acima de 25, vende 100, se est�
% abaixo de 20, compra 100, estabelecendo essas condi��es e essas opera��es
% dentro do loop for, resolvemos essa quest�o.
%
% Vari�veis de entrada :
%
% p = Pre�o di�rio
% t = Total de pe�as que voc� tem
% i = Vari�vel de indexamento
%
% Vari�veis de sa�da :
%
% g = Total de gastos
% v = Total de vendas
% L = Lucro
% t = Quantidade de pe�as mantidas
%
% Par�metros :
%
clear
p = [ 19 18 22 21 25 19 17 21 27 29 ];
t = 1000;
g = 0;
v = 0;
%
% C�lculo
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
disp('Pe�as mantidas')
disp(t)