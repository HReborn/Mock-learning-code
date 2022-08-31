% Programa Questao12x, resolve a quest�o 12
% Criado por Breno Felipe em 24/04/2017
%
% Entrada :
%
% A = Matriz da quest�o
% B = Matriz da quest�o
% C = Matriz da quest�o
%
% Sa�da : 
%
% D = letra A
% E = Letra B
% F = Letra C
% G = Letra D
%
% Valores : 
%
A = [-7 11;4 9];
B = [4 -5;12 -2];
C = [-3 -9;7 8];
%
% C�lculo :
%
D = A + B + C;
E = A - B + C;
F1 =(A + B) + C;
F2 = A + (B + C);
G1 = D;
G2 = B + C + A;
G3 = A + C + B;
%
% Se��o disp :
%
disp('                  LETRA A');
disp('O valor de A + B + C � : ');
disp(D);
disp('                  LETRA B');
disp('O Valor de A - B + C � : ');
disp(E);
disp('                  LETRA C');
disp('Provando a lei associativa,calculamos :');
disp('(A + B) + C : ');
disp(F1);
disp('A + (B + C) : ');
disp(F2);
disp('Logo, confirmamos que a lei associativa � verdadeira.');
disp('                  LETRA D');
disp('Provando a lei cumutativa,calculamos :');
disp('A + B + C');
disp(G1);
disp('B + C + A');
disp(G2);
disp('A + C + B');
disp(G3);
disp('Logo, confirmamos que a lei comutativa � verdadeira.');