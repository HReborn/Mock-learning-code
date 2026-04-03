from rest_framework import serializers
from .models import User

class UserSerializer(serializers.ModelSerializer):
    model=User
    #field=('username', 'password')
    field='__all__'