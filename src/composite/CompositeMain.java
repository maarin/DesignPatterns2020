package composite;

public class CompositeMain {
    public static void main(String[] args) {
        Developer dev1 = new Developer("Ivan", 2000); // leaf node
        Developer dev2 = new Developer("Peter", 3000); // leaf node

        Manager manager1 = new Manager("Georgi", 4000); // branch node
        manager1.add(dev1);
        manager1.add(dev2);

        Developer dev3 = new Developer("Stoian", 4500); // leaf node
        Manager manager2 = new Manager("Petkan", 5000); // Root node
        manager2.add(manager1);
        manager2.add(dev3);

        manager2.printData();
    }
}
