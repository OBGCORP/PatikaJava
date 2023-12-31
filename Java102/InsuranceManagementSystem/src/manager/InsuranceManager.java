package manager;

import util.Insurance;
import util.User;

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class InsuranceManager {
    InsuranceManager(){}
    public Insurance createInsurance(User user){
        Scanner scn = new Scanner(System.in);
        System.out.println("Select one type of Insurance: ");
        System.out.println("1-) Health\n2-) Residence\n3-) Travel\n4-) Car");
        String choice = scn.nextLine();
        System.out.print("Enter amount: ");
        double price = scn.nextInt();
        if(choice.equals("1")) return new HealthInsurance(user, "Health Insurance", price*1.23, Date.from(Instant.now()));
        if(choice.equals("2")) return new ResidenceInsurance(user, "Residence Insurance", price*1.32, Date.from(Instant.now()));
        if(choice.equals("3")) return new TravelInsurance(user, "Travel Insurance", price*2.4, Date.from(Instant.now()));
        return new CarInsurance(user,"Car Insurance", price*1.62, Date.from(Instant.now()));
    }
}

class HealthInsurance extends Insurance {
    HealthInsurance(User user, String name, double price, Date date) {
        super(user,name, price, date);
    }
    @Override
    public double calculate(){
        return super.getPrice();
    }
}

class ResidenceInsurance extends Insurance {
    ResidenceInsurance(User user,String name, double price, Date date) {
        super(user, name, price, date);
    }
    @Override
    public double calculate(){
        return super.getPrice();
    }
}

class TravelInsurance extends Insurance {
    TravelInsurance(User user,String name, double price, Date date) {
        super(user, name, price, date);
    }
    @Override
    public double calculate(){
        return super.getPrice();
    }
}

class CarInsurance extends Insurance {
    CarInsurance(User user, String name, double price, Date date) {
        super(user, name, price, date);
    }
    @Override
    public double calculate(){
        return super.getPrice();
    }
}