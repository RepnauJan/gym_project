package model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Membership {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "membership_id")
    private int membershipId;

    @Column(name = "membership_name")
    private String membershipName;

    @Column(name = "price")
    private int price;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "gym_has_membership",
            joinColumns = { @JoinColumn(name = "gym_id") },
            inverseJoinColumns = { @JoinColumn(name = "membership_id") }
    )
    Set<Membership> projects = new HashSet<>();

}