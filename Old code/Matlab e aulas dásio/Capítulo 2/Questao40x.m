% Programa Questao40x, Resolve a quest�o 40
% Criado por Breno Felipe
%
% Explica��o :
%
% A quest�o quer a diferen�a entre o volume de um g�s ideal e a equa��o 
% de van der waals temos o volume do g�s ideal, � preciso isolar o volume
% e calcul�-lo a partir da equa��o de van der waals, o volume vai estar
% na forma de um polin�mio, ent�o calcule as poss�veis ra�zes.
%
% Vari�veis de Entrada :
%
% a = Corre��o da atra��o molecular
% b = Corre��o do volume das mol�culas
% p = Press�o ( atm )
% r = Constante dos gases
% t = Temperatura ( K )
%
% Vari�veis de sa�da :
%
% x = Polin�mio que representa o volume
% v = Volume Van Der Vaals ( L )
%
% Par�metros :
%
a = 6.49;
b = 0.0562;
p = 0.95;
r = 0.08206;
t = 300;
%
% C�lculo :
%
x = [ p (-b*p - r*t) a -a*b ];
v = roots(x);
%
% Dsplay :
% 
disp('Volume de g�s ideal � : ')
disp(22.41)
disp('Volume Van Der Waals � ':)
disp(v)
disp('Diferen�a entre os volumes � :')
disp(abs(v-22.4))