Version 0.2.0

How to use the app:

Access on browser: `https://robot-qsif.onrender.com`

How to run:
- Dowload files
- Open two terminals
  - On the first terminal type `python manage.py runserver` on the ./robot-back directory
  - On the second terminal type `npm start` on the ./robot-front directory
 
Prerequisites to run:
<br>(isn't ready yet for packaging so it's necessary to have the prerequisites below installed)

 - Install <a href="https://www.python.org/downloads/" target="_blank">python</a> and pip (python's installer will give you the choice to install both together)
 - Install <a href="https://nodejs.org/pt" target="_blank">nodejs</a> (when node is installed, `npm` comes with it too)
 - Install django (type `python -m pip install Django` on a terminal)
 - Install djangorestframework and django-cors-headers (type `pip install djangorestframework django-cors-headers` on a terminal)

Additional sources:

 - https://www.w3schools.com/react/react_router.asp
 - https://medium.com/@devsumitg/how-to-connect-reactjs-django-framework-c5ba268cb8be
 - <a href="https://www.youtube.com/watch?v=gdhiA6wObw0&ab_channel=pythonando">How to make a login page with django<a/>
 - https://blog.logrocket.com/9-ways-deploy-react-app-free/#render
   - had to explicitily create a `robot_front/build` folder to allow render to build and had to add `npm run build` build command
