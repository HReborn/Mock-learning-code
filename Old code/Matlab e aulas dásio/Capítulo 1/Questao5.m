% Programa Questao5, Calcula a questao 5
% Criado em 16/03/2017 por Breno Felipe
%
% Variaveis de saida:
% x9 = referente ao exercicio X
% s2 = referente ao exercicio S
% r2 = referente ao exercicio R
% y9 = referente ao exercicio Y
%
% Variaveis constantes:
% Sao dadas de acordo com a questao
a2 = 1.12;
b2 = 2.34;
c2 = 0.72;
d2 = 0.81;
f2 = 19.83;  
%
% Secao de calculo:
x9 = 1 + a2/b2 + c2/f2^2;
s2 = (b2 - a2)/(d2 - c2);
r2 = 1/((1/a2) + (1/b2) + (1/c2) + (1/d2));
y9 = (a2*b2*f2^2)/2*c;
%
% Secao a mostra:
disp('Exercício X:')
disp(x9)
disp('Exercício S:')
disp(s2)
disp('Exercício R:')
disp(r2)
disp('Exercício Y:')
disp(y9)