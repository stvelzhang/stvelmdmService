package com.example.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 
 * </p>
 *
 * @author stvelzhang
 * @since 2021-03-30
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CaptchaReqVo {


    private String type;

    private String name;

    private String phone;

    private String email;


}
