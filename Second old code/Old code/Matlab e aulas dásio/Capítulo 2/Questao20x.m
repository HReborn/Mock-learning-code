% Programa Questao20x, Resolve a questão 20
% Criado em 03/02/2018, por Breno Felipe
%
% Explicação : 
%
% Achando L : 
%
% ÁreaTotal = ÁreaReta + ÁreaCícular
% 1600 = 2RL + piR^2/2
% Isolando L, temos :
% L = (3200 - piR^2)/4R , Com isso, se chutarmos valores para R, achamos
% valores para L, logo temos L e R.
%
% Achando P : 
% 
% PreçoTotal = PreçoReto + PreçoCircular = 30xÁreaReta + 40xÁreaCircular
% PreçoTotal = 60RL + 20piR^2
%
% Ao usar a função min, Achamos o Pmin, mas temos que ter também Rmin e
% Lmin.
%
% Achando Rmin : 
%
% Pmin = 60RminLmin + 20piRmin^2
% isolando L, temos : 
% Lmin = (Pmin - 20piRmin^2)/60R (1° equação)
% sendo Lmin = (3200 - piRmin^2)/4Rmin (2° equação)
% Igualamos as equações e isolando Rmin, achamos : 
% Rmin = sqrt((Pmin - 48000)/5pi)
%
% Agora que temos Rmin, Jogamos na equação abaixo para achar Lmin : 
%
% Lmin = (3200 - piRmin^2)/4Rmin
% Por fim, terminamos a questão, pois temos Lmin,Rmin e Pmin.
%
% Variáveis de entrada : 
% 
% R = Chute dos valores do raio
%
% Variáveis de Saída : 
%
% L = Arranjo com os valores dos lados do retângulo
% P = Aranjo com os preços em função de R e L
% Pmin = Valor mínimo dos preços
% Rmin = Valor do raio para que o preço seja mínimo
% Lmin = Valor do lado para que o preoço seja mínimo
%
% Valores : 
%
R = 0:0.01:200;
%
% Cálculo : 
%
L = (3200 - pi*R.^2)./(4*R);
P = 60*R.*L + 20*pi*R.^2;
Pmin = min(P);
Rmin = sqrt((Pmin - 48000)/(5*pi));
Lmin = (3200 - pi*Rmin^2)/(4*Rmin);
%
% Display
%
disp('Respectivamente, Raio, Lado e Preço mínimos : ')
disp(Rmin)
disp(Lmin)
disp(Pmin)
disp('Após o término do programa, mude o R, e veja o que acontece.')