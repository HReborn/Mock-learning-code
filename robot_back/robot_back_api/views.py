from django.shortcuts import render
from rest_framework.decorators import api_view
from rest_framework.response import Response

# Added by reborn below
@api_view(['GET'])
def hello_world(request):
    return Response({'message': 'ITS WORKINGGGGG!!!!!!!!'})
