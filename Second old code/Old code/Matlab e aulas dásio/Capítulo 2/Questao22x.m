% Programa Questao22x, Resolve a Questão 22
% Criado em 06/02/2018, por Breno Felipe
%
% Variáveis de entrada : 
%
% w = Vetor linha
% x = Vetor linha
% y = Vetor linha
% z = Vetor linha
% c = Escalar
% d = Escalar
% 
% Variáveis de saída : 
%
% f
% E
% A
% S
%
% Valores : 
%
w = 1:5;
x = 6:10;
y = 11:15;
z = 16:20;
c = 21;
d = 22;
%
% Cálculo : 
%
f = 1./sqrt((2*pi*c)./x);
E = ((x+w)./(y+z))./((x+w)./(y-z));
A = exp(-c./(2*x))./(log(y).*sqrt(d*z));
S = (x.*(2.15+0.35*y).^1.8)./(z.*(1-x).^y);
%
% Disp :
%
disp('f,E,A,S, são, respectivamente : ')
disp(f)
disp(E)
disp(A)
disp(S)