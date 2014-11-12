
package ru.acs.fts.schemas.album.actinspection;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AuthoritesDocumentType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Лицо, присутствующее при досмотре (осмотре)
 */
public class InspectionParticipantType extends PersonBaseType
{
    private String status;
    private String reason;
    private String job;
    private String addresseeMPO;
    private String ATDReceiveCopy;
    private IdentityCardType participantDocs;
    private AuthoritesDocumentType authoritesDocs;

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
     * Get the 'Reason' element value. Причина проведения таможенного досмотра в отсутствие декларанта или иного лица, обладающего полномочиями в отношении товаров (их представителей)
     * 
     * @return value
     */
    public String getReason() {
        return reason;
    }

    /** 
     * Set the 'Reason' element value. Причина проведения таможенного досмотра в отсутствие декларанта или иного лица, обладающего полномочиями в отношении товаров (их представителей)
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
     * Get the 'ATDReceiveCopy' element value. Признак, подтверждающий факт получения второго экземпляра АТД
     * 
     * @return value
     */
    public String getATDReceiveCopy() {
        return ATDReceiveCopy;
    }

    /** 
     * Set the 'ATDReceiveCopy' element value. Признак, подтверждающий факт получения второго экземпляра АТД
     * 
     * @param ATDReceiveCopy
     */
    public void setATDReceiveCopy(String ATDReceiveCopy) {
        this.ATDReceiveCopy = ATDReceiveCopy;
    }

    /** 
     * Get the 'ParticipantDocs' element value. Документ, удостоверяющий личность
     * 
     * @return value
     */
    public IdentityCardType getParticipantDocs() {
        return participantDocs;
    }

    /** 
     * Set the 'ParticipantDocs' element value. Документ, удостоверяющий личность
     * 
     * @param participantDocs
     */
    public void setParticipantDocs(IdentityCardType participantDocs) {
        this.participantDocs = participantDocs;
    }

    /** 
     * Get the 'AuthoritesDocs' element value. Документ, подтверждающий полномочия
     * 
     * @return value
     */
    public AuthoritesDocumentType getAuthoritesDocs() {
        return authoritesDocs;
    }

    /** 
     * Set the 'AuthoritesDocs' element value. Документ, подтверждающий полномочия
     * 
     * @param authoritesDocs
     */
    public void setAuthoritesDocs(AuthoritesDocumentType authoritesDocs) {
        this.authoritesDocs = authoritesDocs;
    }
}
