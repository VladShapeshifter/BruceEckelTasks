package net.mindview.chapter11;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class StaatisticsCyclic {
    public static void main(String[] args) {
        for (int rep = 0; rep < 10; rep++) {
            Random rand = new Random();
            Map<Integer, Integer> m = new HashMap<>();
            for (int i = 0; i < 10000; i++) {
                int r = rand.nextInt(20);
                Integer freq = m.get(r);
                m.put(r, freq == null ? 1 : freq + 1);
            }
            int maxFreq = 0;
            int maxNum = 0;
            for (int i = 0; i < 20; i++) {
                if (m.get(i) > maxFreq) {
                    maxFreq = m.get(i);
                    maxNum = i;
                }
            }
            System.out.println(m);
            System.out.println("Maximum frequently number is: " + maxNum + ", with frequency: " + maxFreq);
        }

    }
}
