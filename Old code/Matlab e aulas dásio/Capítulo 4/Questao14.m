% Programa Questao14, Resolve a questão 14
% Criada por Breno Felipe
%
% Explicação :
%
% Para resolver é preciso entender como funciona o not(~), quanto temos a
% expresão ~(x & y), em que x e y são operações lógicas, o operador not(~)
% age em todos os termos, ele age no x, no & e no y, tornando x em ~x, y em
% ~y e & em |(or), ou seja ~(x & y) = (~x) | (~y)
% e a mesma coisa é em ~(x | y) = (~x) & (~y)
% agora, ache as euqções equivalentes
% 
% Variáveis de entrada :
%
% x = Número qualquer
%
% Variáveis de saída :
%
% a = Letra A
% b = Letra B
%
% Parâmetros : 
%
x = input('Insira o valor de x : ');
%
% Cálculo :
%
a = (x > 10) | (x <= 6);
b = (x =~ 2) & (x < 5);
%
% Disp :
%
disp('Letra A')
disp('a = (x > 10) | (x <= 6)')
disp('Letra B')
disp('b = (x =~ 2) & (x < 5)')