package model;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Schedule {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "schedule_id")
    private int scheduleId;

    @Column(name = "training_module")
    private String trainingModule;

    @Column(name = "date")
    private Date date;

    @Column(name = "trainer_id")
    private int trainer;


}
