% Programa Questao6, resolve a questão 6
% Crado por Breno Felipe
%
% Explicação :
%
% Crie os inputs, como indicado, e jogue na fórmula
%
% Variáveis de entrada :
%
% e = Permissividade do ar ( F/m )
% l = Comprimento dos condutores ( m )
% d = Distância entre os condutores ( m )
% r = Raio dos condutores ( m )
%
% Variáveis de saída :
%
% C = Capacitância de dois condutores paralelos
%
% Parâmetros :
%
e = 8.854*10^-12;
l = input('bota L : ');
d = input('bota D : ');
r = input('bota R : ');
%
% Cálculo : 
%
C = pi*e*l/log((d-r)/r);
%
% Display :
%
disp('Capacitância : ')
disp(C)