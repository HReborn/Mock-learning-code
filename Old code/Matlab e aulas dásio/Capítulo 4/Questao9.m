% Programa Questao9, resolve a quest�o 9
% Criado por Breno Felipe
%
% Explica��o :
%
% Calcule a condi��o e some o resultado, pois j� que � bin�rio o resultado
% vai ser exatamente a quantidade de vezes em que a condi��o foi sanada. 
%
% Vari�veis de entrada :
%
% pa = Pre�o A
% pb = Pre�o B
%
% Vari�veis de sa�da :
%
% x = Condi��o da quest�o
% z = Soma dos dias em que a condi��o foi sanada
%
% Par�metros :
%
pa = [ 19 18 22 21 25 19 17 21 27 29 ];
pb = [ 22 17 20 19 24 18 16 25 28 27 ];
%
% C�lculo :
%
x = pa>pb;
z = sum(x,2);
%
% Display :
%
disp('A Quantidade de dias em que a condi��o foi sanada � :')
disp(z)