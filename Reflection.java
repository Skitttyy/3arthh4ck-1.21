package dev.monky.phobos;

public class Reflection {
    public static void setCustomSession() {
        try {
            Class<?> klass = Class.forName("org.phobos.secure.G7ysU5BGY2thQxMr.kcRMNRxvCqfzhDHk");
            Object INSTANCE = klass.getDeclaredField("INSTANCE").get(null);

            Class<?> session = Class.forName("org.phobos.secure.SOBUOyVU1bYpVvDD.Pu45G0fFp14frG71");
            Object customAccount = session.getDeclaredMethod("create", String.class).invoke(null, "beta+2025-08-21T13:45:30Z");
            System.out.println(customAccount);
            klass.getDeclaredMethod("setSession", session).invoke(INSTANCE, customAccount);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
