//ex3 Laryssa Barbosa Soares - CB3031667
class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ", address=" + address + "]";
    }
}

class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[" + super.toString() + ", program=" + program + ", year=" + year + ", fee=" + fee + "]";
    }
}

class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[" + super.toString() + ", school=" + school + ", pay=" + pay + "]";
    }
}

// Classe de testes
public class Main {
    public static void main(String[] args) {
        // Testando Student
        Student s1 = new Student("Laryssa", "Praia Grande", "ADS - IFSP", 2025, 1500.0);
        System.out.println(s1); // toString

        // Testando set
        s1.setProgram("Engenharia Civil - IFSP");
        s1.setYear(2026);
        s1.setFee(1800.0);
        s1.setAddress("Cubatao");
        System.out.println(s1);

        // Testando getters
        System.out.println("Nome: " + s1.getName());
        System.out.println("Endereço: " + s1.getAddress());
        System.out.println("Programa: " + s1.getProgram());
        System.out.println("Ano: " + s1.getYear());
        System.out.println("Fee: " + s1.getFee());

        // Testando Staff
        Staff st1 = new Staff("Wellington Tuler", "Sao Paulo", "IFSP", 5000.0);
        System.out.println(st1); // toString

        // Testando set
        st1.setSchool("USP");
        st1.setPay(7000.0);
        st1.setAddress("Santos");
        System.out.println(st1);

        // Testando get
        System.out.println("Nome: " + st1.getName());
        System.out.println("Endereço: " + st1.getAddress());
        System.out.println("Escola: " + st1.getSchool());
        System.out.println("Salário: " + st1.getPay());
    }
}


