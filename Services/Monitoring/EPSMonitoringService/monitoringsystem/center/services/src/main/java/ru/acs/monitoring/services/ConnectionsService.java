package ru.acs.monitoring.services;

import java.util.Collection;
import ru.acs.monitoring.domain.Connection;

/**
 * Сервис управления соединениями с локальныим агентами.
 *
 * @author Алексей Селиванов
 */
public interface ConnectionsService {

    /**
     * Производит поиск соединения по идентификатору. Возвращает соединение или
     * {@code null}, если соединение с заданным идентификатором не найдено.
     * 
     * @param  id идентификатор.
     * @return соединение с заданным идентификатором или {@code null}, если 
     *         соединение с заданным идентификатором не найдено.
     */
    Connection findById(Long id);

    /**
     * Возвращает все имеющиеся подключения.
     * @return все имеющиеся подключения.
     */
    Collection<Connection> getAll();

    /**
     * Добавялет подключение.
     * @param connection подключение.
     */
    void save(Connection connection);

    /**
     * Обновляет информацию подключения.
     * @param connecton подключение.
     */
    void update(Connection connecton);

    /**
     * Удаляет подключение.
     * @param connection подключение.
     */
    void remove(Connection connection);

    /**
     * Выполняет замену всех имеющихся подключений на заданные. Те из
     * переданных подключений, которые хранятся в источнике, будут обновлены,
     * остальные добавлены. Те из хранимых подключений, которые остуствуют
     * в переданных, будут удалены.
     *
     * @param connections подключения.
     */
    void replaceAllWith(Collection<Connection> connections);

    /**
     * Возвращает {@code true} тогда и только тогда, когда подключение
     * содержится в хранилище.
     *
     * @param  connection подключение.
     * @return {@code true} тогда и только тогда, когда подключение содержится
     *         в хранилище.
     */
    boolean contains(Connection connection);
}
