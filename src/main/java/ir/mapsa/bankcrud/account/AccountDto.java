package ir.mapsa.bankcrud.account;

import io.swagger.annotations.ApiModelProperty;
import ir.mapsa.bankcrud.bank.BankDTO;
import ir.mapsa.bankcrud.common.BaseDTO;
import ir.mapsa.bankcrud.user.UserDTO;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AccountDto extends BaseDTO {


     @NotNull
    @ApiModelProperty(required = true,hidden = false)
    private String title;



    @NotNull
    @ApiModelProperty(required = true,hidden = false)
    private BankDTO  bank;



    @NotNull
    @ApiModelProperty(required = true,hidden = false)
    private UserDTO user;
}



