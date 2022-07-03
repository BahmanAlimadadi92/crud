package ir.mapsa.bankcrud.account;

import ir.mapsa.bankcrud.bank.Bank;
import ir.mapsa.bankcrud.common.BaseEntity;
import ir.mapsa.bankcrud.user.User;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "tbl_account1")
@Data
@Audited
public class Account extends BaseEntity {









    @Column(name = "title",nullable = true)
    private String title ;



    @ManyToOne
    @JoinColumn(name = "bankatm_id",nullable = true)
    private Bank bank;




    @ManyToOne
    @JoinColumn(name = "user_id",nullable = true)
    private User user;


}









