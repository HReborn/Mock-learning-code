% Programa Questao25 , Resolve a questão 25
% Criado por Breno Felipe em 11/04/2017

% Variáveis de entrada : 
%
% W = Largura do retângulo ( Em metros )
% A = Área da figura ( Em metros^2 )
%
% Variáveis de saída : 
%
% D = Lado do triângulo
% T = Área do triângulo
% L = Comprimento do retângulo
%  
%
% Valores : 
%
W = 6;
A = 80;
%
% Cálculo : 
%
D = sind(45)*W;
T = D^2/2;
L = (A - T)/W;
%
% Seção disp : 
%
disp('A área total da figura é a área do retângulo mais a área do triângulo');
disp('A área do triângulo é D^2/2, achamos D por uma relação trigonométrica');
disp('Sendo sen(45º)=D/W,dizemos que D = sen(45º)*W');
disp('Como a área do retângulo é W*L e a área total é a soma dos dois');
disp('Podemos dizer que L = (Atot - Atri)/W, e assim achamos L.');
disp(L);