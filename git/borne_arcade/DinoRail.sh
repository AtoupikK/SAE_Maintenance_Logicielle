#!/bin/bash
xdotool mousemove 1280 1024
cd projet/DinoRail
touch highscore
javac Dinorail.java
java DinoRail
