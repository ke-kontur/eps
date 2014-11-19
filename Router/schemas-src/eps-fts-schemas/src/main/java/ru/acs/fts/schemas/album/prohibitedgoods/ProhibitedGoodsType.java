
package ru.acs.fts.schemas.album.prohibitedgoods;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Документ о товарах запрещенных или ограниченных к ввозу
 */
public class ProhibitedGoodsType extends BaseDocType
{
    private ShipInfoType shipInfo;
    private DocumentBaseType documentInfo;
    private List<ProhibitedSubjectInfoType> armsInfoList = new ArrayList<ProhibitedSubjectInfoType>();
    private List<CurrencyInfoType> currencyInfoList = new ArrayList<CurrencyInfoType>();
    private List<DrugsSubstanceInfoType> drugsSubstanceInfoList = new ArrayList<DrugsSubstanceInfoType>();
    private List<PermitionDocsType> permitionDocList = new ArrayList<PermitionDocsType>();
    private String documentModeID;

    /** 
     * Get the 'ShipInfo' element value. Сведения о морском/воздушном судне
     * 
     * @return value
     */
    public ShipInfoType getShipInfo() {
        return shipInfo;
    }

    /** 
     * Set the 'ShipInfo' element value. Сведения о морском/воздушном судне
     * 
     * @param shipInfo
     */
    public void setShipInfo(ShipInfoType shipInfo) {
        this.shipInfo = shipInfo;
    }

    /** 
     * Get the 'DocumentInfo' element value. Сведения о документе о товарах запрещенных или ограниченных к ввозу
     * 
     * @return value
     */
    public DocumentBaseType getDocumentInfo() {
        return documentInfo;
    }

    /** 
     * Set the 'DocumentInfo' element value. Сведения о документе о товарах запрещенных или ограниченных к ввозу
     * 
     * @param documentInfo
     */
    public void setDocumentInfo(DocumentBaseType documentInfo) {
        this.documentInfo = documentInfo;
    }

    /** 
     * Get the list of 'ArmsInfo' element items. Информация о наличии оружия и боеприпасов
     * 
     * @return list
     */
    public List<ProhibitedSubjectInfoType> getArmsInfoList() {
        return armsInfoList;
    }

    /** 
     * Set the list of 'ArmsInfo' element items. Информация о наличии оружия и боеприпасов
     * 
     * @param list
     */
    public void setArmsInfoList(List<ProhibitedSubjectInfoType> list) {
        armsInfoList = list;
    }

    /** 
     * Get the list of 'CurrencyInfo' element items. Информация о валюте и валютных ценностях
     * 
     * @return list
     */
    public List<CurrencyInfoType> getCurrencyInfoList() {
        return currencyInfoList;
    }

    /** 
     * Set the list of 'CurrencyInfo' element items. Информация о валюте и валютных ценностях
     * 
     * @param list
     */
    public void setCurrencyInfoList(List<CurrencyInfoType> list) {
        currencyInfoList = list;
    }

    /** 
     * Get the list of 'DrugsSubstanceInfo' element items. Сведения о наличии лекарственных средств
     * 
     * @return list
     */
    public List<DrugsSubstanceInfoType> getDrugsSubstanceInfoList() {
        return drugsSubstanceInfoList;
    }

    /** 
     * Set the list of 'DrugsSubstanceInfo' element items. Сведения о наличии лекарственных средств
     * 
     * @param list
     */
    public void setDrugsSubstanceInfoList(List<DrugsSubstanceInfoType> list) {
        drugsSubstanceInfoList = list;
    }

    /** 
     * Get the list of 'PermitionDocs' element items. Информация о разрешительных документах
     * 
     * @return list
     */
    public List<PermitionDocsType> getPermitionDocList() {
        return permitionDocList;
    }

    /** 
     * Set the list of 'PermitionDocs' element items. Информация о разрешительных документах
     * 
     * @param list
     */
    public void setPermitionDocList(List<PermitionDocsType> list) {
        permitionDocList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Уникальный идентификатор документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Уникальный идентификатор документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
