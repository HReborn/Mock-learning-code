% Programa Questao22, Resolve a quest�o 22
% Criado por Breno Felipe
%
% Explica��o :
%
% Fa�a uma fun��o definida( Side Function ), dentro da pr�pria fun��o,
% n�o � necess�rio executar a side function, lembre-se de colocar o 
% intervalo para a fun��o fminbnd como entrada. Crie um handle da side
% function e minimize a side function.
%
% Vari�veis de entrada :
%
% x1 = Ponto inicial
% x2 = Ponto final
% z = Vari�vel qualquer
%
% Vari�veis de sa�da :
%
% b = Vari�vel qualquer da Side Function
% fun = Handle da Side Function
% a = X m�nimo da side Function
%
% C�lculo :
%
function a = Questao22(x1,x2)
  function b = trote(z)
  b = 20*z^2 - 200*z + 12;
  end
fun = @trote;
a = fminbnd(fun,x1,x2);
end