

public class ClassLoaderSubSystem {

    public static void main(String[] args) {

        System.out.println(String.class.getClassLoader());
        //classLoaderSubSystem  is loaded by application subsystem
        System.out.println(ClassLoaderSubSystem.class.getClassLoader());
    }


}
