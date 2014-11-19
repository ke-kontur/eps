
package ru.acs.fts.schemas.album.residentsezsertificate;

/** 
 * �������� � ����������� ���� ��� �� �������������� ��������������� - ��������� ��� 
 */
public class ResidentOrganisationType
{
    private String organizationName;
    private String shortName;
    private String fullName;
    private String firmName;
    private String type;
    private String OGRN;
    private String INN;
    private String KPP;

    /** 
     * Get the 'OrganizationName' element value. ������������
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. ������������
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'ShortName' element value. ������� ������������ 
     * 
     * @return value
     */
    public String getShortName() {
        return shortName;
    }

    /** 
     * Set the 'ShortName' element value. ������� ������������ 
     * 
     * @param shortName
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /** 
     * Get the 'FullName' element value. ������ ������������ 
     * 
     * @return value
     */
    public String getFullName() {
        return fullName;
    }

    /** 
     * Set the 'FullName' element value. ������ ������������ 
     * 
     * @param fullName
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /** 
     * Get the 'FirmName' element value. ��������� ������������ 
     * 
     * @return value
     */
    public String getFirmName() {
        return firmName;
    }

    /** 
     * Set the 'FirmName' element value. ��������� ������������ 
     * 
     * @param firmName
     */
    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    /** 
     * Get the 'Type' element value. ��� ���������: 1 - ��. ����, 0 - ��
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'Type' element value. ��� ���������: 1 - ��. ����, 0 - ��
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'OGRN' element value. ����/������. �������� ��������������� ���������������  �����.
     * 
     * @return value
     */
    public String getOGRN() {
        return OGRN;
    }

    /** 
     * Set the 'OGRN' element value. ����/������. �������� ��������������� ���������������  �����.
     * 
     * @param OGRN
     */
    public void setOGRN(String OGRN) {
        this.OGRN = OGRN;
    }

    /** 
     * Get the 'INN' element value. ��� - �������������� ����� �����������������.
     * 
     * @return value
     */
    public String getINN() {
        return INN;
    }

    /** 
     * Set the 'INN' element value. ��� - �������������� ����� �����������������.
     * 
     * @param INN
     */
    public void setINN(String INN) {
        this.INN = INN;
    }

    /** 
     * Get the 'KPP' element value. ��� - ��� ������� ���������� �� ����. 
     * 
     * @return value
     */
    public String getKPP() {
        return KPP;
    }

    /** 
     * Set the 'KPP' element value. ��� - ��� ������� ���������� �� ����. 
     * 
     * @param KPP
     */
    public void setKPP(String KPP) {
        this.KPP = KPP;
    }
}
