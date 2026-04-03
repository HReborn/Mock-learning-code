% Programa Questao7, Resolve a questão 7
% Criado por Breno Felipe
%
% Explicação :
%
% Coloque os inputs, como indicado, e jogue na fómula
%
% Vaiáveis de entrada :
%
% u = Coeficiente de atrito
% b = Ângulo ( rad )
% f2 = Força do cinto ( N )
%
% Variáveis de saída :
%
% f1 = Relação entre as forças do cinto em cada parte do cilindro ( N )
%
% Parâmetros
%
u = input('coeficiente : ');
b = input('angulo em rad : ');
f2 = input('F2 : ');
%
% Cálculo :
%
f1 = f2*exp(u*b);
%
% Display :
%
disp('Relação entre as forças do cinto em cada parte do cilindro : ')
disp(f2)