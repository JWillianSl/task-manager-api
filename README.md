# Task Manager API
A REST API project created to help teams in the tasks management process.

# How to run it?
The project uses [PostgreSQL](https://www.postgresql.org/) for data storage. We recommend that you use [Podman](https://podman.io/) and [podman-compose](https://github.com/containers/podman-compose?tab=readme-ov-file) to run postgreSQL in a container. Follow the steps: <br>
* Execute `podman-compose up -d` in the same directory of _podman-compose.yaml_;
* Execute `mvn sprin1g-boot:run` to run the project.