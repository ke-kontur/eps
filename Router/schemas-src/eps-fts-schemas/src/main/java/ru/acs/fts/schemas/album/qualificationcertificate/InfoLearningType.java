
package ru.acs.fts.schemas.album.qualificationcertificate;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Сведения  о прохождении обучения по программам повышения квалификации.
 */
public class InfoLearningType
{
    private LocalDate startPeriod;
    private LocalDate endPeriod;
    private String nameOrganizaion;
    private String nubmerLicenseOrganization;
    private String markCustoms;
    private List<DocumentBaseType> documentLearningList = new ArrayList<DocumentBaseType>();
    private List<PersonSignatureType> signatureAuthorizedPersonList = new ArrayList<PersonSignatureType>();

    /** 
     * Get the 'StartPeriod' element value. Период прохождения обучения по программам повышения  квалификации c
     * 
     * @return value
     */
    public LocalDate getStartPeriod() {
        return startPeriod;
    }

    /** 
     * Set the 'StartPeriod' element value. Период прохождения обучения по программам повышения  квалификации c
     * 
     * @param startPeriod
     */
    public void setStartPeriod(LocalDate startPeriod) {
        this.startPeriod = startPeriod;
    }

    /** 
     * Get the 'EndPeriod' element value. Период прохождения обучения по программам повышения  квалификации до
     * 
     * @return value
     */
    public LocalDate getEndPeriod() {
        return endPeriod;
    }

    /** 
     * Set the 'EndPeriod' element value. Период прохождения обучения по программам повышения  квалификации до
     * 
     * @param endPeriod
     */
    public void setEndPeriod(LocalDate endPeriod) {
        this.endPeriod = endPeriod;
    }

    /** 
     * Get the 'NameOrganizaion' element value. Наименование организации, проводившая обучение
     * 
     * @return value
     */
    public String getNameOrganizaion() {
        return nameOrganizaion;
    }

    /** 
     * Set the 'NameOrganizaion' element value. Наименование организации, проводившая обучение
     * 
     * @param nameOrganizaion
     */
    public void setNameOrganizaion(String nameOrganizaion) {
        this.nameOrganizaion = nameOrganizaion;
    }

    /** 
     * Get the 'NubmerLicenseOrganization' element value. Номер лицензии организации
     * 
     * @return value
     */
    public String getNubmerLicenseOrganization() {
        return nubmerLicenseOrganization;
    }

    /** 
     * Set the 'NubmerLicenseOrganization' element value. Номер лицензии организации
     * 
     * @param nubmerLicenseOrganization
     */
    public void setNubmerLicenseOrganization(String nubmerLicenseOrganization) {
        this.nubmerLicenseOrganization = nubmerLicenseOrganization;
    }

    /** 
     * Get the 'MarkCustoms' element value. Отметка таможенного органа о соблюдении требования о повышении квалификации
     * 
     * @return value
     */
    public String getMarkCustoms() {
        return markCustoms;
    }

    /** 
     * Set the 'MarkCustoms' element value. Отметка таможенного органа о соблюдении требования о повышении квалификации
     * 
     * @param markCustoms
     */
    public void setMarkCustoms(String markCustoms) {
        this.markCustoms = markCustoms;
    }

    /** 
     * Get the list of 'DocumentLearning' element items. Документы, подтверждающие прохождение обучения
     * 
     * @return list
     */
    public List<DocumentBaseType> getDocumentLearningList() {
        return documentLearningList;
    }

    /** 
     * Set the list of 'DocumentLearning' element items. Документы, подтверждающие прохождение обучения
     * 
     * @param list
     */
    public void setDocumentLearningList(List<DocumentBaseType> list) {
        documentLearningList = list;
    }

    /** 
     * Get the list of 'SignatureAuthorizedPerson' element items. Подпись уполномоченное лицо
     * 
     * @return list
     */
    public List<PersonSignatureType> getSignatureAuthorizedPersonList() {
        return signatureAuthorizedPersonList;
    }

    /** 
     * Set the list of 'SignatureAuthorizedPerson' element items. Подпись уполномоченное лицо
     * 
     * @param list
     */
    public void setSignatureAuthorizedPersonList(List<PersonSignatureType> list) {
        signatureAuthorizedPersonList = list;
    }
}
