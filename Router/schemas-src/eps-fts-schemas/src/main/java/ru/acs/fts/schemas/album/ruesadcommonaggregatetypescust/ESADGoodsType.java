
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADContainerType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADCustomsProcedureType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADGoodsPackagingType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADGoodsQuotaType;

/** 
 * �������� �����. ��. 31-47
 */
public class ESADGoodsType extends ESADGoodsItemType
{
    private String additionalSheetCount;
    private String formNumber;
    private String FKSIGN;
    private ESADGoodsPackagingType ESADGoodsPackaging;
    private ESADContainerType ESADContainer;
    private SupplementaryQuantityType supplementaryGoodsQuantity;
    private List<SupplementaryQuantityType> supplementaryGoodsQuantity1List = new ArrayList<SupplementaryQuantityType>();
    private List<ESADElectricalEnergyQuantityType> ESADElectricalEnergyQuantityList = new ArrayList<ESADElectricalEnergyQuantityType>();
    private ESADGoodsQuotaType ESADGoodsQuota;
    private ESADCustomsProcedureType ESADCustomsProcedure;

    /** 
     * Get the 'AdditionalSheetCount' element value. ���������� ����� ���������. 
     * 
     * @return value
     */
    public String getAdditionalSheetCount() {
        return additionalSheetCount;
    }

    /** 
     * Set the 'AdditionalSheetCount' element value. ���������� ����� ���������. 
     * 
     * @param additionalSheetCount
     */
    public void setAdditionalSheetCount(String additionalSheetCount) {
        this.additionalSheetCount = additionalSheetCount;
    }

    /** 
     * Get the 'FormNumber' element value. ������� ����� ������ (�� ����������� ��� ������ FKSIGN='1')
     * 
     * @return value
     */
    public String getFormNumber() {
        return formNumber;
    }

    /** 
     * Set the 'FormNumber' element value. ������� ����� ������ (�� ����������� ��� ������ FKSIGN='1')
     * 
     * @param formNumber
     */
    public void setFormNumber(String formNumber) {
        this.formNumber = formNumber;
    }

    /** 
     * Get the 'FKSIGN' element value. ������� ������������� �� : "1"-����������� ��� �������� ��������� � ��  (� ��� ����� ����� ������� �������) � ������ �������������, ��������� � ����������� ������������ ������� (��������, � ���������� ��������� ���������� ������� ������� � ������������� ������� � ������������ � �� ��� �� �����, ����� ���������� ��� ����, ����������� �� ���������).
     * 
     * @return value
     */
    public String getFKSIGN() {
        return FKSIGN;
    }

    /** 
     * Set the 'FKSIGN' element value. ������� ������������� �� : "1"-����������� ��� �������� ��������� � ��  (� ��� ����� ����� ������� �������) � ������ �������������, ��������� � ����������� ������������ ������� (��������, � ���������� ��������� ���������� ������� ������� � ������������� ������� � ������������ � �� ��� �� �����, ����� ���������� ��� ����, ����������� �� ���������).
     * 
     * @param FKSIGN
     */
    public void setFKSIGN(String FKSIGN) {
        this.FKSIGN = FKSIGN;
    }

    /** 
     * Get the 'ESADGoodsPackaging' element value. �������� � �������� ������, �������� � �������� �������.
     * 
     * @return value
     */
    public ESADGoodsPackagingType getESADGoodsPackaging() {
        return ESADGoodsPackaging;
    }

    /** 
     * Set the 'ESADGoodsPackaging' element value. �������� � �������� ������, �������� � �������� �������.
     * 
     * @param ESADGoodsPackaging
     */
    public void setESADGoodsPackaging(ESADGoodsPackagingType ESADGoodsPackaging) {
        this.ESADGoodsPackaging = ESADGoodsPackaging;
    }

    /** 
     * Get the 'ESADContainer' element value. ESAD. �������� � �����������.
     * 
     * @return value
     */
    public ESADContainerType getESADContainer() {
        return ESADContainer;
    }

    /** 
     * Set the 'ESADContainer' element value. ESAD. �������� � �����������.
     * 
     * @param ESADContainer
     */
    public void setESADContainer(ESADContainerType ESADContainer) {
        this.ESADContainer = ESADContainer;
    }

    /** 
     * Get the 'SupplementaryGoodsQuantity' element value. ���������� ������ � �������������� ������� ���������.
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryGoodsQuantity() {
        return supplementaryGoodsQuantity;
    }

    /** 
     * Set the 'SupplementaryGoodsQuantity' element value. ���������� ������ � �������������� ������� ���������.
     * 
     * @param supplementaryGoodsQuantity
     */
    public void setSupplementaryGoodsQuantity(
            SupplementaryQuantityType supplementaryGoodsQuantity) {
        this.supplementaryGoodsQuantity = supplementaryGoodsQuantity;
    }

    /** 
     * Get the list of 'SupplementaryGoodsQuantity1' element items. ���������� ������ � ������� ���������, �������� �� �������� � �������������� (1)
     * 
     * @return list
     */
    public List<SupplementaryQuantityType> getSupplementaryGoodsQuantity1List() {
        return supplementaryGoodsQuantity1List;
    }

    /** 
     * Set the list of 'SupplementaryGoodsQuantity1' element items. ���������� ������ � ������� ���������, �������� �� �������� � �������������� (1)
     * 
     * @param list
     */
    public void setSupplementaryGoodsQuantity1List(
            List<SupplementaryQuantityType> list) {
        supplementaryGoodsQuantity1List = list;
    }

    /** 
     * Get the list of 'ESADElectricalEnergyQuantity' element items. ���������� ������������ ��������������. ������������ ��� �� 350-� �� 23.05.2002�.
     * 
     * @return list
     */
    public List<ESADElectricalEnergyQuantityType> getESADElectricalEnergyQuantityList() {
        return ESADElectricalEnergyQuantityList;
    }

    /** 
     * Set the list of 'ESADElectricalEnergyQuantity' element items. ���������� ������������ ��������������. ������������ ��� �� 350-� �� 23.05.2002�.
     * 
     * @param list
     */
    public void setESADElectricalEnergyQuantityList(
            List<ESADElectricalEnergyQuantityType> list) {
        ESADElectricalEnergyQuantityList = list;
    }

    /** 
     * Get the 'ESADGoodsQuota' element value. �����.
     * 
     * @return value
     */
    public ESADGoodsQuotaType getESADGoodsQuota() {
        return ESADGoodsQuota;
    }

    /** 
     * Set the 'ESADGoodsQuota' element value. �����.
     * 
     * @param ESADGoodsQuota
     */
    public void setESADGoodsQuota(ESADGoodsQuotaType ESADGoodsQuota) {
        this.ESADGoodsQuota = ESADGoodsQuota;
    }

    /** 
     * Get the 'ESADCustomsProcedure' element value. ���������.
     * 
     * @return value
     */
    public ESADCustomsProcedureType getESADCustomsProcedure() {
        return ESADCustomsProcedure;
    }

    /** 
     * Set the 'ESADCustomsProcedure' element value. ���������.
     * 
     * @param ESADCustomsProcedure
     */
    public void setESADCustomsProcedure(
            ESADCustomsProcedureType ESADCustomsProcedure) {
        this.ESADCustomsProcedure = ESADCustomsProcedure;
    }
}
