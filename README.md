# prometheus-sample

## Pre-requirements

1. install jdk8
2. install docker, docker-compose (for windows: require wsl and rancher-desktop)

## Get Started

1. copy `./env/.env.example to .env`
    and `./src/main/resources/application-dev.properties to ./src/main/resources/application.properties`

2. `./mvnw package`

3. mkdir `./grafana/data` and `./prometheus/data`

4. `docker-compose up -d`

5. goto `http://localhost:9090 for prometheus`

6. goto `http://localhost:3000 for grafana`

7. goto `http://localhost:9093 for alertmanager`