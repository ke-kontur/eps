
package ru.acs.fts.schemas.album.revealedrisks;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ���������� ���������� ��� �� ����������� ������
 */
public class ActionResultType
{
    private String actionResultCode;
    private String inspectedGoodsWeight;
    private String delictGoodsWeight;
    private String changeTNVEDMargin;
    private String KTSMargin;
    private String newGoodsNumeric;
    private String kodeksPunkt;
    private String kodeksPartPunkt;
    private GTDIDType GTDIDNew;

    /** 
     * Get the 'ActionResultCode' element value. ��� ���������� ���������� ���� �� ����������� ����� (�������� ����������� � ������������ � ��������������� "����������� ���������� ������ ��� �� ����������� ������")
     * 
     * @return value
     */
    public String getActionResultCode() {
        return actionResultCode;
    }

    /** 
     * Set the 'ActionResultCode' element value. ��� ���������� ���������� ���� �� ����������� ����� (�������� ����������� � ������������ � ��������������� "����������� ���������� ������ ��� �� ����������� ������")
     * 
     * @param actionResultCode
     */
    public void setActionResultCode(String actionResultCode) {
        this.actionResultCode = actionResultCode;
    }

    /** 
     * Get the 'InspectedGoodsWeight' element value. ��� ����� ������������ ������� (������)
     * 
     * @return value
     */
    public String getInspectedGoodsWeight() {
        return inspectedGoodsWeight;
    }

    /** 
     * Set the 'InspectedGoodsWeight' element value. ��� ����� ������������ ������� (������)
     * 
     * @param inspectedGoodsWeight
     */
    public void setInspectedGoodsWeight(String inspectedGoodsWeight) {
        this.inspectedGoodsWeight = inspectedGoodsWeight;
    }

    /** 
     * Get the 'DelictGoodsWeight' element value. ��� ����� �������, ���������� �������� �������������� (������)
     * 
     * @return value
     */
    public String getDelictGoodsWeight() {
        return delictGoodsWeight;
    }

    /** 
     * Set the 'DelictGoodsWeight' element value. ��� ����� �������, ���������� �������� �������������� (������)
     * 
     * @param delictGoodsWeight
     */
    public void setDelictGoodsWeight(String delictGoodsWeight) {
        this.delictGoodsWeight = delictGoodsWeight;
    }

    /** 
     * Get the 'ChangeTNVEDMargin' element value. �������� ����� ������ ���������� � ������ ���������� �������� �� � ����� �������� ������� (���.)
     * 
     * @return value
     */
    public String getChangeTNVEDMargin() {
        return changeTNVEDMargin;
    }

    /** 
     * Set the 'ChangeTNVEDMargin' element value. �������� ����� ������ ���������� � ������ ���������� �������� �� � ����� �������� ������� (���.)
     * 
     * @param changeTNVEDMargin
     */
    public void setChangeTNVEDMargin(String changeTNVEDMargin) {
        this.changeTNVEDMargin = changeTNVEDMargin;
    }

    /** 
     * Get the 'KTSMargin' element value. �������� ����� �������������� ����������� ��������� �� � ����� ������������� ���������� ��������� ������� (������)
     * 
     * @return value
     */
    public String getKTSMargin() {
        return KTSMargin;
    }

    /** 
     * Set the 'KTSMargin' element value. �������� ����� �������������� ����������� ��������� �� � ����� ������������� ���������� ��������� ������� (������)
     * 
     * @param KTSMargin
     */
    public void setKTSMargin(String KTSMargin) {
        this.KTSMargin = KTSMargin;
    }

    /** 
     * Get the 'NewGoodsNumeric' element value. ����� ������ �� ����� �������� ��
     * 
     * @return value
     */
    public String getNewGoodsNumeric() {
        return newGoodsNumeric;
    }

    /** 
     * Set the 'NewGoodsNumeric' element value. ����� ������ �� ����� �������� ��
     * 
     * @param newGoodsNumeric
     */
    public void setNewGoodsNumeric(String newGoodsNumeric) {
        this.newGoodsNumeric = newGoodsNumeric;
    }

    /** 
     * Get the 'KodeksPunkt' element value. ����� ������ ������� ���������� ��������� �� ���������������� ��������������� (���� ������) ��� ���������� ������� ������ (�� ������) 
     * 
     * @return value
     */
    public String getKodeksPunkt() {
        return kodeksPunkt;
    }

    /** 
     * Set the 'KodeksPunkt' element value. ����� ������ ������� ���������� ��������� �� ���������������� ��������������� (���� ������) ��� ���������� ������� ������ (�� ������) 
     * 
     * @param kodeksPunkt
     */
    public void setKodeksPunkt(String kodeksPunkt) {
        this.kodeksPunkt = kodeksPunkt;
    }

    /** 
     * Get the 'KodeksPartPunkt' element value. ����� ����� ������ ���� ������ ��� �� ������
     * 
     * @return value
     */
    public String getKodeksPartPunkt() {
        return kodeksPartPunkt;
    }

    /** 
     * Set the 'KodeksPartPunkt' element value. ����� ����� ������ ���� ������ ��� �� ������
     * 
     * @param kodeksPartPunkt
     */
    public void setKodeksPartPunkt(String kodeksPartPunkt) {
        this.kodeksPartPunkt = kodeksPartPunkt;
    }

    /** 
     * Get the 'GTDIDNew' element value. ��������������� ����� ����� �������� ��
     * 
     * @return value
     */
    public GTDIDType getGTDIDNew() {
        return GTDIDNew;
    }

    /** 
     * Set the 'GTDIDNew' element value. ��������������� ����� ����� �������� ��
     * 
     * @param GTDIDNew
     */
    public void setGTDIDNew(GTDIDType GTDIDNew) {
        this.GTDIDNew = GTDIDNew;
    }
}
