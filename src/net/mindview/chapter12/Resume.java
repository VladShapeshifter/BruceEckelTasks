package net.mindview.chapter12;

public class Resume {
    int[] ints = {1, 2, 3};
    boolean status = false;
    void method(int k) {
        for (int i = 0; i < k; i++) {
            if (ints.length == k) {
                status = true;
                System.out.println(ints[i]);
            } else {
//                int redundant = ints[i];
                throw new ResumeException(k);
            }

        }
    }

    public static void main(String[] args) {
        Resume resume = new Resume();
        int lim = 5;
        while (!resume.status) {
            try {
                resume.method(lim);
            } catch (ResumeException re) {
//                lim = re.arrayLimit;
//                resume.method(--lim);
                lim--;
            } catch (ArrayIndexOutOfBoundsException e) {
                lim--;
            }
        }
    }
}
