% Programa Questao40x, Resolve a questão 40
% Criado por Breno Felipe
%
% Explicação :
%
% A questão quer a diferença entre o volume de um gás ideal e a equação 
% de van der waals temos o volume do gás ideal, é preciso isolar o volume
% e calculá-lo a partir da equação de van der waals, o volume vai estar
% na forma de um polinômio, então calcule as possíveis raízes.
%
% Variáveis de Entrada :
%
% a = Correção da atração molecular
% b = Correção do volume das moléculas
% p = Pressão ( atm )
% r = Constante dos gases
% t = Temperatura ( K )
%
% Variáveis de saída :
%
% x = Polinômio que representa o volume
% v = Volume Van Der Vaals ( L )
%
% Parâmetros :
%
a = 6.49;
b = 0.0562;
p = 0.95;
r = 0.08206;
t = 300;
%
% Cálculo :
%
x = [ p (-b*p - r*t) a -a*b ];
v = roots(x);
%
% Dsplay :
% 
disp('Volume de gás ideal é : ')
disp(22.41)
disp('Volume Van Der Waals é ':)
disp(v)
disp('Diferença entre os volumes é :')
disp(abs(v-22.4))