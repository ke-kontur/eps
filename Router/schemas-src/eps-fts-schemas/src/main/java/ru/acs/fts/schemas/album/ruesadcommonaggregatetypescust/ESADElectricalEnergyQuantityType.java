
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

/** 
 * ���������� ������������ ��������������. ������������ ��� �� 350-� �� 23.05.2002�.
 */
public class ESADElectricalEnergyQuantityType
{
    private String tariffZoneName;
    private String textID;
    private String description;
    private String qualifierCode;
    private String qualifierName;
    private String transferEnergyQuantity;

    /** 
     * Get the 'TariffZoneName' element value. ������������ �������� ����. ����� ���� �� ���������, ���� �������������� ��������� (����������) ��� ���� �������� ��� ����������� ���������� ���� ��������������.
     * 
     * @return value
     */
    public String getTariffZoneName() {
        return tariffZoneName;
    }

    /** 
     * Set the 'TariffZoneName' element value. ������������ �������� ����. ����� ���� �� ���������, ���� �������������� ��������� (����������) ��� ���� �������� ��� ����������� ���������� ���� ��������������.
     * 
     * @param tariffZoneName
     */
    public void setTariffZoneName(String tariffZoneName) {
        this.tariffZoneName = tariffZoneName;
    }

    /** 
     * Get the 'TextID' element value. ������������� ������ (201-�������, 202-������, 203-������)
     * 
     * @return value
     */
    public String getTextID() {
        return textID;
    }

    /** 
     * Set the 'TextID' element value. ������������� ������ (201-�������, 202-������, 203-������)
     * 
     * @param textID
     */
    public void setTextID(String textID) {
        this.textID = textID;
    }

    /** 
     * Get the 'Description' element value. �������/������/���� �����
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. �������/������/���� �����
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** 
     * Get the 'QualifierCode' element value. ��� ������� ���������.
     * 
     * @return value
     */
    public String getQualifierCode() {
        return qualifierCode;
    }

    /** 
     * Set the 'QualifierCode' element value. ��� ������� ���������.
     * 
     * @param qualifierCode
     */
    public void setQualifierCode(String qualifierCode) {
        this.qualifierCode = qualifierCode;
    }

    /** 
     * Get the 'QualifierName' element value. ������� ������������ ������� ���������.
     * 
     * @return value
     */
    public String getQualifierName() {
        return qualifierName;
    }

    /** 
     * Set the 'QualifierName' element value. ������� ������������ ������� ���������.
     * 
     * @param qualifierName
     */
    public void setQualifierName(String qualifierName) {
        this.qualifierName = qualifierName;
    }

    /** 
     * Get the 'TransferEnergyQuantity' element value. ���������� (����� ��������� �������������� ��� �������� ����)
     * 
     * @return value
     */
    public String getTransferEnergyQuantity() {
        return transferEnergyQuantity;
    }

    /** 
     * Set the 'TransferEnergyQuantity' element value. ���������� (����� ��������� �������������� ��� �������� ����)
     * 
     * @param transferEnergyQuantity
     */
    public void setTransferEnergyQuantity(String transferEnergyQuantity) {
        this.transferEnergyQuantity = transferEnergyQuantity;
    }
}
