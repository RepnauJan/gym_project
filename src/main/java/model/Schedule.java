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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "trainer_id")
    private Trainer trainer;


    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getTrainingModule() {
        return trainingModule;
    }

    public void setTrainingModule(String trainingModule) {
        this.trainingModule = trainingModule;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "scheduleId=" + scheduleId +
                ", trainingModule='" + trainingModule + '\'' +
                ", date=" + date +
                ", trainer=" + trainer +
                '}';
    }
}