#!/bin/bash

if [[ $# -ne 1 ]];
then
	echo "usage: $0 <string>"
	exit
fi
r=0; d=0; s=0;
cd $1
for f in `ls`;
	do
	if [[ -d $f ]]
		then
			d=$((d+1))
	fi
	if [[ -f $f ]]
		then
			r=$((r+1))
	fi
	if [[ -h $f ]]
		then
			s=$((s+1))
	fi
done
echo "dirs -- $d  reg files -- $r  symlinks -- $s"
		
