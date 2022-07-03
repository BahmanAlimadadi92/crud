package ir.mapsa.bankcrud.user;

import ir.mapsa.bankcrud.common.BaseEntity;
import lombok.Data;
import org.hibernate.envers.Audited;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user1")
@Data
@Audited
public class User extends BaseEntity {


    @Column(name = "full_name",nullable = true)
    private String fullName;



    @Column(name = "national_code",unique = true,nullable = true)
    private String nationalCode;


    @Column(name = "family",nullable = true)
    private String family;



    @Column(name = "age",nullable = true)
    private Integer age;
}


