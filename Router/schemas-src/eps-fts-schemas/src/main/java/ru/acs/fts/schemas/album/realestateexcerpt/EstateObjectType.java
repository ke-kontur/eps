
package ru.acs.fts.schemas.album.realestateexcerpt;

/** 
 * ������ ������������
 */
public class EstateObjectType
{
    private String objectSign;
    private String estateObjectSign;
    private String housingSign;
    private String isRoom;
    private String areaValue;
    private String areaUnit;
    private String objectDescription;
    private String cadastrNumber;
    private String additionalInfo;
    private String ID;
    private String conditionCadastrNum;
    private AddressType address;

    /** 
     * Get the 'ObjectSign' element value. ��� �������: 0 - ��������� �������; 1 - ������ ������������
     * 
     * @return value
     */
    public String getObjectSign() {
        return objectSign;
    }

    /** 
     * Set the 'ObjectSign' element value. ��� �������: 0 - ��������� �������; 1 - ������ ������������
     * 
     * @param objectSign
     */
    public void setObjectSign(String objectSign) {
        this.objectSign = objectSign;
    }

    /** 
     * Get the 'EstateObjectSign' element value. ��� ������� ������������: 1 - ���������; 2 - ������; 3 - ����
     * 
     * @return value
     */
    public String getEstateObjectSign() {
        return estateObjectSign;
    }

    /** 
     * Set the 'EstateObjectSign' element value. ��� ������� ������������: 1 - ���������; 2 - ������; 3 - ����
     * 
     * @param estateObjectSign
     */
    public void setEstateObjectSign(String estateObjectSign) {
        this.estateObjectSign = estateObjectSign;
    }

    /** 
     * Get the 'HousingSign' element value. ������� ����, ��� ������ ������������ �������� ����� (��������, ����� ���)
     * 
     * @return value
     */
    public String getHousingSign() {
        return housingSign;
    }

    /** 
     * Set the 'HousingSign' element value. ������� ����, ��� ������ ������������ �������� ����� (��������, ����� ���)
     * 
     * @param housingSign
     */
    public void setHousingSign(String housingSign) {
        this.housingSign = housingSign;
    }

    /** 
     * Get the 'IsRoom' element value. ������� ����, ��� ��������� �������� ��������
     * 
     * @return value
     */
    public String getIsRoom() {
        return isRoom;
    }

    /** 
     * Set the 'IsRoom' element value. ������� ����, ��� ��������� �������� ��������
     * 
     * @param isRoom
     */
    public void setIsRoom(String isRoom) {
        this.isRoom = isRoom;
    }

    /** 
     * Get the 'AreaValue' element value. ������� �������
     * 
     * @return value
     */
    public String getAreaValue() {
        return areaValue;
    }

    /** 
     * Set the 'AreaValue' element value. ������� �������
     * 
     * @param areaValue
     */
    public void setAreaValue(String areaValue) {
        this.areaValue = areaValue;
    }

    /** 
     * Get the 'AreaUnit' element value. ������� ��������� �������
     * 
     * @return value
     */
    public String getAreaUnit() {
        return areaUnit;
    }

    /** 
     * Set the 'AreaUnit' element value. ������� ��������� �������
     * 
     * @param areaUnit
     */
    public void setAreaUnit(String areaUnit) {
        this.areaUnit = areaUnit;
    }

    /** 
     * Get the 'ObjectDescription' element value. �������� �������
     * 
     * @return value
     */
    public String getObjectDescription() {
        return objectDescription;
    }

    /** 
     * Set the 'ObjectDescription' element value. �������� �������
     * 
     * @param objectDescription
     */
    public void setObjectDescription(String objectDescription) {
        this.objectDescription = objectDescription;
    }

    /** 
     * Get the 'CadastrNumber' element value. ����������� �����
     * 
     * @return value
     */
    public String getCadastrNumber() {
        return cadastrNumber;
    }

    /** 
     * Set the 'CadastrNumber' element value. ����������� �����
     * 
     * @param cadastrNumber
     */
    public void setCadastrNumber(String cadastrNumber) {
        this.cadastrNumber = cadastrNumber;
    }

    /** 
     * Get the 'AdditionalInfo' element value. �������������� ����������
     * 
     * @return value
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /** 
     * Set the 'AdditionalInfo' element value. �������������� ����������
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /** 
     * Get the 'ID' element value. ���������� �������������
     * 
     * @return value
     */
    public String getID() {
        return ID;
    }

    /** 
     * Set the 'ID' element value. ���������� �������������
     * 
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /** 
     * Get the 'ConditionCadastrNum' element value. �������� ����������� �����
     * 
     * @return value
     */
    public String getConditionCadastrNum() {
        return conditionCadastrNum;
    }

    /** 
     * Set the 'ConditionCadastrNum' element value. �������� ����������� �����
     * 
     * @param conditionCadastrNum
     */
    public void setConditionCadastrNum(String conditionCadastrNum) {
        this.conditionCadastrNum = conditionCadastrNum;
    }

    /** 
     * Get the 'Address' element value. ����� �������
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. ����� �������
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}
