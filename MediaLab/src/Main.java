public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("S001", "Anna Kowalska", "12c", 120);
        Student student2 = new Student("S002", "Marek Nowak", "12c", 40);

        Equipment laptop1 = new LaptopSet("E001", "Lenovo", 80.0, 32, true);
        Equipment laptop2 = new LaptopSet("E002", "Dell", 100.0, 16, false);

        Equipment camera1 = new CameraKit("E003", "Sony", 90, 3, true);
        Equipment camera2 = new CameraKit("E004", "Canon", 70, 1, true);
    }
}