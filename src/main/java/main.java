import java.text.SimpleDateFormat;
import java.util.Calendar;

public class main {
    public static void main(String[] args){
        while (true){
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
            System.out.println(time.format(cal.getTime()));
            System.out.flush();
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
