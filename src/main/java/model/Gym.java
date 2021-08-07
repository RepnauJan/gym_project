package model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class Gym {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gym_id")
    private int gymId;

    private String name;

    private String address;

    @Column(name = "membership_id")
    private int membershipId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "gym_has_membership",
            joinColumns = { @JoinColumn(name = "gym_id") },
            inverseJoinColumns = { @JoinColumn(name = "membership_id") }
    )
    Set<Membership> projects = new HashSet<>();

    public int getGymId() {
        return gymId;
    }

    public void setGymId(int gymId) {
        this.gymId = gymId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(int membershipId) {
        this.membershipId = membershipId;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Gym{" +
                "gymId=" + gymId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", membershipId=" + membershipId +
                ", schedule=" + schedule +
                '}';
    }
}
