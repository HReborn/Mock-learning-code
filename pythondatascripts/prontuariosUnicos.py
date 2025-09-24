# ESSE ARQUIVO É O ARQUIVO INICIAL QUE IRÁ GERAR UM .CSV COM PRONTUÁRIOS ÚNICOS. 
# OU SEJA, O MESMO PRONTUÁRIO PODE TER MAIS DE UM BOLETIM. ESSE CÓDIGO IRÁ RECEBER O ARQUIVO ORIGINAL
# E IRÁ CONVERTER EM UM OUTRO ARQUIVO COM AS COLUNAS [NOME, NASCIMENTO, PRONTUÁRIO]

import pandas as pd
from pandas import DataFrame
from enum import Enum
from typing import cast

class Coluna(Enum):
    NOME = 0
    NASCIMENTO = 1
    BOLETIM = 2
    PRONTUARIO = 3

def retornarDado(pandasDataFrame, linha, colunaEnum):
    df = cast(DataFrame, pandasDataFrame)
    line = cast(int, linha)
    column = cast(Enum, colunaEnum)
    return str(df.iloc[line, column.value])


# por algum motivo aleatório, não consigo nomear as colunas corretamente
# nome(0)/Nascimento(1)/Boletim(2)/prontuario(3)
df=pd.read_csv("TiMedReportExport.csv", sep=';', usecols=['Alta', 'Nome','Sexo', 'Boletim',])
pacientes = [( retornarDado(df, 0, Coluna.NOME),
               retornarDado(df, 0, Coluna.NASCIMENTO)[:10],
               retornarDado(df, 0, Coluna.PRONTUARIO))]
totalDfLines = len(df)-1
contagem = 0
for linha in range(totalDfLines):
    prontuarioAtual = retornarDado(df, linha, Coluna.PRONTUARIO)
    numeroPacientesIdentificados = len(pacientes)
    i=-1
    for paciente in pacientes:
        i=i+1
        if prontuarioAtual in paciente:
            contagem = contagem+1
            print(f"prontuário {prontuarioAtual} já é {prontuarioAtual in paciente} na linha {i} com {contagem} duplicados")
            break
        
        if i == numeroPacientesIdentificados-1:
            nomePaciente = retornarDado(df, linha, Coluna.NOME)
            nascimentoPaciente = retornarDado(df, linha, Coluna.NASCIMENTO)
            pacientes.append((nomePaciente, nascimentoPaciente[:10], prontuarioAtual))
            break

outputColumns = ["Nome", "Nascimento", "Prontuario"]
outputDf = pd.DataFrame(pacientes, columns=outputColumns)
outputFile = "prontuariosUnicos.csv"
outputDf.to_csv(outputFile, index=False)
