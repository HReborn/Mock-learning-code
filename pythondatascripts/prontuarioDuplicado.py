import pandas as pd
path = "data/TiMedReportExport.csv"
df=pd.read_csv(path, sep=';', usecols=['Alta', 'Nome','Sexo', 'Boletim',])
print(df.iloc[0,0])
verificados=0
for prontAtual in range(19515):
    for prontTeste in range(0,19515):
        print(prontTeste)
        if df.iloc[0,prontAtual] == df.iloc[0,prontTeste]:
            print("achou um")
            break