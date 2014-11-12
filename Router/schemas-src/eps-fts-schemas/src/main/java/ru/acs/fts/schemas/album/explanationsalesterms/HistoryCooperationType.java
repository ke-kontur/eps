
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * История сотрудничества Продавца и Покупателя
 */
public class HistoryCooperationType
{
    private String additionalContract;
    private String cooperationEarly;
    private String constantPartner;
    private String putInformationCost;
    private String commentsPutInformationCos;
    private KindCooperationType kindCooperation;
    private SearchSellerType searchSeller;
    private ChoiceSellerType choiceSeller;

    /** 
     * Get the 'AdditionalContract' element value. Признак наличия у покупателя (см. графу 1 ДТС-1) перед продавцом (см. графу 2 ДТС-1) дополнительных (отличных от получения товара и установленной цены сделки) обязательств
     * 
     * @return value
     */
    public String getAdditionalContract() {
        return additionalContract;
    }

    /** 
     * Set the 'AdditionalContract' element value. Признак наличия у покупателя (см. графу 1 ДТС-1) перед продавцом (см. графу 2 ДТС-1) дополнительных (отличных от получения товара и установленной цены сделки) обязательств
     * 
     * @param additionalContract
     */
    public void setAdditionalContract(String additionalContract) {
        this.additionalContract = additionalContract;
    }

    /** 
     * Get the 'CooperationEarly' element value. Признак осуществления ранее сотрудничества между продавцом и покупателем
     * 
     * @return value
     */
    public String getCooperationEarly() {
        return cooperationEarly;
    }

    /** 
     * Set the 'CooperationEarly' element value. Признак осуществления ранее сотрудничества между продавцом и покупателем
     * 
     * @param cooperationEarly
     */
    public void setCooperationEarly(String cooperationEarly) {
        this.cooperationEarly = cooperationEarly;
    }

    /** 
     * Get the 'ConstantPartner' element value. Признак того, что покупатель и продавец являются постоянными партнерами
     * 
     * @return value
     */
    public String getConstantPartner() {
        return constantPartner;
    }

    /** 
     * Set the 'ConstantPartner' element value. Признак того, что покупатель и продавец являются постоянными партнерами
     * 
     * @param constantPartner
     */
    public void setConstantPartner(String constantPartner) {
        this.constantPartner = constantPartner;
    }

    /** 
     * Get the 'PutInformationCost' element value. Признак согласия продавца предоставить данные о затратах на производство (приобретение) товаров и (или) затратах на их продажу на экспорт в Российскую Федерацию
     * 
     * @return value
     */
    public String getPutInformationCost() {
        return putInformationCost;
    }

    /** 
     * Set the 'PutInformationCost' element value. Признак согласия продавца предоставить данные о затратах на производство (приобретение) товаров и (или) затратах на их продажу на экспорт в Российскую Федерацию
     * 
     * @param putInformationCost
     */
    public void setPutInformationCost(String putInformationCost) {
        this.putInformationCost = putInformationCost;
    }

    /** 
     * Get the 'CommentsPutInformationCos' element value. Данные о затратах на производство (приобретение) товаров и (или) затратах на их продажу на экспорт в Российскую Федерацию
     * 
     * @return value
     */
    public String getCommentsPutInformationCos() {
        return commentsPutInformationCos;
    }

    /** 
     * Set the 'CommentsPutInformationCos' element value. Данные о затратах на производство (приобретение) товаров и (или) затратах на их продажу на экспорт в Российскую Федерацию
     * 
     * @param commentsPutInformationCos
     */
    public void setCommentsPutInformationCos(String commentsPutInformationCos) {
        this.commentsPutInformationCos = commentsPutInformationCos;
    }

    /** 
     * Get the 'KindCooperation' element value. Вид сотрудничества
     * 
     * @return value
     */
    public KindCooperationType getKindCooperation() {
        return kindCooperation;
    }

    /** 
     * Set the 'KindCooperation' element value. Вид сотрудничества
     * 
     * @param kindCooperation
     */
    public void setKindCooperation(KindCooperationType kindCooperation) {
        this.kindCooperation = kindCooperation;
    }

    /** 
     * Get the 'SearchSeller' element value. Поиск продавца для покупки данного товара или ранее до начала сотрудничества осуществлялся
     * 
     * @return value
     */
    public SearchSellerType getSearchSeller() {
        return searchSeller;
    }

    /** 
     * Set the 'SearchSeller' element value. Поиск продавца для покупки данного товара или ранее до начала сотрудничества осуществлялся
     * 
     * @param searchSeller
     */
    public void setSearchSeller(SearchSellerType searchSeller) {
        this.searchSeller = searchSeller;
    }

    /** 
     * Get the 'ChoiceSeller' element value. Был выбран именно этот продавец, поскольку
     * 
     * @return value
     */
    public ChoiceSellerType getChoiceSeller() {
        return choiceSeller;
    }

    /** 
     * Set the 'ChoiceSeller' element value. Был выбран именно этот продавец, поскольку
     * 
     * @param choiceSeller
     */
    public void setChoiceSeller(ChoiceSellerType choiceSeller) {
        this.choiceSeller = choiceSeller;
    }
}
