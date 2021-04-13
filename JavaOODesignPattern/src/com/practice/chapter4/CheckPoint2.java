package com.practice.chapter4;

public class CheckPoint2 {
    static class who {
        public void trigger(A1 a1) {
            a1.doA1();
        }
    }

    static class A1 {
        public void doA1() {
            A2 a2 = new A2();
            a2.doA2(this);
        }

        public void doIt(A3 a3) {
            a3.doIt();
        }
    }

    static class A2 {
        A2() {}

        public void doA2(A1 a1) {
            A3 a3 = new A3();
            a1.doIt(a3);
        }
    }

    static class A3 {
        A3() {}

        public void doIt() {}
    }
}

