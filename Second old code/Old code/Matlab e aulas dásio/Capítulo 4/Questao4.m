% Programa Questao4, resolve a questão 4
% Criado por Breno Felipe
%
% Explicação :
%
% É apenas escrever as operações lógicas e verificar na mão
%
% Variáveis de entrada :
%
% x = Valor da questão
%
% Variáveis de saída :
%
% a = Letra A
% b = Letra B
% c = Letra C
% d = Letra D
% t = Respostas juntas
%
% Parâmetros :
%
x = 6;
%
% Cálculo :
%
a = (x<10);
b = (x==10);
c = x>=4;
d = x~=7;
t = [ a b c d ];
%
% Display :
%
disp('Resultado :')
disp(t)