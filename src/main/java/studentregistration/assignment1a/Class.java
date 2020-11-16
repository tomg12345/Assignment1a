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
/**
 *
 * @author tgord
 */
public class Class {
    private String moduleName;
    private int moduleId;
    private List<Student> students;
    private List<Course> listCourses;

    
    public Class(String name){
        this.moduleName = name;
        this.students = new ArrayList<Student>();
        this.listCourses = new ArrayList<Course>();
       
    }
    //getters and setters
    public String getName(){
            return moduleName;
    }
    
    public void setName(String n){
        moduleName = n;
    }
    
    public int getId(){
            return moduleId;
    }
    
    public void setId(int id){
        moduleId = id;
    }
    
    public List<Student> getListStudents(){
            return students;
    }
    
    public void add(Student student1){
            students.add(student1);
    
    }

    public List<Course> getListCourse(){
            return listCourses;
    }
    
    public void addCourses(Course courses){
        listCourses.add(courses);
        
    }
}
