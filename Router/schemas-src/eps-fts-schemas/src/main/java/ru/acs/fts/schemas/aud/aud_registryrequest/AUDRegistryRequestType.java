
package ru.acs.fts.schemas.aud.aud_registryrequest;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;

public class AUDRegistryRequestType extends AUDBaseEnvelopeType
{
    private LocalDate dateBegin;
    private LocalDate dateStop;
    private String dateIndicatior;
    private String documentModeID;

    /** 
     * Get the 'DateBegin' element value. Дата  начала  размещения  документов
     * 
     * @return value
     */
    public LocalDate getDateBegin() {
        return dateBegin;
    }

    /** 
     * Set the 'DateBegin' element value. Дата  начала  размещения  документов
     * 
     * @param dateBegin
     */
    public void setDateBegin(LocalDate dateBegin) {
        this.dateBegin = dateBegin;
    }

    /** 
     * Get the 'DateStop' element value. Дата  окончания  размещения  документов
     * 
     * @return value
     */
    public LocalDate getDateStop() {
        return dateStop;
    }

    /** 
     * Set the 'DateStop' element value. Дата  окончания  размещения  документов
     * 
     * @param dateStop
     */
    public void setDateStop(LocalDate dateStop) {
        this.dateStop = dateStop;
    }

    /** 
     * Get the 'DateIndicatior' element value. Признак  обработки дат. 1-Дата размещения пакета в архиве 2- дата регистрации ГТД
     * 
     * @return value
     */
    public String getDateIndicatior() {
        return dateIndicatior;
    }

    /** 
     * Set the 'DateIndicatior' element value. Признак  обработки дат. 1-Дата размещения пакета в архиве 2- дата регистрации ГТД
     * 
     * @param dateIndicatior
     */
    public void setDateIndicatior(String dateIndicatior) {
        this.dateIndicatior = dateIndicatior;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида технологического документа (запроса, ответа)
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида технологического документа (запроса, ответа)
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
