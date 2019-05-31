package ru.parhomych.di.lookupmethod;

public class Song {

    private static int count;
    private int order;
    private String name;
    private String key;

    public String getName() {
        System.out.println("Song.getName");
        return name;
    }

    public void setName(String name) {
        System.out.println("Song.setName");
        this.name = name;
    }

    public String getKey() {
        System.out.println("Song.getKey");
        return key;
    }

    public void setKey(String key) {
        System.out.println("Song.setKey");
        this.key = key;
    }

    public Song() {
        System.out.println("Song.Song");
        order = count;
        count++;
    }

    @Override
    public String toString() {
        return "********** Song **********\n" +
                "Song{" +
                "name='" + name + '\'' +
                ", order='" + order + '\'' +
                ", key='" + key + '\'' +
                ", count='" + count + '\'' +
                "\n" +
                "*************************\n";
    }
}
