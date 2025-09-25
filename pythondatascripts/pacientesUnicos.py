# ESSE ARQUIVO IRÁ EFETIVAMENTE GERAR UM CSV COM OS CADASTROS ÚNICOS DOS USUÁRIOS
# E IDENTIFICAR OS CADASTROS QUE ESTÃO DUPLICADOS

import pandas as pd
from pandas import DataFrame
from enum import Enum
from typing import cast

class Coluna(Enum):
    NOME = 0
    NASCIMENTO = 1
    PRONTUARIO = 2

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

print(pacientesUnicos[1].Nome)

# duplicados = [(retornarDado(df, 0, Coluna.NOME), 
#                retornarDado(df, 0, Coluna.NASCIMENTO),
#                retornarDado(df, 0, Coluna.PRONTUARIO))]
# quantidadeDuplicados = 0
# totalDfLines = len(df)-1
# for busca in range(totalDfLines):
#     print(busca)
#     nascimentoBusca=retornarDado(df, busca, Coluna.NASCIMENTO)
    
#     for linha in range(busca,totalDfLines):
#         nascimentoAtual=retornarDado(df, linha, Coluna.NASCIMENTO)
#         prontuarioAtual=retornarDado(df, busca, Coluna.PRONTUARIO)
#         inseridoLista = nascimentoAtual in duplicados[quantidadeDuplicados]
#         nascIgualProntNaoInserido = nascimentoBusca == nascimentoAtual and prontuarioAtual not in duplicados[quantidadeDuplicados]
#         if nascIgualProntNaoInserido and inseridoLista:
#             print(f"duplicado com prontuarios {duplicados[quantidadeDuplicados][2:]}")
#             duplicados[quantidadeDuplicados] =  duplicados[quantidadeDuplicados] + (prontuarioAtual,)
            
#             print(duplicados[quantidadeDuplicados])
#             print("------------------------------")

#         if nascIgualProntNaoInserido and not inseridoLista:
#             nomeAtual = retornarDado(df, busca, Coluna.NOME)
#             duplicados.append((nomeAtual, nascimentoAtual, prontuarioAtual))
#             quantidadeDuplicados = quantidadeDuplicados + 1

#         if linha == totalDfLines and not inseridoLista:
#             nomeAtual = retornarDado(df, busca, Coluna.NOME)
#             duplicados.append((nomeAtual, nascimentoAtual, prontuarioAtual))
#             quantidadeDuplicados = quantidadeDuplicados + 1

# print(quantidadeDuplicados)