import java.util.ArrayList;
// a class to test the student calss
public class Lab3{
    public static void main (String [] args){
        //student1 is in county and taking 10 credit hours
        //student2 is in county and taking 13 credit hours
        //student3 is in county and taking 19 credit hours
        //student4 is out of county and taking 3 credit hours
        //student5 is out of county and taking 15 credit hours
        //student6 is out of county and taking 22 credit hours
        //student7 is out of state and taking 1 credit hours
        //student8 is out of state and taking 18 credit hours
        //student9 is out of state and taking 19 credit hours
        //student10 is in county and taking 5 credit hours
        //student11 is in county and taking 18 credit hours
        //student12 is in county and taking 20 credit hours

        //an Array list to hold the Student objects
        ArrayList<Student> studentList=new ArrayList<Student>();

        //create the student objects and them to the ArrayList studentList
        Student student1=new Student("John","Dawson",123765,"IC",10);

        studentList.add(student1);

        Student student2=new Student("Lisa","Hans",987345,"IC",13);

        studentList.add(student2);

        Student student3=new Student("Jason","wang",345234,"IC",19);

        studentList.add(student3);

        Student student4=new Student("Devon","Snow",109345,"OC",3);

        studentList.add(student4);

        Student student5=new Student("Jennifer","Wood",345254,"OC",15);

        studentList.add(student5);

        Student student6=new Student("David","Park",674933,"OC",22);

        studentList.add(student6);

        Student student7=new Student("Donna","Mason",783234,"OS",1);

        studentList.add(student7);

        Student student8=new Student("Kaily","Andrews",122034,"OS",18);

        studentList.add(student8);
       
        Student student9=new Student("Sara","Yon",129778,"OS",19);

        studentList.add(student9);

        Student student10=new Student("Paul","Phillips",239102,5);

        studentList.add(student10);

        Student student11=new Student("Holly","Faidal",127329,18);

        studentList.add(student11);

        Student student12=new Student("Larry","Poluk",225863,20);

        studentList.add(student12);

         System.out.println("-----------------------------------------------------------------------------------------");

        //for each student object in studentList display the attributes and the tuition
        for(Student student: studentList){

            System.out.println("student " + student.getStudentNumber()+" "+ student.getFirstName() +" " +student.getLastName()+" takes " +student.getCreditHours() 
        + " credit hours,residency = " + student.getResidencyCode()+", Tuition = " +student.CalculateTuition());;

            System.out.println("-----------------------------------------------------------------------------------------");

        }


    }
}