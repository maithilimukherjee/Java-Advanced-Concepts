enum Status{
    RUNNING,
    FAILED,
    PENDING,
    SUCCESS;
}

public class Enum2{
    public static void main(String[] args) {
        Status s = Status.FAILED;

        if(s == Status.FAILED){
            System.out.println("The process has failed.");
        } else {
            System.out.println("The process is not failed.");
        }

    }
}