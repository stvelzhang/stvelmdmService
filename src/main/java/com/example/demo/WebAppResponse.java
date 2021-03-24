package com.example.demo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "通用响应数据结构类")
public class WebAppResponse {
  @ApiModelProperty(value="请求是否处理成功")
  private boolean isok;  //请求是否处理成功
  @ApiModelProperty(value="请求响应状态码",example="200、400、500")
  private int code; //请求响应状态码（200、400、500）
  @ApiModelProperty(value="请求结果描述信息")
  private String message;  //请求结果描述信息
  @ApiModelProperty(value="请求结果数据")
  private Object data; //请求结果数据（通常用于查询操作）

  private WebAppResponse(){}

  //请求成功的响应，不带查询数据（用于删除、修改、新增接口）
  public static WebAppResponse success(){
    WebAppResponse webAppResponse = new WebAppResponse();
    webAppResponse.setIsok(true);
    webAppResponse.setCode(200);
    webAppResponse.setMessage("请求响应成功!");
    return webAppResponse;
  }

  public static WebAppResponse successex(String message){
    WebAppResponse webAppResponse = new WebAppResponse();
    webAppResponse.setIsok(true);
    webAppResponse.setCode(200);
    webAppResponse.setMessage(message);
    return webAppResponse;
  }

  //请求成功的响应，带有查询数据（用于数据查询接口）
  public static WebAppResponse success(Object obj){
    WebAppResponse webAppResponse = new WebAppResponse();
    webAppResponse.setIsok(true);
    webAppResponse.setCode(200);
    webAppResponse.setMessage("请求响应成功!");
    webAppResponse.setData(obj);
    return webAppResponse;
  }

  //请求成功的响应，带有查询数据（用于数据查询接口）
  public static WebAppResponse error(String message){
    WebAppResponse webAppResponse = new WebAppResponse();
    webAppResponse.setIsok(true);
    webAppResponse.setCode(500);
    webAppResponse.setMessage(message);
    return webAppResponse;
  }


  //请求成功的响应，带有查询数据（用于数据查询接口）
  public static WebAppResponse success(Object obj, String message){
    WebAppResponse webAppResponse = new WebAppResponse();
    webAppResponse.setIsok(true);
    webAppResponse.setCode(200);
    webAppResponse.setMessage(message);
    webAppResponse.setData(obj);
    return webAppResponse;
  }


}
