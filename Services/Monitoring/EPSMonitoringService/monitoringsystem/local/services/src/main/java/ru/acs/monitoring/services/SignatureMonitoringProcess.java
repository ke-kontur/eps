package ru.acs.monitoring.services;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ru.acs.fts.dto.monitoring.CertificateInfo;
import ru.acs.fts.dto.monitoring.MonitoringAttribute;
import ru.acs.fts.dto.monitoring.MonitoringInfo;
import ru.acs.fts.dto.monitoring.Severity;
import ru.acs.fts.dto.monitoring.SignatureInfo;
import ru.acs.fts.dto.monitoring.SignaturesInfo;
import ru.acs.monitoring.common.utils.SeverityUtils;
import ru.quorus.signature.server.SignatureConnector;

public class SignatureMonitoringProcess implements MonitoringProcess {
	final static Logger log = LoggerFactory.getLogger(SignatureMonitoringProcess.class);
	List<SignatureSettings> signatureServerSettings;
	
	@Override
	public MonitoringAttribute getAddedOrDefaultAtribute(MonitoringInfo info) {	
		if (info.getSignaturesInfo() == null)
			info.setSignaturesInfo(new SignaturesInfo());
		return info.getSignaturesInfo();
	}

	public void fillMonitoringInfo(MonitoringInfo info) {
		if (signatureServerSettings == null || signatureServerSettings.size() < 1) {
			return;
		}
		log.info("Запущен " + getProcessName());
		boolean result = false;
		SignaturesInfo signaturesInfo = new SignaturesInfo();
		info.setSignaturesInfo(signaturesInfo);
		for (Iterator<SignatureSettings> iterator = signatureServerSettings.iterator(); iterator.hasNext();) {
			SignatureSettings settings = (SignatureSettings) iterator.next();

			SignatureInfo signatureInfo = new SignatureInfo();
			signaturesInfo.getSignatureInfos().add(signatureInfo);
			signatureInfo.setHost(settings.getServerName());
			signatureInfo.setPort(new Long(settings.getPort()));
			signatureInfo.setServiceName(settings.getServiceName());
			signatureInfo.setName(settings.getName());
			try {
				log.info("Проверяется сервер '"+settings.getName() +"' host=" + settings.getServerName() + ", URL='" + getUrl(settings)+"'");
				
				SignatureConnector connector = new SignatureConnector(settings.getServerName(), settings.getPort(),
						settings.getServiceName());
				signatureInfo.setAvailable(true);
				signatureInfo.setSeverity(Severity.INFO);
				for (String certificate : settings.getCertificates()) {
					CertificateInfo certInfo = new CertificateInfo();
					certInfo.setName(certificate);
					signatureInfo.getCertificateInfos().add(certInfo); 
					if (log.isDebugEnabled()) {
						log.debug("Производится подпись документа сертификатом - " + certificate);
					}
					try {
						byte[] signed = connector.getProcessor().sign("<aaa>aaa1</aaa>".getBytes(), certificate);
						if (log.isDebugEnabled()) {
							log.debug("Документ подписан");
						}
						if (log.isDebugEnabled()) {
							log.debug("Производится проверка подписи");
						}
						result = connector.getProcessor().verify(signed);
						if (result) {
							certInfo.setSeverity(Severity.INFO);
						} else {
							certInfo.setSeverity(Severity.WARNING);
							certInfo.getErrors().add("Подпись не верна. Возможна неверная работа сервера ЭЦП");
						}

						if (log.isDebugEnabled()) {
							log.debug("Результат проверки подписи: " + result);
						}

					} catch (RemoteException e) {
						certInfo.getErrors().add(e.getMessage());
						certInfo.setSeverity(Severity.ERROR);
						log.error(e.getMessage(),e);						
					}
				}
				signatureInfo.setSeverity(SeverityUtils.getMaxSeverity(signatureInfo));
			} catch (MalformedURLException e) {
				log.error(e.getMessage(),e);
				putError(signatureInfo, "Неверный URL. "+ e.getMessage());
			} catch (RemoteException e) {
				log.error(e.getMessage(),e);
				putError(signatureInfo, "Ошибка вызова. "+ e.getMessage());
			} catch (NotBoundException e) {
				log.error(e.getMessage(),e);
				putError(signatureInfo, "Сервис не найден." +e.getMessage());
			}
			log.info("Результат проверки сервера " + settings.getServerName() + ", URL='" + getUrl(settings) + "' - "+signatureInfo.getSeverity());
		}
	}

	private void putError(SignatureInfo signatureInfo, String err) {
		signatureInfo.setSeverity(Severity.ERROR);
		signatureInfo.getErrors().add(err);
	}

	private String getUrl(SignatureSettings settings) {
		return "rmi://" + settings.getServerName() + ":" + settings.getPort() + "/" + settings.getServiceName();
	}

	public String getProcessName() {
		return "Мониторинг серверов ЭЦП";
	}

	public List<SignatureSettings> getSignatureServerSettings() {
		return signatureServerSettings;
	}

	@Autowired(required = false)
	public void setSignatureServerSettings(List<SignatureSettings> signatureServerSettings) {
		this.signatureServerSettings = signatureServerSettings;
	}

}
