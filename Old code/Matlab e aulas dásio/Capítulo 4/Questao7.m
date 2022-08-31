% Programa Questao7, Resolve a quest�o 7
% Criado por Breno Felipe
%
% Explica��o :
%
% Ele pede que voc� ache os elementos em que x>y. N�o pensei em outra forma
% de fazer isso, usei find, que vai achar os �ndices do que n�o sao nulos
% ou que s�o "1", depois eu usei um loop para fazer um vetor com os valores
% de x que sa� maiores que y com a condi��o que se no "i" de z(i) = 1,
% ent�o um valor ser� computado no vetor "r".
%
% Vari�veis de entrada :
%
% x = Valores de x
% y = Valores de y
% i = Vari�vel usada para indexamento
% g = Vari�vel usada para indexamento, cada vez que a condi��o for sanada e
%     o valor computado em r, o valor de g aumenta em + 1
%
% Valores de sa�da :
%
% z = Condi��o que a quest�o pede
% t = Vetor contendo os �ndices dos valores de x que s�o maiores que y
% k = O valor de k vai mudar para o valor com �ndice "g" de "t", ou seja
%     k vai ser algum �ndice computado pela fun�ao find
%
% Par�metros :
%
clear
x = [ -3 0 0 2 6 8 ];
y = [ -5 -2 0 3 4 10 ];
g = 1;
%
% C�lculo :
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
disp('Os valores em que X > Y s�o :')
disp(r)
disp('Os �ndices desses valores s�o :')
disp(t)