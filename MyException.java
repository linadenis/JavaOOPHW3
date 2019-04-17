package Exceptions;

public class MyException extends Exception{
    private String message;

    public MyException(String message) {
        this.message = message;
    }

    public MyException() {
    }

    @Override
    public String getMessage(){
        return message;
    }
}
