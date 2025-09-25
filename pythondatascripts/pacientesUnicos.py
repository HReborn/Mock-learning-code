# ESSE ARQUIVO IRÁ EFETIVAMENTE GERAR UM CSV COM OS CADASTROS ÚNICOS DOS USUÁRIOS
# E IDENTIFICAR OS CADASTROS QUE ESTÃO DUPLICADOS

import pandas as pd
from pandas import DataFrame
from enum import Enum
from typing import cast

class Coluna(Enum):
    NOME = 0
    PRIMEIRA_LETRA_DO_NOME = 0

def retornarDado(pandasDataFrame, linha, colunaEnum):
    df = cast(DataFrame, pandasDataFrame)
    line = cast(int, linha)
    column = cast(Enum, colunaEnum)
    return str(df.iloc[line, column.value])

df=pd.read_csv("data/prontuariosUnicos.csv", usecols=["Nome", "Nascimento", "Prontuario"])

pacientesUnicos = list(df.itertuples(index=False))
pacientesUnicosSorted = sorted(pacientesUnicos, key=lambda paciente:paciente[Coluna.NOME.value])
sorted = pacientesUnicos == pacientesUnicosSorted
#pacientesUnicos.sort(key=lambda paciente:paciente[Coluna.NOME.value])

if not sorted:
    print("não está sorteado")
    outputColumns = ["Nome", "Nascimento", "Prontuario"]
    outputDf = pd.DataFrame(pacientesUnicosSorted, columns=outputColumns)
    outputFile = "data/prontuariosUnicos.csv"
    outputDf.to_csv(outputFile, index=False)

duplicados = []
linha = -1
tamanhoDuplicado = len(duplicados)
tamanhoListaPacientes = len(pacientesUnicos)
while linha < len(pacientesUnicos)-2:
    tamanhoListaPacientes = len(pacientesUnicos)
    if len(duplicados) == tamanhoDuplicado:
        linha+=1
    tamanhoDuplicado = len(duplicados)
    i=0 # iterador para rastrear quantas iterações se passaram no while para poder saber qual index usar no pop
    listaDuplicadosPorLetra = [linha]
    pacienteAtual = pacientesUnicos[linha]
    indexLetra = linha+1
    pacienteSeguinte = pacientesUnicos[indexLetra]

    while pacienteAtual.Nome[Coluna.PRIMEIRA_LETRA_DO_NOME.value] == pacienteSeguinte.Nome[Coluna.PRIMEIRA_LETRA_DO_NOME.value] and indexLetra < len(pacientesUnicos)-1:
        i+=1
        indexLetra = linha+i
        pacienteSeguinte=pacientesUnicos[indexLetra]
        # Se o nascimento for igual e se as três primeiras letras do nome forem iguais
        if pacienteAtual.Nascimento == pacienteSeguinte.Nascimento and pacienteAtual.Nome[:3] == pacienteSeguinte.Nome[:3]:
            listaDuplicadosPorLetra.append(indexLetra)
    
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