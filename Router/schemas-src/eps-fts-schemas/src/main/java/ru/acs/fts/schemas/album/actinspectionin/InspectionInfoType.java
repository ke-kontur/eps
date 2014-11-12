
package ru.acs.fts.schemas.album.actinspectionin;

import java.util.ArrayList;
import java.util.List;

/** 
 * Информация о проведенном досмотре
 */
public class InspectionInfoType
{
    private String inspItemNum;
    private String grossWeightDocs;
    private String violationSign;
    private List<InspGTDType> inspGTDNumList = new ArrayList<InspGTDType>();
    private FactWeightInfoType factWeightInfo;
    private InspRadiationInfoType inspRadiationInfo;
    private IdentityMeansInfoType identityMeansInfo;
    private InspectionResultType inspectionResult;
    private List<InspectionDocumentType> inspectionDocumentList = new ArrayList<InspectionDocumentType>();
    private List<InspGoodsType> inspGoodList = new ArrayList<InspGoodsType>();
    private List<UseTMCCType> useTMCCList = new ArrayList<UseTMCCType>();
    private MPOType MPO;

    /** 
     * Get the 'InspItemNum' element value. Количество мест товара (партий товара), предъявленных к таможенному досмотру (по документам)
     * 
     * @return value
     */
    public String getInspItemNum() {
        return inspItemNum;
    }

    /** 
     * Set the 'InspItemNum' element value. Количество мест товара (партий товара), предъявленных к таможенному досмотру (по документам)
     * 
     * @param inspItemNum
     */
    public void setInspItemNum(String inspItemNum) {
        this.inspItemNum = inspItemNum;
    }

    /** 
     * Get the 'GrossWeightDocs' element value. Общий вес брутто товаров по документам (кг.)
     * 
     * @return value
     */
    public String getGrossWeightDocs() {
        return grossWeightDocs;
    }

    /** 
     * Set the 'GrossWeightDocs' element value. Общий вес брутто товаров по документам (кг.)
     * 
     * @param grossWeightDocs
     */
    public void setGrossWeightDocs(String grossWeightDocs) {
        this.grossWeightDocs = grossWeightDocs;
    }

    /** 
     * Get the 'ViolationSign' element value. Признак нарушения таможенного законодательства при пересылке товаров в МПО в адрес физического лица: 0 - не выявлено; 1 - выявлено
     * 
     * @return value
     */
    public String getViolationSign() {
        return violationSign;
    }

    /** 
     * Set the 'ViolationSign' element value. Признак нарушения таможенного законодательства при пересылке товаров в МПО в адрес физического лица: 0 - не выявлено; 1 - выявлено
     * 
     * @param violationSign
     */
    public void setViolationSign(String violationSign) {
        this.violationSign = violationSign;
    }

    /** 
     * Get the list of 'InspGTDNum' element items. Номер ДТ в которой заявлены сведения о досматриваемых  товарах
     * 
     * @return list
     */
    public List<InspGTDType> getInspGTDNumList() {
        return inspGTDNumList;
    }

    /** 
     * Set the list of 'InspGTDNum' element items. Номер ДТ в которой заявлены сведения о досматриваемых  товарах
     * 
     * @param list
     */
    public void setInspGTDNumList(List<InspGTDType> list) {
        inspGTDNumList = list;
    }

    /** 
     * Get the 'FactWeightInfo' element value. Сведения об общем фактическом весе товаров
     * 
     * @return value
     */
    public FactWeightInfoType getFactWeightInfo() {
        return factWeightInfo;
    }

    /** 
     * Set the 'FactWeightInfo' element value. Сведения об общем фактическом весе товаров
     * 
     * @param factWeightInfo
     */
    public void setFactWeightInfo(FactWeightInfoType factWeightInfo) {
        this.factWeightInfo = factWeightInfo;
    }

    /** 
     * Get the 'InspRadiationInfo' element value. Измерение уровня радиационного излучения
     * 
     * @return value
     */
    public InspRadiationInfoType getInspRadiationInfo() {
        return inspRadiationInfo;
    }

    /** 
     * Set the 'InspRadiationInfo' element value. Измерение уровня радиационного излучения
     * 
     * @param inspRadiationInfo
     */
    public void setInspRadiationInfo(InspRadiationInfoType inspRadiationInfo) {
        this.inspRadiationInfo = inspRadiationInfo;
    }

    /** 
     * Get the 'IdentityMeansInfo' element value. Средства идентификации
     * 
     * @return value
     */
    public IdentityMeansInfoType getIdentityMeansInfo() {
        return identityMeansInfo;
    }

    /** 
     * Set the 'IdentityMeansInfo' element value. Средства идентификации
     * 
     * @param identityMeansInfo
     */
    public void setIdentityMeansInfo(IdentityMeansInfoType identityMeansInfo) {
        this.identityMeansInfo = identityMeansInfo;
    }

    /** 
     * Get the 'InspectionResult' element value. Результаты таможенного досмотра
     * 
     * @return value
     */
    public InspectionResultType getInspectionResult() {
        return inspectionResult;
    }

    /** 
     * Set the 'InspectionResult' element value. Результаты таможенного досмотра
     * 
     * @param inspectionResult
     */
    public void setInspectionResult(InspectionResultType inspectionResult) {
        this.inspectionResult = inspectionResult;
    }

    /** 
     * Get the list of 'InspectionDocument' element items. АТД - документ по которому проведен таможенный досмотр
     * 
     * @return list
     */
    public List<InspectionDocumentType> getInspectionDocumentList() {
        return inspectionDocumentList;
    }

    /** 
     * Set the list of 'InspectionDocument' element items. АТД - документ по которому проведен таможенный досмотр
     * 
     * @param list
     */
    public void setInspectionDocumentList(List<InspectionDocumentType> list) {
        inspectionDocumentList = list;
    }

    /** 
     * Get the list of 'InspGoods' element items. Сведения о товаре
     * 
     * @return list
     */
    public List<InspGoodsType> getInspGoodList() {
        return inspGoodList;
    }

    /** 
     * Set the list of 'InspGoods' element items. Сведения о товаре
     * 
     * @param list
     */
    public void setInspGoodList(List<InspGoodsType> list) {
        inspGoodList = list;
    }

    /** 
     * Get the list of 'UseTMCC' element items. Применяемые технические средства таможенного контроля
     * 
     * @return list
     */
    public List<UseTMCCType> getUseTMCCList() {
        return useTMCCList;
    }

    /** 
     * Set the list of 'UseTMCC' element items. Применяемые технические средства таможенного контроля
     * 
     * @param list
     */
    public void setUseTMCCList(List<UseTMCCType> list) {
        useTMCCList = list;
    }

    /** 
     * Get the 'MPO' element value. Сведения о предъявленном МПО
     * 
     * @return value
     */
    public MPOType getMPO() {
        return MPO;
    }

    /** 
     * Set the 'MPO' element value. Сведения о предъявленном МПО
     * 
     * @param MPO
     */
    public void setMPO(MPOType MPO) {
        this.MPO = MPO;
    }
}
