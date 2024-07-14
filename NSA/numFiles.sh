#!bin/bash

read -p "Enter the directory you want to search : " dir
direct="C:/Users/HP/Desktop/$dir"
if [ -d $direct ]
then
	num_files=$(find $direct -type f | ls -l $direct | wc -l)
	echo "There are $num_files files in $dir"
else
	echo "$direct is not a directory"
fi