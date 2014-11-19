
package ru.acs.fts.schemas.album.loadptsresult;

/** 
 * �������� � ����������� ���������� ���������� � ������������ �������� �� ������� ������. 
 */
public class ProtocolProcessingFormType
{
    private String MSGCode;
    private String GUID;
    private String addInformation;

    /** 
     * Get the 'MSG_Code' element value. ��� ��������� (������)
     * 
     * @return value
     */
    public String getMSGCode() {
        return MSGCode;
    }

    /** 
     * Set the 'MSG_Code' element value. ��� ��������� (������)
     * 
     * @param MSGCode
     */
    public void setMSGCode(String MSGCode) {
        this.MSGCode = MSGCode;
    }

    /** 
     * Get the 'GUID' element value. ���������� ������������� ������
     * 
     * @return value
     */
    public String getGUID() {
        return GUID;
    }

    /** 
     * Set the 'GUID' element value. ���������� ������������� ������
     * 
     * @param GUID
     */
    public void setGUID(String GUID) {
        this.GUID = GUID;
    }

    /** 
     * Get the 'AddInformation' element value. �������������� ���������� �� ������ (COMMENT)
     * 
     * @return value
     */
    public String getAddInformation() {
        return addInformation;
    }

    /** 
     * Set the 'AddInformation' element value. �������������� ���������� �� ������ (COMMENT)
     * 
     * @param addInformation
     */
    public void setAddInformation(String addInformation) {
        this.addInformation = addInformation;
    }
}
