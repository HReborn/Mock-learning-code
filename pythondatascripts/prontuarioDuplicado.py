import pandas as pd
from pandas import DataFrame
from enum import Enum
from typing import cast

import os
print(os.getcwd())

class Coluna(Enum):
    NOME = 0
    NASCIMENTO = 1
    BOLETIM = 2
    PRONTUARIO = 3

def retornarDado(pandasDataFrame, linha, colunaEnum):
    df = cast(DataFrame, pandasDataFrame)
    line = cast(int, linha)
    column = cast(Enum, colunaEnum)
    return df.iloc[line, column.value]

# nome(0)/Nascimento(1)/Boletim(2)/prontuario(3)
path = "./TiMedReportExport.csv"
# por algum motivo aleatório, não consigo nomear as colunas corretamente
df=pd.read_csv(path, sep=';', usecols=['Alta', 'Nome','Sexo', 'Boletim',])
testePrint = f"""Nome: {retornarDado(df, 0, Coluna.NOME)}
Nascimento: {retornarDado(df, 0, Coluna.NASCIMENTO)}
Boletim: {retornarDado(df, 0, Coluna.BOLETIM)}
Prontuário: {retornarDado(df, 0, Coluna.PRONTUARIO)}"""
print(testePrint)
nomePaciente = retornarDado(df, 0, Coluna.NOME)
nascimentoPaciente = retornarDado(df, 0, Coluna.NASCIMENTO)
prontuarioPaciente = retornarDado(df, 0, Coluna.PRONTUARIO)
pacientes = [(nomePaciente, nascimentoPaciente, prontuarioPaciente)]
totalDfLines = len(df)-1
for linha in range(totalDfLines):
    prontuarioAtual = retornarDado(df, linha, Coluna.PRONTUARIO)
    print(f"Prontuário atual: {prontuarioAtual}")
    for paciente in pacientes:
        print(prontuarioAtual in paciente)
        if prontuarioAtual in paciente:
            break
        print(f"Adicionando prontuário na lista.")
        nomePaciente = retornarDado(df, linha, Coluna.NOME)
        nascimentoPaciente = retornarDado(df, linha, Coluna.NASCIMENTO)
        prontuarioAtual = cast(int, prontuarioAtual)
        pacientes.append((nomePaciente, nascimentoPaciente[:10], prontuarioAtual))
        break

outputColumns = ["Nome", "Nascimento", "Prontuário"]
outputDf = pd.DataFrame(pacientes, columns=outputColumns)
outputFile = "listaDePacientes.csv"
outputDf.to_csv(outputFile, index=False)



# verificados=0
# for prontAtual in range(totalDfLines):
#     for prontTeste in range(0,totalDfLines):
#         print("1")
#         if df.iloc[0,prontAtual] == df.iloc[0,prontTeste]:
#             print("achou um")
#             break