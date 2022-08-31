% Programa Questao10x, resolve a questão 10
% Criado por Breno Felipe em 24/04/2017
%
% Entrada :
%
% Z = Matriz da questão
%
% Saída : 
%
% Y = Matriz da questão
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
% Cálculo :
%
Y = log(Z);
A = Y(2,:);
B = sum(A,2);
C = Y(:,2).*Z(:,1);
D = max(C);
E = Z(1,:)./(Y(1:3,3))';
%
% Seção disp :
%
disp('Sendo A : ')
disp(Z)
disp('E B igual à : ')
disp(Y)
disp('A segunda linha de B é : ');
disp(A);
disp('A soma da segunda linha de B é : ');
disp(B);
disp('A multiplicação entre a segunda coluna de B e a primeira de A é igual à : ');
disp(C);
disp('O valor máximo da multiplicação acima é : ');
disp(D);
disp('A divisão da primeira linha de A pelos três primeiros elementos da última coluna de B é : ');
disp(E);