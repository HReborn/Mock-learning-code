% Programa Questao30, Resolve a quest�o 30
% Criado por Breno Felipe
%
% Explica��o :
%
% Para achar a velocidade inicial � s� usar a f�rmula de torriceli, vf = 0,
% v0 = ? s = h = 20 a = g = 9.81 e isolar v0.
%
% Vari�veis de entrada :
%
% vf = Velocidade quando chegar na altura 20 ft ( ft/s )
% h = Altura final ( ft )
% g = Acelera��o da gravidade ( ft/s^2 )
%
% Vari�veis de sa�da :
%
% v0 = Velocidade inicial ( ft/s )
%
% Par�metros
%
vf = 0;
h = 20;
g = 9.81;
%
% C�lculo :
%
v0 = sqrt(2*h*g);
%
% Display :
% 
disp('                  Letra A')
disp('A velocidade inicial necess�ria � :')
disp(v0)
disp('O peso, nem a massa interferem na velocidade inicial, ela ser�')
disp('a mesma, o que muda por variar a massa � a for�a colocada para')
disp('a bola sair com a velocidade inicial necess�ria.')
disp('                  Letra B')
disp('Enquanto a barra n�o virar horizontalmente, o comprimento da barra')
disp('n�o importa, pois,verticalmente, a �rea de contato � a mesma, logo')
disp('a velocidade inicial continua a mesma.')