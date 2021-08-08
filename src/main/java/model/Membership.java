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
    Set<Membership> memberships = new HashSet<>();

    public int getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(int membershipId) {
        this.membershipId = membershipId;
    }

    public String getMembershipName() {
        return membershipName;
    }

    public void setMembershipName(String membershipName) {
        this.membershipName = membershipName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Set<Membership> getMemberships() {
        return memberships;
    }

    public void setMemberships(Set<Membership> memberships) {
        this.memberships = memberships;
    }

    @Override
    public String toString() {
        return "Membership{" +
                "membershipId=" + membershipId +
                ", membershipName='" + membershipName + '\'' +
                ", price=" + price +
                ", memberships=" + memberships +
                '}';
    }
}