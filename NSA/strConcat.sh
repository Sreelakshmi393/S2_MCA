#!bin/bash

read -p "Enter the first string : " s1
read -p "Enter the second string : " s2
s3="$s1 $s2"
s3+=" How are your?"
echo $s3