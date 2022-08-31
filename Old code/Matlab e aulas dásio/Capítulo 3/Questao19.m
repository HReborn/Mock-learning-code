% Programa Questao19, Resolve a questão 19
% Criado por Breno Felipe
%
% Explicação :
%
% Faça a função, arbitre um intervalo e calcule os pontos, então, plote.
% em seguida minimize a função para achar o x mínimo com fminbnd
%
% Variáveis de entrada :
%
% y = Função anônima
% x = Intervalo qualquer
% 
% Variáveis de saída :
%
% t = 
% minimo = 
%
% Parâmetros :
%
y = @(x) 20.*x.^2 - 200.*x + 3;
x = -10:10;
%
% Cálculo :
%
t = y(x);
minimo = fminbnd(y,-10,10);
%
% Plot :
%
plot(x,t)
%
% Display :
% 
disp('Letra B :')
disp(minimo)