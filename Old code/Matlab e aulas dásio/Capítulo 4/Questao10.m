% Programa Questao10, Resolve a quest�o 10
% Criado por Breno Felipe
%
% Explica��o :
%
% Mesmo esquemas das duas quest�es anteriores, calcula a condi�� e soma o
% resultado, a �nica dificuldade aqui � achar a condi��o certa.
%
% Vari�veis de entrada :
%
% pa = Pre�o A
% pb = Pre�o B
% pc = Pre�o C
%
% Vari�veis de sa�da :
%
% a = Condi��o da letra A
% a1 = Soma de dias que a condi��o foi sanada na letra A
% b = Condi��o da letra B
% b1 = Soma de dias que a condi��o foi sanada na letra B
% c = Condi��o da letra C
% c1 = Soma de dias que a condi��o foi sanada na letra C
%
% Par�metros :
%
pa = [ 19 18 22 21 25 19 17 21 27 29 ];
pb = [ 22 17 20 19 24 18 16 25 28 27 ];
pc = [ 17 13 22 23 19 17 20 21 24 28 ];
%
% C�lculo :
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