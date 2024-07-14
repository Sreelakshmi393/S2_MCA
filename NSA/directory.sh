#!bin/bash

read -p "Enter the path for search : " dir
for fname in "C:/Users/HP/Desktop/nsa/$dir"
do
if [ -d "$fname" ]
then
	echo "$fname is directory"
else
	echo "$fname is not directory"
fi
done