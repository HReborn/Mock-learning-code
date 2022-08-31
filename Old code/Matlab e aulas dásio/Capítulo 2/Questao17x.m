% Programa Questao17x, resolve a questão 17
% Criado por Breno Felipe em 24/04/2017
%
% Explicação
%
% O problema diz que dois mergulhadores,partindo da superfície,estabelescem um
% sitema de coordenadas (x,y,z) em que x aponta para o leste,y, para o norte e z,para baixo.
% O problema da 3 situações para resolvermos, e conseguimos calculá-las
% com os meios de calcular um vetor qualquer.
%
% Entrada :
%
% A = Coordenadas do mergulhador 1 ( Em pés)
% B = Coordenadas do mergulhador 2 ( Em pés)
%
% Saída : 
%
% C = A distância do mergulhador 1 para a superfície
% D = As coordenadas que o mergulhador 1 precisa nadar para chegar ao mergulhador 2
% E = A distância que o mergulhador 1 precisa nadar para chegar ao mergulhador 2
%
% Valores : 
%
A = [ 60 -25 30];
B = [ 20 -55 20];
%
% Cálculo :
%
C = norm(A);
D = B - A;
E = norm(D);
%
% Seção disp :
%
disp('A distância do mergulhador 1 para a superfície é : ');
disp(C);
disp('As coordenadas que o mergulhador 1 precisa nadar para chegar ao mergulhador 2 é : ');
disp(D);
disp('A distância que o mergulhador 1 precisa nadar para chegar ao mergulhador 2 é : ');
disp(E);