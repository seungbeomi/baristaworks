#!/bin/sh
H2=/DEV-mac/repository/com/h2database/h2/1.3.164/h2-1.3.164.jar
URL=jdbc:h2:~/test
java -cp $H2 org.h2.tools.Server