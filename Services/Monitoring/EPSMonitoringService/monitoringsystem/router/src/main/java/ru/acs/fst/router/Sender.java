package ru.acs.fst.router;

/**
 * Интерфейс для "отправителя"
 *
 * @author fmv
 */
public interface Sender {
    public void send(byte[] message);

    public void sendToQueue(String receiveQueue, String receiveQueueManager, byte[] message);
    public void sendToQueue(String receiveQueue, String receiveQueueManager, int priority, byte[] message);

}
