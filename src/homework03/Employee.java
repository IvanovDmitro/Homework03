package homework03;

public class Employee {
    private String firstName;
    private String secondName;
    private String jobTitle;
    private String email;
    private String phone;
    private int age;

    public Employee(String firstName, String secondName, String jobTitle,
                    String email, String phone, int age) {
        if (firstName.isEmpty()) {
            System.out.println("First name cannot be empty");
        } else {
            this.firstName = firstName;
        }
        if (secondName.isEmpty()) {
            System.out.println("Second name cannot be empty");
        } else {
            this.secondName = secondName;
        }
        if (jobTitle.isEmpty()) {
            System.out.println("Job title cannot be empty");
        } else {
            this.jobTitle = jobTitle;
        }
        if (email.isEmpty()) {
            System.out.println("Email cannot be empty");
        } else {
            this.email = email;
        }
        if (phone.isEmpty()) {
            System.out.println("Phone cannot be empty");
        } else {
            this.phone = phone;
        }
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative number");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
