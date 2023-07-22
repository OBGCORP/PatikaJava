package util;

public class InvalidAuthException extends Exception{
    public InvalidAuthException(String msg){
        super(msg);
        System.out.println("Invalid password.");
    }
}