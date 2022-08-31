% Programa Questao23x, Resolve a questão 23
% Criado por Breno Felipe
%
% Explicação : 
%
% Na letra A ele pede que você plote o tempo-de-meia-vida X k, para isso
% é preciso achar uma expressão para a meia vida em função de k t(k).
% para achar a funçãao t(k) é necessário colocar ln dos dois lados
% e assim isola o t. Na letra B é mais fácil pois ele dá todas as infor-
% mações necessárias e pede o plot C(após 1 hora) X k.Supomos que 
% C0 = 100mg de algum medicamento e que C = 0.001mg
%
% Variáveis de entrada : 
%
% C0 = Concentração inicial da letra A ( mg )
% C = Concentração final da letra A ( mg )
% k = Constante
% c0 = Concentração inicial da letra B ( mg )
% T1 = Tempo da letra B ( h )
%
% Variáveis de saída : 
%
% T = tempo de meia vida em função de k( h )
% c = Concentração após uma hora em função de k
%
% Parâmetros :
%
C0 = 100;
C = 0.001;
k = linspace(0.047,0.107,1000);
c0 = 0;
T1 = 1;
%
% Cálculo :
%
% Letra A
T = log(C0/C)./k; % Expressão obtida após botar ln nos dois lados
plot(T,k),xlabel('Tempo meia-vida'),ylabel('Cte de eliminação'),title('Letra A')
%
x = input('Prosseguir para a letra B ? : ','s');
%
% Letra B
%
c = (1-exp(-k*T))./k;
plot(c,k),xlabel('Concentração'),ylabel('Cte de fornecimento'),title('Letra B')