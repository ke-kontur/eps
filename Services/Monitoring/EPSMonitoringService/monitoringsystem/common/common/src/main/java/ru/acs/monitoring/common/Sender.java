package ru.acs.monitoring.common;

import ru.acs.fts.dto.BaseDocType;

/**
 * Интерфейс для "отправителя"
 * @author fmv
 *
 */
public interface Sender {
		public void send(BaseDocType doc);
		public void send(byte[] message);
}
