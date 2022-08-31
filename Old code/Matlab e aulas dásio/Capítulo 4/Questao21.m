% Programa Questao 21, Resolve a quest�o 21
% Criado por Breno Felipe
%
% Explica��o : 
%
% S� pegue o mesmo loop da fun��o da quest�o 16 e mude o intervalo ( x )
%
% Vari�veis de entrada : 
%
% x = Tempo ( s )
%
% Vari�veis de sa�da : 
%
% y = Altura ( km )
%
% Par�metros :
%
x = -2:0.25:6;
%
% C�lculo : 
%
for i = 1:length(x)
    if x(i) < -1
        y(i) = exp(x(i) + 1);
    elseif x(i) >= 5
        y(i) = 10*(x(i) - 5) + 1;
    else
        y(i) = 2 + cos(pi*x(i));
    end
end
plot(x,y),xlabel('Tempo (s)'),ylabel('Altura (km)')