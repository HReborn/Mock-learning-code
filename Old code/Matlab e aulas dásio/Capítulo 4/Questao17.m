% Programa Questao 17, Resolve a quest�o 17
% Criado por Breno Felipe
%
% Explica��o :
%
% Para reformular o programa apresentado � preciso primeiro conhecer como
% ele funciona, o primeiro if analisa a primeira condi��o e o segundo if
% analisa a segunda condi��o, e ent�o executa apenas se as condi��es dos
% dois if's forem verdadeiras. Para reformular o programa, � necess�rio
% fazer ao inv�s de dois if's para duas condi��es, usar apenas um if
% computando duas condi��es.
%
% Vari�veis de entrada :
%
% x = N�mero qualquer
% y = N�mero qualquer
%
% Vari�veis de sa�da :
%
% w = Resultado do programa apresentado
% w1 = Resultado do loop resposta
%
% Par�metros :
%
y = input('Insira um n�mero qualquer : ');
x = input('Insira um n�mero menor que o anterior : ');
z = input('Insira um n�mero menor que 10 : ');
%
% C�lculo :
%
if x < y
    if z < 10
        w = x*y*z;
    end
end
if x < y & z < 10
    w1 = x*y*z;
end
%
% Display :
%
disp('Resultado do Loop apresentado : ')
disp(w)
disp('Resultado da resposta : ')
disp(w1)