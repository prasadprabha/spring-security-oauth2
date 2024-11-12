
# How to Use OAuth2 in project :

Now Spring as a framework provides the feature of OAuth to the developer via its various Maven and Gradle dependencies. To use the OAuth2 in your project, follow the steps below:- 

1. Create a new project(Spring Starter) with spring web, spring-security dependency, and oauth2 auto-configure dependency.
2. Head to the default class. Add the annotation @EnableOAuth2Sso. This allows us to Enable Oauth in our application.
3. Now, when an Oauth call is made, we need to tell the Client(which is a service and here Github) to look somewhere in order to know what applications can be used to make the OAuth calls. As such, we 4. configure our “application. Properties” file to “applications.yml”.
5. We also need various permissions from applications in order to use their security in our app. Here as we use Github, head to this page.
6. Select “New OAuth App” and then the “Register a new OAuth application” page is presented. Enter an app name and description. Then, enter your app’s home page, which should be http://localhost:8080, in this case. Finally, indicate the Authorization callback URL which is basically the URL of the path, the user should land on after authenticated with GitHub.
7. Now, the app which we have created will give us Client ID and Client secret. Copy these fields.
8. Now, come back to your Spring application and open applications.yml. This file needs to be modified as below. Copy the data in yml file and it’s ready to go.


For more information refer : https://www.geeksforgeeks.org/oauth2-authentication-with-spring-and-github/?ref=next_article

https://www.youtube.com/watch?v=D2FuRIL95kk
