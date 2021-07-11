# withreact

This project is a demo of a Spring Boot application that serves up a React application.  This lets me package up a Spring Boot application along with a React application in a single WAR file, suitable for deployment is cloud environments such as PCF.

There is a great tutorial [link](https://medium.com/analytics-vidhya/how-to-package-your-react-app-with-spring-boot-41432be974bc) that covers how to do efficient development that takes advantage of both Spring and React features to quickly reload changed work.  I did not implement this setup in this project, but I think it is worth mentioning for people looking for a robust solution.

## Spring Setup

My implementation is simple.  I used [Spring Initializr](https://start.spring.io/) to create a simple project, and modified it slightly to serve up JSPs.  (I like JSPs for web development - so powerful!)

## React Setup

For the React side, I used the instructions [found here](https://reactjs.org/docs/create-a-new-react-app.html#create-react-app) to create a simple React project.

To create and run the React project locally:
* npx create-react-app my-app
* cd my-app
* npm start

To build it:
* npm run build

To serve the static, built site:
* npm install -g serve
* serve -s build

## Putting It Together

Finally, I copied the contents of the "build" directory to this project's src/main/resources directory, and now the built React web app is hosted under /index.html.  If you visit /message, you fill find JSPs are served up just fine too, and if you visit /api/hello you will see REST is working as well.

## Todo's
1. Use the tutorial at the top to set up a robust dev environment.
1. Figure out how to fix the React build's paths so that they can be put into sub-directories below the "static" directory; currently, they have to go in that level or they do not work.