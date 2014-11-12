
package ru.acs.fts.schemas.album.oez_permitapplication;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * Заявление на получение разрешения на ввоз/вывоз товаров на (с) территорию (ии) ПОЭЗ
 */
public class OEZPermitApplicationType extends BaseDocType
{
    private String applicationDetails;
    private LocalDate planDate;
    private CUOrganizationType applicant;
    private CustomsType customs;
    private String documentModeID;

    /** 
     * Get the 'ApplicationDetails' element value. Сведения, содержащиеся в заявлении на новое разрешение
     * 
     * @return value
     */
    public String getApplicationDetails() {
        return applicationDetails;
    }

    /** 
     * Set the 'ApplicationDetails' element value. Сведения, содержащиеся в заявлении на новое разрешение
     * 
     * @param applicationDetails
     */
    public void setApplicationDetails(String applicationDetails) {
        this.applicationDetails = applicationDetails;
    }

    /** 
     * Get the 'PlanDate' element value. Планируемая дата ввоза/вывоза товаров
     * 
     * @return value
     */
    public LocalDate getPlanDate() {
        return planDate;
    }

    /** 
     * Set the 'PlanDate' element value. Планируемая дата ввоза/вывоза товаров
     * 
     * @param planDate
     */
    public void setPlanDate(LocalDate planDate) {
        this.planDate = planDate;
    }

    /** 
     * Get the 'Applicant' element value. Заявитель (Резидент ПОЭЗ либо лицо, действующее по его поручению)
     * 
     * @return value
     */
    public CUOrganizationType getApplicant() {
        return applicant;
    }

    /** 
     * Set the 'Applicant' element value. Заявитель (Резидент ПОЭЗ либо лицо, действующее по его поручению)
     * 
     * @param applicant
     */
    public void setApplicant(CUOrganizationType applicant) {
        this.applicant = applicant;
    }

    /** 
     * Get the 'Customs' element value. Сведения о таможенном органе
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Сведения о таможенном органе
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
