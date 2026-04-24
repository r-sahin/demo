package odev39;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary > 1000) {
            return salary * 0.03;
        } else {
            return 0;
        }
    }


    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30.0;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int currentYear = 2021;
        int workYear = currentYear - hireYear;
        if (workYear < 10) {
            return salary * 0.05;
        } else if (workYear < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    public void toStringEmployee() {
        double vergi = tax();
        double bonus = bonus();
        double zam = raiseSalary();
        double vergiVeBonusIleMaas = salary - vergi + bonus;
        double toplamMaas = salary - vergi + bonus + zam;

        System.out.println("Adı : " + name);
        System.out.println("Maaşı : " + salary);
        System.out.println("Çalışma Saati : " + workHours);
        System.out.println("Başlangıç Yılı : " + hireYear);
        System.out.println("Vergi : " + vergi);
        System.out.println("Bonus : " + bonus);
        System.out.println("Maaş Artışı : " + zam);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + vergiVeBonusIleMaas);
        System.out.println("Toplam Maaş : " + toplamMaas);
    }




}
