% Programa Questao18x, resolve a questão 18
% Criado por Breno Felipe em 24/04/2017
%
% Explicação
%
% O problema dá as características de 5 molas e pede para calcularmos a força de compressão
% de cada uma e a energia potencial de cada uma.A primeira parte, usamos a formula
% F = K*X, em que F é a força,K a constante da mola e X, a compressão da mola e para a
% segunda parte, usamos Epot = K*X^2.
%
% Entrada :
%
% F = A força exercida pela mola ( Em N )
% K = A constante da mola ( Em N/M )
%
% Saída : 
%
% X = A compressão de cada mola
% Epot = A energia potencial de cada mola
%
% Valores : 
%
F = [ 11 7 8 10 9 ];
K = [ 1000 600 900 1300 700 ];
%
% Cálculo :
%
X = F./K;
Epot = K.*X.^2/2;
%
% Seção disp :
%
disp('A compressão de cada mola é : ');
disp(X);
disp('A energia potencial de cada mola é : ');
disp(Epot);