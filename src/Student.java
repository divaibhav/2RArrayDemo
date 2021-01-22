public class Student implements Comparable{
    private int rollNo;
    private String name;
    //getter for roll no
    public int getRollNo(){
        return rollNo;
    }
    //getter for name
    public String getName(){
        return name;
    }
    //setter for rollNo
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return name + ", " + rollNo;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
