% Programa Questao2, Resolve a quest�o 2
% Criado por Breno Felipe
%
% Explica��o :
%
% Crie uma condi��o que n�o permita as ra�zes imagin�rias de serem
% computadas.
%
% Vari�veis de entrada :
%
% a = Vari�vel da quest�o
% b = Vari�vel da quest�o
% c = Vari�vel da quest�o
%
% Vari�veis de sa�da :
%
% t = Parte da raiz quadrada
% x1 = Raiz
% x2 = Raiz
% x = Raizes
%
% Par�metros :
%
a = [ 2 3 4 ];
b = [ 10 24 24 ];
c = [ 12 48 100 ];
%
% C�lculo :
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
disp('As ra�zes s�o :')
disp(x)