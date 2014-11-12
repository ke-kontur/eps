
package ru.acs.fts.schemas.album.certificaterightstateflag;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.ShipDataType;

/** 
 * Свидетельство о праве плавать под Государственным флагом Российской Федерации.
 */
public class CertificateRightStateFlagType extends BaseDocType
{
    private String nameVessel;
    private String issuedInspectorate;
    private String issuedChief;
    private String registrationNumber;
    private LocalDate issueDateDoc;
    private ShipownerType shipowner;
    private RegisterType register;
    private ShipDataType vessel;
    private PersonSignatureType signatureChief;
    private String documentModeID;

    /** 
     * Get the 'NameVessel' element value. Наименование судна
     * 
     * @return value
     */
    public String getNameVessel() {
        return nameVessel;
    }

    /** 
     * Set the 'NameVessel' element value. Наименование судна
     * 
     * @param nameVessel
     */
    public void setNameVessel(String nameVessel) {
        this.nameVessel = nameVessel;
    }

    /** 
     * Get the 'IssuedInspectorate' element value. Наименование бассейна, по которому выдано свидетельство Государственной речной судоходной инспекцией
     * 
     * @return value
     */
    public String getIssuedInspectorate() {
        return issuedInspectorate;
    }

    /** 
     * Set the 'IssuedInspectorate' element value. Наименование бассейна, по которому выдано свидетельство Государственной речной судоходной инспекцией
     * 
     * @param issuedInspectorate
     */
    public void setIssuedInspectorate(String issuedInspectorate) {
        this.issuedInspectorate = issuedInspectorate;
    }

    /** 
     * Get the 'IssuedChief' element value. Наименование бассейна, начальник которого   подписывает свидетельство.
     * 
     * @return value
     */
    public String getIssuedChief() {
        return issuedChief;
    }

    /** 
     * Set the 'IssuedChief' element value. Наименование бассейна, начальник которого   подписывает свидетельство.
     * 
     * @param issuedChief
     */
    public void setIssuedChief(String issuedChief) {
        this.issuedChief = issuedChief;
    }

    /** 
     * Get the 'RegistrationNumber' element value. Регистрационный номер свидетельства
     * 
     * @return value
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. Регистрационный номер свидетельства
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /** 
     * Get the 'IssueDateDoc' element value. Дата выдачи сертификата
     * 
     * @return value
     */
    public LocalDate getIssueDateDoc() {
        return issueDateDoc;
    }

    /** 
     * Set the 'IssueDateDoc' element value. Дата выдачи сертификата
     * 
     * @param issueDateDoc
     */
    public void setIssueDateDoc(LocalDate issueDateDoc) {
        this.issueDateDoc = issueDateDoc;
    }

    /** 
     * Get the 'Shipowner' element value. Сведения о судовладельце
     * 
     * @return value
     */
    public ShipownerType getShipowner() {
        return shipowner;
    }

    /** 
     * Set the 'Shipowner' element value. Сведения о судовладельце
     * 
     * @param shipowner
     */
    public void setShipowner(ShipownerType shipowner) {
        this.shipowner = shipowner;
    }

    /** 
     * Get the 'Register' element value. Государственный судовой реестр Российской Федерации
     * 
     * @return value
     */
    public RegisterType getRegister() {
        return register;
    }

    /** 
     * Set the 'Register' element value. Государственный судовой реестр Российской Федерации
     * 
     * @param register
     */
    public void setRegister(RegisterType register) {
        this.register = register;
    }

    /** 
     * Get the 'Vessel' element value. Реквизиты судна
     * 
     * @return value
     */
    public ShipDataType getVessel() {
        return vessel;
    }

    /** 
     * Set the 'Vessel' element value. Реквизиты судна
     * 
     * @param vessel
     */
    public void setVessel(ShipDataType vessel) {
        this.vessel = vessel;
    }

    /** 
     * Get the 'SignatureChief' element value. Подпись начальника Государственной речной судоходной инспекции.
     * 
     * @return value
     */
    public PersonSignatureType getSignatureChief() {
        return signatureChief;
    }

    /** 
     * Set the 'SignatureChief' element value. Подпись начальника Государственной речной судоходной инспекции.
     * 
     * @param signatureChief
     */
    public void setSignatureChief(PersonSignatureType signatureChief) {
        this.signatureChief = signatureChief;
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
