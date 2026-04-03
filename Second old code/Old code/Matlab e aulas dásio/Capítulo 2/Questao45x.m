% Programa Questao45x, Resolve a questão 45
% Criado por Breno Felipe
% 
% Explicação :
%
% Crie o arranjo celular e dê o display do que ele pede usando
% o indexamento de arranjos
%
% Variáveis de entrada :
%
% a = Arranjo celular da questão
%
% Variáveis de saída : 
%
% c = Letra B
%
% Parâmetros :
%
a = cell(2);
a(1,1) = {'Motor 28C'};
a(1,2) = {'Test ID 6'};
a(2,1) = {[ 3 9 ; 7 2 ]};
a(2,2) = {[ 6 5 1 ]};
b{1,1} = 'Motor 28C';
b{1,2} = 'Test ID 6';
b{2,1} = [ 3 9 ; 7 2 ];
b{2,2} = [ 6 5 1 ];
%
% Cálculo :
%
c = a{2,1};
%
% Display :
%
disp('Célula (1,1) elemento (2,1)')
disp(c(1,1))