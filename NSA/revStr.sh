#!bin/bash

read -p "Enter the string : " str
length=${#str}
rev_str=""
for((i=length-1;i>=0;i--))
do
rev_str="$rev_str${str:$i:1}"
done
echo "Reversed string is : "$rev_str