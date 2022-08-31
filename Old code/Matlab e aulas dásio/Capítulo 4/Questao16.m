% Programa Questao16, Resolve a questão 16
% Criado por Breno Felipe
%
% Explicação : 
% 
% siga a lógica, se x (condição) ,então y = valor
%
% Variáveis de entrada : 
%
% x = x da questão
% y1,2,3 = Valores das equações, respectivamente
%
% Variáveis de saída : 
%
% y = Resultado das equações da questão
%
% Parâmetros : 
%
clear
x = [ -5 3 15 ];
y1 = exp(x(1) + 1);
y3 = 10*(x(3) - 5) + 1;
y2 = 2 + cos(pi*x(2));
%
% Cálculo : 
%
for i = 1:3;
    if x(i) < -1
        y(1) = exp(x(i) + 1);
    elseif x(i) >= 5
        y(3) = 10*(x(i) - 5) + 1;
    else
        y(2) = 2 + cos(pi*x(i));
    end
end
%
% Display : 
%
disp(' Os valores de y são : ')
disp(y)
%
% Verificação
%
for k = 1:3;
    if y1 == y(k) & k == 1
        disp('Os valores da primeira operação batem.')
    elseif y2 == y(k) & k == 2
        disp('Os valores da segunda operação batem.')
    elseif y3 == y(k) & k == 3
        disp('Os valores da terceira operação batem.')
    end
end