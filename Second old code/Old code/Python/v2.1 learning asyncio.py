import asyncio
import time
from asyncio.tasks import create_task

async def pega_info():
    print('startando o processo de pegar info')
    await asyncio.sleep(2)
    print('info recebida com sucesso')
    return {'info': 1}

async def mostrador_de_números():
    for i in range(10):
        print(i)
        await asyncio.sleep(0.25)
        #time.sleep(0.25)

async def principal():
    task1 = asyncio.create_task(pega_info())
    task2 = asyncio.create_task(mostrador_de_números())
    
    valor = await task1
    #await task2
    print(valor)


asyncio.run(principal())