% Programa Questao21, Resolve a quest�o 21
% Criada por Breno Felipe
%
% Explica��o :
% 
% Crie um handle da side function, e execute com o intervalo e o handle
% 
% Vari�veis de entrada :
%
% x1 = Ponto de in�cio
% x2 = Ponto final
%
% Vari�veis de sa�da :
%
% z = Handle da Side Function
% x = Intervalo
% b = Zeros da fun��o
%
% C�lculo :
%
function b = Questao21(x1,x2)
z = @Questao21a;
x = [ x1 x2 ];
b = fzero(z,x);