package CSE203.lab5.p2;

import java.util.HashSet;
import java.util.Set;

public class InstructorSet {
    Set<Instructor> instructors = new HashSet<>();

    public void printAll() {
        StringBuilder sb = new StringBuilder();
        for (Instructor i : instructors) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }

    public void searchByOfficeNumber(String officeNumber) {
        for (Instructor i : instructors) {
            if (i.getOfficeNumber().equals(officeNumber)) {
                System.out.println(i);
            }
        }
    }

    public boolean isExisted(String lastName, String firstName, String officeNumber) {
        return instructors.contains(new Instructor(lastName, firstName, officeNumber));
    }
}