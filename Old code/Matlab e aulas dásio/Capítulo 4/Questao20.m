% Programa Questao20, Resolve a quest�o 20
% Breno Felipe
%
% Explica��o :
%
% Na letra A, n�o � preciso usar um la�o for, apenas um if usando a
% condicional estabelecida para o valor de w se x< d ou se x >= d.
% Agora, na letra A, foi feito com um n�mero s�, agora vamos expandir para
% um vetor, s� repetir o processo da letra A e depois plotar x X w;
%
% Vari�veis de entrada :
%
% w = Peso ( N )
% k1 = Constante da mola 1 ( N/m )
% k2 = Constante da mola 2 ( N/m )
% d = Dist�ncia entre a mola 2 e a plataforma ( m )
% wb = Peso, vetor ( N )
%
% Vari�veis de sa�da :
%
% x1 = Valor de x se x1 < d
% x2 = Valor de x na letra B se x2 < d
% x = Valor da dist�ncia na letra a
% xb = Valor de x na letra B
%
% C�lculo :
%
function x = Questao20(w,k1,k2,d)
if nargin < 2
    k1 = 10^4;k2 = 1.5*10^4;d = 0.1;
end
wb = linspace(0,3000,100);
x1 = w/k1;
x2 = wb/k1;
if x1 < d
    x = x1;
else
    x = (w + 2*k2*d)/(k1 + 2*k2);
end
for i = 1:100
    if x2(i) < d
        xb(i) = x2(i);
    else
        xb(i) = (wb(i) + 2*k2*d)/(k1 + 2*k2);
    end
end
plot(xb,wb)
end