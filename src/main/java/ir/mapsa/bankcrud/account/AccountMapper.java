package ir.mapsa.bankcrud.account;

import ir.mapsa.bankcrud.bank.BankMapper;
import ir.mapsa.bankcrud.user.UserMapper;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring",uses = {BankMapper.class, UserMapper.class})
public interface AccountMapper {

    Account toEntity(AccountDto accountDto);


    AccountDto toDTO(Account account);


    List<Account> toEntities(List<AccountDto> accountDtos);

    List<AccountDto> toDTOS(List<Account> accounts);




}
