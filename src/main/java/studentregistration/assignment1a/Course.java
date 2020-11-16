/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentregistration.assignment1a;

/**
 *
 * @author tgord
 */
import java.util.List;
import java.util.ArrayList;
import org.joda.time.DateTime;
/**
 *
 * @author tgord
 */
public class Course {
    private String name;
    private List<Class> modules;
    private List<Student> students;
    private DateTime startDate, endDate;
    
    public Course(String n, DateTime s, DateTime e){
        name = n;
        modules = new ArrayList<Class>();
        this.students = new ArrayList<Student>();
        startDate = s;
        endDate = e;
    }
    
    //getters and setters
    public String getName(){
            return name;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public List<Student> getListStudents(){
            return students;
    }
    
    public void setListStudents(List<Student> students){
        students = students;
        
    }
    
    public List getModules(){
            return modules;
    }
    
    public void setModules(Class module_1, Class module_2){
        modules.add(module_1);
        modules.add(module_2);
    }
    
    public void add(Student student){
        students.add(student);
    }
    
}
