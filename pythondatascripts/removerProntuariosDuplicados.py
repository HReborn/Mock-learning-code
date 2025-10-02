# ESSE ARQUIVO IRÁ EFETIVAMENTE GERAR UM CSV COM OS CADASTROS ÚNICOS DOS USUÁRIOS
# E IDENTIFICAR OS CADASTROS QUE ESTÃO DUPLICADOS

import pandas as pd
from enum import Enum

class Coluna(Enum):
    NOME = 0
    PRIMEIRA_LETRA_DO_NOME = 0


def removerProntuariosDuplicados(path: str):
    df=pd.read_csv(path, usecols=["Nome", "Nascimento", "Prontuario"])
    pacientesUnicos = list(df.itertuples(index=False))
    pacientesUnicosOrdemAlfabetica = sorted(pacientesUnicos, key=lambda paciente:paciente[Coluna.NOME.value])

    # atributo:
    # Recomendado de 2-4 a diferença entre 2,3 e 4 é quase igual. 
    # Quanto menor o número, menor a chance de perder os casos em que as primeiras N letras foram digitadas erradas.
    numeroDeLetrasIniciaisParaDeterminarSeDuplicado = 3



    # É necessário estar em ordem alfabética para otimizar a busca.
    # O comparativo é feito em blocos de a-z de acordo com a letra inicial do nome do paciente
    ordemAlfabetica = pacientesUnicos == pacientesUnicosOrdemAlfabetica
    if not ordemAlfabetica:
        pacientesUnicos = pacientesUnicosOrdemAlfabetica
        outputColumns = ["Nome", "Nascimento", "Prontuario"]
        outputDf = pd.DataFrame(pacientesUnicosOrdemAlfabetica, columns=outputColumns)
        outputFile = "data/prontuariosUnicos.csv"
        outputDf.to_csv(outputFile, index=False)

    duplicados = []; linha = -1
    tamanhoDuplicado = len(duplicados)

    # é -2 por causa do index do paciente seguinte. o index final é len -1
    # com a verificação do paciente seguinte tem que ser len-2
    while linha < len(pacientesUnicos)-2:

        # O paciente atual sempre será removido da lista se for dado como duplicado
        # quando isso acontecer, o index i+1 do próximo paciente se tornará (i+1)-1
        # por causa da remoção do paciente atual. Logo, quando tiver uma remoção, não é necessário subir o número da lista.
        if len(duplicados) == tamanhoDuplicado:
            linha+=1
        tamanhoDuplicado = len(duplicados)
        
        # iterador para rastrear quantas iterações se passaram no while para poder saber qual index usar no pop
        i=0
        indexLetra = linha+1 # paciente seguinte deve ser linha+1
        
        listaDuplicadosPorLetra = [linha]
        pacienteAtual = pacientesUnicos[linha]
        pacienteSeguinte = pacientesUnicos[indexLetra]

        while pacienteAtual.Nome[Coluna.PRIMEIRA_LETRA_DO_NOME.value] == pacienteSeguinte.Nome[Coluna.PRIMEIRA_LETRA_DO_NOME.value] and indexLetra < len(pacientesUnicos)-1:
            i+=1
            indexLetra = linha+i
            pacienteSeguinte=pacientesUnicos[indexLetra]
            nascimentoIgualComNLetrasIniciaisIguais = pacienteAtual.Nascimento == pacienteSeguinte.Nascimento and pacienteAtual.Nome[:numeroDeLetrasIniciaisParaDeterminarSeDuplicado] == pacienteSeguinte.Nome[:numeroDeLetrasIniciaisParaDeterminarSeDuplicado]
            if nascimentoIgualComNLetrasIniciaisIguais:
                listaDuplicadosPorLetra.append(indexLetra)
        

        # o motivo de fazer o pop após cada letra é para evitar verificar pacientes que já foram determinados como duplicados
        # em uma escala menor isso não importa tanto e. com relação ao custo computacional, importaria mais em um banco de dados com
        # uma quantidade muito grande de pacientes duplicados.
        # as duas implementações são plausíveis.
        popNumber = 0
        if len(listaDuplicadosPorLetra) > 1:
            for index in listaDuplicadosPorLetra:
                duplicados.append(pacientesUnicos.pop(index-popNumber))
                popNumber+=1
        listaDuplicadosPorLetra.clear()

    outputColumns = ["Nome", "Nascimento", "Prontuario"]
    outputDf = pd.DataFrame(duplicados, columns=outputColumns)
    outputFile = "data/prontuariosDuplicados.csv"
    outputDf.to_csv(outputFile, index=False)
    print("pacientesUnicos rodou, completou e fez o arquivo")