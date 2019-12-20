import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */
class Student
{int id;
String name;
double cgp;

    Student(int id,String name,double cgp)
    {this.id=id;
    this.name=name;
    this.cgp=cgp;}
    int getID()
    {return id;}
    String getName()
    {return name;}
    double getCGPA()
    {return cgp;}
}
class Priorities
{
    List<Student> getStudents(List<String> events)
    {
        PriorityQueue<Student>pq=new PriorityQueue(Comparator.comparing(Student::getCGPA).reversed().thenComparing(Student::getName).thenComparing(Student::getID));
        for(String e:events)
        {Scanner s=new Scanner(e);
        String event=s.next();
        if(event.equals("ENTER"))
        {String name=s.next();
        double cgp=s.nextDouble();
        int id=s.nextInt();
        Student st=new Student(id,name,cgp);
        pq.add(st);}
        else if(event.equals("SERVED"))
        {Student st=pq.poll();}}
        List<Student>student=new ArrayList<Student>();
        Student st=pq.poll();
        if(st==null)
        return student;
        else
        {while(st!=null)
        {student.add(st);
        st=pq.poll();}}
        return student;
    }
}
