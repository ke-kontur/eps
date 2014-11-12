
package ru.acs.fts.schemas.album.cmr;

/** 
 * ������� ��������������� (��.14,15,20,25,26)
 */
public class CMRTransportType
{
    private String specialConditionsText;
    private String primeMoverStateSignID;
    private String trailerStateSignID;

    /** 
     * Get the 'SpecialConditionsText' element value. ������ ������������� �������
     * 
     * @return value
     */
    public String getSpecialConditionsText() {
        return specialConditionsText;
    }

    /** 
     * Set the 'SpecialConditionsText' element value. ������ ������������� �������
     * 
     * @param specialConditionsText
     */
    public void setSpecialConditionsText(String specialConditionsText) {
        this.specialConditionsText = specialConditionsText;
    }

    /** 
     * Get the 'PrimeMoverStateSignID' element value. ��������������� ����� ������
     * 
     * @return value
     */
    public String getPrimeMoverStateSignID() {
        return primeMoverStateSignID;
    }

    /** 
     * Set the 'PrimeMoverStateSignID' element value. ��������������� ����� ������
     * 
     * @param primeMoverStateSignID
     */
    public void setPrimeMoverStateSignID(String primeMoverStateSignID) {
        this.primeMoverStateSignID = primeMoverStateSignID;
    }

    /** 
     * Get the 'TrailerStateSignID' element value. ��������������� ����� �������
     * 
     * @return value
     */
    public String getTrailerStateSignID() {
        return trailerStateSignID;
    }

    /** 
     * Set the 'TrailerStateSignID' element value. ��������������� ����� �������
     * 
     * @param trailerStateSignID
     */
    public void setTrailerStateSignID(String trailerStateSignID) {
        this.trailerStateSignID = trailerStateSignID;
    }
}
