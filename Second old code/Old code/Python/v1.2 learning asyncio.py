import asyncio

async def kinda():
    task = asyncio.create_task(final())
    print('''The program is being executed perfectly!
Now, it is going to the next step. Wait patiently.''')
    await trippin('Spartacus é topzera!!!')
    print('Now it is totally finished and you can go on.')

async def trippin(text):
    await asyncio.sleep(10)
    print('Busca concluída com sucesso e o resultado é:')
    print(text)

async def final():
    print('Esperando concluir a busca.')

asyncio.run(kinda())
