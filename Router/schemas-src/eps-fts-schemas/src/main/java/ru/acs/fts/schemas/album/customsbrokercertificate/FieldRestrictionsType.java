
package ru.acs.fts.schemas.album.customsbrokercertificate;

/** 
 * ����������� ����� ������������
 */
public class FieldRestrictionsType
{
    private String goodsRestriction;
    private String transportRestriction;
    private String regionRestriction;
    private String procedureRestriction;

    /** 
     * Get the 'GoodsRestriction' element value. ����������� �� ����� ������� � ������������ � �� ��� ��
     * 
     * @return value
     */
    public String getGoodsRestriction() {
        return goodsRestriction;
    }

    /** 
     * Set the 'GoodsRestriction' element value. ����������� �� ����� ������� � ������������ � �� ��� ��
     * 
     * @param goodsRestriction
     */
    public void setGoodsRestriction(String goodsRestriction) {
        this.goodsRestriction = goodsRestriction;
    }

    /** 
     * Get the 'TransportRestriction' element value. ����������� �� ����� ����������
     * 
     * @return value
     */
    public String getTransportRestriction() {
        return transportRestriction;
    }

    /** 
     * Set the 'TransportRestriction' element value. ����������� �� ����� ����������
     * 
     * @param transportRestriction
     */
    public void setTransportRestriction(String transportRestriction) {
        this.transportRestriction = transportRestriction;
    }

    /** 
     * Get the 'RegionRestriction' element value. ����������� �� ������� ������������
     * 
     * @return value
     */
    public String getRegionRestriction() {
        return regionRestriction;
    }

    /** 
     * Set the 'RegionRestriction' element value. ����������� �� ������� ������������
     * 
     * @param regionRestriction
     */
    public void setRegionRestriction(String regionRestriction) {
        this.regionRestriction = regionRestriction;
    }

    /** 
     * Get the 'ProcedureRestriction' element value. ����������� �� ����� ���������� ��������
     * 
     * @return value
     */
    public String getProcedureRestriction() {
        return procedureRestriction;
    }

    /** 
     * Set the 'ProcedureRestriction' element value. ����������� �� ����� ���������� ��������
     * 
     * @param procedureRestriction
     */
    public void setProcedureRestriction(String procedureRestriction) {
        this.procedureRestriction = procedureRestriction;
    }
}
