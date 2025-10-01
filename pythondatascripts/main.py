# processos
# - Primeiro lê
# - Converter para tuple??? (refactor)
# - Ordenar alfabeticamente para simplificar??? (refactor)
# - Gerar lista filtrando atendimentos e mantendo apenas os prontuários únicos
# - 
# - Cruzar a lista com si mesma para garantir que só há pacientes únicos
# - Se houver banco, cruza com o banco
# - Se houver banco, adiciona os determinados únicos no banco
# - Identifica os duplicados e gera o .csv (o programa termina quando gera o .csv)

from pacientesUnicos import removerProntuariosDuplicados
from prontuariosUnicos import removerBoletinsDuplicados

removerBoletinsDuplicados("TiMedReportExport.csv")
removerProntuariosDuplicados("data/prontuariosUnicos.csv")
