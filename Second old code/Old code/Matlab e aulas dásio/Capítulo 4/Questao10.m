% Programa Questao10, Resolve a questão 10
% Criado por Breno Felipe
%
% Explicação :
%
% Mesmo esquemas das duas questões anteriores, calcula a condiçã e soma o
% resultado, a única dificuldade aqui é achar a condição certa.
%
% Variáveis de entrada :
%
% pa = Preço A
% pb = Preço B
% pc = Preço C
%
% Variáveis de saída :
%
% a = Condição da letra A
% a1 = Soma de dias que a condição foi sanada na letra A
% b = Condição da letra B
% b1 = Soma de dias que a condição foi sanada na letra B
% c = Condição da letra C
% c1 = Soma de dias que a condição foi sanada na letra C
%
% Parâmetros :
%
pa = [ 19 18 22 21 25 19 17 21 27 29 ];
pb = [ 22 17 20 19 24 18 16 25 28 27 ];
pc = [ 17 13 22 23 19 17 20 21 24 28 ];
%
% Cálculo :
%
a = (pa>pb & pa>pc);
a1 = sum(a,2);
b = (pa>pb | pa>pc);
b1 = sum(b,2);
c = ((pb>pc & pa>pc & pb>pa) | (pc>pb & pa>pb & pc>pa));
c1 = sum(c,2);
%
% Display :
%
disp('Letra A')
disp(a1)
disp('Letra B')
disp(b1)
disp('Letra C')
disp(c1)