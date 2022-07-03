package ir.mapsa.bankcrud.bank;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-03T13:56:12+0430",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class BankMapperImpl implements BankMapper {

    @Override
    public BankDTO toDTO(Bank bank) {
        if ( bank == null ) {
            return null;
        }

        BankDTO bankDTO = new BankDTO();

        bankDTO.setId( bank.getId() );
        bankDTO.setVersion( bank.getVersion() );
        bankDTO.setCreatedDate( bank.getCreatedDate() );
        bankDTO.setCreatedBy( bank.getCreatedBy() );
        bankDTO.setLastModifiedDate( bank.getLastModifiedDate() );
        bankDTO.setLastModifiedBy( bank.getLastModifiedBy() );
        bankDTO.setTitle( bank.getTitle() );
        bankDTO.setBranchCode( bank.getBranchCode() );

        return bankDTO;
    }

    @Override
    public Bank toEntity(BankDTO bankDTO) {
        if ( bankDTO == null ) {
            return null;
        }

        Bank bank = new Bank();

        bank.setId( bankDTO.getId() );
        bank.setVersion( bankDTO.getVersion() );
        bank.setCreatedDate( bankDTO.getCreatedDate() );
        bank.setCreatedBy( bankDTO.getCreatedBy() );
        bank.setLastModifiedDate( bankDTO.getLastModifiedDate() );
        bank.setLastModifiedBy( bankDTO.getLastModifiedBy() );
        bank.setTitle( bankDTO.getTitle() );
        bank.setBranchCode( bankDTO.getBranchCode() );

        return bank;
    }

    @Override
    public List<Bank> toEntities(List<BankDTO> bankDTOS) {
        if ( bankDTOS == null ) {
            return null;
        }

        List<Bank> list = new ArrayList<Bank>( bankDTOS.size() );
        for ( BankDTO bankDTO : bankDTOS ) {
            list.add( toEntity( bankDTO ) );
        }

        return list;
    }

    @Override
    public List<BankDTO> toDTOs(List<Bank> banks) {
        if ( banks == null ) {
            return null;
        }

        List<BankDTO> list = new ArrayList<BankDTO>( banks.size() );
        for ( Bank bank : banks ) {
            list.add( toDTO( bank ) );
        }

        return list;
    }
}
