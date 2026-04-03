% Programa Questao12, resolve a questão 12
% Criado por Breno Felipe
%
% Explicação :
%
% Como a pressão é constante, iguale as pressões de dezembro e julho e
% substitua as equações, já que n e R são contantes também, você as anula
% da equação e fica apenas t1/v1 = t2/v2, e isolando, v2, você acha o
% resultado.
%
% Variáveis de entrada :
%
% t1 = Temperatura em dezembro ( K )
% v1 = Volume do gás em dezembro ( ft^3 )
% t2 = Temperatura em julho ( K )
%
% Variáveis de saída :
%
% v2 = Volume do gás em julho ( ft^3 )
%
% Parâmetros :
%
t1 = 273.2 - 15;
v1 = 28500;
t2 = 273.2 + 31;
%
% Cálculo :
%
v2 = (v1*t2)/t1;
%
% Display :
%
disp('O volume do gás em julho era :')
disp(v2)