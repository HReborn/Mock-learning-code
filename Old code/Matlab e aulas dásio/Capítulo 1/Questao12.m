% Programa Questao12, resolve a quest�o 12
% Criado por Breno Felipe
%
% Explica��o :
%
% Como a press�o � constante, iguale as press�es de dezembro e julho e
% substitua as equa��es, j� que n e R s�o contantes tamb�m, voc� as anula
% da equa��o e fica apenas t1/v1 = t2/v2, e isolando, v2, voc� acha o
% resultado.
%
% Vari�veis de entrada :
%
% t1 = Temperatura em dezembro ( K )
% v1 = Volume do g�s em dezembro ( ft^3 )
% t2 = Temperatura em julho ( K )
%
% Vari�veis de sa�da :
%
% v2 = Volume do g�s em julho ( ft^3 )
%
% Par�metros :
%
t1 = 273.2 - 15;
v1 = 28500;
t2 = 273.2 + 31;
%
% C�lculo :
%
v2 = (v1*t2)/t1;
%
% Display :
%
disp('O volume do g�s em julho era :')
disp(v2)