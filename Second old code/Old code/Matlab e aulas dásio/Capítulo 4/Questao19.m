% Programa Questao19, Resolve a questão 19
% Criado por Breno Felipe
%
% Explicação :
%
% Para fazer essa função o  matlab lhe obriga ou a conhecer a função mod
% ou a fazer seu próprio programa para ver se um número resultado de uma 
% divisão é inteiro ou não, ou um programa para determinar o resto.
% A função mod(x,y) retorna o resto de uma divisão x/y, e só. Se o número
% resultante da divisão for um decimal, a função vai trazer o resto da
% divisão e caso seja inteiro, o matlab vai retornar que o resto será igual
% à zero. Ao ter entendido a função mod(x,y) a única coisa que resta é
% criar um programa que atenda as condições da questão, mas para atender as
% condições da questão é necessário conhecer a função mod(x,y).
%
% Variáveis de entrada :
%
% x = Ano determinado
%
% Variáveis de saída : 
%
% a = divide x/100 e manda o resto
% b = divide x/4 e manda o resto
% c = divide x/400 e manda o resto
% dia_extra = determina se o ano é bissexto, = 0 se não, = 1 se sim
%
% Cálculo :
%
function dia_extra = Questao19(x)
a = mod(x,100);
b = mod(x,4);
c = mod(x,400);
if a ~= 0 && b == 0
    dia_extra = 1;
elseif a == 0 && c ~= 0
    dia_extra = 0;
elseif c == 0
    dia_extra = 1;
else
    dia_extra = 0;
end
end