% Programa Questao11, Resolve a questão 11
% Criado por Breno Felipe
%
% Explicação :
%
% Use a função que você fez, custo(r), e use a função fminbnd para
% Achar o raio que minimiza o custo. Depois disso, use uma das equações
% anteriores em que você isolou a altura para achar a altura mínima
% necessária.
%
% Variáveis de saída :
%
% rm = Raio mínimo ( m )
% h = Altura mínima ( m )
%
% Cálculo :
%
rm = fminbnd(@Questao11a,0.1,10);
h = (1800 - 2*pi*rm^3)/(3*pi*rm^2);
%
% Display :
%
disp('Raio mínimo necessário : ')
disp(rm)
disp('Altura mínima necessária :')
disp(h)