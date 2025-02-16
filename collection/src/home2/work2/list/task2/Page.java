package home2.work2.list.task2;

import java.util.ArrayList;
import list.task.DBConnecter;

public class Page {
    public static void main(String[] args) {
        // 챔피언 객체 생성
        LoLChampion ashe = new LoLChampion("Ashe", "Marksman", "Support", "Bot", true);
        LoLChampion garen = new LoLChampion("Garen", "Fighter", "Tank", "Top", false);
        LoLChampion lux = new LoLChampion("Lux", "Mage", "Support", "Mid", true);
        LoLChampion jinx = new LoLChampion("Jinx", "Marksman", "None", "Bot", true);
        LoLChampion darius = new LoLChampion("Darius", "Fighter", "Tank", "Top", true);
        LoLChampion ahri = new LoLChampion("Ahri", "Mage", "Assassin", "Mid", true);
        LoLChampion leona = new LoLChampion("Leona", "Tank", "Support", "Bot", true);
        LoLChampion katarina = new LoLChampion("Katarina", "Assassin", "None", "Mid", false);
        LoLChampion caitlyn = new LoLChampion("Caitlyn", "Marksman", "None", "Bot", true);

        // DBConnecter에 챔피언 추가
        DBConnecter.lolchampion.add(ashe);
        DBConnecter.lolchampion.add(garen);
        DBConnecter.lolchampion.add(lux);
        DBConnecter.lolchampion.add(jinx);
        DBConnecter.lolchampion.add(darius);
        DBConnecter.lolchampion.add(ahri);
        DBConnecter.lolchampion.add(leona);
        DBConnecter.lolchampion.add(katarina);
        DBConnecter.lolchampion.add(caitlyn);

        // LOLFindChampion 객체 생성
        LOLFindChampion finder = new LOLFindChampion();

        // 챔피언 이름으로 조회
        LoLChampion foundChampion = finder.findChampionName("Ashe");
        System.out.println("이름으로 챔피언 찾기: " + foundChampion);

        // 챔피언 직업군으로 조회
        ArrayList<LoLChampion> fighters = finder.findByClass("Fighter");
        System.out.println("직업군으로 조회 'Fighter': " + fighters);

        // 마나 유무로 조회
        ArrayList<LoLChampion> manaUsers = finder.findByMana(true);
        System.out.println("마나 유무로 챔피언 조회: " + manaUsers);

        // 챔피언 라인 수정
        ashe.setLine("Mid");
        finder.updateLine(ashe);

        // 수정된 라인 확인
        ArrayList<LoLChampion> updatedChampions = finder.findLine();
        System.out.println("챔피언 업데이트: " + updatedChampions);
    }
}
