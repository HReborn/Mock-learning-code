% Programa Questao5x, resolve a quest�o 5
% Criado por Breno Felipe em 24/04/2017
%
% Entrada :
%
% A = Matriz da quest�o
%
% Sa�da : 
%
% v = Vetor da quest�o
% w = Vetor da quest�o
%
% Valores : 
%
A = [3,7,-4,12;-5,9,10,2;6,13,8,11;15,5,4,1];
%
% C�lculo :
%
v = (A(:,2))';
w = A(2,:);
% 
% Se��o disp :
%
disp('Sendo A : ');
disp(A);
disp('Ent�o v � : ');
disp(v);
disp('E w � : ');
disp(w);