#!/bin/bash

setxkbmap borne

cd /home/pi/git/borne_arcade

read -p "Mettre à jour le système ? (y/n) " -n 1 -r
echo
if [[ $REPLY =~ ^[Yy]$ ]]; then
    ./setup-raspberry.sh
fi

echo "nettoyage des répertoires"
echo "Veuillez patienter"

./clean.sh
./compilation.sh

echo "Lancement du  Menu"
echo "Veuillez patienter"

java -cp .:/home/pi/git/MG2D Main

./clean.sh

for i in {30..1}
do
    echo Extinction de la borne dans $i secondes
    sleep 1
done

sudo halt
