% Programa Questao21, Resolve a questão 21
% Criada por Breno Felipe
%
% Explicação :
% 
% Crie um handle da side function, e execute com o intervalo e o handle
% 
% Variáveis de entrada :
%
% x1 = Ponto de início
% x2 = Ponto final
%
% Variáveis de saída :
%
% z = Handle da Side Function
% x = Intervalo
% b = Zeros da função
%
% Cálculo :
%
function b = Questao21(x1,x2)
z = @Questao21a;
x = [ x1 x2 ];
b = fzero(z,x);