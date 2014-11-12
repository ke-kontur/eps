@echo offgc_jmssetup

echo + Creating script for object creation within JMSAdmin

echo + Creating script for object creation within JMSAdmin

echo del q(ToArchiveQueue)         >> jmssetup.scp
echo def q(ToArchiveQueue) qu(AUD.SERVER.IN)        >> jmssetup.scp

echo del q(FromArchiveQueue)          >> jmssetup.scp
echo def q(FromArchiveQueue) qu(AUD.SERVER.OUT)     >> jmssetup.scp

echo del xaqcf(MqConnection)            >> jmssetup.scp
echo def xaqcf(MqConnection) qmgr(MRDEKK.MANAGER) transport(bind)  >> jmssetup.scp

echo end              >> jmssetup.scp

echo "+ Calling JMSAdmin in batch mode to create objects"
java -DMQJMS_LOG_DIR="%MQ_JAVA_DATA_PATH%"/log -DMQJMS_TRACE_DIR="%MQ_JAVA_DATA_PATH%"/trace -DMQJMS_INSTALL_PATH="%MQ_JAVA_INSTALL_PATH%" com.ibm.mq.jms.admin.JMSAdmin -cfg "%~dp0JMSConfig.config" < "%~dp0jmssetup.scp"

echo + Administration done; tidying up files
del jmssetup.scp

echo "+ Done!"

pause
