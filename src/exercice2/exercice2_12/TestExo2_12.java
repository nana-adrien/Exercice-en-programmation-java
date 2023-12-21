package exercice2.exercice2_12;
import java.util.Date;

public class TestExo2_12 {
    public static void main(String[] args) {
        Patient patient1=new Patient("adrien","nana",new Date(2000,07,21),'h');
        System.out.println("age="+patient1.getAge());
    }

}
