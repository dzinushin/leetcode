#!/bin/bash
kotlinc Main.kt -include-runtime -d build/Main.jar
java -jar build/Main.jar
