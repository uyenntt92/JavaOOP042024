package bt3_common;
public class BaseTest {
    public void createDriver(){
        Constants constants = new Constants();
        System.out.println("browser:" + Constants.browser);
        System.out.println("report:" +Constants.report);
        System.out.println("headless:" + Constants.headless);
    }
    public void closeDriver(){
        Constants constants = new Constants();
        System.out.println("Close Browser:" +Constants.browser);
}
public void closeDriver(String browser){
    System.out.println("closeDriver" + Constants.browser);
}
}
