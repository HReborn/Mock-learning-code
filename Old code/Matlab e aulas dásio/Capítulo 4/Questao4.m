% Programa Questao4, resolve a quest�o 4
% Criado por Breno Felipe
%
% Explica��o :
%
% � apenas escrever as opera��es l�gicas e verificar na m�o
%
% Vari�veis de entrada :
%
% x = Valor da quest�o
%
% Vari�veis de sa�da :
%
% a = Letra A
% b = Letra B
% c = Letra C
% d = Letra D
% t = Respostas juntas
%
% Par�metros :
%
x = 6;
%
% C�lculo :
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