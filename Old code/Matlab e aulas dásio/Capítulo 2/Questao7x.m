% Programa Questao7x, resolve a quest�o 7
% Criado por Breno Felipe em 24/04/2017
%
% Entrada :
%
% x = Arranjo da quest�o
% y = Arranjo da quest�o
% z = Arranjo da quest�o
%
% Sa�da : 
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
% C�lculo :
%
nx = norm(x);
ny = norm(y);
nz = norm(z);
ax = abs(x);
ay = abs(y);
az = abs(z);

% Se��o disp :
%
disp('O comprimento e o valor absoluto de x s�o : ');
disp(nx);
disp(ax);
disp('O comprimento e o valor absoluto de y s�o : ');
disp(ny);
disp(ay);
disp('O comprimento e o valor absoluto de z s�o : ');
disp(nz);
disp(az);