% Programa Questao7, Resolve a quest�o 7
% Criado por Breno Felipe
%
% Explica��o :
%
% Coloque os inputs, como indicado, e jogue na f�mula
%
% Vai�veis de entrada :
%
% u = Coeficiente de atrito
% b = �ngulo ( rad )
% f2 = For�a do cinto ( N )
%
% Vari�veis de sa�da :
%
% f1 = Rela��o entre as for�as do cinto em cada parte do cilindro ( N )
%
% Par�metros
%
u = input('coeficiente : ');
b = input('angulo em rad : ');
f2 = input('F2 : ');
%
% C�lculo :
%
f1 = f2*exp(u*b);
%
% Display :
%
disp('Rela��o entre as for�as do cinto em cada parte do cilindro : ')
disp(f2)