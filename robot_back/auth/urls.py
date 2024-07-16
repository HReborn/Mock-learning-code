from django.urls import path
from . import views

urlspatterns = [
    path('login/', views.login, name='login'),
    path('cadastro/', views.cadastro, name='cadastro')
]