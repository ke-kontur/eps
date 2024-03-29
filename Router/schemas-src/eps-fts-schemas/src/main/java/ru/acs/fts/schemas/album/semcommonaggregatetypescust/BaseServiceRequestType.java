
package ru.acs.fts.schemas.album.semcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ������ � �������
 */
public class BaseServiceRequestType extends BaseDocType
{
    private String accelerationIndicator;
    private String direction;
    private List<SettingsType> calculationSettingList = new ArrayList<SettingsType>();
    private InConsParticipantType consignee;
    private InConsParticipantType consignor;
    private InParticipantType declarant;
    private InParticipantType financialAdjustingResponsiblePerson;
    private GTDIDType gtdRegNumber;

    /** 
     * Get the 'AccelerationIndicator' element value. ��������� ���������� ��������� �������. ���������� ��������� ����������� � �������� ����������, ������� ��������� ��� ������������
     * 
     * @return value
     */
    public String getAccelerationIndicator() {
        return accelerationIndicator;
    }

    /** 
     * Set the 'AccelerationIndicator' element value. ��������� ���������� ��������� �������. ���������� ��������� ����������� � �������� ����������, ������� ��������� ��� ������������
     * 
     * @param accelerationIndicator
     */
    public void setAccelerationIndicator(String accelerationIndicator) {
        this.accelerationIndicator = accelerationIndicator;
    }

    /** 
     * Get the 'Direction' element value. ����������� �������� ������� (�� - ������, �� - �������, �� - �������)
     * 
     * @return value
     */
    public String getDirection() {
        return direction;
    }

    /** 
     * Set the 'Direction' element value. ����������� �������� ������� (�� - ������, �� - �������, �� - �������)
     * 
     * @param direction
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

    /** 
     * Get the list of 'CalculationSettings' element items. ��������������� ������������. �� ������������ ��� ������� �� ������� ����������� ����������
     * 
     * @return list
     */
    public List<SettingsType> getCalculationSettingList() {
        return calculationSettingList;
    }

    /** 
     * Set the list of 'CalculationSettings' element items. ��������������� ������������. �� ������������ ��� ������� �� ������� ����������� ����������
     * 
     * @param list
     */
    public void setCalculationSettingList(List<SettingsType> list) {
        calculationSettingList = list;
    }

    /** 
     * Get the 'Consignee' element value. �������� � ���������� �������
     * 
     * @return value
     */
    public InConsParticipantType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. �������� � ���������� �������
     * 
     * @param consignee
     */
    public void setConsignee(InConsParticipantType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'Consignor' element value. �������� �� ����������� �������
     * 
     * @return value
     */
    public InConsParticipantType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. �������� �� ����������� �������
     * 
     * @param consignor
     */
    public void setConsignor(InConsParticipantType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Declarant' element value. �������� ����������/�������������
     * 
     * @return value
     */
    public InParticipantType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. �������� ����������/�������������
     * 
     * @param declarant
     */
    public void setDeclarant(InParticipantType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'FinancialAdjustingResponsiblePerson' element value. ����, ������������� �� ���������� ��������������
     * 
     * @return value
     */
    public InParticipantType getFinancialAdjustingResponsiblePerson() {
        return financialAdjustingResponsiblePerson;
    }

    /** 
     * Set the 'FinancialAdjustingResponsiblePerson' element value. ����, ������������� �� ���������� ��������������
     * 
     * @param financialAdjustingResponsiblePerson
     */
    public void setFinancialAdjustingResponsiblePerson(
            InParticipantType financialAdjustingResponsiblePerson) {
        this.financialAdjustingResponsiblePerson = financialAdjustingResponsiblePerson;
    }

    /** 
     * Get the 'GtdRegNumber' element value. ����� ����������
     * 
     * @return value
     */
    public GTDIDType getGtdRegNumber() {
        return gtdRegNumber;
    }

    /** 
     * Set the 'GtdRegNumber' element value. ����� ����������
     * 
     * @param gtdRegNumber
     */
    public void setGtdRegNumber(GTDIDType gtdRegNumber) {
        this.gtdRegNumber = gtdRegNumber;
    }
}
