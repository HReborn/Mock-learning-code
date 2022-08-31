% Programa Questao44x, Resolve a quest�o 44
% Criado por Breno Felipe
%
% Explica��o :
%
%
%
% Vari�veis de entrada :
%
% p = Densidade do ar
% v = Velocidade do ar ( mi/h )
% a = �ngulo ( graus )
% s = Envergadura da asa
%
% Vari�veis de sa�da :
%
% k = Constante formada de todos os par�metros
% cl = Polin�mio representando o coeficiente de sustenta��o
% cd = Polin�mio representando o coeficiente de arrasto
% Cl = Coeficiente de sustenta��o
% Cd = Coeficiente de arrasto
% L = For�a de sustenta��o
% D = For�a de arrasto
% r = Rela��o sustento/arrasto
%
% Par�metros :
%
p = 0.002378;
v = 0:0.25:(5280/60);
a = linspace(-2,22,length(v));
s = 36;
%
% C�lculo :
%
k = (p*s*v.^2)/2;
cl = [ 4.47*10^-5 1.15*10^-3 6.66*10^-2 1.02*10^-1 ];
cd = [ 5.75*10^-6 5.09*10^-4 1.81*10^-4 1.25*10^-2 ];
Cl = polyval(cl,a);
Cd = polyval(cd,a);
L = k.*Cl;
D = k.*Cd;
r = L./D;
%
% Plot :
%
plot(a,r)