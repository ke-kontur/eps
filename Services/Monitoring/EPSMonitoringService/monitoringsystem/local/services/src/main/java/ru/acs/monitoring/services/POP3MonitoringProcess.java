package ru.acs.monitoring.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import ru.acs.fts.dto.adapters.DateUtilities;
import ru.acs.fts.dto.monitoring.*;
import ru.acs.monitoring.common.utils.SeverityUtils;
import ru.acs.monitoring.settings.POP3MonitoringSettings;
import ru.acs.monitoring.utils.MailBoxWatcher;

import java.util.List;

/**
 * User: KGN
 * Date: 25.09.12
 * Time: 12:31
 */
public class POP3MonitoringProcess implements MonitoringProcess {
    final static Logger logger = LoggerFactory.getLogger(POP3MonitoringProcess.class);

    private List<POP3MonitoringSettings> pop3MonitoringSettings;

    @Override
    public void fillMonitoringInfo(MonitoringInfo info) {
        POP3MonitoringInfo pop3MonitoringInfo = new POP3MonitoringInfo();
        pop3MonitoringInfo.setName("Мониторинг POP3-сервера");
        pop3MonitoringInfo.setUpdateTime(DateUtilities.xmlCalendar());
        pop3MonitoringInfo.setDescription("Информация мониторинга POP3-сервера");

        for(POP3MonitoringSettings setting: pop3MonitoringSettings) {
            MailboxInfo mailBoxInfo = MailBoxWatcher.watch(setting);
            pop3MonitoringInfo.getMailboxInfos().add(mailBoxInfo);
        }

        pop3MonitoringInfo.setSeverity(SeverityUtils.getMaxSeverity(pop3MonitoringInfo));
        info.setPOP3MonitoringInfo(pop3MonitoringInfo);
    }

    @Override
    public String getProcessName() {
        return "Сервис мониторинга почтовых ящиков на POP3-сервере";
    }

    @Override
    public MonitoringAttribute getAddedOrDefaultAtribute(MonitoringInfo info) {
        if (info.getPOP3MonitoringInfo() == null)
            info.setPOP3MonitoringInfo(new POP3MonitoringInfo());
        return info.getPOP3MonitoringInfo();
    }

    @Autowired(required = false)
    public void setPOP3MonitoringSettings(List<POP3MonitoringSettings> pop3MonitoringSettings) {
        this.pop3MonitoringSettings = pop3MonitoringSettings;
    }
}
