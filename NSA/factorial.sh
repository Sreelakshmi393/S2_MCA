#!bin/bash

read -p "Enter the number : " n
f=1
for((i=1;i<=n;i++))
do
	f=$(($f*$i))
done
echo "Factorial is " $f