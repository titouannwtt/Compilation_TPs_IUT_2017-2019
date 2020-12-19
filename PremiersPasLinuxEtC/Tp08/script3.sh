#!/bin/bash
s=$1
localisationpoint=`expr index "$s" "."`
if [[ `expr index "$s" "."` -ne 0 ]];
then result=`expr substr "$s" 1 $((localisation))`;
else result="Il n'y a pas de . pour localiser l'affixe"
fi
echo "$result"
