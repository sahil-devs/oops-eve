class Enrollment {

    String id;
    String learner;
    String course;
    double fee;
    String status;

    Enrollment(String id, String learner, String course, double fee) {
        this(id, learner, course, fee, "Pending");
    }

    Enrollment(String id, String learner, String course, double fee, String status) {

        this.id = id;
        this.learner = learner;
        this.course = course;
        this.fee = fee;
        this.status = status;
    }

    void display() {

        System.out.println("ID: " + id);
        System.out.println("Learner: " + learner);
        System.out.println("Course: " + course);
        System.out.println("Fee: Rs." + fee);
        System.out.println("Payment Status: " + status);
    }
}

public class day12_3 {

    public static void main(String[] args) {

        Enrollment e1 = new Enrollment("E101", "Aman", "Java Programming", 12000);
        Enrollment e2 = new Enrollment("E102", "Neha", "Python", 15000, "Paid");

        e1.display();
        System.out.println();
        e2.display();
    }
}