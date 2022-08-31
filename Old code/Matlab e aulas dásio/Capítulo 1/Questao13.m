% Programa Questao13 , Calcula a questão 13
% Criado por Breno Felipe em 09/04/2017
%
% Variáveis de entrada : 
% 
% x = Variável correspondente à questão 13
%
% Variáveis de saída : 
%
% y = Variável correspondente à questâo 13
% z = Variável que calcula a quantidade de elementos do arranjo
% w = Variável correspondente ao 3º elemento de y
%
% Valores : 
%
x = 1:0.2:5;
%
% Cálculo : 
%
y = 7*sin(4*x);
z = length(y);
w = y(3);
%
% Seção disp : 
%
disp('O arranjo y tem os seguintes valores : ');
disp(y);

disp('A quantidade de elementos em y é : ');
disp(z);

disp('O terceiro elemento de y é igual à : ');
disp(w);