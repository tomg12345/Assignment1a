/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentregistration.assignment1a;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

import org.joda.time.DateTime;
public class StudentTest {
	private Student student_1;
	private Student student_2;
	private Class module_1;
	private Class module_2;
	private Course course_1;
	

	@Before
	public void setUp() throws Exception {
		student_1 = new Student("BobMarley", 22, "01-01-98", 12345678);
		student_2 = new Student("KeithRichards", 21, "03-03-99", 87654321);
		
		module_1 = new Class("CT417");
		module_2 = new Class("CT418");
		
		course_1 = new Course("4BP", new DateTime("2016-09-01T00:00:00Z"), new DateTime("2020-06-31T00:00:00Z"));
	}

	
	@Test
	public void test_username() {
		String correctUsername = "BobMarley22";
		String currentUsername = student_1.getUsername();
		assertEquals("pass",correctUsername, currentUsername);
	}
	
	@Test
	public void test_course() {
		student_1.setCourses(course_1);
		Course correctCourse =  new Course("4BP", new DateTime("2016-09-01T00:00:00Z"), new DateTime("2020-06-31T00:00:00Z"));
		Course currentCourse = student_1.getCourse();	
		assertEquals("pass", correctCourse, currentCourse);
	}

	@Test
	public void test_module() {
		student_1.add(module_1);
		Class correct = new Class("CT417");
		List<Class> current= student_1.getModules();
		assertEquals("pass",current.contains(correct));
	}

	
}
