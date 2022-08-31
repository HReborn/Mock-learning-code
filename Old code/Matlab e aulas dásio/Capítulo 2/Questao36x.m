% Programa Questao36x, Resolve a quest�o 36
% Criado por Breno Felipe
%
% Explica��o
% 
% Defina o intervalo, calcule os pontos do polin�mio e plote
%
% Vari�veis de entrada :
%
% y = Polin�mio da quest�o
% x = Intervalo
%
% Vari�veis de sa�da :
%
% yx = Pontos do polin�mio
%
% Par�metros :
%
y = [ 3 -5 -28 -5 200 ];
x = -1:0.5:1;
%
% C�lculo :
%
yx = polyval(yx,x);
%
% Plot :
%
plot(x,yx),grid,ginput