package util;
import java.util.ArrayList;
import java.util.Objects;

public abstract class Account implements Comparable<Account> {
    enum AuthenticationStatus {SUCCESS, FAIL}

    User user;
    ArrayList<Insurance> insuranceList;
    AuthenticationStatus status;
    private int type;

    public final void showUserInfo() {
        System.out.println("Account Information: \nName : "+user.getName()+"\nSurname : "+user.getSurname()+"\nE-mail : "+user.getEmail()+"\nJob : "+user.getJob()+"\nAge : " + user.getAge()+"\nLast Activate Date : "+user.getLastLogin());
    }

    public void login(String email, String password) throws InvalidAuthException{

        if( !(user.getEmail().equals(email) && user.getPassword().equals(password)) ){
            status = AuthenticationStatus.FAIL;
            throw new InvalidAuthException("Invalid Password or Email!");
        }
        else{
            status = AuthenticationStatus.SUCCESS;
            user.setLastLogin();
        }

    }

    public abstract void addAddress(Address address);
    public abstract void removeAddress(Address address);

    public boolean isLogin(){
        return status == AuthenticationStatus.SUCCESS;
    }

    public void setStatus(AuthenticationStatus status){
        this.status = status;
    }

    public void setUser(User user){
        this.user = user;
    }

    public void setInsuranceList(ArrayList<Insurance> insuranceList){
        this.insuranceList = insuranceList;
    }

    public abstract void addInsurance(Insurance i);

    public User getUser(){return user;}

    public void setType(int a){type = a;}

    public int getType(){return type;}

    @Override
    public int compareTo(Account o) {
        return this.hashCode() - o.hashCode();
    }

    @Override
    public int hashCode(){
        return Objects.hash(user);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass() ) return false;
        Account account = (Account) obj;
        return Objects.equals(user, account.user);
    }

}

