% Programa Questão 11a, Side Function para o programa "Questao11"
% Criado por Breno Felipe
%
% Explicação :
%
% Essa questão é uma merda, comece pelo papel, escreva as equações
% que você tem, depois isole a altura em duas equações, e depois iguale
% as alturas, o resultado vai ser essa função abaixo.
%
% Variáveis de entrada :
%
% r = Raio do cilindro e da parte hemisférica ( m )
%
% Variáveis de saída :
%
% custo = Custo total em função do raio ( $ )
%
% Cálculo :
%
function custo = Questao11a(r)
custo = (1800 + 3598*pi*r^3)*800/(3*r);