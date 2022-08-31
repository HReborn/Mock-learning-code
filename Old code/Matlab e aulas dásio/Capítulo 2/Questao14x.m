% Programa Questao14x, resolve a quest�o 14
% Criado por Breno Felipe em 24/04/2017
%
% Explica��o : 
%
% O problema da 5 momentos diferentes, os quais possuem 5 trabalhos diferentes,
% ele pede para calcularmos os 5 trabalhos e o trabalho total no trecho todo.
% Lembrando que trabalho � T = F*D, em que D � dist�ncia e F,for�a.
%
% Entrada :
%
% F = Valores da for�a ( Em N )
% D = Valores da dist�ncia ( Em M )
%
% Sa�da : 
%
% A = Trabalho de cada parte do percurso
% B = Trabalho total
%
% Valores : 
%
F = [400 550 700 500 600];
D = [3 0.5 0.75 1.5 5];
%
% C�lculo :
%
A = F.*D;
B = sum(A,2);
%
% Se��o disp :
%
disp('O trabalho de cada parte do percurso � : ');
disp(A);
disp('O Trabalho total � : ');
disp(B);