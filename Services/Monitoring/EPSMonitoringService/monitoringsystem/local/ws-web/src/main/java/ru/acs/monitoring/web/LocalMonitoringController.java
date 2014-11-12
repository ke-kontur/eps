package ru.acs.monitoring.web;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import ru.acs.fts.dto.OXMConverter;
import ru.acs.fts.dto.monitoring.MonitoringInfo;
import ru.acs.monitoring.MonitoringService;
import ru.acs.monitoring.common.utils.XsltUtils;

/**
 * Контроллер для JSP страниц (Spring МVС)
 * @author bad
 *
 */
@Controller
public class LocalMonitoringController implements ApplicationContextAware{
	private OXMConverter converter = new OXMConverter();
	private MonitoringService monitoringService;
	private ApplicationContext applicationContext;

	@RequestMapping("/cache.do")	
	public ModelMap getCachedInfo() {
		MonitoringInfo monitoringInfo = getMonitoringService().getCachedMonitoringInfo();
		XsltUtils xslt = new XsltUtils();
		String result="";
		if (monitoringInfo!=null){
			result=xslt.transformMonitoringInfoAsStr(converter.marshall(monitoringInfo));
		}else{
			result="Нет информации";
		}
		ModelMap modelMap = new ModelMap("monitoringInfo",result);
		return modelMap;
	}

	
	private MonitoringService getMonitoringService() {
		
		if (monitoringService == null)
			monitoringService = (MonitoringService) BeanFactoryUtils
					.beanOfTypeIncludingAncestors(applicationContext,
							MonitoringService.class);
		return monitoringService;
	}
	
	@RequestMapping("/update.do")	
	public String update() {
		getMonitoringService().getMonitoringInfo();		
		return "redirect:/cache.do";
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;		
	}
	
}
