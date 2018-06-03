check-arguments:
ifeq ($(pattern),)
	@echo "Error: expected to receive pattern as argument"
	@exit 1
endif

compile:
	@echo "Compiling..."
	@echo "> kotlinc src/$(pattern) -include-runtime -d build/$(pattern).jar"
	@kotlinc src/$(pattern) -include-runtime -d build/$(pattern).jar

run: check-arguments compile
	@echo "Running..."
	@echo "> java -jar build/$(pattern).jar"
	@java -jar build/$(pattern).jar
	@exit 0
