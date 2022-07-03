package ir.mapsa.bankcrud.account;

import ir.mapsa.bankcrud.bank.BankMapper;
import ir.mapsa.bankcrud.user.UserMapper;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-03T13:56:12+0430",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class AccountMapperImpl implements AccountMapper {

    @Autowired
    private BankMapper bankMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    public Account toEntity(AccountDto accountDto) {
        if ( accountDto == null ) {
            return null;
        }

        Account account = new Account();

        account.setId( accountDto.getId() );
        account.setVersion( accountDto.getVersion() );
        account.setCreatedDate( accountDto.getCreatedDate() );
        account.setCreatedBy( accountDto.getCreatedBy() );
        account.setLastModifiedDate( accountDto.getLastModifiedDate() );
        account.setLastModifiedBy( accountDto.getLastModifiedBy() );
        account.setTitle( accountDto.getTitle() );
        account.setBank( bankMapper.toEntity( accountDto.getBank() ) );
        account.setUser( userMapper.toEntity( accountDto.getUser() ) );

        return account;
    }

    @Override
    public AccountDto toDTO(Account account) {
        if ( account == null ) {
            return null;
        }

        AccountDto accountDto = new AccountDto();

        accountDto.setId( account.getId() );
        accountDto.setVersion( account.getVersion() );
        accountDto.setCreatedDate( account.getCreatedDate() );
        accountDto.setCreatedBy( account.getCreatedBy() );
        accountDto.setLastModifiedDate( account.getLastModifiedDate() );
        accountDto.setLastModifiedBy( account.getLastModifiedBy() );
        accountDto.setTitle( account.getTitle() );
        accountDto.setBank( bankMapper.toDTO( account.getBank() ) );
        accountDto.setUser( userMapper.toDTO( account.getUser() ) );

        return accountDto;
    }

    @Override
    public List<Account> toEntities(List<AccountDto> accountDtos) {
        if ( accountDtos == null ) {
            return null;
        }

        List<Account> list = new ArrayList<Account>( accountDtos.size() );
        for ( AccountDto accountDto : accountDtos ) {
            list.add( toEntity( accountDto ) );
        }

        return list;
    }

    @Override
    public List<AccountDto> toDTOS(List<Account> accounts) {
        if ( accounts == null ) {
            return null;
        }

        List<AccountDto> list = new ArrayList<AccountDto>( accounts.size() );
        for ( Account account : accounts ) {
            list.add( toDTO( account ) );
        }

        return list;
    }
}
