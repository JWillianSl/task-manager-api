# Task Manager API
A REST API project created to help teams in the tasks management process.

# How to run it?
The project uses [PostgreSQL](https://www.postgresql.org/) for data storage. We recommend that you use [Podman](https://podman.io/) and [podman-compose](https://github.com/containers/podman-compose?tab=readme-ov-file) to run postgreSQL in a container. Follow the steps: <br>
* Execute `podman-compose up -d` in the same directory of _podman-compose.yaml_;
* Execute `mvn sprin1g-boot:run` to run the project.

To manager the database we use [PgAdmin4](https://www.pgadmin.org/), it is started when you use `podman-compose up`. To access PgAdmin4, use a browser and do:
* Search for **http://localhost:5051/**;
* Fill out the form using the email and password defined in `podman-compose.yaml`.

Before starting the project, you need to generate a private key and a public key. For this, we prepared a shell script to generate them. The keys are not exposed on github because they are included in the `.gitignore`. 