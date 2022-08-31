% Programa Quest�o31x, Resolve a quest�o 31
% Criado por Breno Felipe
%
% Explica��o :
%
% Joga na f�rmula, tu eh burro por acaso?
%
% Vari�veis de entrada :
%
% F = Vetor for�a ( N )
% r = Vetor posi��o ( m )
% n = Vetor unidade na dire��o da linha
%
% Vari�veis de sa�da :
%
% M = Magnitude
%
% Par�metros :
%
F = [ 12 -5 4 ];
r = [ -3 5 2 ] ;
n = [ 6 5 -7 ] ;
%
% C�lculo :
%
M = dot(cross(r,F),n);
%
% Display :
%
disp('A Magnitude � :')
disp(M)