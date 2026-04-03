% Programa Questao1x, resolve a questão 1
% Criado por Breno Felipe em 24/04/2017
%
% Entrada :
%
% i = Início do vetor
% f = Final do vetor
% q = Quantos termos entre o início e o final
%
% Saída : 
%
% d = Intervalo entre os valores
% A = Primeiro método de calcular
% B = Segundo método de calcular
%
% Valores : 
%
i = [5,2,-2];
f = [28,14,5];
d2 = 0.2;
q2 = ((f(2) - i(2))/d2) + 1;
q = [100,q2,50];
%
% Cálculo : 
d1 = (f(1) - i(1))/(q(1) - 1);
A1 = linspace(i(1),f(1),q(1));
B1 = [ i(1) : d1 : f(1) ];
A2 = linspace(i(2),f(2),q(2));
B2 = [ i(2) : d2 : f(2) ];
d3 = (f(3) - i(3))/(q(3) - 1);
A3 = linspace(i(3),f(3),q(3));
B3 = [ i(3) : d3 : f(3) ];
%
% Seção disp : 
%
disp('O primeiro método é linspace, que tem predefinido o número de termos : ')
disp('A = linspace(i,f,q)')
disp('O segundo método é pela criação normal de vetor,que o intervalo teria que ser calculado por : ')
disp('d = (f - i)/(q - 1),logo, temos o comando abaixo : ')
disp('B = [ i : d : f ]')
disp('Logo,conferindo os resultados, dizemos que A = B em todos os 3 casos. ')