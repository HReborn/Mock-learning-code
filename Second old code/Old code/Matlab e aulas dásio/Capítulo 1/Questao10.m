% Programa Questao10, Calcula a questao 10
% Criado em 17/03/2017 por Breno Felipe
%
% Variaveis constantes:
% X1 = Variavel dada na questao
% Y1 = Variavel dada na questao
%
% Variaveis de saida:
% u3 = referente ao exercicio A
% v3 = referente ao exercicio B
% w3 = referente ao exercicio C
% z3 = referente ao exercicio D
% r3 = referente ao exercicio E
% s3 = referente ao exercicio F
%
% Variaveis constantes:
% Sao dadas de acordo com a questao
X1 = 5 + 8*i;
Y1 = -6 + 7*i;
%
% Secao de calculo:
u3 = X1 + Y1;
v3 = X1*Y1;
w3 = X1/Y1;
z3 = e^X1;
r3 = sqrt(Y1);
s3 = X1*Y1^2;
%
% Secao a mostra:
disp('Exercício A:')
disp(u3)
disp('Exercício B:')
disp(v3)
disp('Exercício C:')
disp(w3)
disp('Exercício D:')
disp(z3)
disp('Exercício E:')
disp(r3)
disp('Exercício F:')
disp(s3)