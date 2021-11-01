package model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Class representation of the writing groups
 */
@Entity
@DiscriminatorValue("Writing Groups")
public class Writing_Groups extends Authoring_Entities{

    /** Head writer of the group*/
    @Column(nullable = true, length = 80)
    private String head_writer;

    /** year the group was formed*/
    @Column(nullable = true)
    private int year_formed;

    /** default constructor */
    public Writing_Groups(){

    }



}
