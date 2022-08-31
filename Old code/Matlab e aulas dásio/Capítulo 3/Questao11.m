% Programa Questao11, Resolve a quest�o 11
% Criado por Breno Felipe
%
% Explica��o :
%
% Use a fun��o que voc� fez, custo(r), e use a fun��o fminbnd para
% Achar o raio que minimiza o custo. Depois disso, use uma das equa��es
% anteriores em que voc� isolou a altura para achar a altura m�nima
% necess�ria.
%
% Vari�veis de sa�da :
%
% rm = Raio m�nimo ( m )
% h = Altura m�nima ( m )
%
% C�lculo :
%
rm = fminbnd(@Questao11a,0.1,10);
h = (1800 - 2*pi*rm^3)/(3*pi*rm^2);
%
% Display :
%
disp('Raio m�nimo necess�rio : ')
disp(rm)
disp('Altura m�nima necess�ria :')
disp(h)