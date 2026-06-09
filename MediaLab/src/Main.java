public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("S001", "Anna Kowalska", "12c", 120);
        Student student2 = new Student("S002", "Marek Nowak", "12c", 40);

        System.out.println("Studenci:");
        System.out.println("- " + student1.getFullName() + " (Punkty: " + student1.getLoyaltyPoints() + ")");
        System.out.println("- " + student2.getFullName() + " (Punkty: " + student2.getLoyaltyPoints() + ")");
        System.out.println();

        Equipment laptop1 = new LaptopSet("E001", "Lenovo ThinkPad Lab", 80.0, 32, true);
        Equipment laptop2 = new LaptopSet("E002", "Dell XPS Demo", 100.0, 16, false);
    }
}