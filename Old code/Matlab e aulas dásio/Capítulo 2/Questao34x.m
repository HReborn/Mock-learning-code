% Programa Questão 34x, Resolve a questão 34
% Criado por Breno Felipe
% 
% Explicação
%
% Só jogue na equação dada
%
% Variáveis de entrada :
%
% a = Aresta do paralelepípedo
% d = Aresta do paralelepípedo
% c = Aresta do paralelepípedo
% 
% Variáveis de saída :
%
% d = Volume do paralelepípedo
%
% Parâmetros :
%
a = [ 5 0 0 ];
b = [ 2 4 0 ];
c = [ 3 0 -2 ];
%
% Cálculo :
%
d = abs(dot(a,cross(b,c)));
%
% Display :
%
disp('O Volume do paralelepípedo é :')
disp(d)