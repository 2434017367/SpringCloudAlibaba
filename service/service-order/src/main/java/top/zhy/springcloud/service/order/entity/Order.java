package top.zhy.springcloud.service.order.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhy
 * @email 2434017367@qq.com
 * @date 2023/2/3 15:12
 */
@Data
@TableName("`order`")
public class Order implements Serializable {

    @TableId(type = IdType.ASSIGN_UUID)
    private String id;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date orderTime;

    private String commodityName;

    private Integer orderNum;

}
