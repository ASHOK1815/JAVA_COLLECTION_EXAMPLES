
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student{

    private  String name;
    private int rollNumber;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}




public class WorkingOfClassType {

    public static void main(String[] args) {


        Student student=new Student();

        // getting hold of class
        Class c1=student.getClass();
        System.out.println(c1);

        // getting all method in the array
        Method m[]=c1.getMethods();
        for(Method method:m)
        {
            System.out.println(method.getName());

        }

         System.out.println();

        //getting all field in the array
        Field f[]=c1.getFields();
        for(Field field:f)
        {
            System.out.println(field.getName());
        }




    }
}
