% Programa Questao30, Resolve a questão 30
% Criado por Breno Felipe
%
% Explicação :
%
% Para achar a velocidade inicial é só usar a fórmula de torriceli, vf = 0,
% v0 = ? s = h = 20 a = g = 9.81 e isolar v0.
%
% Variáveis de entrada :
%
% vf = Velocidade quando chegar na altura 20 ft ( ft/s )
% h = Altura final ( ft )
% g = Aceleração da gravidade ( ft/s^2 )
%
% Variáveis de saída :
%
% v0 = Velocidade inicial ( ft/s )
%
% Parâmetros
%
vf = 0;
h = 20;
g = 9.81;
%
% Cálculo :
%
v0 = sqrt(2*h*g);
%
% Display :
% 
disp('                  Letra A')
disp('A velocidade inicial necessária é :')
disp(v0)
disp('O peso, nem a massa interferem na velocidade inicial, ela será')
disp('a mesma, o que muda por variar a massa é a força colocada para')
disp('a bola sair com a velocidade inicial necessária.')
disp('                  Letra B')
disp('Enquanto a barra não virar horizontalmente, o comprimento da barra')
disp('não importa, pois,verticalmente, a área de contato é a mesma, logo')
disp('a velocidade inicial continua a mesma.')