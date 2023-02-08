package user;

import adap.UserLevelAdap;
import adap.impl.OrdinaryAdapImpl;
import adap.impl.VipAdapImpl;

/**
 * @author zhy
 * @email 2434017367@qq.com
 * @date 2023/2/8 11:13
 */
public enum UserLevelEnum {

    ord("o", new OrdinaryAdapImpl()),

    vip("v", new VipAdapImpl());

    private final String level;

    private final UserLevelAdap dispClass;

    UserLevelEnum(String level, UserLevelAdap dispClass) {
        this.level = level;
        this.dispClass = dispClass;
    }

    public String getLevel() {
        return level;
    }

    public UserLevelAdap getDispClass() {
        return dispClass;
    }

}
