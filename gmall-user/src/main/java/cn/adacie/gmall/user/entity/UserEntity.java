package cn.adacie.gmall.user.entity;

import cn.adacie.gmall.user.enums.SexEnum;
import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
import java.util.List;

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
    @JsonFormat(pattern = "yyyy-MM-dd")
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
    //一对多关系映射   主表实体类应该包含从表实体类的集合引用
    private List<UserReceiveAddress> userReceiveAddresses;

    public List<UserReceiveAddress> getUserReceiveAddresses() {
        return userReceiveAddresses;
    }

    public void setUserReceiveAddresses(List<UserReceiveAddress> userReceiveAddresses) {
        this.userReceiveAddresses = userReceiveAddresses;
    }

    public long getId() {
        return id;
    }
}