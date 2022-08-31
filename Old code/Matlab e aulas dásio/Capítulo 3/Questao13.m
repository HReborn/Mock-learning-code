% Programa Questao13, Resolve a quest�o 13
% Criado por Breno Felipe
%
% Explica��o :
%
% Use a fun��o fminbnd na Side Function para achar o raio m�nimo,
% Jogue em uma das equa��es em que o "L" foi isolado e calcule o "L"
% ap�s isso, use a Side Function para calcular o custo m�nimo utilizando
% a entrada com "rm"
%
% Vari�veis de sa�da :
%
% rm = Raio para minimizar o custo ( ft )
% lm = Lado maior do ret�ngulo ( ft )
% cm = Custo m�nimo ( $ )
%
% C�lculo :
%
rm = fminbnd(@Questao13a,0,1000);
lm = (400 - pi*rm^2)/(4*pi*rm);
cm = Questao13a(rm);
%
% Display :
%
disp('Raio m�nimo :')
disp(rm)
disp('Lado m�nimo :')
disp(lm)
disp('Custo m�nimo :')
disp(cm)