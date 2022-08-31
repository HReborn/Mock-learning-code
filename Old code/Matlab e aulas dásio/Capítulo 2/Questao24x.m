% Programa Questão24x, Calcula a questão 24
% Criado por Breno Felipe
%
% Explicação : 
%
% Calcule a tensão, Calcule a tensão mínima, Jogue Tm na fórmula da tensão
% Substituindo D por Dm e ache o polinômio que calcula Dm, Ache Dm.
% Na letra B, Ache a 10% a mais da tensão e repita o mesmo processo feito
% com Dm.
%
% Variáveis de entrada : 
%
% D = Distância da parede até o pivô ( m )
% Lc = Cabo de suporte da viga ( m )
% Lb = Viga ( m )
% W = Peso alocado no fim da viga ( N )
%
% Variáveis de saída :
%
% T = Tensão ( N )
% Tm = Valor mínimo da tensão ( N )
% V = Polinômio para calcular Dm
% Dm = Comprimento para minimizar a tensão
% TmA = Tensão mínima 10% a mais
% VA = Polinômio de DmA
% DmA = Comprimento mínimo 10% a mais
%
% Parâmetros
%
D = 0.1:0.1:2.9;
Lc = 5;
Lb = 3;
W = 400;
%
% Cálculo
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
plot(T,D),xlabel('Tensão(N)'),ylabel('Distância da Parede')
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