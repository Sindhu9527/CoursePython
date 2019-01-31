# -*- coding: utf-8 -*-
"""
Created on Thu Jan 31 17:55:54 2019

@author: sindh
"""

#word count of the text file, which is nothing but the text scraping 
handle_file = open("C:\\Users\\sindh\\Desktop\\COURSERA\\PyDSC\\Asisgnment 8.4\\Assgnment 8.5\\mbox-short.txt")
#handle_file = open(file_name)

#create a dictionary

counts = dict()
for line in handle_file:
    words = line.split()
    #print (words)
    for word in words:
        if word not in counts:
            counts[word] = 1
        else:
            counts[word] = counts[word] + 1
#now we should find which is the highest repeated word file in it:
highestcount = 0
highestword = ''
#print(counts.items())
for word,count in counts.items():
    if highestcount is None or count>highestcount:
        highestcount = int(highestcount) +1
        highestword = word
   
print (highestword,highestcount)