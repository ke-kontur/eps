package ru.acs.monitoring.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.acs.fts.dto.adapters.DateUtilities;
import ru.acs.fts.dto.monitoring.MailboxInfo;
import ru.acs.fts.dto.monitoring.Severity;
import ru.acs.monitoring.common.utils.SeverityUtils;
import ru.acs.monitoring.common.utils.StringUtils;
import ru.acs.monitoring.settings.POP3MonitoringSettings;

import java.io.File;
import java.io.FileFilter;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * User: CAA
 * Date: 25.09.12
 */
public class MailBoxWatcher {
    protected final static Logger logger = LoggerFactory.getLogger(MailBoxWatcher.class);

    public static MailboxInfo watch(POP3MonitoringSettings mailBoxSettings) {
        logger.debug(
                String.format(
                        "Проверяем почтовый ящик '%s'",
                        mailBoxSettings.getMailboxName()));
        MailboxInfo mailBoxInfo = new MailboxInfo();
        mailBoxInfo.setMailboxName(mailBoxSettings.getMailboxName());
        try {
            File directory = new File(mailBoxSettings.getPathToMailbox());
            if (!directory.exists()) {
                mailBoxInfo.setSeverity(Severity.ERROR);
                mailBoxInfo.setAdditionalInfo("В настройках неверно задан путь до почтового ящика");
                logger.error(
                        String.format(
                                "В настройках неверно задан путь до почтового ящика '%s': %s",
                                mailBoxSettings.getMailboxName(),
                                mailBoxSettings.getPathToMailbox()));
                return mailBoxInfo;
            }
            File[] files = directory.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    return pathname.getPath().endsWith(".eml");
                }
            });
            if (files == null) {
                mailBoxInfo.setSeverity(Severity.ERROR);
                mailBoxInfo.setAdditionalInfo("Не удалось получить список файлов в почтовом ящике");
                logger.error(
                        String.format(
                                "Не удалось получить список файлов в почтовом ящике '%s'",
                                mailBoxSettings.getMailboxName()));
                return mailBoxInfo;
            }
            long current = Calendar.getInstance().getTimeInMillis();
            long oldestMessageDateTime = current;
            for (File file : files) {
                long whenModified = file.lastModified();
                if (oldestMessageDateTime > whenModified) {
                    oldestMessageDateTime = whenModified;
                }
            }
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.setTimeInMillis(oldestMessageDateTime);
            mailBoxInfo.setOldestMessageDateTime(DateUtilities.gregorianToXml(calendar));
            mailBoxInfo.setMessagesCount(files.length);
            if (mailBoxInfo.getMessagesCount() <= mailBoxSettings.getMaxMessagesCountInMailbox() &&
                    oldestMessageDateTime + mailBoxSettings.getDelay() > current) {
                mailBoxInfo.setSeverity(Severity.INFO);
            } else {
                mailBoxInfo.setSeverity(Severity.ERROR);
                mailBoxInfo.setAdditionalInfo("Превышено допустимое кол-во сообщений или интервал считывания");
            }
        } catch (Exception e) {
            mailBoxInfo.setSeverity(Severity.ERROR);
            mailBoxInfo.setAdditionalInfo(
                    String.format(
                            "Не удалось получить информацию по ящику: %s : %s",
                            e.getClass().toString(), e.getMessage()));
            logger.error(
                    String.format(
                            "Не удалось получить информацию по ящику '%s'",
                            mailBoxSettings.getMailboxName()),
                    e);
        }
        logger.debug(
                String.format(
                        "Проверили почтовый ящик '%s' : '%s'",
                        mailBoxSettings.getMailboxName(),
                        SeverityUtils.getLocalizedSeverityName(mailBoxInfo.getSeverity()) +
                                ((StringUtils.isNullOrEmpty(mailBoxInfo.getAdditionalInfo())) ?
                                        "" : " : " + mailBoxInfo.getAdditionalInfo())));
        return mailBoxInfo;
    }
}
