% Programa Questao1, Resolve a questão 1
% Criado por Breno Felipe
%
% Explicação :
%
% Só jogue nas operações imaginárias indicadas
%
% Variáveis de entrada :
%
% x = Intervalo da questão
% 
% Variáveis de saída :
%
% y = Função da questão
% a = Letra a
% b = Letra b
% c = Letra c
% d = Letra d
%
% Parâmetros :
%
x = 0:2;
%
% Cálculo :
%
y = -3 +i*x;
a = abs(y);
b = sqrt(y);
c = (-5 - 7*i)*y;
d = y/(6 - 3*i);
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