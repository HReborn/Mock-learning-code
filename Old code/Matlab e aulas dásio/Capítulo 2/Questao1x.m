% Programa Questao1x, resolve a quest�o 1
% Criado por Breno Felipe em 24/04/2017
%
% Entrada :
%
% i = In�cio do vetor
% f = Final do vetor
% q = Quantos termos entre o in�cio e o final
%
% Sa�da : 
%
% d = Intervalo entre os valores
% A = Primeiro m�todo de calcular
% B = Segundo m�todo de calcular
%
% Valores : 
%
i = [5,2,-2];
f = [28,14,5];
d2 = 0.2;
q2 = ((f(2) - i(2))/d2) + 1;
q = [100,q2,50];
%
% C�lculo : 
d1 = (f(1) - i(1))/(q(1) - 1);
A1 = linspace(i(1),f(1),q(1));
B1 = [ i(1) : d1 : f(1) ];
A2 = linspace(i(2),f(2),q(2));
B2 = [ i(2) : d2 : f(2) ];
d3 = (f(3) - i(3))/(q(3) - 1);
A3 = linspace(i(3),f(3),q(3));
B3 = [ i(3) : d3 : f(3) ];
%
% Se��o disp : 
%
disp('O primeiro m�todo � linspace, que tem predefinido o n�mero de termos : ')
disp('A = linspace(i,f,q)')
disp('O segundo m�todo � pela cria��o normal de vetor,que o intervalo teria que ser calculado por : ')
disp('d = (f - i)/(q - 1),logo, temos o comando abaixo : ')
disp('B = [ i : d : f ]')
disp('Logo,conferindo os resultados, dizemos que A = B em todos os 3 casos. ')