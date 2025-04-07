#!/bin/bash
read -p "Enter exercise name: " exercise
mkdir "$exercise"
cd "$exercise"
touch "${exercise}.java"
code "${exercise}.java"
