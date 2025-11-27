class EmptyNameException extends Exception {
    public String toString() {
        return "Error: Student name cannot be empty!";
    }
}

class UnderageException extends Exception {
    public String toString() {
        return "Error: Age must be 17 or above for admission!";
    }
}

class InvalidPercentageException extends Exception {
    public String toString() {
        return "Error: Percentage must be between 0 and 100!";
    }
}

class NotFitForAdmissionException extends Exception {
    public String toString() {
        return "Error: Minimum 35% required for admission!";
    }
}

class FeesNotPaidException extends Exception {
    public String toString() {
        return "Error: No fees paid. Please pay at least 30% of course fees!";
    }
}

class InsufficientFeesException extends Exception {
    public String toString() {
        return "Error: Fees paid is less than 30% of total course fees!";
    }
}

class AdmissionForm {
    String studentName;
    int age;
    double percentage;
    double courseFees;
    double feesPaid;

    AdmissionForm(String studentName, int age, double percentage, double courseFees, double feesPaid) {
        this.studentName = studentName;
        this.age = age;
        this.percentage = percentage;
        this.courseFees = courseFees;
        this.feesPaid = feesPaid;
    }

    public void validateForm() throws EmptyNameException, UnderageException,
            InvalidPercentageException, NotFitForAdmissionException,
            FeesNotPaidException, InsufficientFeesException {

        if (studentName == null || studentName.trim().equals("")) {
            throw new EmptyNameException();
        }

        if (age < 17) {
            throw new UnderageException();
        }

        if (percentage < 0 || percentage > 100) {
            throw new InvalidPercentageException();
        }

        if (percentage < 35) {
            throw new NotFitForAdmissionException();
        }

        if (feesPaid == 0) {
            throw new FeesNotPaidException();
        }

        if (feesPaid < 0.30 * courseFees) {
            throw new InsufficientFeesException();
        }

        System.out.println("Admission Successful!");
    }

    public String toString() {
        return "\n--- Admission Form Details ---\n" +
                "Name: " + studentName +
                "\nAge: " + age +
                "\nPercentage: " + percentage +
                "\nCourse Fees: " + courseFees +
                "\nFees Paid: " + feesPaid;
    }
}

public class AdmissionTest {
    public static void main(String[] args) {

        AdmissionForm form = new AdmissionForm("Yash", 17, 78.5, 50000, 20000);

        System.out.println(form.toString());

        try {
            form.validateForm();
        } catch (EmptyNameException e) {
            System.out.println(e);
        } catch (UnderageException e) {
            System.out.println(e);
        } catch (InvalidPercentageException e) {
            System.out.println(e);
        } catch (NotFitForAdmissionException e) {
            System.out.println(e);
        } catch (FeesNotPaidException e) {
            System.out.println(e);
        } catch (InsufficientFeesException e) {
            System.out.println(e);
        }
    }
}
