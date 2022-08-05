# Cinema manager
![drawing](auxiliary/cover-photo.jpg)
Web application which simulates cinema service work. Implemented authorization and 
authentication functionality for users. Data exchange between the application and the client is carried out using 
the JSON format.

## <a id="content"></a>Content
- [Description of features](#description)
- [Model structure](#model-structure)
- [Technology](#technology)
- [How to run](#how-to-run)

## <a id="description"></a>Description of features
[content](#content)

#### Access level `ALL`
- register a new user `/register`, request `POST`.
#### Access level `ADMIN`
- get the user by email `/users/by-email`, request `GET`.
- add a new cinema hall `/cinema-halls`, request `POST`.
- add a new movie `/cinema-halls`, request `POST`.
- add a new movie session `/movie-sessions`, request `POST`.
- change the movie session `/movie-sessions/{id}`, request `PUT`.
- delete the movie session `/movie-sessions/{id}`, request `DELETE`.
#### Access level `ADMIN / USER`
- get a list of cinema halls `/cinema-halls`, request `GET`.
- get a list of movies `/movies`, request `GET`.
- get a list of movie sessions for a specified movie and date `/movie-sessions/available?movieId={?}&date={?}`, 
request `GET`.
#### Access level `USER`
- add the ticket to the shopping cart `shopping-carts/movie-sessions`, request `PUT`.
- get a list of tickets in the user's cart `/shopping-carts/by-user`, request `GET`.
- confirm the ticket order in the shopping cart `/orders/complete`, request `POST`.
- get a list of this user's orders `/orders - user`, request `GET`.

## <a id="model-structure"></a>Model structure
[content](#content)

![model structure](auxiliary/shema-photo.png)

## <a id="technology"></a>Technology
[content](#content)
- Java 11
- Hibernate
- Spring (Core, MVC, Web, Security)
- MySQL
- JSON
- Apache Maven
- Apache Tomcat (to run app locally)

## <a id="how-to-run"></a>How to run 
[content](#content)
- You need Apache Tomcat (version 9.0.50).
- You need local or external MySql DB.
- You need to change the configuration information in the file `/resources/db.properties`.
- Finally, you can start the application
- After running the application you will be redirected to login page. You can use:
    * username `admin@gmail.com` with password `1234` to login as admin,
    * username `user@gmail.com` with password `1234` to login as user.
- You can use Postman to send requests and get response.
