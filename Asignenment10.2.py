# -*- coding: utf-8 -*-
"""
Created on Thu Jan 31 22:19:34 2019

@author: sindh
"""

#assignment 10.2, 
#Write a program to read through the mbox-short.txt and figure out the distribution by hour of the day for each of the messages. You can pull the hour out from the 'From ' line by finding the time and then splitting the string a second time using a colon.
 
name = input("Enter file:")
if len(name) < 1 : name = "FILENAME/PATH OF FILE IN LOCAL DISK"
handle = open(name)
counts = dict()

for line in handle:
    if line.startswith("From "):
        time = line.split()[5].split(":")
        counts [time[0]] = counts.get(time[0], 0) + 1

#print sorted( [ (v,k) for k,v in counts.items()] )

obj = list()

for key, value in counts.items():
    obj.append( (key,value) )
obj.sort()

for hour, counts in obj:
    print (hour,counts)