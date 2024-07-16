from django.contrib import admin
from django.urls import path, include

urlpatterns = [
    path('admin/', admin.site.urls),
    path('robot/', include('robot_back_api.urls')),
    path('auth/', include('auth.urls'))
]