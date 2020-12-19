#!/bin/bash
result=`expr index "$1" "$2"`;
if [[ $result -eq 1 ]];
then echo oui;
else echo non;
fi
