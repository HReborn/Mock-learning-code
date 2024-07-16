from django.urls import path
from . import views

urlspatterns = [
    path('login/', views.login, name='login'),
    path('register/', views.register, name='register')
]