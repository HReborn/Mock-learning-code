% Programa Questao13x, resolve a quest�o 13
% Criado por Breno Felipe em 24/04/2017
%
% Entrada :
%
% A = Matriz da quest�o
% B = Matriz da quest�o
%
% Sa�da : 
%
% C = Letra A
% D = Letra B
% E = Letra C
%
% Valores : 
%
A = [56 32;24 -16];
B = [14 -4;6 -2];
%
% C�lculo :
%
C = A*B;
D = A/B;
E = B.^3;
%
% Se��o disp :
%
disp('A multiplica��o matricial de A por B � : ');
disp(C);
disp('O resultado da divis�o matricial � direita de A por B � : ');
disp(D);
disp('O arranjo B com todos os seus elementos elevados � terceira � : ');
disp(E);