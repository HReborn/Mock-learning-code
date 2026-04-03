% Programa Questao5x, resolve a questão 5
% Criado por Breno Felipe em 24/04/2017
%
% Entrada :
%
% A = Matriz da questão
%
% Saída : 
%
% v = Vetor da questão
% w = Vetor da questão
%
% Valores : 
%
A = [3,7,-4,12;-5,9,10,2;6,13,8,11;15,5,4,1];
%
% Cálculo :
%
v = (A(:,2))';
w = A(2,:);
% 
% Seção disp :
%
disp('Sendo A : ');
disp(A);
disp('Então v é : ');
disp(v);
disp('E w é : ');
disp(w);