% Programa Quest�o 11a, Side Function para o programa "Questao11"
% Criado por Breno Felipe
%
% Explica��o :
%
% Essa quest�o � uma merda, comece pelo papel, escreva as equa��es
% que voc� tem, depois isole a altura em duas equa��es, e depois iguale
% as alturas, o resultado vai ser essa fun��o abaixo.
%
% Vari�veis de entrada :
%
% r = Raio do cilindro e da parte hemisf�rica ( m )
%
% Vari�veis de sa�da :
%
% custo = Custo total em fun��o do raio ( $ )
%
% C�lculo :
%
function custo = Questao11a(r)
custo = (1800 + 3598*pi*r^3)*800/(3*r);