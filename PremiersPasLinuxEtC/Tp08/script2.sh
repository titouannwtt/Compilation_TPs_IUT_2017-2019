#!/bin/bash
s=$1
caracteredebut=`expr index "$s" "."`
longueurtotal=`expr length "$s"`
longueursuffix=$((longueurtotal-caracteredebut))
if [[ `expr index "$s" "."` -ne 0 ]];
then result=`expr substr "$s" $((caracteredebut+1)) $longueursuffix`;
else result="Il n'y a pas de . pour localiser le suffix"
fi
echo "$result"
