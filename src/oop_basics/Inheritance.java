
package oop_basics;

import java.util.Scanner;

/**
 *Topic covered: 
 * i. OOP inheritance
 * ii. Superclass
 * ii. Subclass
 * iv. interface
 * v. inner class
 * vi. multi-level inheritance
 * vii. Multiple inheritance features through implements
 * viii. use of this keyword
 * ix. use of super()
 * x. access modifire
 * xi. using classes in the same file
 * 
 * @author Md. Masud Rana
 */

//Interface-1
interface Identity{
    //Interface Metho
    void showName();
}

//Interface-2
interface Family {
    //Interface Metho
    void showRelation();
}

//Super/parent class
class Father {
    //instance/gobal/class level variable/attribute/field
    protected String fatherName;
    
    //constructor
    public Father (String fatherName){
        this.fatherName = fatherName;
    }
}

//child class
class Child extends Father implements Identity, Family{
    //child variable
    private String childName;
    private int childAge;
    
    //child constructor
    public Child(String childName, int childAge, String fatherName) {
        super(fatherName);
        //child variables
        this.childName = childName;
        this.childAge =childAge;
    }

    @Override
    public void showName() {
        System.out.println("\n--------Results:--------");
        System.out.println("Your Name: " + childName);
    }

    @Override
    public void showRelation() {
        System.out.println(" You are " + childName + "\n Son of: " + fatherName + "\n Your age is: " + childAge);
    }
}
public class Inheritance {
    //inner class
    static class Main{
        public static void main(String[] args) {
            //scanner object create
            Scanner input = new Scanner(System.in);
            
            //taking inpit
            System.out.print("Enter your name : ");
            String cName = input.nextLine();
            
            System.out.print("Enter your Age : ");
            int cAge = input.nextInt();
            
            //buffer clear
            input.nextLine();
            
            System.out.print("Enter your father name : ");
            String fName = input.nextLine();
            
            //child object cteate
            Child myChild = new Child(cName, cAge, fName);
            
            //method calling
            myChild.showName();
            System.out.println("Relations:-");
            myChild.showRelation();
            
            //input closing
            input.close();
        }
    }
}

