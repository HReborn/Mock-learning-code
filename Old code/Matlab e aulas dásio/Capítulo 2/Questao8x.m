% Programa Questao8x, resolve a quest�o 8
% Criado por Breno Felipe em 24/04/2017
%
% Entrada :
%
% A = Matriz da quest�o
%
% Sa�da : 
%
% ma = Valor m�ximo da coluna
% mi = Valor m�nimo da coluna
%
% Valores : 
%
A = [3,7,-4,12;-5,9,10,2;6,13,8,11;15,5,4,1];
%
% C�lculo :
%
ma1 = max(A(:,1));
ma2 = max(A(:,2));
ma3 = max(A(:,3));
ma4 = max(A(:,4));
mi1 = min(A(:,1));
mi2 = min(A(:,2));
mi3 = min(A(:,3));
mi4 = min(A(:,4));
%
% Se��o disp :
%
disp('O m�ximo e o m�nimo da primeira coluna de A s�o : ');
disp(ma1);
disp(mi1);
disp('O m�ximo e o m�nimo da segunda coluna de A s�o : ');
disp(ma2);
disp(mi2);
disp('O m�ximo e o m�nimo da terceira coluna de A s�o : ');
disp(ma3);
disp(mi3);
disp('O m�ximo e o m�nimo da quarta coluna de A s�o : ');
disp(ma4);
disp(mi4);