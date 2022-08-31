% Programa Questao29x, resolve a quest�o 29
% Criado por Breno Felipe
%
% Explica��o :
%
% Escreva a matriz de custo e de quantidade, depois separe a coluna do
% custo dos materiais, da m�o de obra e do transporte e repita a coluna 4
% vezes, pois o valor � o mesmo para todos os trimestres, multiplique
% pela matriz quantidade e voc� ter� o custo trimestral de cara tipo de
% despesa. Depois � s� usar a fun��o sum(X,2) e voc� ter� o custo anual
% para cada despesa. depois, some os resultados da letra A e use sum(x)
% no resultado e voc� ter� o custo total para cada quarto de ano.
%
% Vari�veis de entrada :
%
% x1 = Valor da m�o de obra para o produto 1
% x2 = Valor da m�o de obra para o produto 2
% x3 = Valor da m�o de obra para o produto 3
% x4 = Valor da m�o de obra para o produto 4
% Custo = Matriz com o custo das despesas
% Quantidade = Matriz com a produ��o
%
% Vari�veis de sa�da :
%
% Materiais = Custo somente dos materiais
% Mao = Custo somente da m�o de obra
% Transporte = Custo somente do tranporte
% MatCq = Custo de cada quarto de cada produto para os materiais
% MaoCq = Custo de cada quarto de cada produto para a m�o de obra
% TranCq = Custo de cada quarto de cada produto para transporte
% MatCa = Custo de material anual para cada produto
% MaoCa = Custo de m�o de obra anual para cada produto
% TranCa = Custo de transporte anual para cada produto
% CTq = Custo total para cada quarto
%
% Par�metros : 
%
x1 = input('Valor da m�o de obra para o produto 1 : ');
x2 = input('Valor da m�o de obra para o produto 2 : ');
x3 = input('Valor da m�o de obra para o produto 3 : ');
x4 = input('Valor da m�o de obra para o produto 4 : ');
Custo = [ 6 x1 1 ; 2 x2 4 ; 4 x3 2 ; 9 x4 3 ];
Quantidade = [ 10 12 13 15 ; 8 7 6 4 ; 12 10 13 9 ; 6 4 11 5 ];
%
% C�lculo :
%
% Letra A
%
Materiais = [ Custo(:,1) Custo(:,1) Custo(:,1) Custo(:,1) ];
Mao = [ Custo(:,2) Custo(:,2) Custo(:,2) Custo(:,2) ];
Transporte = [ Custo(:,3) Custo(:,3) Custo(:,3) Custo(:,3) ];
MatCq = Materiais.*Quantidade;
MaoCq = Mao.*Quantidade;
TranCq = Transporte.*Quantidade;
%
% Letra B
%
MatCa = sum(MatCq,2);
MaoCa = sum(MaoCq,2);
TranCa = sum(TranCq,2);
%
% Letra C
%
CTq = sum((MatCq + MaoCq + TranCq));
%
% Display :
%
disp('             Letra A')
disp('Custo de cada quarto de cada produto para os materiais :')
disp(MatCq)
disp('Custo de cada quarto de cada produto para M�o obra :')
disp(MaoCq)
disp('Custo de cada quarto de cada produto para transporte :')
disp(TranCq)
disp('             Letra B')
disp('Custo de material anual para cada produto :')
disp(MatCa)
disp('Custo de m�o de obra anual para cada produto :')
disp(MaoCa)
disp('Custo de transporte anual para cada produto :')
disp(TranCa)
disp('             Letra C')
disp('Custo total para cada quarto')
disp(CTq)