
package ru.acs.fts.schemas.album.ktdin;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.AutomobileType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUCustomsPaymentCalculationType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADGoodsItemType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADPresentedDocumentsType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUElectricalEnergyType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUPrecedingDocumentType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADContainerType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADCustomsProcedureType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADExciseType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADGoodsPackagingType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADGoodsQuotaType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ProcessingGoodsDeclarationType;

/** 
 * Товарная часть КДТ. Гр. 31-47
 */
public class KTDinGoodsType extends CUESADGoodsItemType
{
    private String originDigitCountryCode;
    private String destinationDigitCountryCode;
    private String customsCostMethodCode;
    private String languageGoods;
    private String previousCustomsCost;
    private String KDTGoodsNumeric;
    private List<CUESADPresentedDocumentsType> KTDinPresentedDocumentList = new ArrayList<CUESADPresentedDocumentsType>();
    private List<CUPrecedingDocumentType> KTDinPrecedingDocumentList = new ArrayList<CUPrecedingDocumentType>();
    private List<CUCustomsPaymentCalculationType> KTDinCustomsPaymentCalculationList = new ArrayList<CUCustomsPaymentCalculationType>();
    private List<AutomobileType> KTDinAutomobileList = new ArrayList<AutomobileType>();
    private List<KTDinGoodsOfficialMarkType> KTDinGoodsOfficialMarkList = new ArrayList<KTDinGoodsOfficialMarkType>();
    private List<ESADExciseType> ESADExciseList = new ArrayList<ESADExciseType>();
    private ProcessingGoodsDeclarationType KDTinCustomsConditions;
    private KDTinGoodsOrganizationType KDTinGoodsOrganization;
    private ESADGoodsPackagingType ESADGoodsPackaging;
    private ESADGoodsQuotaType ESADGoodsQuota;
    private ESADContainerType ESADContainer;
    private ESADCustomsProcedureType KTDinCustomsProcedure;
    private List<CUElectricalEnergyType> electricalEnergReceivedList = new ArrayList<CUElectricalEnergyType>();
    private List<CUElectricalEnergyType> electricalEnergGivenList = new ArrayList<CUElectricalEnergyType>();
    private List<SupplementaryQuantityType> supplementaryGoodsQuantity1List = new ArrayList<SupplementaryQuantityType>();
    private SupplementaryQuantityType supplementaryGoodsQuantity;
    private ChangeCodeType changeCode;

    /** 
     * Get the 'OriginDigitCountryCode' element value. Цифровой код страны происхождения.
     * 
     * @return value
     */
    public String getOriginDigitCountryCode() {
        return originDigitCountryCode;
    }

    /** 
     * Set the 'OriginDigitCountryCode' element value. Цифровой код страны происхождения.
     * 
     * @param originDigitCountryCode
     */
    public void setOriginDigitCountryCode(String originDigitCountryCode) {
        this.originDigitCountryCode = originDigitCountryCode;
    }

    /** 
     * Get the 'DestinationDigitCountryCode' element value. Цифровой код страны назначения.
     * 
     * @return value
     */
    public String getDestinationDigitCountryCode() {
        return destinationDigitCountryCode;
    }

    /** 
     * Set the 'DestinationDigitCountryCode' element value. Цифровой код страны назначения.
     * 
     * @param destinationDigitCountryCode
     */
    public void setDestinationDigitCountryCode(
            String destinationDigitCountryCode) {
        this.destinationDigitCountryCode = destinationDigitCountryCode;
    }

    /** 
     * Get the 'CustomsCostMethodCode' element value. Номер метода определения таможенной стоимости  Заполняется в соответствии с классификатором методов определения таможенной стоимости товаров, помещаемых под таможенные режимы, применимые к ввозимым товарам
     * 
     * @return value
     */
    public String getCustomsCostMethodCode() {
        return customsCostMethodCode;
    }

    /** 
     * Set the 'CustomsCostMethodCode' element value. Номер метода определения таможенной стоимости  Заполняется в соответствии с классификатором методов определения таможенной стоимости товаров, помещаемых под таможенные режимы, применимые к ввозимым товарам
     * 
     * @param customsCostMethodCode
     */
    public void setCustomsCostMethodCode(String customsCostMethodCode) {
        this.customsCostMethodCode = customsCostMethodCode;
    }

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
     * Get the list of 'KTDinPresentedDocument' element items. КДТ. Внутренний формат. Представленные документы гр. 44
     * 
     * @return list
     */
    public List<CUESADPresentedDocumentsType> getKTDinPresentedDocumentList() {
        return KTDinPresentedDocumentList;
    }

    /** 
     * Set the list of 'KTDinPresentedDocument' element items. КДТ. Внутренний формат. Представленные документы гр. 44
     * 
     * @param list
     */
    public void setKTDinPresentedDocumentList(
            List<CUESADPresentedDocumentsType> list) {
        KTDinPresentedDocumentList = list;
    }

    /** 
     * Get the list of 'KTDinPrecedingDocument' element items. КДТ. Внутренний формат. Предшествующие документы.
     * 
     * @return list
     */
    public List<CUPrecedingDocumentType> getKTDinPrecedingDocumentList() {
        return KTDinPrecedingDocumentList;
    }

    /** 
     * Set the list of 'KTDinPrecedingDocument' element items. КДТ. Внутренний формат. Предшествующие документы.
     * 
     * @param list
     */
    public void setKTDinPrecedingDocumentList(List<CUPrecedingDocumentType> list) {
        KTDinPrecedingDocumentList = list;
    }

    /** 
     * Get the list of 'KTDinCustomsPaymentCalculation' element items. КТД. Внутренний формат. Исчисление таможенных платежей.
     * 
     * @return list
     */
    public List<CUCustomsPaymentCalculationType> getKTDinCustomsPaymentCalculationList() {
        return KTDinCustomsPaymentCalculationList;
    }

    /** 
     * Set the list of 'KTDinCustomsPaymentCalculation' element items. КТД. Внутренний формат. Исчисление таможенных платежей.
     * 
     * @param list
     */
    public void setKTDinCustomsPaymentCalculationList(
            List<CUCustomsPaymentCalculationType> list) {
        KTDinCustomsPaymentCalculationList = list;
    }

    /** 
     * Get the list of 'KTDinAutomobile' element items. КДТ. Внутренний формат. Сведения  об автомобилях. Гр. 31
     * 
     * @return list
     */
    public List<AutomobileType> getKTDinAutomobileList() {
        return KTDinAutomobileList;
    }

    /** 
     * Set the list of 'KTDinAutomobile' element items. КДТ. Внутренний формат. Сведения  об автомобилях. Гр. 31
     * 
     * @param list
     */
    public void setKTDinAutomobileList(List<AutomobileType> list) {
        KTDinAutomobileList = list;
    }

    /** 
     * Get the list of 'KTDinGoodsOfficialMark' element items. КДТ. Внутренний формат. Служебные отметки по товару.
     * 
     * @return list
     */
    public List<KTDinGoodsOfficialMarkType> getKTDinGoodsOfficialMarkList() {
        return KTDinGoodsOfficialMarkList;
    }

    /** 
     * Set the list of 'KTDinGoodsOfficialMark' element items. КДТ. Внутренний формат. Служебные отметки по товару.
     * 
     * @param list
     */
    public void setKTDinGoodsOfficialMarkList(
            List<KTDinGoodsOfficialMarkType> list) {
        KTDinGoodsOfficialMarkList = list;
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
     * Get the 'KDTinCustomsConditions' element value. Сведения, указываемые в случае, если ДТ используется в качестве заявления на получение разрешения на переработку товаровэлемент 6 гр 31, гр 44
     * 
     * @return value
     */
    public ProcessingGoodsDeclarationType getKDTinCustomsConditions() {
        return KDTinCustomsConditions;
    }

    /** 
     * Set the 'KDTinCustomsConditions' element value. Сведения, указываемые в случае, если ДТ используется в качестве заявления на получение разрешения на переработку товаровэлемент 6 гр 31, гр 44
     * 
     * @param KDTinCustomsConditions
     */
    public void setKDTinCustomsConditions(
            ProcessingGoodsDeclarationType KDTinCustomsConditions) {
        this.KDTinCustomsConditions = KDTinCustomsConditions;
    }

    /** 
     * Get the 'KDTinGoodsOrganization' element value. Сведения об организации в товарной части ДТ
     * 
     * @return value
     */
    public KDTinGoodsOrganizationType getKDTinGoodsOrganization() {
        return KDTinGoodsOrganization;
    }

    /** 
     * Set the 'KDTinGoodsOrganization' element value. Сведения об организации в товарной части ДТ
     * 
     * @param KDTinGoodsOrganization
     */
    public void setKDTinGoodsOrganization(
            KDTinGoodsOrganizationType KDTinGoodsOrganization) {
        this.KDTinGoodsOrganization = KDTinGoodsOrganization;
    }

    /** 
     * Get the 'ESADGoodsPackaging' element value. Сведения о грузовых местах, поддонах и упаковке товаров.
     * 
     * @return value
     */
    public ESADGoodsPackagingType getESADGoodsPackaging() {
        return ESADGoodsPackaging;
    }

    /** 
     * Set the 'ESADGoodsPackaging' element value. Сведения о грузовых местах, поддонах и упаковке товаров.
     * 
     * @param ESADGoodsPackaging
     */
    public void setESADGoodsPackaging(ESADGoodsPackagingType ESADGoodsPackaging) {
        this.ESADGoodsPackaging = ESADGoodsPackaging;
    }

    /** 
     * Get the 'ESADGoodsQuota' element value. Квота.
     * 
     * @return value
     */
    public ESADGoodsQuotaType getESADGoodsQuota() {
        return ESADGoodsQuota;
    }

    /** 
     * Set the 'ESADGoodsQuota' element value. Квота.
     * 
     * @param ESADGoodsQuota
     */
    public void setESADGoodsQuota(ESADGoodsQuotaType ESADGoodsQuota) {
        this.ESADGoodsQuota = ESADGoodsQuota;
    }

    /** 
     * Get the 'ESADContainer' element value. Сведения о контейнерах.
     * 
     * @return value
     */
    public ESADContainerType getESADContainer() {
        return ESADContainer;
    }

    /** 
     * Set the 'ESADContainer' element value. Сведения о контейнерах.
     * 
     * @param ESADContainer
     */
    public void setESADContainer(ESADContainerType ESADContainer) {
        this.ESADContainer = ESADContainer;
    }

    /** 
     * Get the 'KTDinCustomsProcedure' element value. Процедура.
     * 
     * @return value
     */
    public ESADCustomsProcedureType getKTDinCustomsProcedure() {
        return KTDinCustomsProcedure;
    }

    /** 
     * Set the 'KTDinCustomsProcedure' element value. Процедура.
     * 
     * @param KTDinCustomsProcedure
     */
    public void setKTDinCustomsProcedure(
            ESADCustomsProcedureType KTDinCustomsProcedure) {
        this.KTDinCustomsProcedure = KTDinCustomsProcedure;
    }

    /** 
     * Get the list of 'ElectricalEnergReceived' element items. Сведения о количестве принятой электроэнергии за отчетный период. элемент 9 Гр 31
     * 
     * @return list
     */
    public List<CUElectricalEnergyType> getElectricalEnergReceivedList() {
        return electricalEnergReceivedList;
    }

    /** 
     * Set the list of 'ElectricalEnergReceived' element items. Сведения о количестве принятой электроэнергии за отчетный период. элемент 9 Гр 31
     * 
     * @param list
     */
    public void setElectricalEnergReceivedList(List<CUElectricalEnergyType> list) {
        electricalEnergReceivedList = list;
    }

    /** 
     * Get the list of 'ElectricalEnergGiven' element items. Сведения о количестве переданной электроэнергии за отчетный период. элемент 9 Гр 31
     * 
     * @return list
     */
    public List<CUElectricalEnergyType> getElectricalEnergGivenList() {
        return electricalEnergGivenList;
    }

    /** 
     * Set the list of 'ElectricalEnergGiven' element items. Сведения о количестве переданной электроэнергии за отчетный период. элемент 9 Гр 31
     * 
     * @param list
     */
    public void setElectricalEnergGivenList(List<CUElectricalEnergyType> list) {
        electricalEnergGivenList = list;
    }

    /** 
     * Get the list of 'SupplementaryGoodsQuantity1' element items. Количество товара в единице измерения, отличной от основной и дополнительной элемент 1 Гр.31
     * 
     * @return list
     */
    public List<SupplementaryQuantityType> getSupplementaryGoodsQuantity1List() {
        return supplementaryGoodsQuantity1List;
    }

    /** 
     * Set the list of 'SupplementaryGoodsQuantity1' element items. Количество товара в единице измерения, отличной от основной и дополнительной элемент 1 Гр.31
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
