% Programa Questao32x, resolve a questão 32
% Criado por Breno Felipe
%
% Explicação :
%
% Jogue na fómula e verifique se a igualdade é verdadeira
%
% Variáveis de entrada :
%
% a = Vetor da questão
% b = Vetor da questão
% c = Vetor da questão
%
% Variáveis de saída :
%
% x = Parte A da igualdade
% y = Parte B da igualdade
%
% Parâmetros :
%
a = [ 7 -3 7 ];
b = [ -6 2 3 ];
c = [ 2 8 -8 ];
%
% Cálculo :
%
x = cross(a,cross(b,c));
y = b*dot(a,c) - c*dot(a,b);
%
% Display :
%
disp('Parte A')
disp(x)
disp('Parte B')
disp(y)