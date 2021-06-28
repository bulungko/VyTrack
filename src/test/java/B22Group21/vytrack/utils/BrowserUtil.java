package B22Group21.vytrack.utils;

public class BrowserUtil {
    public static void sleep(int second)  {
        second *= 1000;

        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("Something is happening on Thread.sleep method");
        }

    }
}
