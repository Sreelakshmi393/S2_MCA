#!bin/bash

echo "Enter the contents of file : " 
cat > rev.txt
echo "Before reversing"
cat rev.txt
echo "After reversing"
tac rev.txt
