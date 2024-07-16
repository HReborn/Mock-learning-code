from django.shortcuts import render
from rest_framework.decorators import api_view
from rest_framework.response import Response

# Added by reborn below
@api_view(['GET'])
def hello_world(request):
    return Response({'message': 'ITS WORKINGGGGG!!!!!!!!'})

@api_view(['GET'])
def login(request):
    return Response({'message': 'logged in'})

@api_view(['GET'])
def register(request):
    return Response({'message': 'registered'})