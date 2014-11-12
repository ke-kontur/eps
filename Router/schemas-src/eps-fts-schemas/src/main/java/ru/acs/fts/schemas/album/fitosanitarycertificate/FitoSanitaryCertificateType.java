
package ru.acs.fts.schemas.album.fitosanitarycertificate;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Фитосанитарный сертификат
 */
public class FitoSanitaryCertificateType extends BaseDocType
{
    private String certNumber;
    private List<String> addDeclarationList = new ArrayList<String>();
    private List<OrganizationQuarantineType> organizationQuarantineList = new ArrayList<OrganizationQuarantineType>();
    private DescriptionConsignmentType descriptionConsignment;
    private DesinfestationType desinfestation;
    private AddressType placeIssue;
    private PersonSignatureType personSignature;
    private String documentModeID;

    /** 
     * Get the 'CertNumber' element value. Номер сертификата
     * 
     * @return value
     */
    public String getCertNumber() {
        return certNumber;
    }

    /** 
     * Set the 'CertNumber' element value. Номер сертификата
     * 
     * @param certNumber
     */
    public void setCertNumber(String certNumber) {
        this.certNumber = certNumber;
    }

    /** 
     * Get the list of 'AddDeclaration' element items. Дополнительная декларация
     * 
     * @return list
     */
    public List<String> getAddDeclarationList() {
        return addDeclarationList;
    }

    /** 
     * Set the list of 'AddDeclaration' element items. Дополнительная декларация
     * 
     * @param list
     */
    public void setAddDeclarationList(List<String> list) {
        addDeclarationList = list;
    }

    /** 
     * Get the list of 'OrganizationQuarantine' element items. Организации(ям) по карантину и защите растений (страны)
     * 
     * @return list
     */
    public List<OrganizationQuarantineType> getOrganizationQuarantineList() {
        return organizationQuarantineList;
    }

    /** 
     * Set the list of 'OrganizationQuarantine' element items. Организации(ям) по карантину и защите растений (страны)
     * 
     * @param list
     */
    public void setOrganizationQuarantineList(
            List<OrganizationQuarantineType> list) {
        organizationQuarantineList = list;
    }

    /** 
     * Get the 'DescriptionConsignment' element value. Описание груза
     * 
     * @return value
     */
    public DescriptionConsignmentType getDescriptionConsignment() {
        return descriptionConsignment;
    }

    /** 
     * Set the 'DescriptionConsignment' element value. Описание груза
     * 
     * @param descriptionConsignment
     */
    public void setDescriptionConsignment(
            DescriptionConsignmentType descriptionConsignment) {
        this.descriptionConsignment = descriptionConsignment;
    }

    /** 
     * Get the 'Desinfestation' element value. Обеззараживание
     * 
     * @return value
     */
    public DesinfestationType getDesinfestation() {
        return desinfestation;
    }

    /** 
     * Set the 'Desinfestation' element value. Обеззараживание
     * 
     * @param desinfestation
     */
    public void setDesinfestation(DesinfestationType desinfestation) {
        this.desinfestation = desinfestation;
    }

    /** 
     * Get the 'PlaceIssue' element value. Место выдачи
     * 
     * @return value
     */
    public AddressType getPlaceIssue() {
        return placeIssue;
    }

    /** 
     * Set the 'PlaceIssue' element value. Место выдачи
     * 
     * @param placeIssue
     */
    public void setPlaceIssue(AddressType placeIssue) {
        this.placeIssue = placeIssue;
    }

    /** 
     * Get the 'PersonSignature' element value. Подпись уполномоченного должностного лица Федеральной службы по ветеринарному и фитосанитарному надзору
     * 
     * @return value
     */
    public PersonSignatureType getPersonSignature() {
        return personSignature;
    }

    /** 
     * Set the 'PersonSignature' element value. Подпись уполномоченного должностного лица Федеральной службы по ветеринарному и фитосанитарному надзору
     * 
     * @param personSignature
     */
    public void setPersonSignature(PersonSignatureType personSignature) {
        this.personSignature = personSignature;
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
