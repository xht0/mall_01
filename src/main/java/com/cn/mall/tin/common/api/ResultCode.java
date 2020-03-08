package com.cn.mall.tin.common.api;

/**
 * ClassName: ResultCode
 * Description:
 * date: 2020/3/8 12:52
 *
 * @author XuHongTao
 * @since JDK 1.8
 */
public enum  ResultCode implements IErrorCode {
    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    VALIDATE_FAILED(404, "参数检验失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期！"),
    FORBIDDEN(403, "没有相关权限");
    private long code;
    private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
