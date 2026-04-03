% Programa Questão31x, Resolve a questão 31
% Criado por Breno Felipe
%
% Explicação :
%
% Joga na fórmula, tu eh burro por acaso?
%
% Variáveis de entrada :
%
% F = Vetor força ( N )
% r = Vetor posição ( m )
% n = Vetor unidade na direção da linha
%
% Variáveis de saída :
%
% M = Magnitude
%
% Parâmetros :
%
F = [ 12 -5 4 ];
r = [ -3 5 2 ] ;
n = [ 6 5 -7 ] ;
%
% Cálculo :
%
M = dot(cross(r,F),n);
%
% Display :
%
disp('A Magnitude é :')
disp(M)