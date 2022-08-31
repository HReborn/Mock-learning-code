% Programa Questao14x, resolve a questão 14
% Criado por Breno Felipe em 24/04/2017
%
% Explicação : 
%
% O problema da 5 momentos diferentes, os quais possuem 5 trabalhos diferentes,
% ele pede para calcularmos os 5 trabalhos e o trabalho total no trecho todo.
% Lembrando que trabalho é T = F*D, em que D é distância e F,força.
%
% Entrada :
%
% F = Valores da força ( Em N )
% D = Valores da distância ( Em M )
%
% Saída : 
%
% A = Trabalho de cada parte do percurso
% B = Trabalho total
%
% Valores : 
%
F = [400 550 700 500 600];
D = [3 0.5 0.75 1.5 5];
%
% Cálculo :
%
A = F.*D;
B = sum(A,2);
%
% Seção disp :
%
disp('O trabalho de cada parte do percurso é : ');
disp(A);
disp('O Trabalho total é : ');
disp(B);