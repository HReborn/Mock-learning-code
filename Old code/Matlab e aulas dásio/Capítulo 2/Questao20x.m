% Programa Questao20x, Resolve a quest�o 20
% Criado em 03/02/2018, por Breno Felipe
%
% Explica��o : 
%
% Achando L : 
%
% �reaTotal = �reaReta + �reaC�cular
% 1600 = 2RL + piR^2/2
% Isolando L, temos :
% L = (3200 - piR^2)/4R , Com isso, se chutarmos valores para R, achamos
% valores para L, logo temos L e R.
%
% Achando P : 
% 
% Pre�oTotal = Pre�oReto + Pre�oCircular = 30x�reaReta + 40x�reaCircular
% Pre�oTotal = 60RL + 20piR^2
%
% Ao usar a fun��o min, Achamos o Pmin, mas temos que ter tamb�m Rmin e
% Lmin.
%
% Achando Rmin : 
%
% Pmin = 60RminLmin + 20piRmin^2
% isolando L, temos : 
% Lmin = (Pmin - 20piRmin^2)/60R (1� equa��o)
% sendo Lmin = (3200 - piRmin^2)/4Rmin (2� equa��o)
% Igualamos as equa��es e isolando Rmin, achamos : 
% Rmin = sqrt((Pmin - 48000)/5pi)
%
% Agora que temos Rmin, Jogamos na equa��o abaixo para achar Lmin : 
%
% Lmin = (3200 - piRmin^2)/4Rmin
% Por fim, terminamos a quest�o, pois temos Lmin,Rmin e Pmin.
%
% Vari�veis de entrada : 
% 
% R = Chute dos valores do raio
%
% Vari�veis de Sa�da : 
%
% L = Arranjo com os valores dos lados do ret�ngulo
% P = Aranjo com os pre�os em fun��o de R e L
% Pmin = Valor m�nimo dos pre�os
% Rmin = Valor do raio para que o pre�o seja m�nimo
% Lmin = Valor do lado para que o preo�o seja m�nimo
%
% Valores : 
%
R = 0:0.01:200;
%
% C�lculo : 
%
L = (3200 - pi*R.^2)./(4*R);
P = 60*R.*L + 20*pi*R.^2;
Pmin = min(P);
Rmin = sqrt((Pmin - 48000)/(5*pi));
Lmin = (3200 - pi*Rmin^2)/(4*Rmin);
%
% Display
%
disp('Respectivamente, Raio, Lado e Pre�o m�nimos : ')
disp(Rmin)
disp(Lmin)
disp(Pmin)
disp('Ap�s o t�rmino do programa, mude o R, e veja o que acontece.')