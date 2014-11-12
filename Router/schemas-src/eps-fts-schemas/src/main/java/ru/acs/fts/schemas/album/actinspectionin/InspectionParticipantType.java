
package ru.acs.fts.schemas.album.actinspectionin;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AuthoritesDocumentType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;

/** 
 * Лицо, присутствующее при досмотре (осмотре)
 */
public class InspectionParticipantType extends PersonInfType
{
    private String status;
    private LocalDate ATDRecriveDate;
    private String ATDReceiveTime;
    private String recordNumber;
    private String reason;
    private String job;
    private String ATDReceiveCopy;
    private String addresseeMPO;
    private IdentityCardType identityCard;
    private AddressType address;
    private AuthoritesDocumentType authoritesDocument;

    /** 
     * Get the 'Status' element value. Статус или должность лица, присутствующего при досмотре (осмотре): 3 - декларант (иное лицо, уполномоченное в отношении товаров, либо представитель); 4 - понятой; 5 - эксперт; 6 - оператор почтовой связи
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. Статус или должность лица, присутствующего при досмотре (осмотре): 3 - декларант (иное лицо, уполномоченное в отношении товаров, либо представитель); 4 - понятой; 5 - эксперт; 6 - оператор почтовой связи
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'ATDRecriveDate' element value. Дата получения второго экземпляра на руки
     * 
     * @return value
     */
    public LocalDate getATDRecriveDate() {
        return ATDRecriveDate;
    }

    /** 
     * Set the 'ATDRecriveDate' element value. Дата получения второго экземпляра на руки
     * 
     * @param ATDRecriveDate
     */
    public void setATDRecriveDate(LocalDate ATDRecriveDate) {
        this.ATDRecriveDate = ATDRecriveDate;
    }

    /** 
     * Get the 'ATDReceiveTime' element value. Время получения второго экземпляра
     * 
     * @return value
     */
    public String getATDReceiveTime() {
        return ATDReceiveTime;
    }

    /** 
     * Set the 'ATDReceiveTime' element value. Время получения второго экземпляра
     * 
     * @param ATDReceiveTime
     */
    public void setATDReceiveTime(String ATDReceiveTime) {
        this.ATDReceiveTime = ATDReceiveTime;
    }

    /** 
     * Get the 'RecordNumber' element value. Порядковый номер записи в таблице БД
     * 
     * @return value
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /** 
     * Set the 'RecordNumber' element value. Порядковый номер записи в таблице БД
     * 
     * @param recordNumber
     */
    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }

    /** 
     * Get the 'Reason' element value. Причина проведения таможенного досмотра в отсутствие декларанта или иного лица, обладающего полномочиями в отношении товаров (транспортных средств), либо их представителей
     * 
     * @return value
     */
    public String getReason() {
        return reason;
    }

    /** 
     * Set the 'Reason' element value. Причина проведения таможенного досмотра в отсутствие декларанта или иного лица, обладающего полномочиями в отношении товаров (транспортных средств), либо их представителей
     * 
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /** 
     * Get the 'Job' element value. Место работы
     * 
     * @return value
     */
    public String getJob() {
        return job;
    }

    /** 
     * Set the 'Job' element value. Место работы
     * 
     * @param job
     */
    public void setJob(String job) {
        this.job = job;
    }

    /** 
     * Get the 'ATDReceiveCopy' element value. Признак, подтверждающий факт получения второго экземпляра АТД  представителем декларанта или лица, уполномоченного в отношении товаров 0 - не получено 1 - получено
     * 
     * @return value
     */
    public String getATDReceiveCopy() {
        return ATDReceiveCopy;
    }

    /** 
     * Set the 'ATDReceiveCopy' element value. Признак, подтверждающий факт получения второго экземпляра АТД  представителем декларанта или лица, уполномоченного в отношении товаров 0 - не получено 1 - получено
     * 
     * @param ATDReceiveCopy
     */
    public void setATDReceiveCopy(String ATDReceiveCopy) {
        this.ATDReceiveCopy = ATDReceiveCopy;
    }

    /** 
     * Get the 'AddresseeMPO' element value. Номер МПО, с которым направлен второй АТД(О), в адрес лица, обладающего полномочиями в отношении товаров
     * 
     * @return value
     */
    public String getAddresseeMPO() {
        return addresseeMPO;
    }

    /** 
     * Set the 'AddresseeMPO' element value. Номер МПО, с которым направлен второй АТД(О), в адрес лица, обладающего полномочиями в отношении товаров
     * 
     * @param addresseeMPO
     */
    public void setAddresseeMPO(String addresseeMPO) {
        this.addresseeMPO = addresseeMPO;
    }

    /** 
     * Get the 'IdentityCard' element value. Документ, удостоверяющий личность
     * 
     * @return value
     */
    public IdentityCardType getIdentityCard() {
        return identityCard;
    }

    /** 
     * Set the 'IdentityCard' element value. Документ, удостоверяющий личность
     * 
     * @param identityCard
     */
    public void setIdentityCard(IdentityCardType identityCard) {
        this.identityCard = identityCard;
    }

    /** 
     * Get the 'Address' element value. Адрес местожительства понятого
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес местожительства понятого
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }

    /** 
     * Get the 'AuthoritesDocument' element value. Документ, подтверждающий полномочия. 
     * 
     * @return value
     */
    public AuthoritesDocumentType getAuthoritesDocument() {
        return authoritesDocument;
    }

    /** 
     * Set the 'AuthoritesDocument' element value. Документ, подтверждающий полномочия. 
     * 
     * @param authoritesDocument
     */
    public void setAuthoritesDocument(AuthoritesDocumentType authoritesDocument) {
        this.authoritesDocument = authoritesDocument;
    }
}
