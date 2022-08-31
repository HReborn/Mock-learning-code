% Programa Questao18x, resolve a quest�o 18
% Criado por Breno Felipe em 24/04/2017
%
% Explica��o
%
% O problema d� as caracter�sticas de 5 molas e pede para calcularmos a for�a de compress�o
% de cada uma e a energia potencial de cada uma.A primeira parte, usamos a formula
% F = K*X, em que F � a for�a,K a constante da mola e X, a compress�o da mola e para a
% segunda parte, usamos Epot = K*X^2.
%
% Entrada :
%
% F = A for�a exercida pela mola ( Em N )
% K = A constante da mola ( Em N/M )
%
% Sa�da : 
%
% X = A compress�o de cada mola
% Epot = A energia potencial de cada mola
%
% Valores : 
%
F = [ 11 7 8 10 9 ];
K = [ 1000 600 900 1300 700 ];
%
% C�lculo :
%
X = F./K;
Epot = K.*X.^2/2;
%
% Se��o disp :
%
disp('A compress�o de cada mola � : ');
disp(X);
disp('A energia potencial de cada mola � : ');
disp(Epot);