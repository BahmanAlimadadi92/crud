package ir.mapsa.bankcrud.user;

import io.swagger.annotations.ApiModelProperty;
import ir.mapsa.bankcrud.common.BaseDTO;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class UserDTO extends BaseDTO {


    @NotNull
    @ApiModelProperty(required = true,hidden = false)
    private String nationalCode;

    @NotNull
    @ApiModelProperty(required = true,hidden = false)
    private Integer age;


    @NotNull
    @ApiModelProperty(required = true,hidden = false)
    private String family;





}
