% Programa Questao12, Resolve a quest�o 12
% Criado por Breno Felipe
%
% Explica��o :
%
% Fa�a a equa��o das �reas e quando chegar no ret�ngulo, substitua a hipo-
% tenusa pelo lado do ret�ngulo, vai dar a equa��o abaixo
%
% Vari�veis de entrada :
%
% w = Lado menor do ret�ngulo
% a = �rea total
%
% Vari�veis de sa�da :
%
% l = Lado maior do ret�ngulo ( m )
%
% C�lculo :
function l = Questao12(w,a);
l = (4*a - w^2)/(4*w);