# Cinema manager 🎥
![drawing](cover-photo.jpg)
Web application which simulates cinema service work.
# Features
### Access level `ALL`
- register a new user `/register`, request `POST`.
### Access level `ADMIN`
- get user by email `/users/by-email`, request `GET`.
- add a new cinema hall `/cinema-halls`, request `POST`.
- add a new movie `/cinema-halls`, request `POST`.
- add a new movie session `/movie-sessions`, request `POST`.
- change movie session `/movie-sessions/{id}`, request `PUT`.
- delete movie session `/movie-sessions/{id}`, request `DELETE`.
### Access level `ADMIN / USER`
- get list of cinema halls `/cinema-halls`, request `GET`.
- get list of movies `/movies`, request `GET`.
- get list of movie sessions for a specified movie and date `/movie-sessions/available?movieId={?}&date={?}`, 
request `GET`.
### Access level `USER`
- get a list of tickets in the user's cart `/shopping-carts/by-user`, request `GET`.
- get a list of this user's orders `/orders - user`, request `GET`.

- POST: /orders/complete - user
- PUT: /shopping-carts/movie-sessions - user
