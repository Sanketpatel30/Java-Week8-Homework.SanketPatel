package Java_Week8_Homework_SanketPatel.encapsulation26;

public class TestEncapsulation {
        public static void main(String[] args) {
            Encapsulate obj = new Encapsulate();
            obj.setName("Sanket");
            obj.setAge(30);
            obj.setRollNo(51);

            //Displaying values of the variables
            System.out.println("Prime's name: " + obj.getName());
            System.out.println("Prime's age: " + obj.getAge());
            System.out.println("Prime's rollNo: " + obj.getRollNo());
        }
    }