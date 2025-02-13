#!/bin/bash

# Find and delete all .class files recursively from the current directory
find . -type f -name "*.class" -delete

echo "All .class files have been deleted."