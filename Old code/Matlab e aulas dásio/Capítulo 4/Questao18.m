% Programa Questao18, Resolve a Quest�o 18
% Criado por Breno Felipe
%
% Explica��o : 
%
% Tanto a letra A, quanto a letra B s�o os mesmos ( Mesma l�gica )
% usar o else e depois abrir outro if � a mesma coisa que usar elseif
% diretamente. Para fazer a letra A � s� pensar que se o if n�o satisfazer
% a condi��o, use alguma outra fun��o ( else ) e abra outro if com outra
% condi��o
%
% Vari�veis de entrada :
%
% x = Inputs entre zero e cem, Letra A
% z = Inputs entre zero e cem, Letra B
%
% Par�metros e C�lculo :
%
for i = 1:5
    x(i) = input('Digite um n�mero entre zero e cem : ');
    if x(i) >= 90
        disp('A')
    else 
        if x(i) >= 80 && x(i) <= 89
            disp('B')
        else
            if x(i) >= 70 && x(i) <= 79
                disp('C')
            else
                if x(i) >= 60 && x(i) <= 69
                    disp('D')
                else
                    if x(i) < 60
                        disp('F')
                    end
                end
            end
        end
    end
end
for t = 1:5
    z(i) = input('Digite um n�mero entre zero e cem : ');
    if z(i) >= 90
        disp('A')
    elseif z(i) >= 80 && z(i) <= 89
        disp('B')
    elseif z(i) >= 70 && z(i) <= 79
        disp('C')
    elseif z(i) >= 60 && z(i) <= 69
        disp('D')
    else
        disp('F')
    end
end
%
% Display :
% 
% J� est� embutido no programa