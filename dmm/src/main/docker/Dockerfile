FROM ${docker.dtr.url}/advda_org/core:${java.version}
USER root
RUN mkdir -p /opt/app/${project.artifactId}
RUN chown -R core:core /opt/app/${project.artifactId}
WORKDIR /opt/app/${project.artifactId}
COPY --chown=core:core maven/ /opt/app/${project.artifactId}
EXPOSE 8443
USER core
ENTRYPOINT ["/opt/app/${project.artifactId}/entrypoint.sh"]