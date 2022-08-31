% Programa Questao12, Resolve a quest�o 12
% Criado por Breno Felipe
%
% Explica��o :
%
% O princ��o b�sico  desse loop � que, ao ser sanada, a condi��o, a
% vari�vel de indexamento computa o valor em uma outra vari�vel, e ao fazer
% isso, a "vi" adiciona + 1 ao seu valor, isso seja na letra A, B ou C.
% Quando uma das condi��es for sanada, � necess�rio que outro if seja
% aberto, pois quando um if � sanado, ele automaticamente descarta os
% outros elseif's ent�o, por exemplo, quando na primeira itera��o a
% condi��o e verdadeira, o valor � computado vi = vi + 1 e logo em seguida
% outro if � aberto para verificar se alguma outra condi��o foi sanada, na
% hip�tese com mais if's � que se na primeira itera��o a condi��o �
% verdadeira, abre outro if dentro e nesse if a segunda condi��o tamb�m �
% verdadeira e abre outro if e a terceira condi��o tamb�m � verdadeira, com
% isso, na primeira itera��o as tr�s condi��es foram sanadas e o matlab n�o
% precisa mais verificar os outros if's restantes, ent�o ele pula para a
% pr�xima itera��o.
%
% Vari�veis de entrada :
%
% a = �ngulo ( rad )
% v0 = Velocidade inicial ( m/s )
% g = Acelera��o da gravidade ( m/s^2 )
% k = Vari�vel de indexamento
% w = Vari�vel de indexamento
% p = Vari�vel de indexamento
% i = Vari�vel de indexamento
%
% Vari�veis de sa�da :
%
% tq = Tempo de queda ( s )
% t = Intervalo do tempo ( s )
% h = sAltura ( m )
% v = Velocidade ( m/s )
% ta = Tempos em que a condi��o da letra A acontece
% tb = Tempos em que a condi��o da letra B acontece
% tc = Tempos em que a condi��o da letra C acontece
%
% Par�metros :
%
clear
a = pi/6;
v0 = 40;
g = 9.81;
k = 1;
w = 1;
p = 1;
%
% C�lculo :
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
    disp('Letra A � vazia')
end
disp('Letra B')
if exist('tb','var')
    disp(tb)
else
    disp('Letra B � vazia')
end
disp('Letra C')
if exist('tc','var')
    disp(tc)
else 
    disp('Letra C � vazia')
end