package home3.list3.task;

import java.util.ArrayList;

import list.task.DBConnecter;

public class MusicBank {
//	음악 이름으로 조회
	public Music findMusicName(String musicName) {
//		근데 이름 조회도 얉은 복사로 선언해서 못찾나?
//		Music music = (ArrayList<Music>) DBConnecter.music.clone();
		Music music = null;
		
		for (int i = 0; i < DBConnecter.music.size(); i++) {
			if (DBConnecter.music.get(i).getMusicName().equals(musicName)) {
				music = DBConnecter.music.get(i);
			}
		}return music;
	}
	
	public ArrayList<Music> findBySinger(String singer) {
		ArrayList<Music> music = (ArrayList<Music>)DBConnecter.music.clone();
		ArrayList<Music> result = new ArrayList<Music>();
		for (int i = 0; i < music.size(); i++) {
			if (music.get(i).getSinger().equals(singer)) {
				result.add(music.get(i));
			}
		}return result;
	}
	
	public ArrayList<Music> findByKind(String kind) {
		ArrayList<Music> music = (ArrayList<Music>)DBConnecter.music.clone();
		ArrayList<Music> result1 = new ArrayList<Music>();
		for (int i = 0; i < music.size(); i++) {
			if (music.get(i).getKind().equals(kind)) {
				result1.add(music.get(i));
			}
		}return result1;
	}
	
	
}
