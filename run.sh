#!/bin/bash

# Navigate to project-b and install dependencies
cd project-b
mvn clean install

# Navigate to project-a and install dependencies
cd ../project-a
mvn clean install

# Run project-a
mvn spring-boot:run
