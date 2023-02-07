package top.zhy.springcloud.service.stock.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author zhy
 * @email 2434017367@qq.com
 * @date 2023/2/3 15:54
 */
@Data
@TableName("`stock`")
public class Stock implements Serializable {

    @TableId(type = IdType.ASSIGN_UUID)
    private String id;

    private String orderId;

    private Integer stockNum;

}
