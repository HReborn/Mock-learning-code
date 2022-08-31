% Programa Questao23, Resolve a questão 23
% Criado por Breno Felipe
%
% Explicação : 
%
% Primeiro tem que achar a distância mínima, você vai aplicar pitágoras
% para achar d em cada ponto, depois use a função min e ache dmin, após
% isso, use ou o for ou sem for para achar a posição do vetor d em que 
% d = dmin, com o índice use a indexação para achar o tempo e as
% coordenadas correspondentes à distância mínima tempo = d(índice)
% cx = x(índice), cy = y(índice), para achar o índice use ou o for usando
% uma operação lógica testando cada membro ou então use a função find para
% uma operação lógica diretamente no vetor e use find.
%
% Variáveis de entrada :
%
% t = Tempo definido da questão
% 
% Variáveis de saída :
%
% x = Coordenada X
% y = Coordenada Y
% d = Distância entre a origem
% dmin = Distância mínima
% u = Posição do vetor em que dmin = d
% q = Índice de u
% Cx = Coordenada x correspondente à distância mínima
% Cy = Coordenada y correspondente à distância mínima
% z = Posição do vetor em que cx = x
% r = Índice de z
% pt = Tempo correspondente à distância mínima
% j = Variável de indexação
% cx = Cx
% cy = Cy
% pt = Pt
%
% Parâmetros :
%
t = 0:0.25:4;
%
% Cálculo :
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
disp('O tempo em que o objeto está mais perto da origem :')
disp(Pt)
disp('O ponto em que ele está mais perto :')
disp('X')
disp(cx)
disp('Y')
disp(cy)
disp('A distância mínima é : ')
disp(dmin)