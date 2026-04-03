# Section 1: Testing string.split and string.split

#text_sample = '        If you gonna be my lover, you must as well be my friend.        '
#strip_variant = text_sample.strip() # it'll clear all white spaces in the end and the beginning or some other character. the white space are default.
#split_variant = text_sample.split() # it'll return a list variable
#list_indexing_variant = split_variant[0] # it'll return th first element: if
#print(text_sample)
#print(strip_variant)
#print(split_variant)
#print(list_indexing_variant) 

# Section 2: String formatting

# Section 2.1: printf-style

# adjetivo = 'bocó'
# frase_1 = 'Você é %s' % adjetivo # botar no lugar de %s
# # print(frase_1) # mostra como pode substituir e botar dentro

# altura_blocos = 256
# frase_2 = 'O minecraft tem uma altura de %s blocos. Isso limita muito as coisas.' % altura_blocos # converte uma variael integer para string. é util quando você não sabe o tipo de variável que quer converter.
# print(frase_2) # mostra como converter uma integral ou qualquer outro tipo

# altura_blocos = 256
# adjetivo = 'bocó'
# frase_3 = 'Sorteio pronto! A quantidade de pessoas %ss sorteadas são: %i pessoas.' % (adjetivo, altura_blocos)
# print(frase_3) # mostra como incluir multiplas variáveis. %i é usado pra integral.

# altura_blocos = 256
# adjetivo = 'bocó'
# frase_4 = '''Pra ficar mais fácil, também podemos dizer que o %(adjetivo_boco)s conseguiu montar um castelo de cartas com 
# %(altura_total_das_cartas)i centímetros de altura. É incrível!!''' % {'adjetivo_boco': adjetivo, 'altura_total_das_cartas': altura_blocos}
# print(frase_4) # pra ficar menos complicado, dá pra botar o nome do que vai ser inserido dentro, também.

# Section 2.2: .format()

# day_number = 17
# winner_name = 'Locke'
# frase_1 = '''O número da sorte de hoje é: {} e o ganhador do dia é: {}. 
# Parabéns ao {}.'''.format(day_number, winner_name, winner_name)
# print(frase_1)

# day_number = 17
# winner_name = 'Locke'
# frase_2 = '''O número da sorte de hoje é: {número} e o ganhador do dia é: {nome}. 
# Parabéns ao {nome}.'''.format(número=day_number, nome=winner_name)
# print(frase_2)

# day_number = 17
# winner_name = 'Locke'
# frase_3 = '''O número da sorte de hoje é: {número} e o ganhador do dia é: {nome}. 
# Parabéns ao {nome}.'''.format(**{'número': day_number, 'nome': winner_name})
# print(frase_3)

# day_number = 17
# winner_name = 'Locke'
# frase_4 = '''O número da sorte de hoje é: {número} e o ganhador do dia é: {nome}. 
# Parabéns ao {nome}.'''
# frase_4_1 = frase_4.format(número=day_number, nome=winner_name)
# print(frase_4_1)

# mode_1 = '{:<30}'.format('alinhado à esquerda')
# mode_2 = '{:>30}'.format('alinhado à direita')
# mode_3_1 = 'centralizado'
# mode_3 = '{:^30}'.format(mode_3_1)
# mode_4 = '{example:^30}'.format(example='centered')
# print(mode_1)
# print(mode_2)
# print(mode_3)
# print(mode_4)

# Section 2.3: Formatação com fstring

