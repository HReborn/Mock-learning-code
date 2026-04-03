% Programa Questao 21, Resolve a questão 21
% Criado por Breno Felipe
%
% Explicação : 
%
% Só pegue o mesmo loop da função da questão 16 e mude o intervalo ( x )
%
% Variáveis de entrada : 
%
% x = Tempo ( s )
%
% Variáveis de saída : 
%
% y = Altura ( km )
%
% Parâmetros :
%
x = -2:0.25:6;
%
% Cálculo : 
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