Version 0.2.3-alpha

How to use the app:

Front access: https://robot-qsif.onrender.com
<br>
Back access: https://inadequate-maryjane-rebornkhr-ab1701c3.koyeb.app

Additional sources:

 - https://www.w3schools.com/react/react_router.asp
 - https://medium.com/@devsumitg/how-to-connect-reactjs-django-framework-c5ba268cb8be
 - <a href="https://www.youtube.com/watch?v=gdhiA6wObw0&ab_channel=pythonando">How to make a login page with django<a/>
 - https://blog.logrocket.com/9-ways-deploy-react-app-free/#render
   - had to explicitily create a `robot_front/build` folder to allow render to build and had to add `npm run build` build command
 - <a href="https://www.koyeb.com/docs/deploy/django">How to deploy django on koyeb<a/>
   - had to install waitress instead of guinicorn
   - had to set a build command `waitress-serve --port=8000 robot_back.wsgi:application` and match to the exposed port (8000) on koyeb's settings.
 - <a href="https://neon.tech/docs/guides/django-migrations">How to connect django with neon postgres database</a>
   - Had to use .properties instead of .env https://www.geeksforgeeks.org/read-properties-file-using-jproperties-in-python/
