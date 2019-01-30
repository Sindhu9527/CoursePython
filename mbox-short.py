# -*- coding: utf-8 -*-
"""
Created on Tue Jan 29 23:56:26 2019

@author: sindh
"""
#assignment 8.5
fname = input("Enter file name: ")
#if len(fname) < 1 : fname = "mbox-short.txt"
fd = open("C:\\Users\\sindh\\Desktop\\COURSERA\\PyDSC\\Asisgnment 8.4\\Assgnment 8.5\\mbox-short.txt")
count = 0

for line in fd:
    line = line.rstrip()
    if line == " " : 
        continue
    if line.startswith('From') : 
        words = line.split()
        if(len(words)) > 2:
            print (words[1])
            count = count + 1
      
print("There were", count, "lines in the file with From as the first word")
