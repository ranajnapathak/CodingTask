/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_java;

import java.util.Scanner;

/**
 *
 * @author Ranjana
 */
public class Test_FilesReaderWriter {
    
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    
    /* This code is working fine for sorting on the basis of grades. */

    public static void main(String[] args) {

        /* Ranjana: Testing data on static values.*/

        FileData[] fData = new FileData[5];
       // String[] names = { "ss", "aa", "bb", "cc", "xx" };
        String[] names = { "BUNDY", "SMITH A", "KING", "SMITH F","Ranjana" };

/* Ranjana: Passing dynamic value for users. */

        try (Scanner in = new Scanner(System.in)) {
            for (int i = 0; i < fData.length; i++) {
                fData[i] = new FileData();
                fData[i].setName(names[i]);
                System.out.println("Please enter Grade for: "+ fData[i].getName());
                fData[i].setGrade(in.nextInt());
            }
        }

        // Ranjana: Print all names with their grades, before sorting.
        System.out.println("Before Sorting");
        for (FileData s : fData) {
            System.out.println("Name: " + s.getName() + "  Grade: " + s.getGrade());
        }

        /* Ranjana: logic for sorting*/

        String tempStr;
        int tempInt;
        for (int t = 0; t < fData.length - 1; t++) {
            for (int i = 0; i < fData.length - t - 1; i++) {
                     tempStr = fData[i].getName();
                if (fData[i + 1].getGrade()<(fData[i].getGrade())) {
              /*      if(fData[i + 1].getGrade()==(fData[i].getGrade())){
                        
                        if (fData[i + 1].getName().compareTo(fData[i].getName()) < 0) {
                    tempStr = fData[i].getName();
                    fData[i].setName(fData[i + 1].getName());
                    fData[i + 1].setName(tempStr);
                }
                    }*/
                    tempInt = fData[i].getGrade();
                    
                    System.out.println("Grade: "+ tempInt+ ":::: Name: "+ tempStr);
                    
                    fData[i].setGrade(fData[i + 1].getGrade());
                    fData[i].setName(fData[i+1].getName());
                    
                    
                    fData[i + 1].setGrade(tempInt);
                    fData[i+1].setName(tempStr);
                }
            }
            
       /*     for (int i = 0; i < fData.length - t - 1; i++) {
                if (fData[i + 1].getName().compareTo(fData[i].getName()) < 0) {
                    tempStr = fData[i].getName();
                    fData[i].setName(fData[i + 1].getName());
                    fData[i + 1].setName(tempStr);
                }
            }*/
        }

        System.out.println("After Sorting");
        for (FileData s : fData) {
            System.out.println(s.getName() + " " + s.getGrade());
        }
    }
}



/*Ranjana: Class that has two variables name and grade. It has methods to get and set their values. */
class FileData {

    private String name;
    private int grade;
    
    FileData(){
        
    }

    FileData(String name, int grade){
        this.name=name;
        this.grade=grade;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int gr) {
        grade = gr;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

}

