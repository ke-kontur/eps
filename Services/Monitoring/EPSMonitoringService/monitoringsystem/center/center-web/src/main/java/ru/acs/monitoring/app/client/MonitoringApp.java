package ru.acs.monitoring.app.client;

import ru.acs.fts.webconsole.app.client.App;
import ru.acs.fts.webconsole.app.client.pages.Category;
import ru.acs.fts.webconsole.core.client.ExceptionHandler;
import ru.acs.fts.webconsole.core.client.rpc.BaseAsyncCallback;
import ru.acs.fts.webconsole.security.client.SecuredCategory;
import ru.acs.fts.webconsole.security.client.SecurityContext;
import ru.acs.fts.webconsole.security.client.SecurityService;
import ru.acs.fts.webconsole.security.client.SecurityServiceAsync;
import ru.acs.fts.webconsole.security.client.auth.AuthenticationListener;
import ru.acs.fts.webconsole.security.client.model.User;
import ru.acs.monitoring.app.client.pages.ConnectionSettingsPage;
import ru.acs.monitoring.app.client.pages.LogPage;
import ru.acs.monitoring.app.client.pages.MessageProcessingStatPage;
import ru.acs.monitoring.app.client.pages.MonitoringPage;
import ru.acs.monitoring.app.client.pages.SecurityPage;
import ru.acs.monitoring.app.client.widget.ShowXmlWindow;

import com.extjs.gxt.ui.client.GXT;
import com.extjs.gxt.ui.client.data.TreeModel;
import com.extjs.gxt.ui.client.util.Theme;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.StatusCodeException;

/**
 * Приложение мониторинга.
 * 
 * @author Алексей Селиванов
 * @author fmv
 */
public class MonitoringApp extends App {

	/** {@inheritDoc} */
	@Override
	protected void beforeLoad() {
		GXT.setDefaultTheme(Theme.GRAY, true);
		GXT.hideLoadingPanel("loading");

		initSecurity();
		initHandlers();

		// super.beforeLoad();
		SecurityServiceAsync service = GWT.create(SecurityService.class);
		service.getCurrentUser(new BaseAsyncCallback<User>() {

			public void onSuccess(User user) {
				SecurityContext.setCurrentUser(user);
				if (user == null)
					SecurityContext.doAuthentication();
				else
					MonitoringApp.super.beforeLoad();
			}
		});

	}

	private void initSecurity() {
		SecurityContext.setEnabled(true);

		SecurityContext.getAuthenticator().addListener(new AuthenticationListener() {

			public void onSuccess() {
				MonitoringApp.super.beforeLoad();
			}

			public void onFailure() {
			}
		});
	}

	private void initHandlers() {
		GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {

			public void onUncaughtException(Throwable e) {
				// Window.alert("Ошибка приложения:\n" + e.toString());
				String message = "Ошибка приложения:\n" + e.toString();
				for (StackTraceElement stack : e.getStackTrace()) {
					message += '\n' + stack.toString();
				}
				if (message != null) {
					new ShowXmlWindow("Ошибка", message).show();
				}
			}
		});

		BaseAsyncCallback.addHandler(new ExceptionHandler() {

			public void handle(Throwable t) {
				String message = null;
				if (t instanceof StatusCodeException) {
					StatusCodeException sce = (StatusCodeException) t;

					if (sce.getStatusCode() == 500) {
						message = "Ошибка на сервере:\n" + sce.getMessage();
					}
				} else if (t instanceof Exception) {
					message = t.getMessage();
				}
				for (StackTraceElement stack : t.getStackTrace()) {
					message += '\n' + stack.toString();
				}
				if (message != null) {
					new ShowXmlWindow("Ошибка", message).show();
				}

			}
		});
	}

	/** {@inheritDoc} */
	@Override
	protected void beforeInitUI() {
		initPages();
		super.beforeInitUI();
	}

	private void initPages() {
		TreeModel pages = getPageTree();

		Category monitoring = new SecuredCategory("Мониторинг", new String[] { "ROLE_USER" });
		{
			monitoring.addPage("agents", "Мониторинг компонент", new MonitoringPage());
			monitoring.addPage("log", "Журнал событий", new LogPage());
			monitoring.addPage("stat", "Статистика обработки сообщений", new MessageProcessingStatPage());

		}
		pages.add(monitoring);

		Category settings = new SecuredCategory("Настройки и управление", new String[] { "ROLE_ADMIN" });
		{
			settings.addPage("connections", "Настройка подключений", new ConnectionSettingsPage());
			settings.addPage("security", "Настройка безопасности", new SecurityPage());

		}
		pages.add(settings);

		SecurityContext.filterSecuredTree(pages);
	}

	@Override
	protected void afterInitUI() {
		super.afterInitUI();
		showPage(findPage("agents"));
	}
}
