ls -al $1 > tempfile
sort -b -n -k 5 < tempfile
rm tempfile
