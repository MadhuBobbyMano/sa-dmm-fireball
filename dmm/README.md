# DmmApp

Welcome to your new dashboard. Out of the box everything is preconfigured to hit the ground running.

You will need to run your initial build to get your web assets properly compiled. This can take a little bit on the first run since webpack will need to download quite a few packages.

```
mvn clean install -P no-docker,js-debug
```

Fireball dashboards are Spring Boot projects and have a built in Servlet. You can start the dashboard using your IDE's SpringBootApplication run configuration or use the included run_locally.sh script in the base directory.

Your dashboard has some basic screens to demonstrate how the metadata works for Fireball. There are also some basic unit tests in the project for the included service.

**Before you proceed with development**, please scan the project for **TODO** comments and either make adjustments as needed for your project or create backlog stories to track the needed work.

For more information on how to code within the Fireball framework, please use the following [documentation](https://itsdemodev.premierinc.com/fireball/).

# Docker Deployment

As a part of your new dashboard, the creation of a docker image is preconfigured and tied to the maven build lifecycle.

You'll need to ensure you have created your project's organization (dmmapp_org) and repository (dmm) in DTR, configure a service account for the DTR image push, and create a docker compose file for your service.