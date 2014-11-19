
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AutomobileBaseType;

/** 
 * �������� �� �����������. ��. 31
 */
public class AutomobileType extends AutomobileBaseType
{
    private String identityCardNumber;
    private String carCost;
    private String powerWeightQuanity;
    private String passedKilometerQuantity;

    /** 
     * Get the 'IdentityCardNumber' element value. ����� �������������
     * 
     * @return value
     */
    public String getIdentityCardNumber() {
        return identityCardNumber;
    }

    /** 
     * Set the 'IdentityCardNumber' element value. ����� �������������
     * 
     * @param identityCardNumber
     */
    public void setIdentityCardNumber(String identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    /** 
     * Get the 'CarCost' element value. ��������� ������������� ��������
     * 
     * @return value
     */
    public String getCarCost() {
        return carCost;
    }

    /** 
     * Set the 'CarCost' element value. ��������� ������������� ��������
     * 
     * @param carCost
     */
    public void setCarCost(String carCost) {
        this.carCost = carCost;
    }

    /** 
     * Get the 'PowerWeightQuanity' element value. ����������: ����������������/��������
     * 
     * @return value
     */
    public String getPowerWeightQuanity() {
        return powerWeightQuanity;
    }

    /** 
     * Set the 'PowerWeightQuanity' element value. ����������: ����������������/��������
     * 
     * @param powerWeightQuanity
     */
    public void setPowerWeightQuanity(String powerWeightQuanity) {
        this.powerWeightQuanity = powerWeightQuanity;
    }

    /** 
     * Get the 'PassedKilometerQuantity' element value. ������
     * 
     * @return value
     */
    public String getPassedKilometerQuantity() {
        return passedKilometerQuantity;
    }

    /** 
     * Set the 'PassedKilometerQuantity' element value. ������
     * 
     * @param passedKilometerQuantity
     */
    public void setPassedKilometerQuantity(String passedKilometerQuantity) {
        this.passedKilometerQuantity = passedKilometerQuantity;
    }
}
