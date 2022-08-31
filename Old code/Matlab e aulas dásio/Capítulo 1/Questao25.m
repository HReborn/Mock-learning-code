% Programa Questao25 , Resolve a quest�o 25
% Criado por Breno Felipe em 11/04/2017

% Vari�veis de entrada : 
%
% W = Largura do ret�ngulo ( Em metros )
% A = �rea da figura ( Em metros^2 )
%
% Vari�veis de sa�da : 
%
% D = Lado do tri�ngulo
% T = �rea do tri�ngulo
% L = Comprimento do ret�ngulo
%  
%
% Valores : 
%
W = 6;
A = 80;
%
% C�lculo : 
%
D = sind(45)*W;
T = D^2/2;
L = (A - T)/W;
%
% Se��o disp : 
%
disp('A �rea total da figura � a �rea do ret�ngulo mais a �rea do tri�ngulo');
disp('A �rea do tri�ngulo � D^2/2, achamos D por uma rela��o trigonom�trica');
disp('Sendo sen(45�)=D/W,dizemos que D = sen(45�)*W');
disp('Como a �rea do ret�ngulo � W*L e a �rea total � a soma dos dois');
disp('Podemos dizer que L = (Atot - Atri)/W, e assim achamos L.');
disp(L);