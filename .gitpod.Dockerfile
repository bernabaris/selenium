FROM gitpod/workspace-full-vnc:latest

USER gitpod

RUN bash -c ". /home/gitpod/.sdkman/bin/sdkman-init.sh && \
    sdk install java 20.0.1.fx-zulu && \
    sdk default java 20.0.1.fx-zulu"

# Install dependencies.
RUN sudo apt-get update \
    && sudo DEBIAN_FRONTEND=noninteractive apt-get install -y \
    libgtk2.0-0 \
    libgtk-3-0 \
    libnotify-dev \
    libgconf-2-4 \
    libnss3 \
    libxss1 \
    libasound2 \
    libxtst6 \
    xauth \
    xvfb \
    && sudo rm -rf /var/lib/apt/lists/*

# Install Chrome

RUN sudo apt-get update -q \
    && sudo apt-get install -yq \
    chrome \
    && sudo rm -rf /var/lib/apt/lists/*