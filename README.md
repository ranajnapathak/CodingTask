# CodingTask
EBR coding task

I have tried two option to get the desired result. 

First:___________________SHELL script_____________

To get the sorting over two column can be very straight forward using the Shell command in Linux,

If input file is test.dat in which data is kept,
then using the sort command we can sort two columns.
Following is the command,

$sort -k3,2 test.dat  > Sorted_data.dat

In this line, sort is the command that is working on two key arguments 3 and 2. These two arguments represents name and grades.
 using the ">" output is send to the separate file named as Sorted_data.dat
 
 Output of this command is as follows:
 
 BUNDY, TERESSA, 88
KING, MADISON, 88
SMITH, FRANCIS, 85
SMITH, ALLAN, 70
 
 
Second:____________________JAVA_________

I have also attempted in JAVA. Although my task is not 100% complete but I am sure I am able to show my logical skill.
I have two java files and one output file to support my attempt.

In my initial attempt I applied sorting on static and run time values. 
JAVA code:    Test_FilesReaderWriter.java
Output:       OUTPUT_Test_FilesReaderWriter.txt
 

 In another code, I have shown how data can be read and write to a file.
 Also using tokenize and arraylist.
 
