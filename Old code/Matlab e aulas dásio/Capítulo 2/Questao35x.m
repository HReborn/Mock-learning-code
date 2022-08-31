% Programa Questao35x, Resolve a quest�o 35
% Criado por Breno Felipe
%
% Explica��o
%
% Primeiro, defina os intervalos, defina os polin�mios e usando a fun��o
% polyval, calcule os pontos do polin�mio e enfim plote o intervalo versus
% os pontos dos polin�mios.
%
% Vari�veis de entrada :
%
% y = Polin�mio da quest�o
% z = Polin�mio da quest�o
% x = intervalo
%
% Vari�veis de sa�da :
%
% yx = Pontos do polin�mio "y"
% zx = Pontos do polin�mio "z"
%
% Par�metros :
%
y = [ 3 -6 8 4 90 ];
z = [ 3 5 -8 70 ];
x = -3:0.5:3;
%
% C�lculo :
%
yx = polyval(y,x);
zx = polyval(z,x);
%
% Plot :
%
plot(x,yx,'r',x,zx,'b'),ylabel('mA'),xlabel('Volts')