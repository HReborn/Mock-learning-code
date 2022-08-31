% Programa Questao16, Resolve a quest�o 16
% Criado por Breno Felipe
%
% Explica��o : 
% 
% siga a l�gica, se x (condi��o) ,ent�o y = valor
%
% Vari�veis de entrada : 
%
% x = x da quest�o
% y1,2,3 = Valores das equa��es, respectivamente
%
% Vari�veis de sa�da : 
%
% y = Resultado das equa��es da quest�o
%
% Par�metros : 
%
clear
x = [ -5 3 15 ];
y1 = exp(x(1) + 1);
y3 = 10*(x(3) - 5) + 1;
y2 = 2 + cos(pi*x(2));
%
% C�lculo : 
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
disp(' Os valores de y s�o : ')
disp(y)
%
% Verifica��o
%
for k = 1:3;
    if y1 == y(k) & k == 1
        disp('Os valores da primeira opera��o batem.')
    elseif y2 == y(k) & k == 2
        disp('Os valores da segunda opera��o batem.')
    elseif y3 == y(k) & k == 3
        disp('Os valores da terceira opera��o batem.')
    end
end