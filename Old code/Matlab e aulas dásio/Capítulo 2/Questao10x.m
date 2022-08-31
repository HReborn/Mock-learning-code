% Programa Questao10x, resolve a quest�o 10
% Criado por Breno Felipe em 24/04/2017
%
% Entrada :
%
% Z = Matriz da quest�o
%
% Sa�da : 
%
% Y = Matriz da quest�o
% A = Arranjo da letra A
% B = Arranjo da letra B
% C = Arranjo da letra C
% D = Arranjo da letra D
% E = Arranjo da letra E
%
% Valores : 
%
Z = [1,4,2;2,4,100;7,9,7;3,pi,42];
%
% C�lculo :
%
Y = log(Z);
A = Y(2,:);
B = sum(A,2);
C = Y(:,2).*Z(:,1);
D = max(C);
E = Z(1,:)./(Y(1:3,3))';
%
% Se��o disp :
%
disp('Sendo A : ')
disp(Z)
disp('E B igual � : ')
disp(Y)
disp('A segunda linha de B � : ');
disp(A);
disp('A soma da segunda linha de B � : ');
disp(B);
disp('A multiplica��o entre a segunda coluna de B e a primeira de A � igual � : ');
disp(C);
disp('O valor m�ximo da multiplica��o acima � : ');
disp(D);
disp('A divis�o da primeira linha de A pelos tr�s primeiros elementos da �ltima coluna de B � : ');
disp(E);