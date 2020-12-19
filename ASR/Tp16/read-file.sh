#!/bin/bash

if [[ $# -ne 1 ]];
then
	echo "Usage: $0 <file>"
	exit
fi
count=0
file=$1
y=`wc $1 -l`
while [[ `expr substr "$y" 1 1` -ne $count ]]
	do
	echo `head -n $((count+1)) $file | tail -n1` > tempfile
	read v1 v2 < tempfile
	echo $v1
	count=$((count+1))
	done
rm tempfile
