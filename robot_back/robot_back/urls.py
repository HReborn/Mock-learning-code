from django.contrib import admin
from django.urls import path, include

urlpatterns = [
    path('admin/', admin.site.urls),
    path('robot/', include('robot_back_api.urls')),
    path('robot-auth/', include('robot_auth.urls'))
]