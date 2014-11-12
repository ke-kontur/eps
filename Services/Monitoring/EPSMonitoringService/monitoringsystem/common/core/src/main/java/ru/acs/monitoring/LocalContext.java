package ru.acs.monitoring;

public class LocalContext {

    public LocalContext() {
    }

    private static ThreadLocal<LocalContext> context = new ThreadLocal<LocalContext>() {
            @Override
            protected synchronized LocalContext initialValue() {
                    return new LocalContext();
            }
    };
    /**
     * Возвращает текущий контекст.
     */
    public static LocalContext getContext() {
            return (LocalContext) context.get();
    }


}
