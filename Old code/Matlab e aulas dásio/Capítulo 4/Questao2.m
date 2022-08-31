% Programa Questao2, Resolve a questão 2
% Criado por Breno Felipe
%
% Explicação :
%
% Crie uma condição que não permita as raízes imaginárias de serem
% computadas.
%
% Variáveis de entrada :
%
% a = Variável da questão
% b = Variável da questão
% c = Variável da questão
%
% Variáveis de saída :
%
% t = Parte da raiz quadrada
% x1 = Raiz
% x2 = Raiz
% x = Raizes
%
% Parâmetros :
%
a = [ 2 3 4 ];
b = [ 10 24 24 ];
c = [ 12 48 100 ];
%
% Cálculo :
%
t = b.^2 - 4*a.*c;
for i = 1:3
    if t(i) >= 0
        x1(i) = (-b(i) + sqrt(t(i)))/(2*a(i));
        x2(i) = (-b(i) - sqrt(t(i)))/(2*a(i));
    else
        x1(i) = NaN;
        x2(i) = NaN;
    end
end
x = [ x1 ; x2 ];
%
% Display :
%
disp('As raízes são :')
disp(x)