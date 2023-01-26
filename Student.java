// class Student 

public class Student{
    //Attributes
    private String firstName;
    private String lastName;
    private int studentNumber;
    private String residencyCode;
    private int creditHours;


    public Student (String argFirstName, String argLastName, int argStudentNumber, String argResidencyCode, int argCreditHours){
        firstName=argFirstName;
        lastName=argLastName;
        studentNumber=argStudentNumber;
        residencyCode=argResidencyCode;
        creditHours=argCreditHours;
    }

    public Student(String argFirstName,String argLastName,int argStudentNumber,int argCreditHours){
        firstName=argLastName;
        lastName=argLastName;
        studentNumber=argStudentNumber;
        residencyCode="IC";
        creditHours=argCreditHours;
    }


    public void setFirstName(String arg){
        firstName= arg;

    }
    public void setLastName(String arg){
        lastName=arg;
    }
    public void setStudentNumber (int arg){
        studentNumber=arg;
    }
    public void setResidencyCode(String arg){
        residencyCode=arg;
    }
    public void setCreditHours(int arg){
        creditHours=arg;
    }


    public String getFirstName (){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    public int getStudentNumber (){
        return studentNumber;
    }
    public String getResidencyCode(){
        return residencyCode;
    }
    public int getCreditHours(){
        return creditHours;
    }

    public double CheckRate(){
        double rate;
        double ICRate= 149.04;
        double OCRate= 174.22;
        double OSRate= 325.79;
        if(residencyCode.equals("IC")){
            rate= ICRate;
        }
        else if(residencyCode.equals("OC")){
            rate=OCRate;
        }
        else{
            rate=OSRate;
        }
        return rate;
        
    }

    public double CalculateTuition(){
        double tuition;
        double tuitionRate=CheckRate();
        if ((creditHours>18)){
                tuition=(creditHours-5)*tuitionRate;
                
            }
            else if(creditHours>13){
                tuition=13*tuitionRate;
                
            }
            else {
                tuition=creditHours*tuitionRate;
            }
        
        return tuition;

    }
    

}