% Programa Questao10, Resolve a questão 10
% Criado por Breno Felipe
%
% Explicação :
%
% Ele pede para achar o tempo, mas quando os valores são substituidos
% o resultado é uma equação do segundo grau, então, crie a função
% jogue o polinômio do tempo nela e calcule com roots
%
% Variáveis de entrada :
%
% h = Altura ( m )
% v0 = Velocidade inicial ( m/s )
% g = Aceleração da gravidade ( m/s^2 )
%
% Variáveis de saída :
%
% x = Polinômnio que representa o tempo
% t = Tempo ( s )
%
% Cálculo :
%
function t = Questao10(h,v0,g);
x = [ g/2 -v0 h ];
t = roots(x);