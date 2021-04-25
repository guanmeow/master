package fju.edu.cust;

public class Tester2 {
    public static void main(String[] args) {
        Customer c = new Customer("0001",500);
        SeliverCustomer sc = new SeliverCustomer("1001",50000);
        c.getTotal();
        sc.getTotal();
        System.out.println(c.id+"\t"+c.amount+"\t"+c.getTotal());
        System.out.println(sc.id+"\t"+sc.amount+"\t"+sc.getTotal());
    }
}
