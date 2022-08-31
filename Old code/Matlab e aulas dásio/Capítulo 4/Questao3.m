% Programa Questao3, Resolve a quest�o 3
% Criado por Breno Felipe
%
% Explica��o :
%
% Para obter a soma dos n�meros � s� definir x = 0 e para cada itera��o
% ir somando a soma anterior, xatual = somaatual + xantigo e repete at�
% chegar ao final de k
%
% Vari�veis de entrada :
% 
% x = Soma inicial, que � zero
% k = Vari�vel independente
%
% Vari�veis de sa�da :
%
% x = Soma, mesma vari�vel que o x inicial, por�m ele vai mudando o valor
%
% Par�metros :
%
x = 0;
%
% C�lculo :
%
for k = 1:10
    x = 14*k^3 - 20*k^2 + 5*k + x;
end
%
% Display :
%
disp('Soma dos dez termos :')
disp(x)