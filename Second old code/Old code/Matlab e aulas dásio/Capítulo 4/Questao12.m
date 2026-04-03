% Programa Questao12, Resolve a questão 12
% Criado por Breno Felipe
%
% Explicação :
%
% O princíío básico  desse loop é que, ao ser sanada, a condição, a
% variável de indexamento computa o valor em uma outra variável, e ao fazer
% isso, a "vi" adiciona + 1 ao seu valor, isso seja na letra A, B ou C.
% Quando uma das condições for sanada, é necessário que outro if seja
% aberto, pois quando um if é sanado, ele automaticamente descarta os
% outros elseif's então, por exemplo, quando na primeira iteração a
% condição e verdadeira, o valor é computado vi = vi + 1 e logo em seguida
% outro if é aberto para verificar se alguma outra condição foi sanada, na
% hipótese com mais if's é que se na primeira iteração a condição é
% verdadeira, abre outro if dentro e nesse if a segunda condição também é
% verdadeira e abre outro if e a terceira condição também é verdadeira, com
% isso, na primeira iteração as três condições foram sanadas e o matlab não
% precisa mais verificar os outros if's restantes, então ele pula para a
% próxima iteração.
%
% Variáveis de entrada :
%
% a = Ângulo ( rad )
% v0 = Velocidade inicial ( m/s )
% g = Aceleração da gravidade ( m/s^2 )
% k = Variável de indexamento
% w = Variável de indexamento
% p = Variável de indexamento
% i = Variável de indexamento
%
% Variáveis de saída :
%
% tq = Tempo de queda ( s )
% t = Intervalo do tempo ( s )
% h = sAltura ( m )
% v = Velocidade ( m/s )
% ta = Tempos em que a condição da letra A acontece
% tb = Tempos em que a condição da letra B acontece
% tc = Tempos em que a condição da letra C acontece
%
% Parâmetros :
%
clear
a = pi/6;
v0 = 40;
g = 9.81;
k = 1;
w = 1;
p = 1;
%
% Cálculo :
%
tq = (2*(v0/g)*sin(a));
t = 0:0.5:tq;
h = (v0*t*sin(a)) - (0.5*g*t.^2);
v = sqrt((v0^2) - (2*v0*g*t*sin(a)) + ((g^2)*t.^2));
%
% Loops :
%
for i = 1:length(h)
    if h(i) >= 15
        ta(k) = t(i);
        k = k+1;
        if v(i) <= 36 && h(i) >= 15
            tb(w) = t(i);
            w = w+1;
            if h(i) < 5 || v(i) > 35
                tc(p) = t(i);
                p = p + 1;
            end
        elseif h(i) < 5 || v(i) > 35
            tc(p) = t(i);
            p = p + 1;
        end
    elseif v(i) <= 36 && h(i) >= 15
        tb(g) = t(i);
        w = w+1;
        if h(i) < 5 || v(i) > 35
            tc(p) = t(i);
            p = p + 1;
        end
    elseif h(i) < 5 || v(i) > 35
        tc(p) = t(i);
        p = p + 1;
    else
        o = 0;
    end
end
%
% Display :
%
disp('Letra A')
if exist('ta','var')
    disp(ta)
else
    disp('Letra A é vazia')
end
disp('Letra B')
if exist('tb','var')
    disp(tb)
else
    disp('Letra B é vazia')
end
disp('Letra C')
if exist('tc','var')
    disp(tc)
else 
    disp('Letra C é vazia')
end