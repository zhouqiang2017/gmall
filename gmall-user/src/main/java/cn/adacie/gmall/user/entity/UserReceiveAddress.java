package cn.adacie.gmall.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author zhou_qiang
 * @date 2019/10/20
 */
@Data
@TableName("ums_member_receive_address")
public class UserReceiveAddress {
    @TableId(type = IdType.AUTO)
    private long id;
    private long memberId;
    private String name;
    private String phoneNumber;
    private long defaultStatus;
    private String postCode;
    private String province;
    private String city;
    private String region;
    private String detailAddress;
}
