#!/bin/bash
#
for (( i=$1 ; i< $2 ; i++ )); 
	do
	for (( j=$1 ; i<$2 ; j++ ));
		do
		echo -n "$((i*j))"
		echo -n " "
	done
	echo ""
done
exit
