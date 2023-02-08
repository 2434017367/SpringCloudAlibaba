package service;

import adap.UserLevelAdap;
import user.User;

/**
 * @author zhy
 * @email 2434017367@qq.com
 * @date 2023/2/8 11:03
 */
public class UserService {

    public int advTime(String userId) {
        User userById = User.getUserById(userId);
        UserLevelAdap dispClass = userById.getUserLevelEnum().getDispClass();

        return dispClass.advTime(userId);
    }

    public int discountRote(String userId) {
        User userById = User.getUserById(userId);
        UserLevelAdap dispClass = userById.getUserLevelEnum().getDispClass();

        return dispClass.discountRote(userId);
    }

}
