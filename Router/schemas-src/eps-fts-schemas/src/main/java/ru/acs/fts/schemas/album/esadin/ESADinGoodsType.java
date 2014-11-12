
package ru.acs.fts.schemas.album.esadin;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.AutomobileType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUCustomsPaymentCalculationType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUPrecedingDocumentType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADExciseType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ProcessingGoodsDeclarationType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.RUESADDecisionType;

/** 
 * ДТ и ТД. Внутренний формат. Товарная часть ДТ. Гр. 31-47.
 */
public class ESADinGoodsType extends ESADGoodsType
{
    private String originDigitCountryCode;
    private String destinationDigitCountryCode;
    private String customsCostCorrectMark;
    private String STAT;
    private String KODSTR;
    private String KODSTRC;
    private LocalDate DSTAT;
    private String customsCostMethodCode;
    private List<ESADinPresentedDocumentType> ESADinPresentedDocumentList = new ArrayList<ESADinPresentedDocumentType>();
    private List<CUPrecedingDocumentType> ESADinPrecedingDocumentList = new ArrayList<CUPrecedingDocumentType>();
    private List<CUCustomsPaymentCalculationType> ESADinCustomsPaymentCalculationList = new ArrayList<CUCustomsPaymentCalculationType>();
    private List<AutomobileType> ESADinAutomobileList = new ArrayList<AutomobileType>();
    private ESADinConsignorType ESADinGoodsOrganization;
    private ProcessingGoodsDeclarationType customConditionDocuments;
    private RUESADDecisionType ESADinGoodsDecision;
    private List<ESADinGoodsOfficialMarkType> ESADinGoodsOfficialMarkList = new ArrayList<ESADinGoodsOfficialMarkType>();
    private List<ESADExciseType> ESADExciseList = new ArrayList<ESADExciseType>();

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
     * Get the 'CustomsCostCorrectMark' element value. Признак корректировки таможенной стоимости.
     * 
     * @return value
     */
    public String getCustomsCostCorrectMark() {
        return customsCostCorrectMark;
    }

    /** 
     * Set the 'CustomsCostCorrectMark' element value. Признак корректировки таможенной стоимости.
     * 
     * @param customsCostCorrectMark
     */
    public void setCustomsCostCorrectMark(String customsCostCorrectMark) {
        this.customsCostCorrectMark = customsCostCorrectMark;
    }

    /** 
     * Get the 'STAT' element value. Признак учета в таможенной статистике внешней торговли (0 -  товар не учитываются  в статистике внешней торговли, 1 - товар учитывается в статистике внешней торговли)
     * 
     * @return value
     */
    public String getSTAT() {
        return STAT;
    }

    /** 
     * Set the 'STAT' element value. Признак учета в таможенной статистике внешней торговли (0 -  товар не учитываются  в статистике внешней торговли, 1 - товар учитывается в статистике внешней торговли)
     * 
     * @param STAT
     */
    public void setSTAT(String STAT) {
        this.STAT = STAT;
    }

    /** 
     * Get the 'KOD_STR' element value. Расчетное значение страны происхождения / назначения. Формируется в соответствии с установленным алгоритмом для целей статистики. Буквенный код.
     * 
     * @return value
     */
    public String getKODSTR() {
        return KODSTR;
    }

    /** 
     * Set the 'KOD_STR' element value. Расчетное значение страны происхождения / назначения. Формируется в соответствии с установленным алгоритмом для целей статистики. Буквенный код.
     * 
     * @param KODSTR
     */
    public void setKODSTR(String KODSTR) {
        this.KODSTR = KODSTR;
    }

    /** 
     * Get the 'KOD_STRC' element value. Расчетное значение страны происхождения / назначения. Формируется в соответствии с установленным алгоритмом для целей статистики. Цифровой код.
     * 
     * @return value
     */
    public String getKODSTRC() {
        return KODSTRC;
    }

    /** 
     * Set the 'KOD_STRC' element value. Расчетное значение страны происхождения / назначения. Формируется в соответствии с установленным алгоритмом для целей статистики. Цифровой код.
     * 
     * @param KODSTRC
     */
    public void setKODSTRC(String KODSTRC) {
        this.KODSTRC = KODSTRC;
    }

    /** 
     * Get the 'DSTAT' element value. Дата учета (не учета) товара в статистике внешней торговли.
     * 
     * @return value
     */
    public LocalDate getDSTAT() {
        return DSTAT;
    }

    /** 
     * Set the 'DSTAT' element value. Дата учета (не учета) товара в статистике внешней торговли.
     * 
     * @param DSTAT
     */
    public void setDSTAT(LocalDate DSTAT) {
        this.DSTAT = DSTAT;
    }

    /** 
     * Get the 'CustomsCostMethodCode' element value. Код метода определения таможенной стоимости. В соответствии с Классификатором методов определения таможенной стоимости.
     * 
     * @return value
     */
    public String getCustomsCostMethodCode() {
        return customsCostMethodCode;
    }

    /** 
     * Set the 'CustomsCostMethodCode' element value. Код метода определения таможенной стоимости. В соответствии с Классификатором методов определения таможенной стоимости.
     * 
     * @param customsCostMethodCode
     */
    public void setCustomsCostMethodCode(String customsCostMethodCode) {
        this.customsCostMethodCode = customsCostMethodCode;
    }

    /** 
     * Get the list of 'ESADinPresentedDocument' element items. ДТ и ТД. Внутренний формат. Представленные документы гр. 44.
     * 
     * @return list
     */
    public List<ESADinPresentedDocumentType> getESADinPresentedDocumentList() {
        return ESADinPresentedDocumentList;
    }

    /** 
     * Set the list of 'ESADinPresentedDocument' element items. ДТ и ТД. Внутренний формат. Представленные документы гр. 44.
     * 
     * @param list
     */
    public void setESADinPresentedDocumentList(
            List<ESADinPresentedDocumentType> list) {
        ESADinPresentedDocumentList = list;
    }

    /** 
     * Get the list of 'ESADinPrecedingDocument' element items. ДТ и ТД. Внутренний формат. Предшествующие документы.
     * 
     * @return list
     */
    public List<CUPrecedingDocumentType> getESADinPrecedingDocumentList() {
        return ESADinPrecedingDocumentList;
    }

    /** 
     * Set the list of 'ESADinPrecedingDocument' element items. ДТ и ТД. Внутренний формат. Предшествующие документы.
     * 
     * @param list
     */
    public void setESADinPrecedingDocumentList(
            List<CUPrecedingDocumentType> list) {
        ESADinPrecedingDocumentList = list;
    }

    /** 
     * Get the list of 'ESADinCustomsPaymentCalculation' element items. ДТ и ТД. Внутренний формат. Исчисление таможенных платежей.
     * 
     * @return list
     */
    public List<CUCustomsPaymentCalculationType> getESADinCustomsPaymentCalculationList() {
        return ESADinCustomsPaymentCalculationList;
    }

    /** 
     * Set the list of 'ESADinCustomsPaymentCalculation' element items. ДТ и ТД. Внутренний формат. Исчисление таможенных платежей.
     * 
     * @param list
     */
    public void setESADinCustomsPaymentCalculationList(
            List<CUCustomsPaymentCalculationType> list) {
        ESADinCustomsPaymentCalculationList = list;
    }

    /** 
     * Get the list of 'ESADinAutomobile' element items. ДТ и ТД. Внутренний формат. Сведения  об автомобилях. Гр. 31
     * 
     * @return list
     */
    public List<AutomobileType> getESADinAutomobileList() {
        return ESADinAutomobileList;
    }

    /** 
     * Set the list of 'ESADinAutomobile' element items. ДТ и ТД. Внутренний формат. Сведения  об автомобилях. Гр. 31
     * 
     * @param list
     */
    public void setESADinAutomobileList(List<AutomobileType> list) {
        ESADinAutomobileList = list;
    }

    /** 
     * Get the 'ESADinGoodsOrganization' element value. Сведения об организации в товарной части ДТ
     * 
     * @return value
     */
    public ESADinConsignorType getESADinGoodsOrganization() {
        return ESADinGoodsOrganization;
    }

    /** 
     * Set the 'ESADinGoodsOrganization' element value. Сведения об организации в товарной части ДТ
     * 
     * @param ESADinGoodsOrganization
     */
    public void setESADinGoodsOrganization(
            ESADinConsignorType ESADinGoodsOrganization) {
        this.ESADinGoodsOrganization = ESADinGoodsOrganization;
    }

    /** 
     * Get the 'CustomConditionDocuments' element value. Сведения, указываемые в случае, если ДТ используется в качестве заявления на получение разрешения на переработку товаровэлемент 6 гр 31, гр 44
     * 
     * @return value
     */
    public ProcessingGoodsDeclarationType getCustomConditionDocuments() {
        return customConditionDocuments;
    }

    /** 
     * Set the 'CustomConditionDocuments' element value. Сведения, указываемые в случае, если ДТ используется в качестве заявления на получение разрешения на переработку товаровэлемент 6 гр 31, гр 44
     * 
     * @param customConditionDocuments
     */
    public void setCustomConditionDocuments(
            ProcessingGoodsDeclarationType customConditionDocuments) {
        this.customConditionDocuments = customConditionDocuments;
    }

    /** 
     * Get the 'ESADinGoodsDecision' element value. ДТ и ТД. Внутренний формт. Принятое решение по товару.
     * 
     * @return value
     */
    public RUESADDecisionType getESADinGoodsDecision() {
        return ESADinGoodsDecision;
    }

    /** 
     * Set the 'ESADinGoodsDecision' element value. ДТ и ТД. Внутренний формт. Принятое решение по товару.
     * 
     * @param ESADinGoodsDecision
     */
    public void setESADinGoodsDecision(RUESADDecisionType ESADinGoodsDecision) {
        this.ESADinGoodsDecision = ESADinGoodsDecision;
    }

    /** 
     * Get the list of 'ESADinGoodsOfficialMark' element items. ДТ и ТД. Внутренний формат. Служебные отметки по товару.
     * 
     * @return list
     */
    public List<ESADinGoodsOfficialMarkType> getESADinGoodsOfficialMarkList() {
        return ESADinGoodsOfficialMarkList;
    }

    /** 
     * Set the list of 'ESADinGoodsOfficialMark' element items. ДТ и ТД. Внутренний формат. Служебные отметки по товару.
     * 
     * @param list
     */
    public void setESADinGoodsOfficialMarkList(
            List<ESADinGoodsOfficialMarkType> list) {
        ESADinGoodsOfficialMarkList = list;
    }

    /** 
     * Get the list of 'ESADExcise' element items. Сведения об акцизных марках.
     * 
     * @return list
     */
    public List<ESADExciseType> getESADExciseList() {
        return ESADExciseList;
    }

    /** 
     * Set the list of 'ESADExcise' element items. Сведения об акцизных марках.
     * 
     * @param list
     */
    public void setESADExciseList(List<ESADExciseType> list) {
        ESADExciseList = list;
    }
}
