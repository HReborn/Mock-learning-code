% Programa Questao16x, resolve a quest�o 16
% Criado por Breno Felipe em 24/04/2017
%
% Entrada :
%
% S = Quantidade de reais ganhas por hora ( R$/H )
% H = Horas de trabalho
% Q = Quantidade de dispositivos produzidos
%
% Sa�da : 
%
% A = Lucro de cada tabalhador na semana
% B = O sal�rio total pago
% C = O n�mero total de dispositivos produzidos
% D = O custo m�dio para produzir um dispositivo
% E1 = O n�mero total de horal trabalhadas
% E = O n�mero m�dio de horas necess�rias para produzir um dispositivo
% F = A quantidade de dispositivos por hora
% F1 = O trabalhador mais eficiente ( O maior F )
% F2 = O trabalhador menos eficiente ( O menor F )
%
% Valores : 
%
S = [5 5.5 6.5 6 6.25];
H = [40 43 37 50 45];
Q = [1000 1100 1000 1200 1100];
%
% C�lculo :
%
A = S.*H;
B = sum(A,2);
C = sum(Q,2);
D = C/B;
E1 = sum(H,2);
E = C/E1;
F = Q./H;
F1 = max(F);
F2 = min(F);
%
% Se��o disp :
%
disp('O lucro de cada tabalhador na semana � : ');
disp(A);
disp('O sal�rio total pago � : ');
disp(B);
disp('O n�mero total de dispositivos produzidos � : ');
disp(C);
disp('O custo m�dio para produzir um dispositivo � : ');
disp(D);
disp('O n�mero m�dio de horas necess�rias para produzir um dispositivo � : ');
disp(E);
disp('A quantidade de dispositivos por hora � : ');
disp(F);
disp('Logo,o mais eficiente e o menos eficiente s�o,respectivamente : O 3� e o 4�.')