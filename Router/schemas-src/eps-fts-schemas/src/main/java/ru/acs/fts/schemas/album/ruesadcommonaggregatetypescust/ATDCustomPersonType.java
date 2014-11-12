
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Должностные лица таможенного органа, присутствующие и проводившие таможенный досмотр
 */
public class ATDCustomPersonType extends PersonBaseType
{
    private String signatureFlag;
    private String LNP;
    private String officialStatus;
    private String OTOFlag;
    private String lawAct;
    private String recordNumber;

    /** 
     * Get the 'SignatureFlag' element value. Признак, подтверждающий факт подписи АТД
     * 
     * @return value
     */
    public String getSignatureFlag() {
        return signatureFlag;
    }

    /** 
     * Set the 'SignatureFlag' element value. Признак, подтверждающий факт подписи АТД
     * 
     * @param signatureFlag
     */
    public void setSignatureFlag(String signatureFlag) {
        this.signatureFlag = signatureFlag;
    }

    /** 
     * Get the 'LNP' element value. ЛНП должностного лица таможенного органа
     * 
     * @return value
     */
    public String getLNP() {
        return LNP;
    }

    /** 
     * Set the 'LNP' element value. ЛНП должностного лица таможенного органа
     * 
     * @param LNP
     */
    public void setLNP(String LNP) {
        this.LNP = LNP;
    }

    /** 
     * Get the 'OfficialStatus' element value. Статус должностного лица при проведении таможенного досмотра 1 -  проведение досмотра, 2 - присутствовало при досмотре
     * 
     * @return value
     */
    public String getOfficialStatus() {
        return officialStatus;
    }

    /** 
     * Set the 'OfficialStatus' element value. Статус должностного лица при проведении таможенного досмотра 1 -  проведение досмотра, 2 - присутствовало при досмотре
     * 
     * @param officialStatus
     */
    public void setOfficialStatus(String officialStatus) {
        this.officialStatus = officialStatus;
    }

    /** 
     * Get the 'OTOFlag' element value. Тип присутствующего лица: 1 - должностное лицо, не являющееся должностным лицом таможенного поста (ОТОиТК); 2- уполномоченное должностное лицо таможенного поста (ОТОиТК);
     * 
     * @return value
     */
    public String getOTOFlag() {
        return OTOFlag;
    }

    /** 
     * Set the 'OTOFlag' element value. Тип присутствующего лица: 1 - должностное лицо, не являющееся должностным лицом таможенного поста (ОТОиТК); 2- уполномоченное должностное лицо таможенного поста (ОТОиТК);
     * 
     * @param OTOFlag
     */
    public void setOTOFlag(String OTOFlag) {
        this.OTOFlag = OTOFlag;
    }

    /** 
     * Get the 'LawAct' element value. Основание для присутствия при таможенном досмотре должностных лиц, не являющихся должностными лицами таможенного поста (ОТОиТК)
     * 
     * @return value
     */
    public String getLawAct() {
        return lawAct;
    }

    /** 
     * Set the 'LawAct' element value. Основание для присутствия при таможенном досмотре должностных лиц, не являющихся должностными лицами таможенного поста (ОТОиТК)
     * 
     * @param lawAct
     */
    public void setLawAct(String lawAct) {
        this.lawAct = lawAct;
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
}
