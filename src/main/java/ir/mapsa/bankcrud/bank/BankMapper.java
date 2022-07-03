package ir.mapsa.bankcrud.bank;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BankMapper {


    BankDTO toDTO(Bank bank);

    Bank toEntity(BankDTO bankDTO);

    List<Bank> toEntities(List<BankDTO> bankDTOS);

    List<BankDTO> toDTOs(List<Bank> banks);
}
