% Programa Questao15, Resolve a quest�o 15
% Criado por Breno Felipe
%
% Explica��o :
%
% S� um joguinho de operadores.
% Letra A1 : (a == b) & ((b == c) | (a == c))
% a=b e ((b=c) ou (a=c))
% para ser verdadeiro, a tem que ser igual a b e tamb�m ou b � igual a c
% ou a � igual a c
% Letra A2 : (a == b) | ((b == c) & (a == c ))
% a=b ou (b=c e a=c)
% para ser verdadeiro, apenas uma condi��o tem que ser sanada a=b ou b=c e
% tamb�m a=c
% como o A1 requer duas condi��es a serem sanadas, e A2 requerem duas,ent�o
% as equa��es n�o s�o equivalentes
% Letra B1 : (a < b) & ((a > c) | (a > d))
% duas condi��es precisam ser sanadas, (a < b) e tamb�m a segunda op��o em
% que apenas uma das duas precisam ser sanadas (a > c) ou (a > d)
% Letra B2 : (a < b) % (a > c) | ((a < b) & (a > d))
% aqui fica meio confuso, pois voc� precisa saber a ordem em que as
% opera��es atuam, como as opera��es l�gicas tem a mesma prefer�ncia, ent�o
% o privil�gio vi da esquerda para a direita, � como se escrev�ssemos : 
% ((a < b) & (a > c)) | ((a < b) & (a > d))
% as duas equa��es B1 e B2 s�o iguais pois em B1, (a < b) � verdadeiro, mas
% (a > c) | (a > d), apenas um dos dois pode ser verdadeiro, ent�o temos
% duas combina��es poss�veis (a < b) & (a > c) ou (a < b) & (a > d), e isso
% � exatamente o que a equa��o B2 descreve
%
% C�lculo : 
%
% Como eu j� expliquei, n�o vai haver c�lculo