package nl.hkstwk.demo.a;

import java.util.Locale;

public class WarningTestA {
    @Deprecated
    public void oldMethod() {
    }

    public void test() {
        oldMethod();
    }
}