package ru.parhomych.di.lookupmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("app-config-for-lookupmethod.xml");

        ArrayList<Song> songArrayList = new ArrayList<Song>();

        SongStore songStore = (SongStore) context.getBean("songStore");
        songArrayList.add(songStore.makeMajorSong());
        songArrayList.add(songStore.makeMinorSong());
        songArrayList.add(songStore.makeMajorSong());
        songArrayList.add(songStore.makeMinorSong());
        songArrayList.add(songStore.makeMajorSong());
        songArrayList.add(songStore.makeMinorSong());

        for (Song song :
                songArrayList) {
            System.out.println(song);
        }

    }
}
