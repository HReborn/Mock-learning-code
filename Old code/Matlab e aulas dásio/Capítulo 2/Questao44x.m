% Programa Questao44x, Resolve a questão 44
% Criado por Breno Felipe
%
% Explicação :
%
%
%
% Variáveis de entrada :
%
% p = Densidade do ar
% v = Velocidade do ar ( mi/h )
% a = Ângulo ( graus )
% s = Envergadura da asa
%
% Variáveis de saída :
%
% k = Constante formada de todos os parâmetros
% cl = Polinômio representando o coeficiente de sustentação
% cd = Polinômio representando o coeficiente de arrasto
% Cl = Coeficiente de sustentação
% Cd = Coeficiente de arrasto
% L = Força de sustentação
% D = Força de arrasto
% r = Relação sustento/arrasto
%
% Parâmetros :
%
p = 0.002378;
v = 0:0.25:(5280/60);
a = linspace(-2,22,length(v));
s = 36;
%
% Cálculo :
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