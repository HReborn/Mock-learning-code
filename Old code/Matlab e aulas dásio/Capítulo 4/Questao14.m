% Programa Questao14, Resolve a quest�o 14
% Criada por Breno Felipe
%
% Explica��o :
%
% Para resolver � preciso entender como funciona o not(~), quanto temos a
% expres�o ~(x & y), em que x e y s�o opera��es l�gicas, o operador not(~)
% age em todos os termos, ele age no x, no & e no y, tornando x em ~x, y em
% ~y e & em |(or), ou seja ~(x & y) = (~x) | (~y)
% e a mesma coisa � em ~(x | y) = (~x) & (~y)
% agora, ache as euq��es equivalentes
% 
% Vari�veis de entrada :
%
% x = N�mero qualquer
%
% Vari�veis de sa�da :
%
% a = Letra A
% b = Letra B
%
% Par�metros : 
%
x = input('Insira o valor de x : ');
%
% C�lculo :
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