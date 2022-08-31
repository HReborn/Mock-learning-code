% Programa Questao38x, Resolve a quest�o 38
% Criado por Breno Felipe
%
% Explica��o :
%
% S� joga na fun��o, rap�
%
% Vari�veis de entrada :
%
% a = Polin�mio numerador
% b = Polin�mio denominador
%
% Vari�veis de sa�da :
%
% c = Polin�mio resultante da divis�o
% r = Resto da divis�o
%
% Par�metros :
%
a = [ 14 -6 3 9 ];
b = [ 5 7 -4 ];
%
% C�lculo :
%
[c,r] = deconv(a,b);% Programa Questao42x, Resolve a quest�o 42
% Criado por Breno Felipe
%
% Explica��o
%
%
% Vari�veis de entrada :
%
% a = Polin�mio numerador
% b = Polin�mio Denominador
% x = Intervalo
%
% Vari�veis de sa�da :
%
% ax = Pontos do polin�mio "a"
% bx = Pontos do polin�mio "b"
% c = Resultado da divis�o
%
% Par�metros :
%
a = [ 3 -12 20 ];
b = [ 1 -7 10 ];
x = 0:0.1:7;
%
% C�lculo :
%
ax = polyval(a,x);
bx = polyval(b,x);
c = ax./bx;
%
% Plot :
%
plot(x,c)