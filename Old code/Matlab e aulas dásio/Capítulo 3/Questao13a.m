% Programa Questao13a, Side Function da quest�o 13
% Criado por Breno Felipe
%
% Explica��o :
%
% Fa�a duas equa��es, uma do custo total e a outra da �rea total,
% Isole o "L" nas duas equa��es e iguale, ent�o ter� Custo(r)
%
% Vari�veis de entrada :
%
% r = Raio do semic�rculo ( ft )
%
% Vari�veis de sa�da :
%
% Custo = Custo total para fazer o nego�o ( $ )
%
% C�lculo : 
%
function Custo = Questao13a(r)
Custo = (20*(4000 - pi*r^2) + pi*r^2*50*(pi+2))/(pi*r);