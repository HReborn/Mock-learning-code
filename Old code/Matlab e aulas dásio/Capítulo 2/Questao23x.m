% Programa Questao23x, Resolve a quest�o 23
% Criado por Breno Felipe
%
% Explica��o : 
%
% Na letra A ele pede que voc� plote o tempo-de-meia-vida X k, para isso
% � preciso achar uma express�o para a meia vida em fun��o de k t(k).
% para achar a fun��ao t(k) � necess�rio colocar ln dos dois lados
% e assim isola o t. Na letra B � mais f�cil pois ele d� todas as infor-
% ma��es necess�rias e pede o plot C(ap�s 1 hora) X k.Supomos que 
% C0 = 100mg de algum medicamento e que C = 0.001mg
%
% Vari�veis de entrada : 
%
% C0 = Concentra��o inicial da letra A ( mg )
% C = Concentra��o final da letra A ( mg )
% k = Constante
% c0 = Concentra��o inicial da letra B ( mg )
% T1 = Tempo da letra B ( h )
%
% Vari�veis de sa�da : 
%
% T = tempo de meia vida em fun��o de k( h )
% c = Concentra��o ap�s uma hora em fun��o de k
%
% Par�metros :
%
C0 = 100;
C = 0.001;
k = linspace(0.047,0.107,1000);
c0 = 0;
T1 = 1;
%
% C�lculo :
%
% Letra A
T = log(C0/C)./k; % Express�o obtida ap�s botar ln nos dois lados
plot(T,k),xlabel('Tempo meia-vida'),ylabel('Cte de elimina��o'),title('Letra A')
%
x = input('Prosseguir para a letra B ? : ','s');
%
% Letra B
%
c = (1-exp(-k*T))./k;
plot(c,k),xlabel('Concentra��o'),ylabel('Cte de fornecimento'),title('Letra B')