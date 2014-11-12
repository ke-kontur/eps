
package ru.acs.fts.schemas.album.kdtout_cu;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.AutomobileType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUCustomsPaymentCalculationType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADGoodsItemType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUElectricalEnergyType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUPrecedingDocumentType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADContainerType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADCustomsProcedureType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADExciseType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADGoodsPackagingType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADGoodsQuotaType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ProcessingGoodsDeclarationType;

/** 
 * Товарная часть КТД. Гр. 31-47
 */
public class KDToutGoodsType extends CUESADGoodsItemType
{
    private String languageGoods;
    private String previousCustomsCost;
    private String KDTGoodsNumeric;
    private List<KDTPresentedDocumentsType> KDToutPresentedDocumentList = new ArrayList<KDTPresentedDocumentsType>();
    private List<CUPrecedingDocumentType> KDToutPrecedingDocumentList = new ArrayList<CUPrecedingDocumentType>();
    private List<CUCustomsPaymentCalculationType> KDToutCustomsPaymentCalculationList = new ArrayList<CUCustomsPaymentCalculationType>();
    private List<ESADExciseType> ESADExciseList = new ArrayList<ESADExciseType>();
    private List<CUElectricalEnergyType> electricalEnergReceivedList = new ArrayList<CUElectricalEnergyType>();
    private List<CUElectricalEnergyType> electricalEnergGivenList = new ArrayList<CUElectricalEnergyType>();
    private List<AutomobileType> goodsAutomobileList = new ArrayList<AutomobileType>();
    private ESADCustomsProcedureType customsProcedure;
    private List<SupplementaryQuantityType> supplementaryGoodsQuantity1List = new ArrayList<SupplementaryQuantityType>();
    private SupplementaryQuantityType supplementaryGoodsQuantity;
    private ESADContainerType ESADContainer;
    private ESADGoodsPackagingType ESADGoodsPackaging;
    private ESADGoodsQuotaType ESADGoodsQuota;
    private ProcessingGoodsDeclarationType KDToutCustomsConditions;
    private KDToutGoodsOrganizationType KDToutGoodsOrganization;
    private SupplementaryQuantityType RBSupplementaryGoodsQuantity;
    private ChangeCodeType changeCode;

    /** 
     * Get the 'LanguageGoods' element value. Код языка  описания товара
     * 
     * @return value
     */
    public String getLanguageGoods() {
        return languageGoods;
    }

    /** 
     * Set the 'LanguageGoods' element value. Код языка  описания товара
     * 
     * @param languageGoods
     */
    public void setLanguageGoods(String languageGoods) {
        this.languageGoods = languageGoods;
    }

    /** 
     * Get the 'PreviousCustomsCost' element value. Предыдущее значение таможенной стоимости, гр.45 второй подраздел
     * 
     * @return value
     */
    public String getPreviousCustomsCost() {
        return previousCustomsCost;
    }

    /** 
     * Set the 'PreviousCustomsCost' element value. Предыдущее значение таможенной стоимости, гр.45 второй подраздел
     * 
     * @param previousCustomsCost
     */
    public void setPreviousCustomsCost(String previousCustomsCost) {
        this.previousCustomsCost = previousCustomsCost;
    }

    /** 
     * Get the 'KDTGoodsNumeric' element value. Порядковый номер товара по КДТ
     * 
     * @return value
     */
    public String getKDTGoodsNumeric() {
        return KDTGoodsNumeric;
    }

    /** 
     * Set the 'KDTGoodsNumeric' element value. Порядковый номер товара по КДТ
     * 
     * @param KDTGoodsNumeric
     */
    public void setKDTGoodsNumeric(String KDTGoodsNumeric) {
        this.KDTGoodsNumeric = KDTGoodsNumeric;
    }

    /** 
     * Get the list of 'KDToutPresentedDocument' element items. Представленные документы. Гр. 44
     * 
     * @return list
     */
    public List<KDTPresentedDocumentsType> getKDToutPresentedDocumentList() {
        return KDToutPresentedDocumentList;
    }

    /** 
     * Set the list of 'KDToutPresentedDocument' element items. Представленные документы. Гр. 44
     * 
     * @param list
     */
    public void setKDToutPresentedDocumentList(
            List<KDTPresentedDocumentsType> list) {
        KDToutPresentedDocumentList = list;
    }

    /** 
     * Get the list of 'KDToutPrecedingDocument' element items. Предшествующие документы. Гр. 40
     * 
     * @return list
     */
    public List<CUPrecedingDocumentType> getKDToutPrecedingDocumentList() {
        return KDToutPrecedingDocumentList;
    }

    /** 
     * Set the list of 'KDToutPrecedingDocument' element items. Предшествующие документы. Гр. 40
     * 
     * @param list
     */
    public void setKDToutPrecedingDocumentList(
            List<CUPrecedingDocumentType> list) {
        KDToutPrecedingDocumentList = list;
    }

    /** 
     * Get the list of 'KDToutCustomsPaymentCalculation' element items. Исчисление таможенных платежей
     * 
     * @return list
     */
    public List<CUCustomsPaymentCalculationType> getKDToutCustomsPaymentCalculationList() {
        return KDToutCustomsPaymentCalculationList;
    }

    /** 
     * Set the list of 'KDToutCustomsPaymentCalculation' element items. Исчисление таможенных платежей
     * 
     * @param list
     */
    public void setKDToutCustomsPaymentCalculationList(
            List<CUCustomsPaymentCalculationType> list) {
        KDToutCustomsPaymentCalculationList = list;
    }

    /** 
     * Get the list of 'ESADExcise' element items. Сведения об акцизных марках
     * 
     * @return list
     */
    public List<ESADExciseType> getESADExciseList() {
        return ESADExciseList;
    }

    /** 
     * Set the list of 'ESADExcise' element items. Сведения об акцизных марках
     * 
     * @param list
     */
    public void setESADExciseList(List<ESADExciseType> list) {
        ESADExciseList = list;
    }

    /** 
     * Get the list of 'ElectricalEnergReceived' element items. Сведения о количестве принятой электроэнергии за отчетный период (элемент 9 Гр 31)
     * 
     * @return list
     */
    public List<CUElectricalEnergyType> getElectricalEnergReceivedList() {
        return electricalEnergReceivedList;
    }

    /** 
     * Set the list of 'ElectricalEnergReceived' element items. Сведения о количестве принятой электроэнергии за отчетный период (элемент 9 Гр 31)
     * 
     * @param list
     */
    public void setElectricalEnergReceivedList(List<CUElectricalEnergyType> list) {
        electricalEnergReceivedList = list;
    }

    /** 
     * Get the list of 'ElectricalEnergGiven' element items. Сведения о количестве переданной электроэнергии за отчетный период (элемент 9 Гр 31)
     * 
     * @return list
     */
    public List<CUElectricalEnergyType> getElectricalEnergGivenList() {
        return electricalEnergGivenList;
    }

    /** 
     * Set the list of 'ElectricalEnergGiven' element items. Сведения о количестве переданной электроэнергии за отчетный период (элемент 9 Гр 31)
     * 
     * @param list
     */
    public void setElectricalEnergGivenList(List<CUElectricalEnergyType> list) {
        electricalEnergGivenList = list;
    }

    /** 
     * Get the list of 'GoodsAutomobile' element items. Сведения об автомобилях. Гр. 31
     * 
     * @return list
     */
    public List<AutomobileType> getGoodsAutomobileList() {
        return goodsAutomobileList;
    }

    /** 
     * Set the list of 'GoodsAutomobile' element items. Сведения об автомобилях. Гр. 31
     * 
     * @param list
     */
    public void setGoodsAutomobileList(List<AutomobileType> list) {
        goodsAutomobileList = list;
    }

    /** 
     * Get the 'CustomsProcedure' element value. Процедура.Гр 37
     * 
     * @return value
     */
    public ESADCustomsProcedureType getCustomsProcedure() {
        return customsProcedure;
    }

    /** 
     * Set the 'CustomsProcedure' element value. Процедура.Гр 37
     * 
     * @param customsProcedure
     */
    public void setCustomsProcedure(ESADCustomsProcedureType customsProcedure) {
        this.customsProcedure = customsProcedure;
    }

    /** 
     * Get the list of 'SupplementaryGoodsQuantity1' element items. Количество товара в единице измерения, отличной от основной и дополнительной (элемент 1 Гр.31)
     * 
     * @return list
     */
    public List<SupplementaryQuantityType> getSupplementaryGoodsQuantity1List() {
        return supplementaryGoodsQuantity1List;
    }

    /** 
     * Set the list of 'SupplementaryGoodsQuantity1' element items. Количество товара в единице измерения, отличной от основной и дополнительной (элемент 1 Гр.31)
     * 
     * @param list
     */
    public void setSupplementaryGoodsQuantity1List(
            List<SupplementaryQuantityType> list) {
        supplementaryGoodsQuantity1List = list;
    }

    /** 
     * Get the 'SupplementaryGoodsQuantity' element value. Количество товара в дополнительной единице измерения.  Гр.41
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryGoodsQuantity() {
        return supplementaryGoodsQuantity;
    }

    /** 
     * Set the 'SupplementaryGoodsQuantity' element value. Количество товара в дополнительной единице измерения.  Гр.41
     * 
     * @param supplementaryGoodsQuantity
     */
    public void setSupplementaryGoodsQuantity(
            SupplementaryQuantityType supplementaryGoodsQuantity) {
        this.supplementaryGoodsQuantity = supplementaryGoodsQuantity;
    }

    /** 
     * Get the 'ESADContainer' element value. Сведения о контейнерах (элемент 3 Гр 31)
     * 
     * @return value
     */
    public ESADContainerType getESADContainer() {
        return ESADContainer;
    }

    /** 
     * Set the 'ESADContainer' element value. Сведения о контейнерах (элемент 3 Гр 31)
     * 
     * @param ESADContainer
     */
    public void setESADContainer(ESADContainerType ESADContainer) {
        this.ESADContainer = ESADContainer;
    }

    /** 
     * Get the 'ESADGoodsPackaging' element value. Сведения о грузовых местах, поддонах и упаковке товаров
     * 
     * @return value
     */
    public ESADGoodsPackagingType getESADGoodsPackaging() {
        return ESADGoodsPackaging;
    }

    /** 
     * Set the 'ESADGoodsPackaging' element value. Сведения о грузовых местах, поддонах и упаковке товаров
     * 
     * @param ESADGoodsPackaging
     */
    public void setESADGoodsPackaging(ESADGoodsPackagingType ESADGoodsPackaging) {
        this.ESADGoodsPackaging = ESADGoodsPackaging;
    }

    /** 
     * Get the 'ESADGoodsQuota' element value. Квота.Гр 39 
     * 
     * @return value
     */
    public ESADGoodsQuotaType getESADGoodsQuota() {
        return ESADGoodsQuota;
    }

    /** 
     * Set the 'ESADGoodsQuota' element value. Квота.Гр 39 
     * 
     * @param ESADGoodsQuota
     */
    public void setESADGoodsQuota(ESADGoodsQuotaType ESADGoodsQuota) {
        this.ESADGoodsQuota = ESADGoodsQuota;
    }

    /** 
     * Get the 'KDToutCustomsConditions' element value. Сведения, указываемые в случае, если ДТ используется в качестве заявления на получение разрешения на переработку товаров (элемент 6 гр 31, гр 44)
     * 
     * @return value
     */
    public ProcessingGoodsDeclarationType getKDToutCustomsConditions() {
        return KDToutCustomsConditions;
    }

    /** 
     * Set the 'KDToutCustomsConditions' element value. Сведения, указываемые в случае, если ДТ используется в качестве заявления на получение разрешения на переработку товаров (элемент 6 гр 31, гр 44)
     * 
     * @param KDToutCustomsConditions
     */
    public void setKDToutCustomsConditions(
            ProcessingGoodsDeclarationType KDToutCustomsConditions) {
        this.KDToutCustomsConditions = KDToutCustomsConditions;
    }

    /** 
     * Get the 'KDToutGoodsOrganization' element value. Сведения об организации в товарной части ДТ
     * 
     * @return value
     */
    public KDToutGoodsOrganizationType getKDToutGoodsOrganization() {
        return KDToutGoodsOrganization;
    }

    /** 
     * Set the 'KDToutGoodsOrganization' element value. Сведения об организации в товарной части ДТ
     * 
     * @param KDToutGoodsOrganization
     */
    public void setKDToutGoodsOrganization(
            KDToutGoodsOrganizationType KDToutGoodsOrganization) {
        this.KDToutGoodsOrganization = KDToutGoodsOrganization;
    }

    /** 
     * Get the 'RBSupplementaryGoodsQuantity' element value. Количество товара помещенного под процедуру переработки и свободную таможенную зону для РБ
     * 
     * @return value
     */
    public SupplementaryQuantityType getRBSupplementaryGoodsQuantity() {
        return RBSupplementaryGoodsQuantity;
    }

    /** 
     * Set the 'RBSupplementaryGoodsQuantity' element value. Количество товара помещенного под процедуру переработки и свободную таможенную зону для РБ
     * 
     * @param RBSupplementaryGoodsQuantity
     */
    public void setRBSupplementaryGoodsQuantity(
            SupplementaryQuantityType RBSupplementaryGoodsQuantity) {
        this.RBSupplementaryGoodsQuantity = RBSupplementaryGoodsQuantity;
    }

    /** 
     * Get the 'ChangeCode' element value. Код изменений гр 45а при наличии изменений и (или) дополнении сведений в отношении товара
     * 
     * @return value
     */
    public ChangeCodeType getChangeCode() {
        return changeCode;
    }

    /** 
     * Set the 'ChangeCode' element value. Код изменений гр 45а при наличии изменений и (или) дополнении сведений в отношении товара
     * 
     * @param changeCode
     */
    public void setChangeCode(ChangeCodeType changeCode) {
        this.changeCode = changeCode;
    }
}
