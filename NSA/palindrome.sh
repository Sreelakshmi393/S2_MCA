#!bin/bash

read -p "Enter a number : " num
n=$num
rev=0
while [ $num -gt 0 ]
do
	rem=$(($num%10))
	rev=$(($rev*10+rem))
	num=$(($num/10))
done
if [ $rev -eq $n ]
then
	echo "$n is palindrome"
else
	echo "$n is not palindrome"
fi