% Programa Questao26 , plota o gr�fico da quest�o 26
% Criado por Breno Felipe em 11/04/2017

% Vari�veis de entrada : ( Em metros ou graus )
%
% b1 = Lado do tri�ngulo superior
% b2 = Lado do tri�ngulo inferior
% c1 = Lado do tri�ngulo superior
% A1 = �ngulo do tri�ngulo superior
% A2 = �ngulo do tri�ngulo inferior
% 
% Vari�veis de sa�da : 
%
% c2 = Lado do tri�ngulo inferior
% a = Valor do lado em comum dos tri�ngulos
% t = Termo independente da equa��o de segundo grau
% u = Termo x da equa��o de segundo grau
% g = Forma vetorial da equa��o polinomial para achar c2
% c = Ra�zes da equa��o polinomial para achar c2
%
% Valores : 
%
b1 = 180;
b2 = 165;
c1 = 115;
A1 = 120;
A2 = 100;
%
% C�lculo : 
%
a = b1^2 + c1^2 - 2*b1*c1*cosd(A1);
t = b2^2 - a;
u = 2*b2*cosd(A2);
g = [ 1 u t ];
c = roots(g);
c2 = c( c >= 0 );
disp('O valor de c2 � : ')
disp(c2);