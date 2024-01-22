import java.util.*;
public class Student{
    String name;
    int roll;
    int fee;
    void setdata(String n,int r,int f)
    {
        name=n;
        roll=r;
        fee=f;
    }
    void display()
    {
        System.out.println("name:" +name);
         System.out.println("rollnumber:" +roll);
          System.out.println("fees:" +fee);


    }

public static void main(String args[])
{
    Student s1=new Student();
    s1.setdata("Ashish", 56,6900);
    s1.display();

}

}