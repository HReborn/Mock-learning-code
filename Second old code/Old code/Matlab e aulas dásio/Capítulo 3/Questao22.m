% Programa Questao22, Resolve a questão 22
% Criado por Breno Felipe
%
% Explicação :
%
% Faça uma função definida( Side Function ), dentro da própria função,
% não é necessário executar a side function, lembre-se de colocar o 
% intervalo para a função fminbnd como entrada. Crie um handle da side
% function e minimize a side function.
%
% Variáveis de entrada :
%
% x1 = Ponto inicial
% x2 = Ponto final
% z = Variável qualquer
%
% Variáveis de saída :
%
% b = Variável qualquer da Side Function
% fun = Handle da Side Function
% a = X mínimo da side Function
%
% Cálculo :
%
function a = Questao22(x1,x2)
  function b = trote(z)
  b = 20*z^2 - 200*z + 12;
  end
fun = @trote;
a = fminbnd(fun,x1,x2);
end