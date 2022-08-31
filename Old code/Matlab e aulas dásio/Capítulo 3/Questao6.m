% Programa Questao6, resolve a quest�o 6
% Crado por Breno Felipe
%
% Explica��o :
%
% Crie os inputs, como indicado, e jogue na f�rmula
%
% Vari�veis de entrada :
%
% e = Permissividade do ar ( F/m )
% l = Comprimento dos condutores ( m )
% d = Dist�ncia entre os condutores ( m )
% r = Raio dos condutores ( m )
%
% Vari�veis de sa�da :
%
% C = Capacit�ncia de dois condutores paralelos
%
% Par�metros :
%
e = 8.854*10^-12;
l = input('bota L : ');
d = input('bota D : ');
r = input('bota R : ');
%
% C�lculo : 
%
C = pi*e*l/log((d-r)/r);
%
% Display :
%
disp('Capacit�ncia : ')
disp(C)