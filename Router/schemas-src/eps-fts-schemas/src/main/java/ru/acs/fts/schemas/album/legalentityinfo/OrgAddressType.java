
package ru.acs.fts.schemas.album.legalentityinfo;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * Сведения об адресе (месте нахождения) постоянно действующего исполнительного органа юр. лица
 */
public class OrgAddressType extends AddressType
{
    private String KLADRCode;
    private String subjectCode;
    private String impossibleContact;
    private RecordDataType recordData;

    /** 
     * Get the 'KLADRCode' element value. Код адреса по КЛАДР
     * 
     * @return value
     */
    public String getKLADRCode() {
        return KLADRCode;
    }

    /** 
     * Set the 'KLADRCode' element value. Код адреса по КЛАДР
     * 
     * @param KLADRCode
     */
    public void setKLADRCode(String KLADRCode) {
        this.KLADRCode = KLADRCode;
    }

    /** 
     * Get the 'SubjectCode' element value. Код субъекта РФ
     * 
     * @return value
     */
    public String getSubjectCode() {
        return subjectCode;
    }

    /** 
     * Set the 'SubjectCode' element value. Код субъекта РФ
     * 
     * @param subjectCode
     */
    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    /** 
     * Get the 'ImpossibleContact' element value. Признак невозможности взаимодействия с юридическим лицом по содержащемуся в ЕГРЮЛ адресу: 0 - если юр. лицо не располагается по адресу, указанному при государственной регистрации; 1 - если адрес, указанный юр. лицом при государственной регистрации, не существует
     * 
     * @return value
     */
    public String getImpossibleContact() {
        return impossibleContact;
    }

    /** 
     * Set the 'ImpossibleContact' element value. Признак невозможности взаимодействия с юридическим лицом по содержащемуся в ЕГРЮЛ адресу: 0 - если юр. лицо не располагается по адресу, указанному при государственной регистрации; 1 - если адрес, указанный юр. лицом при государственной регистрации, не существует
     * 
     * @param impossibleContact
     */
    public void setImpossibleContact(String impossibleContact) {
        this.impossibleContact = impossibleContact;
    }

    /** 
     * Get the 'RecordData' element value. Сведения о записи
     * 
     * @return value
     */
    public RecordDataType getRecordData() {
        return recordData;
    }

    /** 
     * Set the 'RecordData' element value. Сведения о записи
     * 
     * @param recordData
     */
    public void setRecordData(RecordDataType recordData) {
        this.recordData = recordData;
    }
}
