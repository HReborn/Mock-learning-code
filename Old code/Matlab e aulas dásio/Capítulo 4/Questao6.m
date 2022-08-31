% Programa Questao6, Resolve a questão 6
% Criado por Breno Felipe
%
% Explicação :
%
% Apenas excreva as operações lógicas corretamente.
%
% Variáveis de entrada :
%
% x = Vetor da questão
% y = Vetor da questão
%
% Variáveis de saída :
%
% a = Letra A
% b = Letra B
% c = Letra C
% d = Letra D
% r = Resultados juntos
%
% Parâmetros :
%
x = [ 10 -2 6 5 -3 ];
y = [ 9 -3 2 5 -1 ];
%
% Cálculo :
%
a = x < 6;
b = x<=y;
c = x==y;
d = x~=y;
r = [ a ; b ; c ; d ];
%
% Display :
%
disp('Os resultados são : ')
disp(r)