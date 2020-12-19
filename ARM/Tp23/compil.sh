
#!/bin/bash
if [[ $# -ne 1 ]]
then
	echo "Usage: $0 <fichier.s (sans le .s)>";
	exit;
fi
rm $1.o

rm a.out

as -gstabs -o $1.o $1.s
ld -O0 $1.o
./a.out
