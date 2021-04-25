package fju.edu.cust;

public class SeliverCustomer extends Customer {
    float discount = 0.1f;
    public SeliverCustomer(String id ,int amount){
        super(id, amount);
    }
    @Override
    public int getTotal() {
        return amount - (int)(amount * discount);
    }


}
