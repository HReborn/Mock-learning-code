% Programa Questao28x, resolve a questão 28
% Criado por Breno Felipe
%
% Explicação :
%
% Tranforme a matriz de % para números normais e multiplique a matriz
% por 10^6, a resposta vai ser a quantidade de cada material necessário
% em toneladas.
%
% Variáveis de entrada :
%
% a = Matriz referente a % de materiais no alumínio
%
% Variáveis de saída :
%
% b = Matriz da quantidaes de materiais sem estar em %
% c = Matriz da quantidade dos materiais ( Ton )
%
% Parâmetros : 
%
a = [ 2024 4.4 1.5 0.6 0 0 ; 6061 0 1 0 0.6 0 ;...
    7005 0 1.4 0 0 4.5 ; 7075 1.6 2.5 0 0 5.6 ; 356 0 0.3 0 7 0 ];
%
% Cálculo :
%
b = a/100;
c = b*10^6;
c(:,1) = [ 2024 ; 6061 ; 7005 ; 7075 ; 356 ];
%
% Display : 
%
disp('Quantidade em toneladas dos materiais presentes no alumínio')
disp(c)