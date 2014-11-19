
package ru.acs.fts.schemas.album.oez_notifviolation;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Уведомление об отказе в выдаче разрешения на ввоз (вывоз) товаров
 */
public class OEZNotifViolationType extends BaseDocType
{
    private LocalDate regDate;
    private List<String> motiveProhibitionList = new ArrayList<String>();
    private List<String> necessityActivityList = new ArrayList<String>();
    private String docSign;
    private CustomsType customs;
    private List<ListDocumentInformationType> listDocumentInformationList = new ArrayList<ListDocumentInformationType>();
    private CustomsPersonType customsPerson;
    private OrganizationBaseType declarantOEZ;
    private List<GoodsInfoType> goodsInfoList = new ArrayList<GoodsInfoType>();
    private String documentModeID;

    /** 
     * Get the 'RegDate' element value. Дата регистрации уведомления. 
     * 
     * @return value
     */
    public LocalDate getRegDate() {
        return regDate;
    }

    /** 
     * Set the 'RegDate' element value. Дата регистрации уведомления. 
     * 
     * @param regDate
     */
    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    /** 
     * Get the list of 'MotiveProhibition' element items. Причины, по которым разрешение на ввоз (вывоз) товаров на (с) территорию (ии) ОЭЗ не может быть выдано.
     * 
     * @return list
     */
    public List<String> getMotiveProhibitionList() {
        return motiveProhibitionList;
    }

    /** 
     * Set the list of 'MotiveProhibition' element items. Причины, по которым разрешение на ввоз (вывоз) товаров на (с) территорию (ии) ОЭЗ не может быть выдано.
     * 
     * @param list
     */
    public void setMotiveProhibitionList(List<String> list) {
        motiveProhibitionList = list;
    }

    /** 
     * Get the list of 'NecessityActivity' element items. Необходимые действия для получения разрешения на ввоз (вывоз) товара.
     * 
     * @return list
     */
    public List<String> getNecessityActivityList() {
        return necessityActivityList;
    }

    /** 
     * Set the list of 'NecessityActivity' element items. Необходимые действия для получения разрешения на ввоз (вывоз) товара.
     * 
     * @param list
     */
    public void setNecessityActivityList(List<String> list) {
        necessityActivityList = list;
    }

    /** 
     * Get the 'DocSign' element value. Признак уведомления об отказе в выдаче разрешения на ввоз (вывоз) товаров на (с) территорию (ии): 0 - ОЭЗ; 1 - ПОЭЗ
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. Признак уведомления об отказе в выдаче разрешения на ввоз (вывоз) товаров на (с) территорию (ии): 0 - ОЭЗ; 1 - ПОЭЗ
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'Customs' element value. Наименование таможенного органа
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Наименование таможенного органа
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the list of 'ListDocumentInformation' element items. Документы и сведения, представляемые в уполномоченный таможенный орган
     * 
     * @return list
     */
    public List<ListDocumentInformationType> getListDocumentInformationList() {
        return listDocumentInformationList;
    }

    /** 
     * Set the list of 'ListDocumentInformation' element items. Документы и сведения, представляемые в уполномоченный таможенный орган
     * 
     * @param list
     */
    public void setListDocumentInformationList(
            List<ListDocumentInformationType> list) {
        listDocumentInformationList = list;
    }

    /** 
     * Get the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'Declarant_OEZ' element value. Лицо, получающее разрешение на ввоз (вывоз) товара на  (с) территорию (ии) ОЭЗ 
     * 
     * @return value
     */
    public OrganizationBaseType getDeclarantOEZ() {
        return declarantOEZ;
    }

    /** 
     * Set the 'Declarant_OEZ' element value. Лицо, получающее разрешение на ввоз (вывоз) товара на  (с) территорию (ии) ОЭЗ 
     * 
     * @param declarantOEZ
     */
    public void setDeclarantOEZ(OrganizationBaseType declarantOEZ) {
        this.declarantOEZ = declarantOEZ;
    }

    /** 
     * Get the list of 'GoodsInfo' element items. Сведения о товарах
     * 
     * @return list
     */
    public List<GoodsInfoType> getGoodsInfoList() {
        return goodsInfoList;
    }

    /** 
     * Set the list of 'GoodsInfo' element items. Сведения о товарах
     * 
     * @param list
     */
    public void setGoodsInfoList(List<GoodsInfoType> list) {
        goodsInfoList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
