
package ru.acs.fts.schemas.album.certificatdimmatriculation;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Свидетельство о регистрации транспортного средства
 */
public class CertificatDImmatriculationType extends BaseDocType
{
    private List<String> commentList = new ArrayList<String>();
    private String PTSNumber;
    private RegistrationType registration;
    private UnRegistrationType unRegistration;
    private CDITransportMeansType CDITransportMeans;
    private CDIAutomobileownerType CDIAutomobileowner;
    private String documentModeID;

    /** 
     * Get the list of 'Comment' element items. Прочие отметки
     * 
     * @return list
     */
    public List<String> getCommentList() {
        return commentList;
    }

    /** 
     * Set the list of 'Comment' element items. Прочие отметки
     * 
     * @param list
     */
    public void setCommentList(List<String> list) {
        commentList = list;
    }

    /** 
     * Get the 'PTSNumber' element value. Регистрационный номер Паспорта ТС
     * 
     * @return value
     */
    public String getPTSNumber() {
        return PTSNumber;
    }

    /** 
     * Set the 'PTSNumber' element value. Регистрационный номер Паспорта ТС
     * 
     * @param PTSNumber
     */
    public void setPTSNumber(String PTSNumber) {
        this.PTSNumber = PTSNumber;
    }

    /** 
     * Get the 'Registration' element value. Регистрационные данные свидетельства
     * 
     * @return value
     */
    public RegistrationType getRegistration() {
        return registration;
    }

    /** 
     * Set the 'Registration' element value. Регистрационные данные свидетельства
     * 
     * @param registration
     */
    public void setRegistration(RegistrationType registration) {
        this.registration = registration;
    }

    /** 
     * Get the 'UnRegistration' element value. Данные о снятии с учета ТС
     * 
     * @return value
     */
    public UnRegistrationType getUnRegistration() {
        return unRegistration;
    }

    /** 
     * Set the 'UnRegistration' element value. Данные о снятии с учета ТС
     * 
     * @param unRegistration
     */
    public void setUnRegistration(UnRegistrationType unRegistration) {
        this.unRegistration = unRegistration;
    }

    /** 
     * Get the 'CDITransportMeans' element value. Сведения о транспортном средстве 
     * 
     * @return value
     */
    public CDITransportMeansType getCDITransportMeans() {
        return CDITransportMeans;
    }

    /** 
     * Set the 'CDITransportMeans' element value. Сведения о транспортном средстве 
     * 
     * @param CDITransportMeans
     */
    public void setCDITransportMeans(CDITransportMeansType CDITransportMeans) {
        this.CDITransportMeans = CDITransportMeans;
    }

    /** 
     * Get the 'CDIAutomobileowner' element value. Сведения о собственнике транспортного средства
     * 
     * @return value
     */
    public CDIAutomobileownerType getCDIAutomobileowner() {
        return CDIAutomobileowner;
    }

    /** 
     * Set the 'CDIAutomobileowner' element value. Сведения о собственнике транспортного средства
     * 
     * @param CDIAutomobileowner
     */
    public void setCDIAutomobileowner(CDIAutomobileownerType CDIAutomobileowner) {
        this.CDIAutomobileowner = CDIAutomobileowner;
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
