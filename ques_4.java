class Pen {}
class Pencil {}
class Course {}
class College {}
class Tuition {}
class Oracle {}
class It {}
class Mouse {}
class Study {}
class Education {}
class Student {}

class StudentClass 
{
    Study show(Pen p, Pencil pencil) 
    {
        System.out.println("show() method...");
        Study patha = new Study();
        return patha;
    }
    Education display(Course c, College clg, Tuition t) 
    {
        System.out.println("display() method...");
        Education samudra = new Education();
        return samudra;
    }
    Student study(Oracle o, It it, Mouse micky) 
    {
        System.out.println("study() method...");
        Student hmm = new Student();
        return hmm;
    }
    public static void main(String[] args) 
    {
        StudentClass institute = new StudentClass();
        Pen myPen = new Pen();
        Pencil myPencil = new Pencil();
        Study myStudy = institute.show(myPen, myPencil);
        System.out.println("show() method returns value = " +myStudy);

        Course myCourse = new Course();
        College myCollege = new College();
        Tuition myTuition = new Tuition();
        Education myEducation = institute.display(myCourse, myCollege, myTuition);
        System.out.println("display() method returns value = " +myEducation);

        Oracle myOracle = new Oracle();
        It myIt = new It();
        Mouse myMouse = new Mouse();
        Student myStudent = institute.study(myOracle, myIt, myMouse);
        System.out.println("study() method returns value = " +myStudent);
    }
}
