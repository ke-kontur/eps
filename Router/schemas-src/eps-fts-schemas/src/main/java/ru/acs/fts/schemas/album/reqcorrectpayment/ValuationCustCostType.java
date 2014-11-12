
package ru.acs.fts.schemas.album.reqcorrectpayment;

import java.util.ArrayList;
import java.util.List;

/** 
 * Определение таможенной стоимости товаров/Необходимые изменения в ДТ
 */
public class ValuationCustCostType
{
    private String numberGood;
    private String artAgreement;
    private String custCostGoods;
    private List<String> sourceInfList = new ArrayList<String>();
    private String methodNumber;
    private List<DeclarationChangesType> declarationChangeList = new ArrayList<DeclarationChangesType>();

    /** 
     * Get the 'NumberGood' element value. Номер товара
     * 
     * @return value
     */
    public String getNumberGood() {
        return numberGood;
    }

    /** 
     * Set the 'NumberGood' element value. Номер товара
     * 
     * @param numberGood
     */
    public void setNumberGood(String numberGood) {
        this.numberGood = numberGood;
    }

    /** 
     * Get the 'ArtAgreement' element value. Номер статьи Соглашения
     * 
     * @return value
     */
    public String getArtAgreement() {
        return artAgreement;
    }

    /** 
     * Set the 'ArtAgreement' element value. Номер статьи Соглашения
     * 
     * @param artAgreement
     */
    public void setArtAgreement(String artAgreement) {
        this.artAgreement = artAgreement;
    }

    /** 
     * Get the 'CustCostGoods' element value. Таможенная стоимость товаров
     * 
     * @return value
     */
    public String getCustCostGoods() {
        return custCostGoods;
    }

    /** 
     * Set the 'CustCostGoods' element value. Таможенная стоимость товаров
     * 
     * @param custCostGoods
     */
    public void setCustCostGoods(String custCostGoods) {
        this.custCostGoods = custCostGoods;
    }

    /** 
     * Get the list of 'SourceInf' element items. Источник информации
     * 
     * @return list
     */
    public List<String> getSourceInfList() {
        return sourceInfList;
    }

    /** 
     * Set the list of 'SourceInf' element items. Источник информации
     * 
     * @param list
     */
    public void setSourceInfList(List<String> list) {
        sourceInfList = list;
    }

    /** 
     * Get the 'MethodNumber' element value. Номер метода
     * 
     * @return value
     */
    public String getMethodNumber() {
        return methodNumber;
    }

    /** 
     * Set the 'MethodNumber' element value. Номер метода
     * 
     * @param methodNumber
     */
    public void setMethodNumber(String methodNumber) {
        this.methodNumber = methodNumber;
    }

    /** 
     * Get the list of 'DeclarationChanges' element items. Описание необходимых изменений (дополнений) ДТ
     * 
     * @return list
     */
    public List<DeclarationChangesType> getDeclarationChangeList() {
        return declarationChangeList;
    }

    /** 
     * Set the list of 'DeclarationChanges' element items. Описание необходимых изменений (дополнений) ДТ
     * 
     * @param list
     */
    public void setDeclarationChangeList(List<DeclarationChangesType> list) {
        declarationChangeList = list;
    }
}
