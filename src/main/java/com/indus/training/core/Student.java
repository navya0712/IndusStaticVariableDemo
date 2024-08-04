package com.indus.training.core;

import java.util.Objects;

/**
 * The Student class represents a student with a first name, last name, roll
 * number, and static attributes for the teacher and grade.
 */
public class Student {

	private String firstName;
	private String lastName;
	private String rollNo;
	private static String teacher;
	private static String grade;

	/**
	 * Default constructor for Student.
	 */
	public Student() {
		super();
	}

	/**
	 * Constructs a Student with the specified first name, last name, and roll
	 * number.
	 *
	 * @param firstName the first name of the student
	 * @param lastName  the last name of the student
	 * @param rollNo    the roll number of the student
	 */
	public Student(String firstName, String lastName, String rollNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNo = rollNo;
	}

	/**
	 * Returns the first name of the student.
	 *
	 * @return the first name of the student
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name of the student.
	 *
	 * @param firstName the first name of the student
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Returns the last name of the student.
	 *
	 * @return the last name of the student
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name of the student.
	 *
	 * @param lastName the last name of the student
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Returns the roll number of the student.
	 *
	 * @return the roll number of the student
	 */
	public String getRollNo() {
		return rollNo;
	}

	/**
	 * Sets the roll number of the student.
	 *
	 * @param rollNo the roll number of the student
	 */
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	/**
	 * Returns the teacher associated with the student.
	 *
	 * @return the teacher associated with the student
	 */
	public static String getTeacher() {
		return teacher;
	}

	/**
	 * Sets the teacher associated with the student.
	 *
	 * @param teacher the teacher associated with the student
	 */
	public static void setTeacher(String teacher) {
		Student.teacher = teacher;
	}

	/**
	 * Returns the grade of the student.
	 *
	 * @return the grade of the student
	 */
	public static String getGrade() {
		return grade;
	}

	/**
	 * Sets the grade of the student.
	 *
	 * @param grade the grade of the student
	 */
	public static void setGrade(String grade) {
		Student.grade = grade;
	}

	/**
	 * Returns the hash code value for the object.
	 *
	 * @return the hash code value for the object
	 */
	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, rollNo);
	}

	/**
	 * Compares this student to the specified object. The result is true if and only
	 * if the argument is not null and is a Student object that has the same first
	 * name, last name, and roll number as this object.
	 *
	 * @param obj the object to compare this Student against
	 * @return true if the given object represents a Student equivalent to this
	 *         student, false otherwise
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(rollNo, other.rollNo);
	}

	/**
	 * Returns a string representation of the object.
	 *
	 * @return a string representation of the object
	 */
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", rollNo=" + rollNo + "]";
	}

}
