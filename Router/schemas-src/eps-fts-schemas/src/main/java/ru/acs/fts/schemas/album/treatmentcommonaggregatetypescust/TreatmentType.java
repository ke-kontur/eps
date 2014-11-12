
package ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� �����������
 */
public class TreatmentType
{
    private List<String> yieldNormList = new ArrayList<String>();
    private String processingCost;
    private String costCurrencyCode;
    private List<String> replaceInfList = new ArrayList<String>();
    private DateLimitType dateLimit;
    private List<TreatmentOperationsType> treatmentOperationList = new ArrayList<TreatmentOperationsType>();
    private TreatmentGoodsType treatmentGoods;
    private TrResultType trResult;
    private WasteProductsType wasteProducts;
    private LossType loss;
    private HeelsType heels;
    private SubstituteType substitute;
    private List<ProcOrganizationType> procOrganizationList = new ArrayList<ProcOrganizationType>();

    /** 
     * Get the list of 'YieldNorm' element items. ����� ������
     * 
     * @return list
     */
    public List<String> getYieldNormList() {
        return yieldNormList;
    }

    /** 
     * Set the list of 'YieldNorm' element items. ����� ������
     * 
     * @param list
     */
    public void setYieldNormList(List<String> list) {
        yieldNormList = list;
    }

    /** 
     * Get the 'ProcessingCost' element value. ���������  �����������
     * 
     * @return value
     */
    public String getProcessingCost() {
        return processingCost;
    }

    /** 
     * Set the 'ProcessingCost' element value. ���������  �����������
     * 
     * @param processingCost
     */
    public void setProcessingCost(String processingCost) {
        this.processingCost = processingCost;
    }

    /** 
     * Get the 'CostCurrencyCode' element value. ��� ������
     * 
     * @return value
     */
    public String getCostCurrencyCode() {
        return costCurrencyCode;
    }

    /** 
     * Set the 'CostCurrencyCode' element value. ��� ������
     * 
     * @param costCurrencyCode
     */
    public void setCostCurrencyCode(String costCurrencyCode) {
        this.costCurrencyCode = costCurrencyCode;
    }

    /** 
     * Get the list of 'ReplaceInf' element items. �������� ��������� ������ ��������� ����������� ������������ ��������
     * 
     * @return list
     */
    public List<String> getReplaceInfList() {
        return replaceInfList;
    }

    /** 
     * Set the list of 'ReplaceInf' element items. �������� ��������� ������ ��������� ����������� ������������ ��������
     * 
     * @param list
     */
    public void setReplaceInfList(List<String> list) {
        replaceInfList = list;
    }

    /** 
     * Get the 'DateLimit' element value. ���� �����������
     * 
     * @return value
     */
    public DateLimitType getDateLimit() {
        return dateLimit;
    }

    /** 
     * Set the 'DateLimit' element value. ���� �����������
     * 
     * @param dateLimit
     */
    public void setDateLimit(DateLimitType dateLimit) {
        this.dateLimit = dateLimit;
    }

    /** 
     * Get the list of 'TreatmentOperations' element items. �������� �� ����������� ������� � ������� �� ����������
     * 
     * @return list
     */
    public List<TreatmentOperationsType> getTreatmentOperationList() {
        return treatmentOperationList;
    }

    /** 
     * Set the list of 'TreatmentOperations' element items. �������� �� ����������� ������� � ������� �� ����������
     * 
     * @param list
     */
    public void setTreatmentOperationList(List<TreatmentOperationsType> list) {
        treatmentOperationList = list;
    }

    /** 
     * Get the 'TreatmentGoods' element value. ������ ��� �����������
     * 
     * @return value
     */
    public TreatmentGoodsType getTreatmentGoods() {
        return treatmentGoods;
    }

    /** 
     * Set the 'TreatmentGoods' element value. ������ ��� �����������
     * 
     * @param treatmentGoods
     */
    public void setTreatmentGoods(TreatmentGoodsType treatmentGoods) {
        this.treatmentGoods = treatmentGoods;
    }

    /** 
     * Get the 'TrResult' element value. �������� �����������
     * 
     * @return value
     */
    public TrResultType getTrResult() {
        return trResult;
    }

    /** 
     * Set the 'TrResult' element value. �������� �����������
     * 
     * @param trResult
     */
    public void setTrResult(TrResultType trResult) {
        this.trResult = trResult;
    }

    /** 
     * Get the 'WasteProducts' element value. ������ �����������
     * 
     * @return value
     */
    public WasteProductsType getWasteProducts() {
        return wasteProducts;
    }

    /** 
     * Set the 'WasteProducts' element value. ������ �����������
     * 
     * @param wasteProducts
     */
    public void setWasteProducts(WasteProductsType wasteProducts) {
        this.wasteProducts = wasteProducts;
    }

    /** 
     * Get the 'Loss' element value. ���������������� ������
     * 
     * @return value
     */
    public LossType getLoss() {
        return loss;
    }

    /** 
     * Set the 'Loss' element value. ���������������� ������
     * 
     * @param loss
     */
    public void setLoss(LossType loss) {
        this.loss = loss;
    }

    /** 
     * Get the 'Heels' element value. �������
     * 
     * @return value
     */
    public HeelsType getHeels() {
        return heels;
    }

    /** 
     * Set the 'Heels' element value. �������
     * 
     * @param heels
     */
    public void setHeels(HeelsType heels) {
        this.heels = heels;
    }

    /** 
     * Get the 'Substitute' element value. ���������� � ������ ������� ��� ����������� �������������� ��������
     * 
     * @return value
     */
    public SubstituteType getSubstitute() {
        return substitute;
    }

    /** 
     * Set the 'Substitute' element value. ���������� � ������ ������� ��� ����������� �������������� ��������
     * 
     * @param substitute
     */
    public void setSubstitute(SubstituteType substitute) {
        this.substitute = substitute;
    }

    /** 
     * Get the list of 'ProcOrganization' element items. ����������� ������������
     * 
     * @return list
     */
    public List<ProcOrganizationType> getProcOrganizationList() {
        return procOrganizationList;
    }

    /** 
     * Set the list of 'ProcOrganization' element items. ����������� ������������
     * 
     * @param list
     */
    public void setProcOrganizationList(List<ProcOrganizationType> list) {
        procOrganizationList = list;
    }
}
