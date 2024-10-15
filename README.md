Project Overview

This project is a movie review platform that allows users to browse and review movies. The platform consists of a frontend built with React and a backend built with Spring Boot.

Frontend (MovieClient):

The frontend is built using Create React App and is designed to provide a user-friendly interface for users to interact with the platform. The main features of the frontend include:

Home Page: Displays a list of movies with their posters, titles, and genres.
Movie Details Page: Displays detailed information about a movie, including its title, release date, trailer link, and poster.
Reviews Page: Allows users to leave reviews for a movie.
Trailer Page: Displays the trailer for a movie.
The frontend uses various libraries and frameworks, including:

React for building the user interface
React Router for client-side routing
React Bootstrap for styling and layout
Axios for making API requests to the backend.

Backend (MovieAPI):

The backend is built using Spring Boot and is designed to provide a RESTful API for the frontend to interact with. The main features of the backend include:

Movie API: Provides endpoints for retrieving movie data, including movie details and reviews.
Review API: Provides endpoints for creating, reading, and updating reviews.
Cors Configuration: Configures CORS to allow the frontend to make API requests to the backend.
The backend uses various libraries and frameworks, including:

Spring Boot for building the RESTful API
Spring Data MongoDB for interacting with the MongoDB database
MongoDB for storing movie and review data

Database:

The project uses a MongoDB database to store movie and review data. The database is designed to store the following data:

Movies: Movie details, including title, release date, trailer link, and poster.
Reviews: Review data, including the movie ID, user ID, review text, and rating.

API Endpoints:

The backend provides the following API endpoints:

GET /api/v1/movies: Retrieves a list of movies.
GET /api/v1/movies/{imdbId}: Retrieves a movie by its IMDB ID.
POST /api/v1/reviews: Creates a new review for a movie.
GET /api/v1/reviews/{movieId}: Retrieves a list of reviews for a movie.
PUT /api/v1/reviews/{reviewId}: Updates a review.


Installation and Running:

To install and run the project, follow these steps:

Clone the repository to your local machine.
Install the dependencies for the frontend by running npm install in the MovieClient directory.
Install the dependencies for the backend by running mvn install in the MovieAPI directory.
Start the backend by running mvn spring-boot:run in the MovieAPI directory.
Start the frontend by running npm start in the MovieClient directory.

Contributing:

Contributions are welcome! If you'd like to contribute to the project, please fork the repository and submit a pull request with your changes.
