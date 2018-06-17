FROM openjdk:8-alpine

ENV APPDIR /app
ENV PATH ${PATH}:/usr/lib/kotlinc/bin
ENV LIBDIR /usr/lib

ADD . ${APPDIR}
WORKDIR ${APPDIR}

RUN apk add --no-cache --update wget bash && \
    cd ${LIBDIR} && \
    wget https://github.com/JetBrains/kotlin/releases/download/v1.2.50/kotlin-compiler-1.2.50.zip && \
    unzip kotlin*.zip && \
    rm kotlin*.zip
