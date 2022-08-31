% Programa Questao17x, resolve a quest�o 17
% Criado por Breno Felipe em 24/04/2017
%
% Explica��o
%
% O problema diz que dois mergulhadores,partindo da superf�cie,estabelescem um
% sitema de coordenadas (x,y,z) em que x aponta para o leste,y, para o norte e z,para baixo.
% O problema da 3 situa��es para resolvermos, e conseguimos calcul�-las
% com os meios de calcular um vetor qualquer.
%
% Entrada :
%
% A = Coordenadas do mergulhador 1 ( Em p�s)
% B = Coordenadas do mergulhador 2 ( Em p�s)
%
% Sa�da : 
%
% C = A dist�ncia do mergulhador 1 para a superf�cie
% D = As coordenadas que o mergulhador 1 precisa nadar para chegar ao mergulhador 2
% E = A dist�ncia que o mergulhador 1 precisa nadar para chegar ao mergulhador 2
%
% Valores : 
%
A = [ 60 -25 30];
B = [ 20 -55 20];
%
% C�lculo :
%
C = norm(A);
D = B - A;
E = norm(D);
%
% Se��o disp :
%
disp('A dist�ncia do mergulhador 1 para a superf�cie � : ');
disp(C);
disp('As coordenadas que o mergulhador 1 precisa nadar para chegar ao mergulhador 2 � : ');
disp(D);
disp('A dist�ncia que o mergulhador 1 precisa nadar para chegar ao mergulhador 2 � : ');
disp(E);