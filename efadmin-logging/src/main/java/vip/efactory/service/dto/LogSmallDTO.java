package vip.efactory.service.dto;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class LogSmallDTO implements Serializable {

    /**
     * 描述
     */
    private String description;

    /**
     * 请求ip
     */
    private String requestIp;

    /**
     * 请求耗时
     */
    private Long time;

    private String address;

    private String browser;

    private Timestamp createTime;
}
