package com.example.demo.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.WebAppResponse;
import com.example.demo.constant.HttpStatus;
import com.example.demo.pojo.DeviceTemplateVo;
import com.example.demo.response.TableDataInfo;
import com.example.demo.vo.CaptchaReqVo;
import com.example.demo.vo.TaskReqWVo;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  获取验证码
 * </p>
 *
 * @author stvelzhang
 * @since 2021-03-30
 */
@RestController
@CrossOrigin
@RequestMapping("/captchacode")
public class CaptchaCodeController {

    @CrossOrigin
    @PostMapping("/code")
    public @ResponseBody
    WebAppResponse getCaptchaCode(@RequestBody CaptchaReqVo captchaReqVo){

        if(captchaReqVo.getType().equals("phone")){
            return  WebAppResponse.success("123456","验证码获取成功");

        }else  if(captchaReqVo.getType().equals("email")){
            return  WebAppResponse.success("654321","验证码获取成功");
        }


        return WebAppResponse.success();
    }

}

