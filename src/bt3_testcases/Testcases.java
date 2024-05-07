package bt3_testcases;
import bt3_common.BaseTest;
import bt3_common.Constants;
public class Testcases extends BaseTest {
    public void loginCRM() {
        System.out.println("1. Truy cập link https://cms.anhtester.com/login");
        System.out.println("2. Nhập dữ liệu user= admin@example.com/123456");
        System.out.println("3. Nhập dữ liệu password= 123456");
        System.out.println("4. Click button Login");
        System.out.println("5. Kiểm tra màn hình đăng nhập");
    }
    public void testCRM() {
        createDriver();
        loginCRM();
        closeDriver();
    }
    ;
    public void loginCRMfail() {
        System.out.println("1. Truy cập link https://cms.anhtester.com/login");
        System.out.println("2. Nhập dữ liệu user= admin@example.com");
        System.out.println("3. Nhập dữ liệu password= 567886");
        System.out.println("4. Click button Login");
        System.out.println("5. Kiểm tra màn hình đăng nhập");
    }
    ;
    public void testCRMfail() {
        createDriver();
        loginCRMfail();
        closeDriver();
    }
    public static void main(String[] args) {
        Testcases tescase = new Testcases();
        tescase.testCRM();
        System.out.println("====================");
        tescase.testCRMfail();
    }
}
