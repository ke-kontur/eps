package ru.acs.fts.eps2.ws.crypto.application;

import java.io.PrintStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import ru.quorus.cryptography.unification.impl.QuickInitalizatorImpl;
import ru.quorus.helpers.NativeLibraryLoader.NativeLibraryLoader;
import ru.quorus.helpers.NativeLibraryLoader.NativeLibraryLoaderFactory;
import ru.quorus.helpers.NativeLibraryLoader.impl.NativeLibraryLoaderFactoryImpl;

public class CryptoApplicationListener
        implements ApplicationListener
{
    private static final Logger log = LoggerFactory.getLogger(CryptoApplicationListener.class);

    public void onApplicationEvent(ApplicationEvent event)
    {
        log.info("Произошло событие (ApplicationListener): {}", event.getClass());
        if ((event instanceof ContextRefreshedEvent))
        {
            try
            {
                NativeLibraryLoaderFactory loaderFactory = new NativeLibraryLoaderFactoryImpl();
                NativeLibraryLoader loader = loaderFactory.newNativeLibraryLoader(System.getProperties());
                try
                {
                    loader.loadLibrary("quorus.cryptography.unification.java-2.0.1");
                    QuickInitalizatorImpl Initializator = new QuickInitalizatorImpl();
                    Initializator.Initialize();
                }
                catch (Throwable e)
                {
                    String err = e.getMessage();
                    System.err.println(err);
                    System.exit(1);
                }
            }
            catch (Exception e)
            {
                log.info(String.format("При инициализации нативной крипто библиотеки произошла ошибка: %s", new Object[] { e.getMessage() }), e);
            }
            log.info("Контекст приложения обновлен.");
        }
    }
}
