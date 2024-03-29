package com.fzzixun.appstore.connector.hubstudio.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("打开环境-请求参数")
public class EnvOpenModel {

    @ApiModelProperty("团队code")
    private String groupCode;

    @ApiModelProperty("环境code")
    private String containerCode;

    @ApiModelProperty("是否无头模式")
    private Boolean isHeadless = false;

    @ApiModelProperty("")
    private Boolean isWebDriverReadOnlyMode = true;

}
