% Programa Questao6x, resolve a questão 6
% Criado por Breno Felipe em 24/04/2017
%
% Entrada :
%
% A = Matriz da questão
%
% Saída : 
%
% B = Arranjo da questão
% C = Arranjo da questão
% D = Arranjo da questão
%
% Valores : 
%
A = [3,7,-4,12;-5,9,10,2;6,13,8,11;15,5,4,1];
%
% Cálculo :
%
B = A(:,2:4);
C = A(2:4,:);
D = A(1:2,2:4);
% Seção disp :
%
disp('Sendo A : ');
disp(A);
disp('Então B é : ');
disp(B);
disp('C é : ');
disp(C);
disp('E D é : ');
disp(D);