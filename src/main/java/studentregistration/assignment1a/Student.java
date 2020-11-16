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
import org.joda.time.DateTime;
import java.util.List;
import java.util.ArrayList;
import org.joda.time.DateTime;
/**
 *
 * @author tgord
 */
public class Student {
    private String name;
    private int age;
    private String dob;
    private int id;
    private String username;
    private Course course;
    private List<Class> modules;

    
    public Student(String name, int age, String dob, int id){
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        modules = new ArrayList<Class>();
        
        
        }
    //getters and setters
    
    public String getName(){
            return name;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public int getAge(){
            return age;
    }
    
    public void setAge(int a){
        age= a;
    }
    
    
    public String getDob(){
            return dob;
    }
    
    public void setDob(String dob){
        this.dob = dob;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
        public int getId(){
            return id;
    }
    
    public String getUsername(){
        String u = name + id;
            return u;
            
    }
    
    public void setUserName(String user){
        username = user;
    }
    
    public Course getCourse(){
            return course;
    }
    
    public void setCourses(Course course){
        this.course = course;
    }
    
    public List getModules(){
            return modules;
    }
    
    public void setModules(List<Class> modules){
        this.modules = modules;
    }
    
    public void add(Class module){
        modules.add(module);
    }
    
    
}
