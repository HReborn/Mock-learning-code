% Programa Questao18, Resolve a Questão 18
% Criado por Breno Felipe
%
% Explicação : 
%
% Tanto a letra A, quanto a letra B são os mesmos ( Mesma lógica )
% usar o else e depois abrir outro if é a mesma coisa que usar elseif
% diretamente. Para fazer a letra A é só pensar que se o if não satisfazer
% a condição, use alguma outra função ( else ) e abra outro if com outra
% condição
%
% Variáveis de entrada :
%
% x = Inputs entre zero e cem, Letra A
% z = Inputs entre zero e cem, Letra B
%
% Parâmetros e Cálculo :
%
for i = 1:5
    x(i) = input('Digite um número entre zero e cem : ');
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
    z(i) = input('Digite um número entre zero e cem : ');
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
% Já está embutido no programa