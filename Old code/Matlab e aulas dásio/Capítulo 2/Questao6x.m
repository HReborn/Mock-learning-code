% Programa Questao6x, resolve a quest�o 6
% Criado por Breno Felipe em 24/04/2017
%
% Entrada :
%
% A = Matriz da quest�o
%
% Sa�da : 
%
% B = Arranjo da quest�o
% C = Arranjo da quest�o
% D = Arranjo da quest�o
%
% Valores : 
%
A = [3,7,-4,12;-5,9,10,2;6,13,8,11;15,5,4,1];
%
% C�lculo :
%
B = A(:,2:4);
C = A(2:4,:);
D = A(1:2,2:4);
% Se��o disp :
%
disp('Sendo A : ');
disp(A);
disp('Ent�o B � : ');
disp(B);
disp('C � : ');
disp(C);
disp('E D � : ');
disp(D);