% Programa Questao9x, resolve a questão 9
% Criado por Breno Felipe em 24/04/2017
%
% Entrada :
%
% A = Matriz da questão
%
% Saída : 
%
% A = Matriz dada na questão
% B = Ordenação crescente das colunas de A
% C = Ordenação crescente das linhas de A
% D = Soma de cada coluna de A
% E = Soma de cada linha de A
%
% Valores : 
%
A = [3,7,-4,12;-5,9,10,2;6,13,8,11;15,5,4,1];
%
% Cálculo :
%
B = sort(A,1,'ascend');
C = sort(A,2,'ascend');
D = sum(A);
E = sum(A,2);
%
% Seção disp :
%
disp('Sendo A : ')
disp(A)
disp('As colunas ordenadas em crescentes são iguais à : ');
disp(B);
disp('As linhas ordenadas em crescentes são iguais à : ');
disp(C);
disp('A soma de cada coluna de A é igual à : ');
disp(D);
disp('A soma de cada linha de A é igual à : ');
disp(E);