package home3.list3.task;

import java.util.ArrayList;

import list.task.DBConnecter;

public class Page {
    public static void main(String[] args) {
        // MusicBank 객체 생성
        MusicBank musicBank = new MusicBank();

        // 음악 객체 생성
        Music song1 = new Music("Song1", "Singer1", "Pop");
        Music song2 = new Music("Song2", "Singer2", "Rock");
        Music song3 = new Music("Song3", "Singer1", "Pop");
        Music song4 = new Music("Song4", "Singer3", "Jazz");
        Music song5 = new Music("Song5", "Singer4", "Rock");
        Music song6 = new Music("Song6", "Singer2", "Classical");

        // 음악 추가
        DBConnecter.music.add(song1);
        DBConnecter.music.add(song2);
        DBConnecter.music.add(song3);
        DBConnecter.music.add(song4);
        DBConnecter.music.add(song5);
        DBConnecter.music.add(song6);

        // 음악 이름으로 조회
        Music foundMusic = musicBank.findMusicName("Song3");
        System.out.println("음악 이름으로 조회 (Song3): " + foundMusic);

        // 가수로 조회
        ArrayList<Music> singerResults = musicBank.findBySinger("Singer1");
        System.out.println("가수로 조회 (Singer1): " + singerResults);

        // 장르로 조회
        ArrayList<Music> kindResults = musicBank.findByKind("Rock");
        System.out.println("장르로 조회 (Rock): " + kindResults);
    }
}
