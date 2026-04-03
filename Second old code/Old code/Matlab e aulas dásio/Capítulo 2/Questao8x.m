% Programa Questao8x, resolve a questão 8
% Criado por Breno Felipe em 24/04/2017
%
% Entrada :
%
% A = Matriz da questão
%
% Saída : 
%
% ma = Valor máximo da coluna
% mi = Valor mínimo da coluna
%
% Valores : 
%
A = [3,7,-4,12;-5,9,10,2;6,13,8,11;15,5,4,1];
%
% Cálculo :
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
% Seção disp :
%
disp('O máximo e o mínimo da primeira coluna de A são : ');
disp(ma1);
disp(mi1);
disp('O máximo e o mínimo da segunda coluna de A são : ');
disp(ma2);
disp(mi2);
disp('O máximo e o mínimo da terceira coluna de A são : ');
disp(ma3);
disp(mi3);
disp('O máximo e o mínimo da quarta coluna de A são : ');
disp(ma4);
disp(mi4);