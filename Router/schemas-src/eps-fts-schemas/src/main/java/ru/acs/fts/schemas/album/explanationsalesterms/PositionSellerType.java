
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * ������� ������� ���������� ��������
 */
public class PositionSellerType
{
    private String fundsAvailable;
    private String glutWarehouse;
    private String bankruptcy;
    private String other;
    private String comments;

    /** 
     * Get the 'FundsAvailable' element value. ������� ������������� �������� �������
     * 
     * @return value
     */
    public String getFundsAvailable() {
        return fundsAvailable;
    }

    /** 
     * Set the 'FundsAvailable' element value. ������� ������������� �������� �������
     * 
     * @param fundsAvailable
     */
    public void setFundsAvailable(String fundsAvailable) {
        this.fundsAvailable = fundsAvailable;
    }

    /** 
     * Get the 'GlutWarehouse' element value. ������� ������������� �������
     * 
     * @return value
     */
    public String getGlutWarehouse() {
        return glutWarehouse;
    }

    /** 
     * Set the 'GlutWarehouse' element value. ������� ������������� �������
     * 
     * @param glutWarehouse
     */
    public void setGlutWarehouse(String glutWarehouse) {
        this.glutWarehouse = glutWarehouse;
    }

    /** 
     * Get the 'Bankruptcy' element value. ������� �����������
     * 
     * @return value
     */
    public String getBankruptcy() {
        return bankruptcy;
    }

    /** 
     * Set the 'Bankruptcy' element value. ������� �����������
     * 
     * @param bankruptcy
     */
    public void setBankruptcy(String bankruptcy) {
        this.bankruptcy = bankruptcy;
    }

    /** 
     * Get the 'Other' element value. ������� ������� ���� ���������� ��������
     * 
     * @return value
     */
    public String getOther() {
        return other;
    }

    /** 
     * Set the 'Other' element value. ������� ������� ���� ���������� ��������
     * 
     * @param other
     */
    public void setOther(String other) {
        this.other = other;
    }

    /** 
     * Get the 'Comments' element value. ���� (������� �����������)
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. ���� (������� �����������)
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
}
