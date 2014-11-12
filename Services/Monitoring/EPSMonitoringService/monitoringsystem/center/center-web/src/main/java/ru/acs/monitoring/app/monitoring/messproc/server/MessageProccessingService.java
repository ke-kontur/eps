package ru.acs.monitoring.app.monitoring.messproc.server;

import java.util.List;
import java.util.Map;

import org.gwtwidgets.server.spring.GWTRequestMapping;

import ru.acs.monitoring.app.config.conn.client.model.ConnectionModel;
import ru.acs.monitoring.app.monitoring.messproc.domain.MessageProcessingFilter;
import ru.acs.monitoring.app.monitoring.messproc.domain.MessageProcessingStatData;
import ru.acs.monitoring.app.monitoring.messproc.domain.NamedObject;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@GWTRequestMapping("/messproc-service")
@RemoteServiceRelativePath("../rpc/messproc-service")
public interface MessageProccessingService extends RemoteService{
		public List<NamedObject> getMPSystem(ConnectionModel connection);
		public List<MessageProcessingStatData> getMPStats(MessageProcessingFilter filter);
		public Map<NamedObject,List<MessageProcessingStatData>> getMPStatsForAreaChart(MessageProcessingFilter filter);
}
