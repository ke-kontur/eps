
package ru.acs.fts.schemas.album.certificaterightstateflag;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.ShipDataType;

/** 
 * ������������� � ����� ������� ��� ��������������� ������ ���������� ���������.
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
     * Get the 'NameVessel' element value. ������������ �����
     * 
     * @return value
     */
    public String getNameVessel() {
        return nameVessel;
    }

    /** 
     * Set the 'NameVessel' element value. ������������ �����
     * 
     * @param nameVessel
     */
    public void setNameVessel(String nameVessel) {
        this.nameVessel = nameVessel;
    }

    /** 
     * Get the 'IssuedInspectorate' element value. ������������ ��������, �� �������� ������ ������������� ��������������� ������ ���������� ����������
     * 
     * @return value
     */
    public String getIssuedInspectorate() {
        return issuedInspectorate;
    }

    /** 
     * Set the 'IssuedInspectorate' element value. ������������ ��������, �� �������� ������ ������������� ��������������� ������ ���������� ����������
     * 
     * @param issuedInspectorate
     */
    public void setIssuedInspectorate(String issuedInspectorate) {
        this.issuedInspectorate = issuedInspectorate;
    }

    /** 
     * Get the 'IssuedChief' element value. ������������ ��������, ��������� ��������   ����������� �������������.
     * 
     * @return value
     */
    public String getIssuedChief() {
        return issuedChief;
    }

    /** 
     * Set the 'IssuedChief' element value. ������������ ��������, ��������� ��������   ����������� �������������.
     * 
     * @param issuedChief
     */
    public void setIssuedChief(String issuedChief) {
        this.issuedChief = issuedChief;
    }

    /** 
     * Get the 'RegistrationNumber' element value. ��������������� ����� �������������
     * 
     * @return value
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. ��������������� ����� �������������
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /** 
     * Get the 'IssueDateDoc' element value. ���� ������ �����������
     * 
     * @return value
     */
    public LocalDate getIssueDateDoc() {
        return issueDateDoc;
    }

    /** 
     * Set the 'IssueDateDoc' element value. ���� ������ �����������
     * 
     * @param issueDateDoc
     */
    public void setIssueDateDoc(LocalDate issueDateDoc) {
        this.issueDateDoc = issueDateDoc;
    }

    /** 
     * Get the 'Shipowner' element value. �������� � �������������
     * 
     * @return value
     */
    public ShipownerType getShipowner() {
        return shipowner;
    }

    /** 
     * Set the 'Shipowner' element value. �������� � �������������
     * 
     * @param shipowner
     */
    public void setShipowner(ShipownerType shipowner) {
        this.shipowner = shipowner;
    }

    /** 
     * Get the 'Register' element value. ��������������� ������� ������ ���������� ���������
     * 
     * @return value
     */
    public RegisterType getRegister() {
        return register;
    }

    /** 
     * Set the 'Register' element value. ��������������� ������� ������ ���������� ���������
     * 
     * @param register
     */
    public void setRegister(RegisterType register) {
        this.register = register;
    }

    /** 
     * Get the 'Vessel' element value. ��������� �����
     * 
     * @return value
     */
    public ShipDataType getVessel() {
        return vessel;
    }

    /** 
     * Set the 'Vessel' element value. ��������� �����
     * 
     * @param vessel
     */
    public void setVessel(ShipDataType vessel) {
        this.vessel = vessel;
    }

    /** 
     * Get the 'SignatureChief' element value. ������� ���������� ��������������� ������ ���������� ���������.
     * 
     * @return value
     */
    public PersonSignatureType getSignatureChief() {
        return signatureChief;
    }

    /** 
     * Set the 'SignatureChief' element value. ������� ���������� ��������������� ������ ���������� ���������.
     * 
     * @param signatureChief
     */
    public void setSignatureChief(PersonSignatureType signatureChief) {
        this.signatureChief = signatureChief;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
