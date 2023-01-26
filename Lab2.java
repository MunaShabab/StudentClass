// a class to test the student calss
public class Lab2{
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

        Student student1=new Student("John","Dawson",123765,"IC",10);

        Student student2=new Student("Lisa","Hans",987345,"IC",13);

        Student student3=new Student("Jason","wang",345234,"IC",19);

        Student student4=new Student("Devon","Snow",109345,"OC",3);

        Student student5=new Student("Jennifer","Wood",345254,"OC",15);

        Student student6=new Student("David","Park",674933,"OC",22);

        Student student7=new Student("Donna","Mason",783234,"OS",1);

        Student student8=new Student("Kaily","Andrews",122034,"OS",18);
       
        Student student9=new Student("Sara","Yon",129778,"OS",19);


        System.out.println("student " + student1.getStudentNumber()+" "+ student1.getFirstName() +" " +student1.getLastName()+" takes " +student1.getCreditHours() 
        + " credit hours,residency = " + student1.getResidencyCode()+", Tuition = " +student1.CalculateTuition());
        System.out.println("******************************************************************************************");
        System.out.println("student " + student2.getStudentNumber()+" "+student2.getFirstName() +" " +student2.getLastName()+" takes " +student2.getCreditHours() 
        +" credit hours, residency = " + student2.getResidencyCode()+", Tuition = " +student2.CalculateTuition() );
        System.out.println("******************************************************************************************");
        System.out.println("student " + student3.getStudentNumber()+" "+student3.getFirstName() +" " +student3.getLastName()+" takes " +student3.getCreditHours() 
        + " credit hours, residency = " + student3.getResidencyCode()+", Tuition = " +student3.CalculateTuition() );
        System.out.println("******************************************************************************************");
        System.out.println("student " + student4.getStudentNumber()+" "+student4.getFirstName() +" " +student4.getLastName()+" takes " +student4.getCreditHours() 
        + " credit hours, residency = " + student4.getResidencyCode()+", Tuition = " +student4.CalculateTuition() );
        System.out.println("******************************************************************************************");
        System.out.println("student " + student5.getStudentNumber()+" "+student5.getFirstName() +" " +student5.getLastName()+" takes " +student5.getCreditHours() 
        + " credit hours, residency = " + student5.getResidencyCode()+", Tuition = " +student5.CalculateTuition() );
        System.out.println("******************************************************************************************");
        System.out.println("student " + student6.getStudentNumber()+" "+student6.getFirstName() +" " +student6.getLastName()+" takes " +student6.getCreditHours()
         + " credit hours, residency = " + student6.getResidencyCode()+", Tuition = " +student6.CalculateTuition() );
        System.out.println("******************************************************************************************");
        System.out.println("student " + student7.getStudentNumber()+" "+student7.getFirstName() +" " +student7.getLastName()+" takes " +student7.getCreditHours()
         + " credit hours, residency = " + student7.getResidencyCode()+", Tuition = " +student7.CalculateTuition());
        System.out.println("******************************************************************************************");
        System.out.println("student " + student8.getStudentNumber()+" "+student8.getFirstName() +" " +student8.getLastName()+" takes " +student8.getCreditHours() 
        + " credit hours, residency = " + student8.getResidencyCode()+", Tuition = " +student8.CalculateTuition() );
        System.out.println("******************************************************************************************");
        System.out.println("student " + student9.getStudentNumber()+" "+student9.getFirstName() +" " +student9.getLastName()+" takes " +student9.getCreditHours()
         + " credit hours, residency = " + student9.getResidencyCode()+", Tuition = " +student9.CalculateTuition() );
        System.out.println("******************************************************************************************");
    


    }
}