
package ru.acs.fts.schemas.album.commissioninspection;

/** 
 * Степень досмотра
 */
public class DegreeInspectionType
{
    private String weighing;
    private String convertingFreightPlace;
    private String chooseOpening;
    private String openingAllFreightPlace;
    private String convertingQuantityObjects;
    private String choose;
    private String all;
    private String measurementDeterminationBehaviourGoods;
    private String withoutThievingSampling;
    private String withThievingSampling;
    private String others;
    private String otherComments;

    /** 
     * Get the 'Weighing' element value. Взвешивание (полное/выборочное/без взвешивания).Если значение поля: 1 - полное; 2 - выборочное; 3 - без взвешивания.
     * 
     * @return value
     */
    public String getWeighing() {
        return weighing;
    }

    /** 
     * Set the 'Weighing' element value. Взвешивание (полное/выборочное/без взвешивания).Если значение поля: 1 - полное; 2 - выборочное; 3 - без взвешивания.
     * 
     * @param weighing
     */
    public void setWeighing(String weighing) {
        this.weighing = weighing;
    }

    /** 
     * Get the 'ConvertingFreightPlace' element value. Пересчет грузовых мест.Если значение поля: "true" - да; "false" - нет.
     * 
     * @return value
     */
    public String getConvertingFreightPlace() {
        return convertingFreightPlace;
    }

    /** 
     * Set the 'ConvertingFreightPlace' element value. Пересчет грузовых мест.Если значение поля: "true" - да; "false" - нет.
     * 
     * @param convertingFreightPlace
     */
    public void setConvertingFreightPlace(String convertingFreightPlace) {
        this.convertingFreightPlace = convertingFreightPlace;
    }

    /** 
     * Get the 'ChooseOpening' element value. Выборочным вскрытием.Если значение поля: "true" - да; "false" - нет.
     * 
     * @return value
     */
    public String getChooseOpening() {
        return chooseOpening;
    }

    /** 
     * Set the 'ChooseOpening' element value. Выборочным вскрытием.Если значение поля: "true" - да; "false" - нет.
     * 
     * @param chooseOpening
     */
    public void setChooseOpening(String chooseOpening) {
        this.chooseOpening = chooseOpening;
    }

    /** 
     * Get the 'OpeningAllFreightPlace' element value. Вскрытием всех грузовых мест. Если значение поля: "true" - да; "false" - нет.
     * 
     * @return value
     */
    public String getOpeningAllFreightPlace() {
        return openingAllFreightPlace;
    }

    /** 
     * Set the 'OpeningAllFreightPlace' element value. Вскрытием всех грузовых мест. Если значение поля: "true" - да; "false" - нет.
     * 
     * @param openingAllFreightPlace
     */
    public void setOpeningAllFreightPlace(String openingAllFreightPlace) {
        this.openingAllFreightPlace = openingAllFreightPlace;
    }

    /** 
     * Get the 'ConvertingQuantityObjects' element value. Пересчет количества предметов в грузовых местах. Если значение поля: "true" - да; "false" - нет.
     * 
     * @return value
     */
    public String getConvertingQuantityObjects() {
        return convertingQuantityObjects;
    }

    /** 
     * Set the 'ConvertingQuantityObjects' element value. Пересчет количества предметов в грузовых местах. Если значение поля: "true" - да; "false" - нет.
     * 
     * @param convertingQuantityObjects
     */
    public void setConvertingQuantityObjects(String convertingQuantityObjects) {
        this.convertingQuantityObjects = convertingQuantityObjects;
    }

    /** 
     * Get the 'Choose' element value. Выборочно.Если значение поля: "true" - да; "false" - нет.
     * 
     * @return value
     */
    public String getChoose() {
        return choose;
    }

    /** 
     * Set the 'Choose' element value. Выборочно.Если значение поля: "true" - да; "false" - нет.
     * 
     * @param choose
     */
    public void setChoose(String choose) {
        this.choose = choose;
    }

    /** 
     * Get the 'All' element value. Всех.Если значение поля: "true" - да; "false" - нет.
     * 
     * @return value
     */
    public String getAll() {
        return all;
    }

    /** 
     * Set the 'All' element value. Всех.Если значение поля: "true" - да; "false" - нет.
     * 
     * @param all
     */
    public void setAll(String all) {
        this.all = all;
    }

    /** 
     * Get the 'MeasurementDeterminationBehaviourGoods' element value. Измерение и определение характеристик товаров (с частичной разборкой/с полной разборкой).Если значение поля: "true" - да; "false" - нет.
     * 
     * @return value
     */
    public String getMeasurementDeterminationBehaviourGoods() {
        return measurementDeterminationBehaviourGoods;
    }

    /** 
     * Set the 'MeasurementDeterminationBehaviourGoods' element value. Измерение и определение характеристик товаров (с частичной разборкой/с полной разборкой).Если значение поля: "true" - да; "false" - нет.
     * 
     * @param measurementDeterminationBehaviourGoods
     */
    public void setMeasurementDeterminationBehaviourGoods(
            String measurementDeterminationBehaviourGoods) {
        this.measurementDeterminationBehaviourGoods = measurementDeterminationBehaviourGoods;
    }

    /** 
     * Get the 'WithoutThievingSampling' element value. Без взятия проб и образцов.Если значение поля: "true" - да; "false" - нет.
     * 
     * @return value
     */
    public String getWithoutThievingSampling() {
        return withoutThievingSampling;
    }

    /** 
     * Set the 'WithoutThievingSampling' element value. Без взятия проб и образцов.Если значение поля: "true" - да; "false" - нет.
     * 
     * @param withoutThievingSampling
     */
    public void setWithoutThievingSampling(String withoutThievingSampling) {
        this.withoutThievingSampling = withoutThievingSampling;
    }

    /** 
     * Get the 'WithThievingSampling' element value. С взятием проб и образцов. Если значение поля: "true" - да; "false" - нет.
     * 
     * @return value
     */
    public String getWithThievingSampling() {
        return withThievingSampling;
    }

    /** 
     * Set the 'WithThievingSampling' element value. С взятием проб и образцов. Если значение поля: "true" - да; "false" - нет.
     * 
     * @param withThievingSampling
     */
    public void setWithThievingSampling(String withThievingSampling) {
        this.withThievingSampling = withThievingSampling;
    }

    /** 
     * Get the 'Others' element value. Прочее.Если значение поля: "true" - да; "false" - нет.
     * 
     * @return value
     */
    public String getOthers() {
        return others;
    }

    /** 
     * Set the 'Others' element value. Прочее.Если значение поля: "true" - да; "false" - нет.
     * 
     * @param others
     */
    public void setOthers(String others) {
        this.others = others;
    }

    /** 
     * Get the 'OtherComments' element value. Прочее(указать)
     * 
     * @return value
     */
    public String getOtherComments() {
        return otherComments;
    }

    /** 
     * Set the 'OtherComments' element value. Прочее(указать)
     * 
     * @param otherComments
     */
    public void setOtherComments(String otherComments) {
        this.otherComments = otherComments;
    }
}
