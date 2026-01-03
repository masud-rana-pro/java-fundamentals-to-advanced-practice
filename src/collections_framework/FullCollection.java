
package collections_framework;

/**
 *Collection framework is a very popular framework in java;
 * important in the sense that using this we can write object oriented application using 
    * Data structre, Linkedlist, Hashtable.
 * The Collection framework is bound with the java.util package.
 * So while creating applications which need collection of objects we need to import the util package in our application.
 * 
 * @author Masud Rana
 */
public class FullCollection {
    
}

class EmployeeAddress{
    private String address;
    private int road;
    private String area;
    private int postalCode;

    public EmployeeAddress(String address, int road, String area, int postalCode) {
        this.address = address;
        this.road = road;
        this.area = area;
        this.postalCode = postalCode;
    }

    public String getAddress() {
        return address;
    }

    public int getRoad() {
        return road;
    }

    public String getArea() {
        return area;
    }

    public int getPostalCode() {
        return postalCode;
    } 

    @Override
    public String toString() {
        return "Employee Address : " + address + "\nEmployee Road : " + road 
                + "\nEmployee Area : " + area + "\nEmployee Postal Code : " + postalCode;
    }
 
}

//salary class 
class SalaryStructure {
    private double minSalary;
    private double currentSalary;
    private double maxSalary;
    private String incrementType;

    public SalaryStructure(double minSalary, double currentSalary, double maxSalary, String incrementType) {
        this.minSalary = minSalary;
        this.currentSalary = currentSalary;
        this.maxSalary = maxSalary;
        this.incrementType = incrementType;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public double getCurrentSalary() {
        return currentSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public String getIncrementType() {
        return incrementType;
    }

    @Override
    public String toString() {
        return "SalaryStructure{" + "\nMinSalary=" + minSalary + "\nCurrentSalary=" + currentSalary + "\nMaxSalary=" + maxSalary + "\nIncrementType=" + incrementType + "\n}";
    }

}


//employee calss
class Employee


