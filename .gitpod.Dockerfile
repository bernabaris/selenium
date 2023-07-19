FROM gitpod/workspace-full-vnc:latest

USER gitpod

RUN bash -c ". /home/gitpod/.sdkman/bin/sdkman-init.sh && \
    sdk install java 20.0.1.fx-zulu && \
    sdk default java 20.0.1.fx-zulu"

