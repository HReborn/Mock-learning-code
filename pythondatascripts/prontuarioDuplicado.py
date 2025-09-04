import pandas as pd
path = "data/TiMedReportExport.csv"
df=pd.read_csv(path, sep=';', usecols=['Alta', 'Nome','Sexo', 'Boletim',])
print(df.iloc[0,0])