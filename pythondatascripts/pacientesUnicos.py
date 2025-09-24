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

df=pd.read_csv("prontuariosUnicos.csv", usecols=["Nome", "Nascimento", "Prontuario"])

duplicados = [()]
quantidadeDuplicados = 0
totalDfLines = len(df)-1
for busca in range(totalDfLines):
    print(busca)
    nascimentoBusca=retornarDado(df, busca, Coluna.NASCIMENTO)
    
    for linha in range(busca+1,totalDfLines):
        nascimentoAtual=retornarDado(df, busca, Coluna.NASCIMENTO)
        inseridoLista = nascimentoAtual in duplicados[quantidadeDuplicados]
        if nascimentoBusca == nascimentoAtual and inseridoLista:
            prontuarioAtual=retornarDado(df, busca, Coluna.PRONTUARIO)
            duplicados[quantidadeDuplicados] + (prontuarioAtual,)
            quantidadeDuplicados = quantidadeDuplicados + 1

        if nascimentoBusca == nascimentoAtual and not inseridoLista:
            nomeAtual = retornarDado(df, busca, Coluna.NOME)
            prontuarioAtual=retornarDado(df, busca, Coluna.PRONTUARIO)
            duplicados.append((nomeAtual, nascimentoAtual, prontuarioAtual))

        if linha == totalDfLines and not inseridoLista:
            nomeAtual = retornarDado(df, busca, Coluna.NOME)
            prontuarioAtual=retornarDado(df, busca, Coluna.PRONTUARIO)
            duplicados.append((nomeAtual, nascimentoAtual, prontuarioAtual))

print(duplicados)