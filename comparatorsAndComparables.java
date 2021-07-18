--------------------

package comparatorsAndComparables;

public class Student implements Comparable<Student> {
//public class Student { // comparator
	int marks;
	String name;
	
	// Steps to plain old java object POJO 
	
	// 1. source -> Generate Constructor using field 
	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}

	// 2. source -> generate toString()
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}

	// 3. source -> generate getters and setters
	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// ** comparable -- compare current obj with this obj and return an int
	// returned --  +ve -> current obj < this obj (in case of descending order)
	//				-ve -> current obj > this obj (in case of descending order)
	//				0   -> current obj = this obj (in case of descending order)
	@Override // comparable
	public int compareTo(Student obj) {
		
		if (this.marks > obj.marks) return -1;
		else if (this.marks < obj.marks) return 1;
//		return 0;
		
//		if both are same sort by name
		return this.name.compareTo(obj.name);
	}
	
}

--------------------
  
  
package comparatorsAndComparables;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		
		students.add(new Student(23, "Ram"));
		students.add(new Student(35, "Shyam"));
		students.add(new Student(83, "Rohit"));
		students.add(new Student(13, "Rohit"));
		students.add(new Student(35, "Anuj"));
		
		// sorting in decreasing order
//		Collections.sort(students); //comparable
//		Collections.sort(students, new SortByNameThenMarks()); // comparator

//		Collections.sort(students, (o1, o2) -> {
//			if (o1.name.equals(o2.name)) {
//				return o1.marks - o2.marks;
//			} else {
//				return o1.name.compareTo(o2.name);
//			}
//		});
//		
		// compare with only name
//		Collections.sort(students, (o1, o2) -> o1.name.compareTo(o2.name));
		Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks));
		
		students.forEach(System.out::println);
	}
	
}

//class SortByNameThenMarks implements Comparator<Student>{
//	
//	// returns +ve -> o1 > o2 (decreasing order)
//	// 		   -ve -> 01 < o2 (decreasing order)
//	// 		     0 -> o1 = o2 (decreasing order)
//	@Override
//	public int compare(Student o1, Student o2) {
//	
//		if (o1.name.equals(o2.name)) {
//			return o1.marks - o2.marks;
//		} else {
//			return o1.name.compareTo(o2.name);
//		}
//	
//	}
//	
//}

--------------------
