% Programa Questao19x, Resolve a Questão 19
% Criado em 03/02/2018, Por Breno Felipe
%
% Variáveis de entrada : 
%
% Precos = Vetor coluna para os preços de cada item ($/ton)
% Quantidades = Matriz 5x3 contendo as toneladas compradas para cada item
%
% Variáveis de saída : 
%
% Matriz = Matriz 5x3 contendo os valores gastos em cada item para cada mês
% Maio,Junho,Julho = Quantidade gasta no total em cada um desses meses
% Material = Total do gasto para cada material nos 3 meses
% Total = Total gasto em todos os materiais para todos os meses
%
% Valores : 
%
Precos = [ 300 ; 550 ; 400 ; 250 ; 500 ];
Quantidades = [ 5 4 6 ; 3 2 4 ; 6 5 3 ; 3 5 4 ; 2 4 3 ];
%
% Cálculo
%
% Letra A
%
Matriz(1:5,1) = Quantidades(1:5,1).*Precos;
Matriz(1:5,2) = Quantidades(1:5,2).*Precos;
Matriz(1:5,3) = Quantidades(1:5,3).*Precos;
disp('Letra A : ')
disp(Matriz)
%
% Letra B
%
Maio = sum(Matriz(1:5,1));
Junho = sum(Matriz(1:5,2));
Julho = sum(Matriz(1:5,3));
disp('Letra B : ')
disp(Maio)
disp(Junho)
disp(Julho)
%
% Letra C
%
Material = sum(Matriz,2);
disp('Letra C : ')
disp(Material)
%
% Letra D
%
Total = sum(sum(Matriz),2);
disp('Letra D : ')
disp(Total)