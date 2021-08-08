package model;

import javax.persistence.*;

@Entity
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "trainer_id")
    private int trainerId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "membership_id")
    private int membershipId;

    @Column(name = "schedule_id")
    private int scheduleId;

}
