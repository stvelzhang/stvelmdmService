package com.example.demo.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
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
 * @since 2021-03-10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DistTypeVo {


    private Integer id;

    private String name;

}
