% Programa Quest�o24x, Calcula a quest�o 24
% Criado por Breno Felipe
%
% Explica��o : 
%
% Calcule a tens�o, Calcule a tens�o m�nima, Jogue Tm na f�rmula da tens�o
% Substituindo D por Dm e ache o polin�mio que calcula Dm, Ache Dm.
% Na letra B, Ache a 10% a mais da tens�o e repita o mesmo processo feito
% com Dm.
%
% Vari�veis de entrada : 
%
% D = Dist�ncia da parede at� o piv� ( m )
% Lc = Cabo de suporte da viga ( m )
% Lb = Viga ( m )
% W = Peso alocado no fim da viga ( N )
%
% Vari�veis de sa�da :
%
% T = Tens�o ( N )
% Tm = Valor m�nimo da tens�o ( N )
% V = Polin�mio para calcular Dm
% Dm = Comprimento para minimizar a tens�o
% TmA = Tens�o m�nima 10% a mais
% VA = Polin�mio de DmA
% DmA = Comprimento m�nimo 10% a mais
%
% Par�metros
%
D = 0.1:0.1:2.9;
Lc = 5;
Lb = 3;
W = 400;
%
% C�lculo
%
% Letra A
%
T = Lb*Lc*W./(D.*sqrt(Lb^2 - D.^2));
Tm = min(T);
V = [ Tm^2,0,(-Tm^2)*Lb^2,0,(Lb^2)*(Lc^2)*W^2 ];
Dm = roots(V);
%
% Letra B
%
TmA = Tm*1.1; 
VA = [ TmA^2,0,0,(-TmA^2)*Lb^2,0,(Lb^2)*(Lc^2)*W^2 ];
DmA = roots(V);
%
% Plot
%
plot(T,D),xlabel('Tens�o(N)'),ylabel('Dist�ncia da Parede')
%
% Display
%
disp('Letra A')
disp('Dmin')
disp(Dm)
disp('Tmin')
disp(Tm)
disp('Letra B')
disp('DminAcima')
disp(DmA)
disp('TminAcima')
disp(TmA)