import pandas as pd

df=pd.read_csv("AtendimentosSabin.csv", sep=';', index_col=None, usecols=["Celular"])
print(df.head)