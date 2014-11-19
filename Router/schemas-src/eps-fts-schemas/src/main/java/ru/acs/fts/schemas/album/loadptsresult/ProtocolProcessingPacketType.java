
package ru.acs.fts.schemas.album.loadptsresult;

/** 
 * ��������� �������� / ��������� ������ 
 */
public class ProtocolProcessingPacketType
{
    private String MSGCode;
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
