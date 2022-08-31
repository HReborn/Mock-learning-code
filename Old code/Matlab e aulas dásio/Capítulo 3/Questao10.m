% Programa Questao10, Resolve a quest�o 10
% Criado por Breno Felipe
%
% Explica��o :
%
% Ele pede para achar o tempo, mas quando os valores s�o substituidos
% o resultado � uma equa��o do segundo grau, ent�o, crie a fun��o
% jogue o polin�mio do tempo nela e calcule com roots
%
% Vari�veis de entrada :
%
% h = Altura ( m )
% v0 = Velocidade inicial ( m/s )
% g = Acelera��o da gravidade ( m/s^2 )
%
% Vari�veis de sa�da :
%
% x = Polin�mnio que representa o tempo
% t = Tempo ( s )
%
% C�lculo :
%
function t = Questao10(h,v0,g);
x = [ g/2 -v0 h ];
t = roots(x);