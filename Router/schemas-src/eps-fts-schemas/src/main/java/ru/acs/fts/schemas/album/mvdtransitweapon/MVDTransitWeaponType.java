
package ru.acs.fts.schemas.album.mvdtransitweapon;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ���������� �� ���� �� ���������� �� (����� � ���������� ��, �������� ����� ���������� ��) ������������ � ���������� ������ � �������� � ����, �������� ������������ ����
 */
public class MVDTransitWeaponType extends BaseDocType
{
    private String isCanceled;
    private String BDRDID;
    private String departureCountry;
    private String destinationCountry;
    private PermissionType permission;
    private CUOrganizationType organization;
    private WeaponDescriptionType weaponDescription;
    private DocumentBaseType baseDocument;
    private PersonSignatureType signer;
    private String documentModeID;

    /** 
     * Get the 'IsCanceled' element value. �������������� ��������
     * 
     * @return value
     */
    public String getIsCanceled() {
        return isCanceled;
    }

    /** 
     * Set the 'IsCanceled' element value. �������������� ��������
     * 
     * @param isCanceled
     */
    public void setIsCanceled(String isCanceled) {
        this.isCanceled = isCanceled;
    }

    /** 
     * Get the 'BDRDID' element value. ������������� ��������� �� �� ��
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. ������������� ��������� �� �� ��
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the 'DepartureCountry' element value. ������ �����������
     * 
     * @return value
     */
    public String getDepartureCountry() {
        return departureCountry;
    }

    /** 
     * Set the 'DepartureCountry' element value. ������ �����������
     * 
     * @param departureCountry
     */
    public void setDepartureCountry(String departureCountry) {
        this.departureCountry = departureCountry;
    }

    /** 
     * Get the 'DestinationCountry' element value. ������ ����������
     * 
     * @return value
     */
    public String getDestinationCountry() {
        return destinationCountry;
    }

    /** 
     * Set the 'DestinationCountry' element value. ������ ����������
     * 
     * @param destinationCountry
     */
    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    /** 
     * Get the 'Permission' element value. ����������
     * 
     * @return value
     */
    public PermissionType getPermission() {
        return permission;
    }

    /** 
     * Set the 'Permission' element value. ����������
     * 
     * @param permission
     */
    public void setPermission(PermissionType permission) {
        this.permission = permission;
    }

    /** 
     * Get the 'Organization' element value. ����������� ����
     * 
     * @return value
     */
    public CUOrganizationType getOrganization() {
        return organization;
    }

    /** 
     * Set the 'Organization' element value. ����������� ����
     * 
     * @param organization
     */
    public void setOrganization(CUOrganizationType organization) {
        this.organization = organization;
    }

    /** 
     * Get the 'WeaponDescription' element value. �������� ������ (��������)
     * 
     * @return value
     */
    public WeaponDescriptionType getWeaponDescription() {
        return weaponDescription;
    }

    /** 
     * Set the 'WeaponDescription' element value. �������� ������ (��������)
     * 
     * @param weaponDescription
     */
    public void setWeaponDescription(WeaponDescriptionType weaponDescription) {
        this.weaponDescription = weaponDescription;
    }

    /** 
     * Get the 'BaseDocument' element value. ���������
     * 
     * @return value
     */
    public DocumentBaseType getBaseDocument() {
        return baseDocument;
    }

    /** 
     * Set the 'BaseDocument' element value. ���������
     * 
     * @param baseDocument
     */
    public void setBaseDocument(DocumentBaseType baseDocument) {
        this.baseDocument = baseDocument;
    }

    /** 
     * Get the 'Signer' element value. ����������� ����, ����������� ����������
     * 
     * @return value
     */
    public PersonSignatureType getSigner() {
        return signer;
    }

    /** 
     * Set the 'Signer' element value. ����������� ����, ����������� ����������
     * 
     * @param signer
     */
    public void setSigner(PersonSignatureType signer) {
        this.signer = signer;
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
