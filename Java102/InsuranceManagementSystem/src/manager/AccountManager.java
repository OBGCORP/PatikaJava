package manager;

import util.*;

import java.util.Scanner;
import java.util.TreeSet;

public class AccountManager {
    TreeSet<Account> accounts;
    User currentUser;
    Account account;

    public AccountManager() {
        accounts = new TreeSet<>();
        run();
    }

    public void run() {
        Scanner scn = new Scanner(System.in);
        String choice = "GO";
        while (!choice.equals("3")) {
            System.out.println("1-) Create an Account");
            System.out.println("2-) Login to Account");
            System.out.println("3-) Quit");
            System.out.println("4-) Admin Login");
            System.out.print("Choice : ");
            choice = scn.nextLine();

            if (choice.equals("1")) createAccount();

            else if (choice.equals("2")) {
                System.out.print("Enter email : ");
                String email = scn.nextLine();
                System.out.print("Enter password : ");
                String password = scn.nextLine();

                login(email, password);
            } else if (choice.equals("4")) {
                System.out.println("Printing all accounts and passwords in the system ...");
                for (Account a : getAccounts())
                    System.out.println("Email : " + a.getUser().getEmail() + " Password : " + a.getUser().getPassword());

                System.out.println("Printing all InsuranceList in the system ...");
                for (Insurance a : User.getInsuranceList())
                    System.out.println("Customer name : " + a.getCustomerName() + " Insurance Name : " + a.getName() + " Total Price : " + a.getPrice() + "\n");

            }
        }

    }

    public void createAccount() {
        Scanner sc = new Scanner(System.in);
        String name, surname, email, password, job, age;
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter surname: ");
        surname = sc.nextLine();
        System.out.print("Enter email: ");
        email = sc.nextLine();
        System.out.print("Enter password: ");
        password = sc.nextLine();
        System.out.print("Enter job: ");
        job = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextLine();
        User user = new User(name, surname, email, password, job, age);

        System.out.println("Are you individual (1 for yes 0 for no): ");
        name = sc.nextLine();
        Account prop;
        if (name.equals("1")) {
            prop = new Individual(user);
        } else {
            prop = new Enterprise(user);
        }
        accounts.add(prop);
    }

    public void login(String email, String password) {
        for (Account account : accounts) {
            try {
                account.login(email, password);
                if (account.isLogin()) {
                    currentUser = account.getUser();
                    this.account = account;
                    if (account.getType() == 1) individualUserProcess();
                    else individualUserProcess();
                    break;
                }
            } catch (InvalidAuthException e) {
                System.out.println(e);
            }
        }
    }

    public void individualUserProcess() {
        System.out.println("Welcome Mr. " + currentUser.getName());
        String choice = "1";
        while (!choice.equals("q")) {
            Scanner scn = new Scanner(System.in);
            System.out.println("\n1-) Show my infos");
            System.out.println("2-) Get Insurance");
            System.out.println("3-) Show Insurance List");
            System.out.println("4-) Add Address");
            System.out.println("5-) Show All Address");
            choice = scn.nextLine();
            if (choice.equals("1")) {
                account.showUserInfo();
            } else if (choice.equals("2")) {
                InsuranceManager insuranceManager = new InsuranceManager();
                account.addInsurance(insuranceManager.createInsurance(currentUser));
            } else if (choice.equals("3")) {
                for (Insurance insurance : account.getUser().getInsuranceList()) {
                    System.out.print("\n\nName: " + insurance.getName());
                    System.out.println("Price: " + insurance.getPrice());
                }
            } else if (choice.equals("4")) account.addAddress(AddressManager.createAddress());
            else if (choice.equals("5")) {
                for (Address adr : currentUser.getAddressList()) {
                    System.out.println(adr.getAddress());
                }
            }
        }
    }

    public TreeSet<Account> getAccounts() {
        return accounts;
    }
}
