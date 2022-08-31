% Programa Questao15, Resolve a questão 15
% Criado por Breno Felipe
%
% Explicação :
%
% Só um joguinho de operadores.
% Letra A1 : (a == b) & ((b == c) | (a == c))
% a=b e ((b=c) ou (a=c))
% para ser verdadeiro, a tem que ser igual a b e também ou b é igual a c
% ou a é igual a c
% Letra A2 : (a == b) | ((b == c) & (a == c ))
% a=b ou (b=c e a=c)
% para ser verdadeiro, apenas uma condição tem que ser sanada a=b ou b=c e
% também a=c
% como o A1 requer duas condições a serem sanadas, e A2 requerem duas,então
% as equações não são equivalentes
% Letra B1 : (a < b) & ((a > c) | (a > d))
% duas condições precisam ser sanadas, (a < b) e também a segunda opção em
% que apenas uma das duas precisam ser sanadas (a > c) ou (a > d)
% Letra B2 : (a < b) % (a > c) | ((a < b) & (a > d))
% aqui fica meio confuso, pois você precisa saber a ordem em que as
% operações atuam, como as operações lógicas tem a mesma preferência, então
% o privilégio vi da esquerda para a direita, é como se escrevêssemos : 
% ((a < b) & (a > c)) | ((a < b) & (a > d))
% as duas equações B1 e B2 são iguais pois em B1, (a < b) é verdadeiro, mas
% (a > c) | (a > d), apenas um dos dois pode ser verdadeiro, então temos
% duas combinações possíveis (a < b) & (a > c) ou (a < b) & (a > d), e isso
% é exatamente o que a equação B2 descreve
%
% Cálculo : 
%
% Como eu já expliquei, não vai haver cálculo