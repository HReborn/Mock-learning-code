% Programa Questao17 , Calcula a quest�o 17
% Criado por Breno Felipe em 11/04/2017
%
% Vari�veis de entrada : 
%
% M = Maginitude de um terremoto na escala ritcher
% M1 = Magnitude de outro terremoto na escala ritcher
%
% Vari�veis de sa�da : 
%
% E = Energia liberada por um terremoto de acordo com a escala ritcher (Em joules)
% E1 = Energia de outro terremoto pela escala ritcher (Em joules)
% D = diferen�a entre as energias dos terremotos (Em joules)
%
% Valores :
%
M = 5.6;
M1 = 7.6;
%
% C�lculo : 
%
E = 10^4.4*10*(1.5*M);
E1 = 10^4.4*10*(1.5*M1);
D = E1 - E;
%
% Se��o disp : 
%
disp('A energia,na escala ritcher de um terremoto de magnitude 5.6 � : ');
disp(E);
disp('A energia,na escala ritcher de um terremoto de magnitude 7.6 � : ');
disp(E1);
disp('Logo, a quantidade de energia excedente que um terremoto')
disp('de magnitude 7.6 possui em rela��o a um de 5.6 � : ')
disp(D);