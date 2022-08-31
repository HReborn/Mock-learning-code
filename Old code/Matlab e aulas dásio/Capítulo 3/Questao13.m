% Programa Questao13, Resolve a questão 13
% Criado por Breno Felipe
%
% Explicação :
%
% Use a função fminbnd na Side Function para achar o raio mínimo,
% Jogue em uma das equações em que o "L" foi isolado e calcule o "L"
% após isso, use a Side Function para calcular o custo mínimo utilizando
% a entrada com "rm"
%
% Variáveis de saída :
%
% rm = Raio para minimizar o custo ( ft )
% lm = Lado maior do retângulo ( ft )
% cm = Custo mínimo ( $ )
%
% Cálculo :
%
rm = fminbnd(@Questao13a,0,1000);
lm = (400 - pi*rm^2)/(4*pi*rm);
cm = Questao13a(rm);
%
% Display :
%
disp('Raio mínimo :')
disp(rm)
disp('Lado mínimo :')
disp(lm)
disp('Custo mínimo :')
disp(cm)