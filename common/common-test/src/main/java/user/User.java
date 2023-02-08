package user;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhy
 * @email 2434017367@qq.com
 * @date 2023/2/8 11:02
 */
@Data
public class User {

    private String id;

    private String username;

    private String password;

    private UserLevelEnum userLevelEnum;

    private final static List<User> user_list = new ArrayList<>();
    static {
        User user = new User();
        user.setId("1");
        user.setUsername("赵四");
        user.setPassword("dddd");
        user.setUserLevelEnum(UserLevelEnum.ord);
        user_list.add(user);

        User user1 = new User();
        user1.setId("2");
        user1.setUsername("刘能");
        user1.setPassword("dddd");
        user1.setUserLevelEnum(UserLevelEnum.vip);
        user_list.add(user1);
    }

    public static User getUserById(String id) {
        for (User user : user_list) {
            if (id.equals(user.getId())) {
                return user;
            }
        }
        return null;
    }

}
