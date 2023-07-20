FROM gitpod/workspace-full-vnc:latest

USER gitpod

RUN bash -c ". /home/gitpod/.sdkman/bin/sdkman-init.sh && \
    sdk install java 20.0.1.fx-zulu && \
    sdk default java 20.0.1.fx-zulu"

# Install Chrome for Selenium tests
RUN sudo apt-get update && sudo apt-get install -y \
    apt-transport-https \
    ca-certificates \
    curl \
    gnupg \
    --no-install-recommends \
    && curl -sSL https://dl.google.com/linux/linux_signing_key.pub | sudo apt-key add - \
    && echo "deb https://dl.google.com/linux/chrome/deb/ stable main" | sudo tee -a /etc/apt/sources.list.d/google-chrome.list \
    && sudo apt-get update \
    && sudo apt-get install -y \
    google-chrome-stable \
    --no-install-recommends \
    && sudo rm -rf /var/lib/apt/lists/*

