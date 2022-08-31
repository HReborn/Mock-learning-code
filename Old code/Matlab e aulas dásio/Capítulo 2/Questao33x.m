% Programa Questão 33x, Resolve a questão 33
% Criado por Breno Felipe
% 
% Explicação
%
% Apenas calcule o módulo do produto vetorial entre os lados
%
% Variáveis de entrada :
%
% a = Lado do paralelogramo
% b = Lado do paralelogramo
%
% Variáveis de saída :
%
% c = Área do paralelogramo
%
% Parâmetros :
%
a = [ 5 0 0 ];
b = [ 1 3 0 ];
%
% Cálculo :
%
c = abs(cross(a,b));
%
% Display :
%
disp('A área do paralelogramo é :')
disp(c)