package com.bootcamp.mountain;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Mountain mountain = new Mountain("Alps", "Italy", 4809);
        ArrayList<Mountaineer> mountaineers = new ArrayList<Mountaineer>();
        RecreationalMountaineer mountaineer1 = new RecreationalMountaineer(1, "Oliver", "Brown", 12, "Lombardy", 5523, 1000);
        RecreationalMountaineer mountaineer2 = new RecreationalMountaineer(2, "Joey", "Scott", 5, "Lombardy", 5642, 1000);
        RecreationalMountaineer mountaineer3 = new RecreationalMountaineer(3, "Linsay", "Monday", 16, "Lombardy", 2500, 1000);
        Alpinist alpinist1 = new Alpinist(4, "Caileigh", "Ellington", 5, 2000);
        Alpinist alpinist2 = new Alpinist(5, "Petal", "Fox", 7, 2000);
        Alpinist alpinist3 = new Alpinist(6, "Lola", "Woodrow", 12, 2000);
        mountaineers.add(mountaineer1);
        mountaineers.add(mountaineer2);
        mountaineers.add(mountaineer3);
        mountaineers.add(alpinist1);
        mountaineers.add(alpinist2);
        mountaineers.add(alpinist3);

        int totalMembershipCost = 0;
        for(int i = 0; i < mountaineers.size(); i++) {
            totalMembershipCost += mountaineers.get(i).getMembership();
            mountaineers.get(i).printMembership();
            if(i < 3) {
                mountaineers.get(i).print();
                mountaineers.get(i).successfulClimb(mountain);
                System.out.println();
            }
            else {
                mountaineers.get(i).print();
                mountaineers.get(i).alpinistScore();
                System.out.println();
            }
        }

        System.out.println("Total membership cost is: " + totalMembershipCost);

    }
}
