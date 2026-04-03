% Programa Questao7x, resolve a questão 7
% Criado por Breno Felipe em 24/04/2017
%
% Entrada :
%
% x = Arranjo da questão
% y = Arranjo da questão
% z = Arranjo da questão
%
% Saída : 
%
% nx = Norma de x
% ny = Norma de y
% nz = Norma de z
% ax = Valor absoluto de x
% ay = Valor absoluto de y
% az = Valor absoluto de z
%
% Valores : 
%
x = [2 4 7];
y = [2 -4 7];
z = [5 + 3i,-3 + 4i,2 - 7i];
%
% Cálculo :
%
nx = norm(x);
ny = norm(y);
nz = norm(z);
ax = abs(x);
ay = abs(y);
az = abs(z);

% Seção disp :
%
disp('O comprimento e o valor absoluto de x são : ');
disp(nx);
disp(ax);
disp('O comprimento e o valor absoluto de y são : ');
disp(ny);
disp(ay);
disp('O comprimento e o valor absoluto de z são : ');
disp(nz);
disp(az);