% Programa Questao14 , Calcula a questão 14
% Criado por Breno Felipe em 09/04/2017
%
% Variáveis de entrada :
%
% x1 = Arranjo correspondente à questâo 14
%
% Variáveis de saída : 
%
% z1 = Variável que calcula a quantidade de elementos do arranjo x
% w1 = Variável correspondente ao 10º elemento de x
%
% Valores : 
%
x1 = sin(-pi/2):0.05:cos(0);
%
% Cálculo : 
%
z1 = length(x1);
w1 = x1(10);
%
% Seção disp : 
%
disp('A quantidade de elementos no arranjo é : ');
disp(z1);
disp('O décimo elemento do arranjo é igual à : ');
disp(w1);