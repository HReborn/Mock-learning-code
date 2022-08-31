% Programa Questao18, Resolve a Questão 18
% Criado por Breno Felipe
%
% Explicação :
%
% Crie uma função anônima, com a entrada sendo o intervalo ,execute e por
% fim, plote.
%
% Variáveis de entrada :
%
% z = Intervalo da questão
% y = Função anônima
%
% Variáveis de saída :
%
% t = Resultado da função
%
% Parâmetros :
%
z = 0:0.25:2;
y = @(x) 10*exp(-2*x);
%
% Cálculo :
%
t = y(z);
%
% Plot :
%
plot(z,t)

