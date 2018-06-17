IMAGE="design-patterns-in-kotlin"
PWD=$(shell pwd)
APPDIR=/app
BUILDDIR=build

build-image:
ifeq ($(shell docker images | grep ${IMAGE}a | wc -l),0)
	@echo "Building image..."
	@docker build . -t ${IMAGE}:latest
endif

check-arguments:
ifeq ($(pattern),)
	@echo "Error: expected to receive pattern as argument"
	@exit 1
endif

compile:
	@echo "Compiling..."
	@echo "docker @ kotlinc src/$(pattern) -include-runtime -d ${BUILDDIR}/$(pattern).jar"
	@docker run -v ${PWD}:/${APPDIR} ${IMAGE} kotlinc src/$(pattern) -include-runtime -d ${BUILDDIR}/$(pattern).jar

run: check-arguments build-image compile
	@echo "Running..."
	@echo "docker @ java -jar build/$(pattern).jar"
	@docker run -v ${PWD}:/${APPDIR} ${IMAGE} java -jar ${BUILDDIR}/$(pattern).jar
	@exit 0
