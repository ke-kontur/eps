
package ru.acs.fts.schemas.album.ktsin;

import org.joda.time.LocalDate;

/** 
 * КТС. Внутренний формат. Служебные отметки по товарам.
 */
public class KTSinGoodsOfficialMarkType
{
    private String recordSerialNumber;
    private String reserveMarkIdentifier;
    private String officialRecord;
    private String paymentEnsuringTypeCode;
    private String personName;
    private String LNP;
    private LocalDate dateInf;
    private String timeInf;
    private String documentNumber;
    private LocalDate documentDate;

    /** 
     * Get the 'RecordSerialNumber' element value. Порядковый номер записи 
     * 
     * @return value
     */
    public String getRecordSerialNumber() {
        return recordSerialNumber;
    }

    /** 
     * Set the 'RecordSerialNumber' element value. Порядковый номер записи 
     * 
     * @param recordSerialNumber
     */
    public void setRecordSerialNumber(String recordSerialNumber) {
        this.recordSerialNumber = recordSerialNumber;
    }

    /** 
     * Get the 'ReserveMarkIdentifier' element value. Резерв - Идентификатор проставленной технологической отметки
     * 
     * @return value
     */
    public String getReserveMarkIdentifier() {
        return reserveMarkIdentifier;
    }

    /** 
     * Set the 'ReserveMarkIdentifier' element value. Резерв - Идентификатор проставленной технологической отметки
     * 
     * @param reserveMarkIdentifier
     */
    public void setReserveMarkIdentifier(String reserveMarkIdentifier) {
        this.reserveMarkIdentifier = reserveMarkIdentifier;
    }

    /** 
     * Get the 'OfficialRecord' element value. Служебная запись 
     * 
     * @return value
     */
    public String getOfficialRecord() {
        return officialRecord;
    }

    /** 
     * Set the 'OfficialRecord' element value. Служебная запись 
     * 
     * @param officialRecord
     */
    public void setOfficialRecord(String officialRecord) {
        this.officialRecord = officialRecord;
    }

    /** 
     * Get the 'PaymentEnsuringTypeCode' element value. Вид обеспечения уплаты
     * 
     * @return value
     */
    public String getPaymentEnsuringTypeCode() {
        return paymentEnsuringTypeCode;
    }

    /** 
     * Set the 'PaymentEnsuringTypeCode' element value. Вид обеспечения уплаты
     * 
     * @param paymentEnsuringTypeCode
     */
    public void setPaymentEnsuringTypeCode(String paymentEnsuringTypeCode) {
        this.paymentEnsuringTypeCode = paymentEnsuringTypeCode;
    }

    /** 
     * Get the 'PersonName' element value. ФИО инспектора, заверившего запись
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. ФИО инспектора, заверившего запись
     * 
     * @param personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /** 
     * Get the 'LNP' element value. Номер ЛНП инспектора, заверившего запись
     * 
     * @return value
     */
    public String getLNP() {
        return LNP;
    }

    /** 
     * Set the 'LNP' element value. Номер ЛНП инспектора, заверившего запись
     * 
     * @param LNP
     */
    public void setLNP(String LNP) {
        this.LNP = LNP;
    }

    /** 
     * Get the 'DateInf' element value. Дата внесения служебной отметки.
     * 
     * @return value
     */
    public LocalDate getDateInf() {
        return dateInf;
    }

    /** 
     * Set the 'DateInf' element value. Дата внесения служебной отметки.
     * 
     * @param dateInf
     */
    public void setDateInf(LocalDate dateInf) {
        this.dateInf = dateInf;
    }

    /** 
     * Get the 'TimeInf' element value. Время внесения служебной отметки.
     * 
     * @return value
     */
    public String getTimeInf() {
        return timeInf;
    }

    /** 
     * Set the 'TimeInf' element value. Время внесения служебной отметки.
     * 
     * @param timeInf
     */
    public void setTimeInf(String timeInf) {
        this.timeInf = timeInf;
    }

    /** 
     * Get the 'DocumentNumber' element value. Номер документа
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. Номер документа
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'DocumentDate' element value. Дата документа.
     * 
     * @return value
     */
    public LocalDate getDocumentDate() {
        return documentDate;
    }

    /** 
     * Set the 'DocumentDate' element value. Дата документа.
     * 
     * @param documentDate
     */
    public void setDocumentDate(LocalDate documentDate) {
        this.documentDate = documentDate;
    }
}
