% Programa Questao15, Resolve a quest�o 15
% Criado por Breno Felipe
%
% Explica��o :
% 
% Defina o volume como sua entrada para ele ser usado na Side Function,
% minimize o raio usando a fun��o fminbnd. Calcule a altura m�nima
% usando o raio m�nimo em uma das express�es em que o h foi isolado.
% Plote um intervalo do raio com f�rmula do volume.
%
% Vari�veis de entrada :
%
% v = Volume ( in^3 )
%
% Vari�veis de sa�da :
%
% rm = Raio m�nimo ( in )
% hm = Altura m�nima ( in )
% r = Intervalo qualquer do raio ( in )
% v1 = Volume em fun��o do raio ( in^3 )
% Am = �rea m�nima ( in^2 )
% AmA = 10% Acima da �rea m�nima ( in^2 )
% a1 = intervalo da �rea m�nima at� 10% acima de seu valor
% rmA1 = Polin�mio que representa a varia��o do raio em fun��o da �rea
% rmA2 = Valores poss�veis para rm
% rmA = Valor m�ximo que r pode variar do seu valor m�nimo quando a �rea
%       varia at� 10% acima do seu valor m�nimo
%
% C�lculo :
%
function [rm,rmA] = Questao15(v)
rm = fminbnd(@Questao15a,0,100);
hm = (3*v)/(pi*rm^2);
r = 0:0.1:5;
v1 = pi*r.^2*hm/3;
Am = Questao15a(rm);
AmA = Am*1.1;
a1 = linspace(Am,AmA,50);
rmA1 = [ pi 0 0 0 -a1.^2 0 9*v^2 ];
rmA2 = roots(rmA1);
rmA = max(rmA2);
%
% Plot :
%
plot(r,v1)