% Programa Questao 17, Resolve a questão 17
% Criado por Breno Felipe
%
% Explicação :
%
% Para reformular o programa apresentado é preciso primeiro conhecer como
% ele funciona, o primeiro if analisa a primeira condição e o segundo if
% analisa a segunda condição, e então executa apenas se as condições dos
% dois if's forem verdadeiras. Para reformular o programa, é necessário
% fazer ao invés de dois if's para duas condições, usar apenas um if
% computando duas condições.
%
% Variáveis de entrada :
%
% x = Número qualquer
% y = Número qualquer
%
% Variáveis de saída :
%
% w = Resultado do programa apresentado
% w1 = Resultado do loop resposta
%
% Parâmetros :
%
y = input('Insira um número qualquer : ');
x = input('Insira um número menor que o anterior : ');
z = input('Insira um número menor que 10 : ');
%
% Cálculo :
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