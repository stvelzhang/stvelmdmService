package com.example.demo.vo;

import com.example.demo.pojo.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author stvelzhang
 * @since 2021-02-08
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeviceTempleDataVo {


    private List<DeviceTemplate> deviceTemplate;


    private List<AlarmRules> alarmRuleInfo;

}
