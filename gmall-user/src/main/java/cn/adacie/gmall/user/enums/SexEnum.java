package cn.adacie.gmall.user.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;

/**
 * @author zhou_qiang
 * @date 2019/10/20
 */
public enum SexEnum implements IEnum<Integer> {

    MALE(1, "男"),
    FEMALE(2, "女");

    private int value;
    private String desc;

    SexEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    @Override
    public Integer getValue() {
        return this.value;
    }

    @JsonValue
    public String getDesc(){
        return this.desc;
    }

    @Override
    public String toString() {
        return this.desc;
    }
}
