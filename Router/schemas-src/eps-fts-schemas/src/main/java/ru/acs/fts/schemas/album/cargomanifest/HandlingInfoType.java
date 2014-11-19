
package ru.acs.fts.schemas.album.cargomanifest;

/** 
 * ���������� �� ��������� �����
 */
public class HandlingInfoType
{
    private String numPP;
    private String serviceInfoCode;
    private String infoDescription;

    /** 
     * Get the 'NumPP' element value. ���������� ����� ������
     * 
     * @return value
     */
    public String getNumPP() {
        return numPP;
    }

    /** 
     * Set the 'NumPP' element value. ���������� ����� ������
     * 
     * @param numPP
     */
    public void setNumPP(String numPP) {
        this.numPP = numPP;
    }

    /** 
     * Get the 'ServiceInfoCode' element value. ��� ����������
     * 
     * @return value
     */
    public String getServiceInfoCode() {
        return serviceInfoCode;
    }

    /** 
     * Set the 'ServiceInfoCode' element value. ��� ����������
     * 
     * @param serviceInfoCode
     */
    public void setServiceInfoCode(String serviceInfoCode) {
        this.serviceInfoCode = serviceInfoCode;
    }

    /** 
     * Get the 'InfoDescription' element value. ����������� ���������� � ������ ����������
     * 
     * @return value
     */
    public String getInfoDescription() {
        return infoDescription;
    }

    /** 
     * Set the 'InfoDescription' element value. ����������� ���������� � ������ ����������
     * 
     * @param infoDescription
     */
    public void setInfoDescription(String infoDescription) {
        this.infoDescription = infoDescription;
    }
}
