% Programa Questao21x, Resolve a questão 21
% Criado em 03/02/2018, por Breno Felipe
%
% Explicação :
%
% A partir da fómula do volume, isolamos h em função de r ( h = f(r) )
% Depois Achamos rm, isolando hm e igualando duas equações, vai dar uma
% Equação do 3º graus, ache as raízes
% 
% Variáveis de entrada : 
%
% r = raio do cilindro e da parte hemisférica superior
% V = Volume total do tanque
% 
% Variáveis de saída :
%
% h = Altura
% A = Área total
% P = Preço totas
% Pm = Menor custo total
% rm = Raio para ter o menor custo
% hm = Altura para ter o menor custo
%
% Valores : 
%
r = linspace(2,10,10);
V = 500;
%
% Cálculo
%
h = (2*pi*r.^3/3 - V)./(pi*r.^2);
h = abs(h);
A = 2*pi*r.*h + 2*pi*r.^2;
P = 2*pi*r.*h*300 + 2*pi*r.^2*400;
Pm = min(P);
rm = roots([ 402*pi 0 -Pm -600*V ]);
hm = (2*pi*rm.^3/3 - V)./(pi*rm.^2);
%
% Plot & Disp : 
%
plot(r,P),title('Raio x Custo'),xlabel('Raio'),ylabel('Custo')
disp('Menor custo, Possíveis raios e alturas respectivamente : ')
disp(Pm)
disp(rm)
disp(hm)