package ir.mapsa.bankcrud.bank;

import io.swagger.annotations.ApiModelProperty;
import ir.mapsa.bankcrud.common.BaseDTO;
import lombok.Data;

import javax.validation.constraints.NotNull;


@Data
public class BankDTO extends BaseDTO {




    @NotNull
   @ApiModelProperty(required =true,hidden = false )
    private String title ;

    @NotNull
   @ApiModelProperty(required = true,hidden = false)
   private String branchCode;

}
