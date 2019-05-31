package ru.parhomych.di.constructorinjection;

public class Job {

    private String nameOfJob;

    public Job(String nameOfJob) {
        System.out.println("Job.Job <- конструктор");
        this.nameOfJob = nameOfJob;
    }

    public String whatJob(){
        return "Job.whatJob() сработал";
    }

    @Override
    public String toString() {
        return "Job{" +
                "nameOfJob='" + nameOfJob + '\'' +
                '}';
    }
}
