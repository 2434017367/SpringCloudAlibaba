package adap.impl;

import adap.UserLevelAdap;

/**
 * @author zhy
 * @email 2434017367@qq.com
 * @date 2023/2/8 11:12
 */
public class VipAdapImpl implements UserLevelAdap {

    @Override
    public int advTime(String userId) {
        return 0;
    }

    @Override
    public int discountRote(String userId) {
        return 5;
    }
}
