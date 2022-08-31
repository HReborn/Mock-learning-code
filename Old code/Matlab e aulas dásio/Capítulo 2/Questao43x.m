% Programa Questao43x
% Criado por Breno Felipe
%
% Explica��o :
%
% S� defina o polin�mio, calcule o valor quando o �ngulo � 10, e jogue na
% f�rmula.
%
% Vari�veis de entrada :
% 
% p = Densidade do ar
% a = �ngulo ( Graus )
% s = Envergadura da asa
% v = Velocidade do ar
%
% Vari�veis de sa�da :
%
% k = Constante, constuida de todos os par�metros juntos
% cl = Polin�mio represnetando o coeficiente de sustenta��o
% cd = Polin�mio representando o coefieciente de arrasto
% Cl = Coeficiente de sustenta��o quando "a" = 10
% Cd = Coeficiente de arrasto quando a = 10
% L = For�a de sustenta��o ( lb )
% D = For�a de arrasto ( lb )
%
% Par�metros :
%
p = 0.002378;
a = 10;
s = 36;
v = 0:0.25:(5280/60);
%
% C�lculo :
%
k = (p*s*v.^2)/2;
cl = [ 4.47*10^-5 1.15*10^-3 6.66*10^-2 1.02*10^-1 ];
cd = [ 5.75*10^-6 5.09*10^-4 1.8*10^-4 1.25*10^-2 ];
Cl = polyval(cl,a);
Cd = polyval(cd,a);
L = k*Cl;
D = k*Cd;
%
% Display :
%
disp('For�a de sustenta��o :')
disp(L)
disp('For�a de arrasto :')
disp(D)