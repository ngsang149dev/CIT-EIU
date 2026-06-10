package CSE203.lab5.p2;

import java.util.Objects;

public class Instructor {
	private String lastName; // Last name
	private String firstName; // First name
	private String officeNumber; // Office number

	/**
	 * This constructor initializes the last name,
	 * first name, and office number.
	 * 
	 * @param lname  The instructor's last name.
	 * @param fname  The instructor's first name.
	 * @param office The office number.
	 */

	public Instructor(String lname, String fname,
			String office) {
		lastName = lname;
		firstName = fname;
		officeNumber = office;
	}

	/**
	 * The copy constructor initializes the object
	 * as a copy of another Instructor object.
	 * 
	 * @param copiedObject The object to copy.
	 */

	public Instructor(Instructor copiedObject) {
		lastName = copiedObject.lastName;
		firstName = copiedObject.firstName;
		officeNumber = copiedObject.officeNumber;
	}

	public void set(String lname, String fname,
			String office) {
		lastName = lname;
		firstName = fname;
		officeNumber = office;
	}

	public String toString() {
		return "Last Name: " + lastName +
				" First Name: " + firstName +
				" Office Number: " + officeNumber;
	}

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Instructor)) return false;
        Instructor other = (Instructor) obj;
        return this.officeNumber.equals(other.officeNumber)
        && this.firstName.equals(other.firstName) &&
        this.lastName.equals(other.lastName);
    }

    public int hashCode() {
        return Objects.hash(officeNumber);
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    
}