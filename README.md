Version 0.1

Functionalities:

1. Simple hello world
  Access on browser: localhost:8000/robot/hello-world/

How to run:
- Dowload files
- Open two terminals
  - On the first terminal type `python manage.py runserver` on the ./robot-back directory
  - On the second terminal type `npm start` on the ./robot-front directory
 
Prerequisites to run:
<br>(isn't ready yet for packaging so it's necessary to have the prerequisites below installed)
 - For the backend:
   - Install <a href="https://www.python.org/downloads/" target="_blank">python</a> and pip (python's installer will give you the choice to install both together)
   - Install <a href="https://nodejs.org/pt" target="_blank">nodejs</a> (when node is installed, `npm` comes with it too)
   - Install django (type `python -m pip install Django` on a terminal)
   - Install djangorestframeworkd and django-cors-headers (type `pip install djangorestframework django-cors-headers` on a terminal)
 - For the frontend:
   - Install axios (type `npm install axios` on a terminal)
