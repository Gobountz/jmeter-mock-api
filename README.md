# API permettant de simuler une vraie API pour les tirs de performances
## Développement
Maven est nécessaire, en version 3.x idéalement.

Pour développer et profiter de la compilation dynamique de Quarkus, il suffit d'exécuter la commande suivante :
`mvn compile quarkus:dev`.

Pour créer le fichier _jar_ exécutable : `mvn package`.

Pour créer l'image Docker : `docker build -f src/main/docker/Dockerfile.jvm -t {compte docker-hub}/{nom de l'artefact} .`

Pour créer l'image Docker en natif : `docker build -f src/main/docker/Dockerfile.multistage -t {compte docker-hub}/{nom de l'artefact} .`
