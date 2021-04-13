package com.practice.chapter4;

public class CheckPoint1 {

    static class X {
        public void trigger(Y y) {
            Object a = new Object();
            Object b = new Object();
            y.m1(a, b);
        }
    }

    static class Y {
        public void m1(Object a, Object b) {
            Z o = new Z();
            boolean g = true;
            if (g) {
                o.m2();
            }
        }
    }

    static class Z {
        private W w;

        public Z() {
            w = new W();
        }

        public int m2() {
            w = null;
            return 5;
        }
    }

    static class W {
        public W() {}
    }
}
