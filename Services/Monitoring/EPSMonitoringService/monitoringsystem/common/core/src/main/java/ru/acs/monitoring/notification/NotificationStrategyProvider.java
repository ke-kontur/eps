package ru.acs.monitoring.notification;

public class NotificationStrategyProvider {

	private NotificationStrategy strategy;
	
	public NotificationStrategyProvider(NotificationStrategy strategy) {
		super();
		this.strategy = strategy;
	}

	public NotificationStrategyProvider() {
		super();
	}

	public NotificationStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(NotificationStrategy strategy) {
		this.strategy = strategy;
	}	
}
