% Programa Questao23, Resolve a quest�o 23
% Criado por Breno Felipe
%
% Explica��o : 
%
% Primeiro tem que achar a dist�ncia m�nima, voc� vai aplicar pit�goras
% para achar d em cada ponto, depois use a fun��o min e ache dmin, ap�s
% isso, use ou o for ou sem for para achar a posi��o do vetor d em que 
% d = dmin, com o �ndice use a indexa��o para achar o tempo e as
% coordenadas correspondentes � dist�ncia m�nima tempo = d(�ndice)
% cx = x(�ndice), cy = y(�ndice), para achar o �ndice use ou o for usando
% uma opera��o l�gica testando cada membro ou ent�o use a fun��o find para
% uma opera��o l�gica diretamente no vetor e use find.
%
% Vari�veis de entrada :
%
% t = Tempo definido da quest�o
% 
% Vari�veis de sa�da :
%
% x = Coordenada X
% y = Coordenada Y
% d = Dist�ncia entre a origem
% dmin = Dist�ncia m�nima
% u = Posi��o do vetor em que dmin = d
% q = �ndice de u
% Cx = Coordenada x correspondente � dist�ncia m�nima
% Cy = Coordenada y correspondente � dist�ncia m�nima
% z = Posi��o do vetor em que cx = x
% r = �ndice de z
% pt = Tempo correspondente � dist�ncia m�nima
% j = Vari�vel de indexa��o
% cx = Cx
% cy = Cy
% pt = Pt
%
% Par�metros :
%
t = 0:0.25:4;
%
% C�lculo :
%
x = 5*t - 10;
y = 25*t.^2 + 120*t + 144;
d = sqrt(x.^2 + y.^2);
dmin = min(d);
%
% Sem for :
%
u = dmin == d;
q = find(u);
Cx = x(q);
Cy = y(q);
z = Cx == x;
r = find(z);
Pt = t(r);
%
% Com for :
%
j = 1;
for i = 1:length(t)
    if dmin == d(i)
        cx(j) = x(i);
        cy(j) = y(i);
        pt(j) = t(i);
        j = j+1;
    end
end
%
% Display :
%
disp('O tempo em que o objeto est� mais perto da origem :')
disp(Pt)
disp('O ponto em que ele est� mais perto :')
disp('X')
disp(cx)
disp('Y')
disp(cy)
disp('A dist�ncia m�nima � : ')
disp(dmin)