package co.topc.base.message.sms.constant;

/**
 * 发送短信业务场景枚举类
 *
 * @author fantao
 * @date 2019/9/18 23:41
 */
public enum SendWhenEnum {

    LOGIN("1", "登陆注册");

    SendWhenEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * 根据code获取name
     *
     * @param code
     * @return
     */
    public static String getName(String code) {
        for (SendWhenEnum sendWhenEnum : SendWhenEnum.values()) {
            if (sendWhenEnum.getCode().equals(code)) {
                return sendWhenEnum.name;
            }
        }
        return null;
    }

    private String code;
    private String name;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
