% Programa Questao9x, resolve a quest�o 9
% Criado por Breno Felipe em 24/04/2017
%
% Entrada :
%
% A = Matriz da quest�o
%
% Sa�da : 
%
% A = Matriz dada na quest�o
% B = Ordena��o crescente das colunas de A
% C = Ordena��o crescente das linhas de A
% D = Soma de cada coluna de A
% E = Soma de cada linha de A
%
% Valores : 
%
A = [3,7,-4,12;-5,9,10,2;6,13,8,11;15,5,4,1];
%
% C�lculo :
%
B = sort(A,1,'ascend');
C = sort(A,2,'ascend');
D = sum(A);
E = sum(A,2);
%
% Se��o disp :
%
disp('Sendo A : ')
disp(A)
disp('As colunas ordenadas em crescentes s�o iguais � : ');
disp(B);
disp('As linhas ordenadas em crescentes s�o iguais � : ');
disp(C);
disp('A soma de cada coluna de A � igual � : ');
disp(D);
disp('A soma de cada linha de A � igual � : ');
disp(E);