import discord

client = discord.Client()

@client.event
async def on_ready():
    channel_lideres = client.get_channel(776148362570760234)
    await channel_lideres.send("First functionality of the bot. Baby steps.")

client.run('ODk3NTUyNTI0OTg1MzkzMTkz.YWXU7Q.dEDVd9IlvRfEnONjmmcv_mdNiq8')