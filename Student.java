public class Student {
    private String name;
    private int age;


    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;

    }
    public static void main(String[] args) {
        Student s1 = new Student("Nishant", 21);
        System.out.println("Name:"+ s1.getName());

        //changing the name using setter
        s1.setName("Singh");
        System.out.println("Updated Name:"+s1.getName());


          

    }


    

    
}
