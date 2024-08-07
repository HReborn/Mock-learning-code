from rest_framework.decorators import api_view
from rest_framework.response import Response

@api_view(['GET'])
def login(request):
    return Response({'message': 'logged in'})

@api_view(['GET'])
def register(request):
    return Response({'message': 'registered'})
