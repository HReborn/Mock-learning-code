from django.db import models # type: ignore

# Create your models here.

class User(models.Model):
    id = models.AutoField(primary_key=True)
    username = models.CharField(20)
    password = models.CharField(64)
    role = models.BigIntegerField(64) # roles will come from rolesEnum.py
    active = models.BooleanField(default=True)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)