package cn.adacie.gmall.user.entity;

import cn.adacie.gmall.user.enums.SexEnum;
import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

/**
 * @author zhou_qiang
 * @Description 用户实体类
 * @date 2019/10/19
 */

@Data
@TableName("ums_member")  // 数据库中的表名
public class UserEntity {
    @TableId(type = IdType.AUTO)
    private long id;
    private long memberLevelId;
    private String username;
    private String password;
    private String nickname;
    private String phone;
    private long status;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    private String icon;
    private SexEnum gender;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private String city;
    private String job;
    private String personalizedSignature;
    private long sourceType;
    private long integration;
    private long growth;
    private long luckeyCount;
    private long historyIntegration;

    public long getId() {
        return id;
    }
}