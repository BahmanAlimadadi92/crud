package ir.mapsa.bankcrud.bank;

import ir.mapsa.bankcrud.common.BaseEntity;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_bankatm1")
@Data
@Audited
public class Bank extends BaseEntity {






    @Column(name = "title",unique = true,nullable = true)
    private String title;




    @Column(name = "branch_code",unique = true,nullable = true)
    private String branchCode;






}
