% Programa Questao27x, Resolve a questão 27
% Criado por Breno Felipe
%
% Explicação :
%
% Na letra A é preciso dividir o custo dos materiais, mão de obra,
% e transporte em matrizes 5x4 com quatro coluna iguais e depois
% multiplicar elemento a elemento pela quantidade dos produtos, e o re-
% sultado vai ser um matriz 5x4 com cada coluna representando um quarto
% do custo total do ano para cada tipo de serviço.
% Na letra B, é preciso somar as quantidades para cada quarto e achar
% as quantidades anuais para cada tipo de material vai dar uma matriz
% coluna, mas para realizar a multiplicação é preciso repetir as colunas
% 3 vezes para ficar uma matriz 5x3 e multiclicar com a matriz de custo.
% Na letra C, cria-se uma matriz coluna com a soma dos preços dos serviços
% e então repete a coluna 4 vezes, essa matriz vai representar o custo
% para produzir cada unidade e vai ser 5x4, e então multiplique pela
% matriz quantidade original, o resultado vai representar o custo total
% para cada material em cada quarto, e depois disso some as colunas,
% vai dar um vetor de dimensão 4.
%
% Variáveis de entrada :
%
% Custo = Matriz do custo da questão ( $ x 10^3 )
% Quantidade = Matriz quantidade de cada produto em cada quarto
%
% Variáveis de saída :
%
% Materiais = Repete 4 vezes a coluna referente aos materiais ( 5x4 )
% Mao = Repete 4 vezes a coluna referente à mão de obra ( 5x4 )
% Transporte = Repete 4 vezes a coluna referente ao tranporte ( 5x4 )
% a = Custo total dos de cada quarto dos materiais ( 5x4 )
% b = Custo total dos de cada quarto da mão de obra ( 5x4 )
% c = Custo total dos de cada quarto do transporte ( 5x4 )
% Quant = Repete 3 vezes a soma das linhas de "Quantidade", representa
% o total peças produzidas anualmente  ( 5x3 )
% d = Custo total anual para cada produto e serviço ( 5x3 )
% CustoT = Repete 4 vezes a soma das linhas de "Custo", representa o
% custo total para produzir uma unidade para cada produto  ( 5x4 )
% Total1 = Custo total para cada produto de cada quarto ( 5x4 )
% Total = Custo total de cada quarto ( 1x4 )
%
% Parâmetros :
%
Custo = [ 7 3 2 ; 3 1 3 ; 9 4 5 ; 2 5 4 ; 6 2 1 ];
Quantidade = [ 16 14 10 12 ; 12 15 11 13 ; 8 9 7 11 ; 14 13 15 17 ; 13 16 12 18 ];
%
% Cálculo :
%
% Letra A :
%
Materiais = [ Custo(:,1) Custo(:,1) Custo(:,1) Custo(:,1) ];
Mao = [ Custo(:,2) Custo(:,2) Custo(:,2) Custo(:,2) ];
Transporte = [ Custo(:,3) Custo(:,3) Custo(:,3) Custo(:,3) ];
a = Materiais.*Quantidade;
b = Mao.*Quantidade;
c = Transporte.*Quantidade;
%
% Letra B :
%
Quant = [ sum(Quantidade,2) sum(Quantidade,2) sum(Quantidade,2) ];
d = Quant.*Custo;
%
% Letra C :
%
CustoT(:,1:4) = [ sum(Custo,2) sum(Custo,2) sum(Custo,2) sum(Custo,2) ];
Total1 = CustoT.*Quantidade;
Total = sum(Total1);
%
% Display :
%
disp('Letra A')
disp('Custo de cada trimestre para Material')
disp(a)
disp('Custo de cada trimestre para Mão de Obra')
disp(b)
disp('Custo de cada trimestre para Transporte')
disp(c)
disp('Letra B')
disp('Custo total anual para Material, Mão de Obra e Transporte')
disp(d)
disp('Letra C')
disp('Custo total de cada trimestre')
disp(Total)