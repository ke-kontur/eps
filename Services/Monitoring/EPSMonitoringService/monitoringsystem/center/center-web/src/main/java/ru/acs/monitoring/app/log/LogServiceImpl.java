package ru.acs.monitoring.app.log;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import ru.acs.fts.dto.monitoring.Severity;
import ru.acs.monitoring.app.log.client.LogService;
import ru.acs.monitoring.app.log.client.model.LogFilter;
import ru.acs.monitoring.app.log.client.model.LogLevel;
import ru.acs.monitoring.domain.Connection;
import ru.acs.monitoring.domain.MonitoringInf;
import ru.acs.monitoring.services.ConnectionsService;
import ru.acs.monitoring.services.MonitoringInfoService;
import ru.acs.monitoring.utils.XsltUtils;

import com.extjs.gxt.ui.client.data.BaseModelData;
import com.extjs.gxt.ui.client.data.BasePagingLoadResult;
import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.data.PagingLoadConfig;
import com.extjs.gxt.ui.client.data.PagingLoadResult;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class LogServiceImpl
        extends RemoteServiceServlet
        implements LogService {

    private MonitoringInfoService monService;
    private ConnectionsService conService;

    @Override
    public void init() throws ServletException {
        ApplicationContext context = WebApplicationContextUtils
                .getWebApplicationContext(getServletContext());

        monService = (MonitoringInfoService) context
                .getBean("monitoringInfoService");
        conService = (ConnectionsService) context
                .getBean("connectionsService");
    }

    public String findXmlById(Long id) {
        MonitoringInf inf = monService.getMonitoringInfById(id);
        if (inf != null){
        	String monitoringInfoXML = monService.getMonitoringXML(inf);
    		if (monitoringInfoXML != null) {
    			XsltUtils xslt = new XsltUtils();
    			return xslt.transformMonitoringInfoAsStr(monitoringInfoXML);
    		}
    		return null;
        }

        return null;
    }

    private static final List<String> SORT_COLUMNS = new ArrayList<String>();
    {
        SORT_COLUMNS.add("updated");
        SORT_COLUMNS.add("severity");
    }

    public PagingLoadResult<ModelData> getData(final PagingLoadConfig config,
            LogFilter filter) throws Exception {
        
        String severity = getSeverity(filter);
		List<MonitoringInf> infs = monService.getMonitoringInfList(filter.getUpdateDateFrom(),filter.getUpdateDateTo(),filter.getConnectionId(),severity,config.getLimit(),config.getOffset());
        List<ModelData> data = new LinkedList<ModelData>();

        int total = infs.size();

    // ordering
/*        if (config.getSortField() != null) {
            Collections.sort(infs, new Comparator<MonitoringInf>() {

                public int compare(MonitoringInf o1, MonitoringInf o2) {
                    if ("updateDate".equalsIgnoreCase(config.getSortField())) {
                        int result = o1.getUpdateDate().compareTo(o2.getUpdateDate());
                        
                        SortDir dir = config.getSortDir();
                        if (dir != null && dir == SortDir.DESC)
                            result = - result;

                        return result;
                    }

                    return 0;
                }
            });
        }
*/

    // paging
        int endIdx = config.getOffset() + config.getLimit();
        if (infs.size() < endIdx){
        	endIdx=infs.size();
        }
        if ((infs.size() > config.getOffset()) && (infs.size() >=endIdx)) {
            infs = infs.subList(config.getOffset(),
                    endIdx);
        }

    // converting
        for (MonitoringInf inf : infs) {
            data.add(convert(inf));
        }

        PagingLoadResult<ModelData>
        result = new BasePagingLoadResult<ModelData>(data);
        {
            result.setTotalLength(total);
            result.setOffset(config.getOffset());
        }

        return result;
    }

	private String getSeverity(LogFilter filter) {
		if (LogLevel.ALL.equals(filter.getLevel())){
			return null;
		}
		return filter.getLevel().name();
	}

    private ModelData convert(MonitoringInf inf) {
        ModelData model = new BaseModelData();
        {
            model.set("id", inf.getId());
            model.set("connectionName", inf.getConnection().getName());
            model.set("systemName", inf.getSystemName());
            model.set("systemId", inf.getSystemId());
            model.set("updateDate", inf.getUpdateDate());
            model.set("error", inf.getError());
            model.set("level", convert(inf.getSeverity()));
        }

        return model;
    }

    private LogLevel convert(String severity) {
        if ("INFO".equalsIgnoreCase(severity)) {
            return LogLevel.INFO;
        } else if ("WARNING".equalsIgnoreCase(severity)) {
            return LogLevel.WARNING;
        } else if ("ERROR".equalsIgnoreCase(severity)) {
            return LogLevel.ERROR;
        } else
            return null;
    }

    private LogLevel convert(Severity severity) {
        if (severity == null) return null;

        switch (severity) {
        case INFO: return LogLevel.INFO;
        case WARNING: return LogLevel.WARNING;
        case ERROR: return LogLevel.ERROR;
        }

        return null;
    }

    public Map<Long, String> getConnectionOptions() throws Exception {
        Collection<Connection> connections = conService.getAll();

        Map<Long, String> result = new HashMap<Long, String>();

        for (Connection connection : connections) {
            result.put(connection.getId(), connection.getName());
        }

        return result;
    }
}
