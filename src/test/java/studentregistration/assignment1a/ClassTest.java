/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentregistration.assignment1a;

import java.util.ArrayList;
import static org.junit.Assert.*;

import java.util.List;

import org.joda.time.DateTime;
import org.junit.*;

public class ClassTest {
	private Student student_1;
	private Student student_2;
	private Class module_1;
	private Course course_1;
	private Course course_2;

	
	
	@Before
	public void setUp() throws Exception {
		student_1 = new Student("BobMarley", 22, "01-01-98", 12345678);
		student_2 = new Student("KeithRichards", 21, "03-03-99", 87654321);
	
		module_1 = new Class("CT417");		
		course_1 = new Course("4BP", new DateTime("2016-09-01T00:00:00Z"), new DateTime("2020-06-31T00:00:00Z"));
		course_2 = new Course("3BP", new DateTime("2015-08-01T00:00:00Z"), new DateTime("2021-07-1T00:00:00Z"));
	}
	
	@Test
	public void test_student() {
		module_1.add(student_1);
		List<Student> current = module_1.getListStudents();
                Student correct = new Student("BobMarley", 22, "01-01-98", 12345678);
		assertEquals("pass",current.contains(correct));
	}
	
	@Test
	public void test_courses() {
		module_1.addCourses(course_1);
                module_1.addCourses(course_2);
		List<Course> correctCourses = new ArrayList<>();
                Course a = new Course("4BP", new DateTime("2016-09-01T00:00:00Z"), new DateTime("2020-06-31T00:00:00Z"));
                Course b = new Course("3BP", new DateTime("2015-08-01T00:00:00Z"), new DateTime("2021-07-1T00:00:00Z"));
                correctCourses.add(a);
                correctCourses.add(b);
		List<Course> currentCourses= module_1.getListCourse();
		assertEquals("pass", correctCourses, currentCourses);
	}
}
