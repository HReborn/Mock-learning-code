% Programa Questao2, Resolve a questão 2
% Criado por Breno Felipe
%
% Explicação :
%
% A magnitude de um imaginário é medida com a função abs e seu ângulo, com
% a função angle
%
% Variáveis de entrada :
%
% x = Na questão
% y = Na questão
%
% Variáveis de saída :
%
% a1 = Magnitude da letra a
% a2 = Ângulo da letra a
% b1 = Magnitude da letra b
% b2 = Ângulo da letra b
%
% Parâmetros :
%
x = -5 - 8*i;
y = 10 - 5*i;
%
% Cálculo :
%
a1 = abs(x*y);
a2 = angle(x*y);
b1 = abs(x/y);
b2 = angle(x/y);
%
% Display :
%
disp('Magnitude e Ângulo da letra A :')
disp(a1)
disp(a2)
disp('Magnitude e Ângulo da letra B :')
disp(b1)
disp(b2)