% Programa Questao24 , plota o gr�fico da quest�o 24
% Criado por Breno Felipe em 11/04/2017

% Vari�veis de entrada : 
%
% R = Raio ( Em polegadas )
% fi = �ngulo do cicl�ide ( Em radianos )
%
% Vari�veis de sa�da : 
%
% Y = Equa��o do cicl�ide
% X = Equa��o do cicl�ide
%
% Valores : 
%
R = 10;
fi = linspace(0,4*pi,100);
%
% C�lculo : 
%
Y = R*(1 - cos(fi));
X = R*(fi - sin(fi));
%
% Plot : 
%
plot(X,Y),title('Gr�fico do cicl�ide')