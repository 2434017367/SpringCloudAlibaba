import service.UserService;

/**
 * @author zhy
 * @email 2434017367@qq.com
 * @date 2023/2/8 11:18
 */
public class Main {

    private final static UserService userService = new UserService();

    public static void main(String[] args) {
        int advTime = userService.advTime("1");
        System.out.println("advTime = " + advTime);
    }

}
