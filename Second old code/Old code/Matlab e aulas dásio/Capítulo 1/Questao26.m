% Programa Questao26 , plota o gráfico da questão 26
% Criado por Breno Felipe em 11/04/2017

% Variáveis de entrada : ( Em metros ou graus )
%
% b1 = Lado do triângulo superior
% b2 = Lado do triângulo inferior
% c1 = Lado do triângulo superior
% A1 = Ângulo do triângulo superior
% A2 = Ângulo do triângulo inferior
% 
% Variáveis de saída : 
%
% c2 = Lado do triângulo inferior
% a = Valor do lado em comum dos triângulos
% t = Termo independente da equação de segundo grau
% u = Termo x da equação de segundo grau
% g = Forma vetorial da equação polinomial para achar c2
% c = Raízes da equação polinomial para achar c2
%
% Valores : 
%
b1 = 180;
b2 = 165;
c1 = 115;
A1 = 120;
A2 = 100;
%
% Cálculo : 
%
a = b1^2 + c1^2 - 2*b1*c1*cosd(A1);
t = b2^2 - a;
u = 2*b2*cosd(A2);
g = [ 1 u t ];
c = roots(g);
c2 = c( c >= 0 );
disp('O valor de c2 é : ')
disp(c2);