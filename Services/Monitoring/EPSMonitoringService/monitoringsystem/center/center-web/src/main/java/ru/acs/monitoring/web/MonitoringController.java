package ru.acs.monitoring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ru.acs.monitoring.domain.MonitoringInf;
import ru.acs.monitoring.services.MonitoringInfoService;
import ru.acs.monitoring.utils.XsltUtils;

/**
 * Контроллер для JSP страниц (Spring МVС)
 * @author fmv
 *
 */
@Controller
public class MonitoringController {
	protected MonitoringInfoService monService;

	@RequestMapping("/moninfos.do")
	public ModelMap monHandler() {
		return new ModelMap(monService.getMonitoringInfList());
	}

	@RequestMapping("/moninfo.do")	
	public ModelMap xmlHandler(@RequestParam("id") int infId) {
		MonitoringInf monitoringInf = monService.getMonitoringInfById(new Long(infId));
		XsltUtils xslt = new XsltUtils();
		String result="";
		if (monitoringInf!=null && monitoringInf.getMonitoringInfoData() !=null && monService.getMonitoringXML(monitoringInf) !=null){
			result=xslt.transformMonitoringInfoAsStr(monService.getMonitoringXML(monitoringInf));
		}else{
			result="Нет информации";
		}
		ModelMap modelMap = new ModelMap("monitoringInfo",result);
		return modelMap;
	}

	@RequestMapping("/messstats.do")
	public ModelMap statListHandler() {
		return new ModelMap(monService.getMessageProcessingStats());
	}

	@Autowired
	public void setMonService(MonitoringInfoService monService) {
		this.monService = monService;
	}
}
