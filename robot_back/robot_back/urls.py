from django.contrib import admin
from django.urls import path, include

urlpatterns = [
    path('admin/', admin.site.urls),
    path('robot/', include('apps.robot_back_api.urls')),
    path('robot-auth/', include('apps.robot_auth.urls'))
]