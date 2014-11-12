
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import org.joda.time.DateTime;
import ru.acs.fts.schemas.aud.commonaggregatetypescust.BaseDocType;

/** 
 * Базовый класс для всех технологических документов АЮД.
 */
public class AUDBaseEnvelopeType extends BaseDocType
{
    private DateTime documentDateTime;
    private boolean testDocumentIndicator;

    /** 
     * Get the 'DocumentDateTime' element value. Дата и время создания технологического документа (запроса, ответа). Значение должно быть представлено с указанием смещения (значения локального времени относительно всемирного времени).
     * 
     * @return value
     */
    public DateTime getDocumentDateTime() {
        return documentDateTime;
    }

    /** 
     * Set the 'DocumentDateTime' element value. Дата и время создания технологического документа (запроса, ответа). Значение должно быть представлено с указанием смещения (значения локального времени относительно всемирного времени).
     * 
     * @param documentDateTime
     */
    public void setDocumentDateTime(DateTime documentDateTime) {
        this.documentDateTime = documentDateTime;
    }

    /** 
     * Get the 'TestDocumentIndicator' element value. Признак того, что технологический документ является тестовым.
     * 
     * @return value
     */
    public boolean isTestDocumentIndicator() {
        return testDocumentIndicator;
    }

    /** 
     * Set the 'TestDocumentIndicator' element value. Признак того, что технологический документ является тестовым.
     * 
     * @param testDocumentIndicator
     */
    public void setTestDocumentIndicator(boolean testDocumentIndicator) {
        this.testDocumentIndicator = testDocumentIndicator;
    }
}
