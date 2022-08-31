% Programa Questao19, Resolve a quest�o 19
% Criado por Breno Felipe
%
% Explica��o :
%
% Para fazer essa fun��o o  matlab lhe obriga ou a conhecer a fun��o mod
% ou a fazer seu pr�prio programa para ver se um n�mero resultado de uma 
% divis�o � inteiro ou n�o, ou um programa para determinar o resto.
% A fun��o mod(x,y) retorna o resto de uma divis�o x/y, e s�. Se o n�mero
% resultante da divis�o for um decimal, a fun��o vai trazer o resto da
% divis�o e caso seja inteiro, o matlab vai retornar que o resto ser� igual
% � zero. Ao ter entendido a fun��o mod(x,y) a �nica coisa que resta �
% criar um programa que atenda as condi��es da quest�o, mas para atender as
% condi��es da quest�o � necess�rio conhecer a fun��o mod(x,y).
%
% Vari�veis de entrada :
%
% x = Ano determinado
%
% Vari�veis de sa�da : 
%
% a = divide x/100 e manda o resto
% b = divide x/4 e manda o resto
% c = divide x/400 e manda o resto
% dia_extra = determina se o ano � bissexto, = 0 se n�o, = 1 se sim
%
% C�lculo :
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