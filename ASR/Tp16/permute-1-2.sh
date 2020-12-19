#!/bin/bash

if [[ $# -ne 2 ]];
then
	echo "Usage: $0 <file> <reverse file>"
	exit
fi
count=0
file=$1
y=`wc $1 -l`
while [[ `expr substr "$y" 1 1` -ne $count ]]
	do
	echo `head -n $((count+1)) $file | tail -n1` > tempfile
	read v1 v2 v3 < tempfile
	echo "$v2 $v1 $v3" >> $2
	count=$((count+1))
	done
rm tempfile
