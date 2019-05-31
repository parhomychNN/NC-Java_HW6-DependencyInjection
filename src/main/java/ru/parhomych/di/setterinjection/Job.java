package ru.parhomych.di.setterinjection;

public class Job {
    private String nameOfJob;

    public String whatJob(){
        return "Job.whatJob() сработал";
    }

    public void setNameOfJob(String nameOfJob) {
        this.nameOfJob = nameOfJob;
    }

    @Override
    public String toString() {
        return "Job{" +
                "nameOfJob='" + nameOfJob + '\'' +
                '}';
    }
}
