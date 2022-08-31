% Programa Questao43x
% Criado por Breno Felipe
%
% Explicação :
%
% Só defina o polinômio, calcule o valor quando o ângulo é 10, e jogue na
% fórmula.
%
% Variáveis de entrada :
% 
% p = Densidade do ar
% a = Ângulo ( Graus )
% s = Envergadura da asa
% v = Velocidade do ar
%
% Variáveis de saída :
%
% k = Constante, constuida de todos os parâmetros juntos
% cl = Polinômio represnetando o coeficiente de sustentação
% cd = Polinômio representando o coefieciente de arrasto
% Cl = Coeficiente de sustentação quando "a" = 10
% Cd = Coeficiente de arrasto quando a = 10
% L = Força de sustentação ( lb )
% D = Força de arrasto ( lb )
%
% Parâmetros :
%
p = 0.002378;
a = 10;
s = 36;
v = 0:0.25:(5280/60);
%
% Cálculo :
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
disp('Força de sustentação :')
disp(L)
disp('Força de arrasto :')
disp(D)