
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * �������� �� �����������. ����������� ���������� ���������
 */
public class RKOrganizationFeaturesType
{
    private String BIN;
    private String IIN;
    private ITNKZType ITN;

    /** 
     * Get the 'BIN' element value. ������-����������������� ����� (���)
     * 
     * @return value
     */
    public String getBIN() {
        return BIN;
    }

    /** 
     * Set the 'BIN' element value. ������-����������������� ����� (���)
     * 
     * @param BIN
     */
    public void setBIN(String BIN) {
        this.BIN = BIN;
    }

    /** 
     * Get the 'IIN' element value. �������������� ����������������� ����� (���)
     * 
     * @return value
     */
    public String getIIN() {
        return IIN;
    }

    /** 
     * Set the 'IIN' element value. �������������� ����������������� ����� (���)
     * 
     * @param IIN
     */
    public void setIIN(String IIN) {
        this.IIN = IIN;
    }

    /** 
     * Get the 'ITN' element value. ����������������� ���������� ����� (���)
     * 
     * @return value
     */
    public ITNKZType getITN() {
        return ITN;
    }

    /** 
     * Set the 'ITN' element value. ����������������� ���������� ����� (���)
     * 
     * @param ITN
     */
    public void setITN(ITNKZType ITN) {
        this.ITN = ITN;
    }
}
