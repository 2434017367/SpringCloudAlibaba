package adap.impl;

import adap.UserLevelAdap;

/**
 * @author zhy
 * @email 2434017367@qq.com
 * @date 2023/2/8 11:11
 */
public class OrdinaryAdapImpl implements UserLevelAdap {

    private UserLevelAdap userLevelAdap;

    public OrdinaryAdapImpl() {

    }

    public OrdinaryAdapImpl(UserLevelAdap userLevelAdap) {
        this.userLevelAdap = userLevelAdap;
    }

    @Override
    public int advTime(String userId) {
        return userLevelAdap.advTime(userId);
    }

    @Override
    public int discountRote(String userId) {
        return 8;
    }
}
