import asyncio

async def kinda():
    print('executed perfectly!')
    await trippin('text')

async def trippin(text):
    print(text)
    await asyncio.sleep(1)
    
asyncio.run(kinda())