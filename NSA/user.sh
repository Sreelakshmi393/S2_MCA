#!/bin/bash

# Get the current user's username
username=$(whoami)

# Count the number of terminal sessions for the current user
session_count=$(who | grep -w $username | wc -l)

# Display the result
echo "User $username has logged in $session_count times."
