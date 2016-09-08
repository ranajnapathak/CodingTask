package test_java;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Ranjana
 */
public class Test_fileCopy {
 public static void main(String args[]) throws IOException{ 
      FileReader in = null;
      FileWriter out = null;
// create ArrayList to store the records objects from a File
        List<FileData> recData = new ArrayList<>();

      try {
         in = new FileReader("C:\\Users\\Ranjana\\Documents\\NetBeansProjects\\Test_java\\src\\test_java\\inputData.txt");
         out = new FileWriter("C:\\Users\\Ranjana\\Documents\\NetBeansProjects\\Test_java\\src\\test_java\\outputData.txt");
         String st, full;
        full="";
BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Ranjana\\Documents\\NetBeansProjects\\Test_java\\src\\test_java\\inputData.txt"));
while ((st=br.readLine())!=null) {
    full+=st;
   // full+="\n";
   // System.out.print(st);
    //System.out.print("\n");
    
    String[] tokenize = st.split(",");
      

                // assume file is made correctly
                // and make temporary variables for name and grades from the data file.
                String tempName = String.join(tokenize[0],tokenize[1]);   // Ranjana: Create a string using first two tokens.
                int tempGrade = Integer.parseInt(tokenize[2]);            // Ranjana: Create integer object for storing grades.
                
          FileData fd=new FileData(tempName,tempGrade);                  // Ranjana : Using the parameterised constructor of the class FileData, creating objects
          recData.add(fd);                                               // Ranjana: Adding objects to the array list.

}
    System.out.print(full);    /*TODO::::::Ranjana::::::::*/
   
/* Next step is to combine logic of both the programs, where values of the objects can be fetched and sorted according to the 
grade and for the same grades apply sorting for names.
Send sorted output to another file.
*/
                                        
  /*  for (FileData each : recData)
        {
            System.out.println("====================");
            System.out.println(each);
            System.out.println();
            //System.out.printf("Total value = %8.2f %n", each.getTotal());
        }*/
     int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
 

}
/*
String st, full;
full="";
BufferedReader br = new BufferedReader(new FileReader(URL));
while ((st=br.readLine())!=null) {
    full+=st;
}
*/