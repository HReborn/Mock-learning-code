% Programa Questao16x, resolve a questão 16
% Criado por Breno Felipe em 24/04/2017
%
% Entrada :
%
% S = Quantidade de reais ganhas por hora ( R$/H )
% H = Horas de trabalho
% Q = Quantidade de dispositivos produzidos
%
% Saída : 
%
% A = Lucro de cada tabalhador na semana
% B = O salário total pago
% C = O número total de dispositivos produzidos
% D = O custo médio para produzir um dispositivo
% E1 = O número total de horal trabalhadas
% E = O número médio de horas necessárias para produzir um dispositivo
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
% Cálculo :
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
% Seção disp :
%
disp('O lucro de cada tabalhador na semana é : ');
disp(A);
disp('O salário total pago é : ');
disp(B);
disp('O número total de dispositivos produzidos é : ');
disp(C);
disp('O custo médio para produzir um dispositivo é : ');
disp(D);
disp('O número médio de horas necessárias para produzir um dispositivo é : ');
disp(E);
disp('A quantidade de dispositivos por hora é : ');
disp(F);
disp('Logo,o mais eficiente e o menos eficiente são,respectivamente : O 3º e o 4º.')