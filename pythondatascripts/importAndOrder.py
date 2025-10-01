import pandas as pd

df=pd.read_csv("AtendimentosSabin.csv", sep=';', usecols=['Alta', 'Nome','Sexo', 'Boletim',])
print("rodou")