% Programa Questao11, Resolve a questão 11
% Criado por Breno Felipe
%
% Explicação :
%
% Só escreva as operações lógicas indicadas na questão
%
% Variáveis de entrada :
%
% x = Vetor da questão
% y = Vetor da questão
%
% Variáveis de saída :
%
% a = Condição da letra A
% b = Condição da letra B
% c = Condição da letra C
% d = Condição da letra D
%
% Parâmetros :
%
x = [ -3 0 0 2 5 8 ];
y = [ -5 -2 0 3 4 10 ];
%
% Cálculo :
%
a = y > x;
b = x & y;
c = x|y;
d = xor(x,y);
%
% Display :
%
disp('Letra A')
disp(a)
disp('Letra B')
disp(b)
disp('Letra C')
disp(c)
disp('Letra D')
disp(d)