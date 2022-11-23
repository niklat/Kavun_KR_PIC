
public class Magazine {
    private volatile static Magazine instance;
    private String schoolMagazine;
    public static Magazine getInstance() {
        if (instance == null) {
            instance = new Magazine();
        }
        return instance;
    }
    private Magazine() {
        this.schoolMagazine = "Математика, Фізика";
    }

    public void addNewSubject(String subject) {
        System.out.println("Subject added!");
        schoolMagazine += ", " + subject;
    }

    public void readSubject() {
        System.out.println(schoolMagazine);
    }
}