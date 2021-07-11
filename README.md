# withreact

A demo of a Spring Boot application that also serves up a React application.

----------------------------------------------

My working notes:

https://reactjs.org/docs/create-a-new-react-app.html#create-react-app

npx create-react-app my-app
cd my-app
npm start

When you’re ready to deploy to production, running npm run build will create an optimized build of your app in the build folder. 

npm run build

to serve the static, built site:
npm install -g serve
serve -s build

information for packaging app with spring boot into a single WAR file:
https://medium.com/analytics-vidhya/how-to-package-your-react-app-with-spring-boot-41432be974bc
