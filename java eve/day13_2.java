class Session {

    String topic;
    int duration;
    String trainer;
    String room;

    Session(String topic, int duration, String trainer, String room) {
        this.topic = topic;
        this.duration = duration;
        this.trainer = trainer;
        this.room = room;
    }

    Session(String topic, int duration) {
        this(topic, duration, "Mahendra Yadav", "Lab 3");
    }

    Session(String topic) {
        this(topic, 2);
    }

    void display() {
        System.out.println("Topic: " + topic);
        System.out.println("Duration: " + duration + " Hours");
        System.out.println("Trainer: " + trainer);
        System.out.println("Room: " + room);
    }
}

public class day13_2 {
    public static void main(String[] args) {

        Session s1 = new Session("Java Arrays");
        Session s2 = new Session("Java OOP", 3);
        Session s3 = new Session("Java Strings", 2, "Rahul", "Lab 5");

        s1.display();
        System.out.println();

        s2.display();
        System.out.println();

        s3.display();
    }
}