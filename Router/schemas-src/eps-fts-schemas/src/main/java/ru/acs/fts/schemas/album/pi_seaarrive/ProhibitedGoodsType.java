
package ru.acs.fts.schemas.album.pi_seaarrive;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Запрещенные или ограниченные к ввозу товары
 */
public class ProhibitedGoodsType
{
    private List<ProhibitedSubjectInfoType> armsInfoList = new ArrayList<ProhibitedSubjectInfoType>();
    private List<DrugsSubstanceInfoType> drugsSubstanceInfoList = new ArrayList<DrugsSubstanceInfoType>();
    private List<CurrencyInfoType> currencyInfoList = new ArrayList<CurrencyInfoType>();
    private List<DocumentBaseType> permitionDocList = new ArrayList<DocumentBaseType>();

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
     * Get the list of 'PermitionDocs' element items. Информация о разрешительных документах
     * 
     * @return list
     */
    public List<DocumentBaseType> getPermitionDocList() {
        return permitionDocList;
    }

    /** 
     * Set the list of 'PermitionDocs' element items. Информация о разрешительных документах
     * 
     * @param list
     */
    public void setPermitionDocList(List<DocumentBaseType> list) {
        permitionDocList = list;
    }
}
