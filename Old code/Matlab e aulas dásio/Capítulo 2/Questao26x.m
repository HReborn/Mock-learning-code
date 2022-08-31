% Programa Questao26x, Resolve a questão 26
% Criado por Breno Felipe
%
% Explicação :
%
% Escreva as operações e use a multiplicação de matriz
%
% Variáveis de entrada :
%
% A = Matriz dada
% B = Matriz dada
% C = Matriz dada
%
% Variáveis de saída :
%
% a = Primeira parte da letra A
% b = Segunda parte da letra A
% c = Primeira parte da letra B
% d = Segunda parte da Letra B
%
% Parâmetros :
%
A = [ 4 -2 1 ; 6 8 -5 ; 7 9 10 ];
B = [ 6 9 -4 ; 7 5 3 ; -8 2 1 ];
C = [ -4 -5 2 ; 10 6 1 ; 3 -9 8 ];
%
% Cálculo :
%
a = A*(B+C);
b = A*B + A*C;
c = (A*B)*C;
d = A*(B*C);
%
% Display :
%
disp('A*(B+C)')
disp(a)
disp('A*B + A*C')
disp(b)
disp('(A*B)*C')
disp(c)
disp('A*(B*C)')
disp(d)